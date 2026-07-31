package io.opentelemetry.contrib.disk.buffering.internal.storage;

import io.opentelemetry.contrib.disk.buffering.internal.storage.files.ReadableFile;
import io.opentelemetry.contrib.disk.buffering.internal.storage.files.WritableFile;
import io.opentelemetry.contrib.disk.buffering.internal.storage.util.ClockBuddy;
import io.opentelemetry.contrib.disk.buffering.storage.impl.FileStorageConfiguration;
import io.opentelemetry.sdk.common.Clock;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class FolderManager implements Closeable {
    private final Clock clock;
    private final FileStorageConfiguration configuration;

    @Nullable
    private ReadableFile currentReadableFile;

    @Nullable
    private WritableFile currentWritableFile;
    private final File folder;

    public static FolderManager create(File file, FileStorageConfiguration fileStorageConfiguration, Clock clock) {
        if (file.isFile()) {
            throw new IllegalArgumentException("destinationDir must be a directory");
        }
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("Could not create dir: " + file);
        }
        return new FolderManager(file, fileStorageConfiguration, clock);
    }

    public FolderManager(File file, FileStorageConfiguration fileStorageConfiguration, Clock clock) {
        this.folder = file;
        this.configuration = fileStorageConfiguration;
        this.clock = clock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        closeCurrentFiles();
    }

    @Nullable
    public synchronized ReadableFile getReadableFile() throws IOException {
        this.currentReadableFile = null;
        File findReadableFile = findReadableFile();
        if (findReadableFile == null) {
            return null;
        }
        ReadableFile readableFile = new ReadableFile(findReadableFile, Long.parseLong(findReadableFile.getName()), this.clock, this.configuration);
        this.currentReadableFile = readableFile;
        return readableFile;
    }

    public synchronized WritableFile createWritableFile() throws IOException {
        WritableFile writableFile;
        long nowMillis = ClockBuddy.nowMillis(this.clock);
        File[] listFiles = this.folder.listFiles();
        if (listFiles != null && purgeExpiredFilesIfAny(listFiles, nowMillis) == 0) {
            removeOldestFileIfSpaceIsNeeded(listFiles);
        }
        writableFile = new WritableFile(new File(this.folder, String.valueOf(nowMillis)), nowMillis, this.configuration, this.clock);
        this.currentWritableFile = writableFile;
        return writableFile;
    }

    public synchronized void clear() throws IOException {
        closeCurrentFiles();
        ArrayList arrayList = new ArrayList();
        for (File file : (File[]) Objects.requireNonNull(this.folder.listFiles())) {
            if (!file.delete()) {
                arrayList.add(file);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOException("Could not delete files " + arrayList);
        }
    }

    @Nullable
    private File findReadableFile() throws IOException {
        WritableFile writableFile;
        long nowMillis = ClockBuddy.nowMillis(this.clock);
        File[] listFiles = this.folder.listFiles();
        File file = null;
        if (listFiles != null) {
            long j = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                if (isReadyToBeRead(nowMillis, parseLong) && !hasExpiredForReading(nowMillis, parseLong) && (file == null || parseLong < j)) {
                    file = file2;
                    j = parseLong;
                }
            }
        }
        if (file != null && (writableFile = this.currentWritableFile) != null && file.equals(writableFile.getFile())) {
            this.currentWritableFile.close();
        }
        return file;
    }

    private int purgeExpiredFilesIfAny(File[] fileArr, long j) throws IOException {
        int i = 0;
        for (File file : fileArr) {
            if (hasExpiredForReading(j, Long.parseLong(file.getName()))) {
                ReadableFile readableFile = this.currentReadableFile;
                if (readableFile != null && file.equals(readableFile.getFile())) {
                    this.currentReadableFile.close();
                }
                if (file.delete()) {
                    i++;
                }
            }
        }
        return i;
    }

    private void removeOldestFileIfSpaceIsNeeded(File[] fileArr) throws IOException {
        if (fileArr.length <= 0 || !isNeededToClearSpaceForNewFile(fileArr)) {
            return;
        }
        File oldest = getOldest(fileArr);
        ReadableFile readableFile = this.currentReadableFile;
        if (readableFile != null && oldest.equals(readableFile.getFile())) {
            this.currentReadableFile.close();
        }
        if (!oldest.delete()) {
            throw new IOException("Could not delete the file: " + oldest);
        }
    }

    private static File getOldest(File[] fileArr) {
        File file = null;
        for (File file2 : fileArr) {
            if (file == null || file2.getName().compareTo(file.getName()) < 0) {
                file = file2;
            }
        }
        return (File) Objects.requireNonNull(file);
    }

    private boolean isNeededToClearSpaceForNewFile(File[] fileArr) {
        int i = 0;
        for (File file : fileArr) {
            i += (int) file.length();
        }
        return i + this.configuration.getMaxFileSize() > this.configuration.getMaxFolderSize();
    }

    private boolean isReadyToBeRead(long j, long j2) {
        return j >= j2 + this.configuration.getMinFileAgeForReadMillis();
    }

    private boolean hasExpiredForReading(long j, long j2) {
        return j > j2 + this.configuration.getMaxFileAgeForReadMillis();
    }

    private synchronized void closeCurrentFiles() throws IOException {
        ReadableFile readableFile = this.currentReadableFile;
        if (readableFile != null) {
            readableFile.close();
        }
        WritableFile writableFile = this.currentWritableFile;
        if (writableFile != null) {
            writableFile.close();
        }
    }
}
