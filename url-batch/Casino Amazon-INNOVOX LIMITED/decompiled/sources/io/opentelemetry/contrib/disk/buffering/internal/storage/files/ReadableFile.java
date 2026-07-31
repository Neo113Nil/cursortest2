package io.opentelemetry.contrib.disk.buffering.internal.storage.files;

import io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader.DelimitedProtoStreamReader;
import io.opentelemetry.contrib.disk.buffering.internal.storage.files.reader.StreamReader;
import io.opentelemetry.contrib.disk.buffering.internal.storage.files.utils.FileStream;
import io.opentelemetry.contrib.disk.buffering.internal.storage.util.ClockBuddy;
import io.opentelemetry.contrib.disk.buffering.storage.impl.FileStorageConfiguration;
import io.opentelemetry.sdk.common.Clock;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class ReadableFile implements FileOperations {
    private final Clock clock;
    private final long expireTimeMillis;

    @Nonnull
    private final File file;
    private final FileStream fileStream;
    private final AtomicBoolean isClosed;
    private final StreamReader reader;

    public ReadableFile(File file, long j, Clock clock, FileStorageConfiguration fileStorageConfiguration) throws IOException {
        this(file, j, clock, fileStorageConfiguration, DelimitedProtoStreamReader.Factory.getInstance());
    }

    public ReadableFile(@Nonnull File file, long j, Clock clock, FileStorageConfiguration fileStorageConfiguration, StreamReader.Factory factory) throws IOException {
        this.isClosed = new AtomicBoolean(false);
        this.file = file;
        this.clock = clock;
        this.expireTimeMillis = j + fileStorageConfiguration.getMaxFileAgeForReadMillis();
        FileStream create = FileStream.create(file);
        this.fileStream = create;
        this.reader = factory.create(create);
    }

    @Nullable
    public synchronized byte[] readNext() throws IOException {
        if (this.isClosed.get()) {
            return null;
        }
        if (hasExpired()) {
            close();
            return null;
        }
        byte[] readNext = this.reader.readNext();
        if (readNext != null) {
            return readNext;
        }
        clear();
        return null;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.files.FileOperations
    public synchronized boolean hasExpired() {
        return ClockBuddy.nowMillis(this.clock) >= this.expireTimeMillis;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.files.FileOperations
    public synchronized boolean isClosed() {
        return this.isClosed.get();
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.storage.files.FileOperations
    @Nonnull
    public File getFile() {
        return this.file;
    }

    public synchronized void clear() throws IOException {
        close();
        if (!this.file.delete()) {
            throw new IOException("Could not delete file: " + this.file);
        }
    }

    public synchronized void removeTopItem() throws IOException {
        this.fileStream.truncateTop();
        if (this.fileStream.size() == 0) {
            clear();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.isClosed.compareAndSet(false, true)) {
            this.reader.close();
        }
    }

    public String toString() {
        return "ReadableFile{file=" + this.file + AbstractJsonLexerKt.END_OBJ;
    }
}
