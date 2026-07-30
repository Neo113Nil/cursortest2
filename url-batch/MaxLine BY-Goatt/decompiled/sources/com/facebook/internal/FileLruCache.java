package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.Logger;
import defpackage.dm0;
import defpackage.ey;
import defpackage.k3;
import defpackage.tp2;
import defpackage.yt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FileLruCache {
    private static final String HEADER_CACHEKEY_KEY = "key";
    private static final String HEADER_CACHE_CONTENT_TAG_KEY = "tag";
    private final Condition condition;
    private final File directory;
    private boolean isTrimInProgress;
    private boolean isTrimPending;
    private final AtomicLong lastClearCacheTime;
    private final Limits limits;
    private final ReentrantLock lock;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "FileLruCache";
    private static final AtomicLong bufferIndex = new AtomicLong();

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class BufferFile {
        private static final String FILE_NAME_PREFIX = "buffer";
        public static final BufferFile INSTANCE = new BufferFile();
        private static final FilenameFilter filterExcludeBufferFiles;
        private static final FilenameFilter filterExcludeNonBufferFiles;

        static {
            final int i = 0;
            filterExcludeBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.a
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean filterExcludeBufferFiles$lambda$0;
                    boolean filterExcludeNonBufferFiles$lambda$1;
                    switch (i) {
                        case 0:
                            filterExcludeBufferFiles$lambda$0 = FileLruCache.BufferFile.filterExcludeBufferFiles$lambda$0(file, str);
                            return filterExcludeBufferFiles$lambda$0;
                        default:
                            filterExcludeNonBufferFiles$lambda$1 = FileLruCache.BufferFile.filterExcludeNonBufferFiles$lambda$1(file, str);
                            return filterExcludeNonBufferFiles$lambda$1;
                    }
                }
            };
            final int i2 = 1;
            filterExcludeNonBufferFiles = new FilenameFilter() { // from class: com.facebook.internal.a
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    boolean filterExcludeBufferFiles$lambda$0;
                    boolean filterExcludeNonBufferFiles$lambda$1;
                    switch (i2) {
                        case 0:
                            filterExcludeBufferFiles$lambda$0 = FileLruCache.BufferFile.filterExcludeBufferFiles$lambda$0(file, str);
                            return filterExcludeBufferFiles$lambda$0;
                        default:
                            filterExcludeNonBufferFiles$lambda$1 = FileLruCache.BufferFile.filterExcludeNonBufferFiles$lambda$1(file, str);
                            return filterExcludeNonBufferFiles$lambda$1;
                    }
                }
            };
        }

        private BufferFile() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean filterExcludeBufferFiles$lambda$0(File file, String str) {
            str.getClass();
            return !tp2.o(str, FILE_NAME_PREFIX, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean filterExcludeNonBufferFiles$lambda$1(File file, String str) {
            str.getClass();
            return tp2.o(str, FILE_NAME_PREFIX, false);
        }

        public final void deleteAll(File file) {
            file.getClass();
            File[] listFiles = file.listFiles(excludeNonBufferFiles());
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        public final FilenameFilter excludeBufferFiles() {
            return filterExcludeBufferFiles;
        }

        public final FilenameFilter excludeNonBufferFiles() {
            return filterExcludeNonBufferFiles;
        }

        public final File newFile(File file) {
            return new File(file, FILE_NAME_PREFIX + FileLruCache.bufferIndex.incrementAndGet());
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Limits {
        private int byteCount = 1048576;
        private int fileCount = 1024;

        public final int getByteCount() {
            return this.byteCount;
        }

        public final int getFileCount() {
            return this.fileCount;
        }

        public final void setByteCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.byteCount = i;
        }

        public final void setFileCount(int i) {
            if (i < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.fileCount = i;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface StreamCloseCallback {
        void onClose();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class StreamHeader {
        private static final int HEADER_VERSION = 0;
        public static final StreamHeader INSTANCE = new StreamHeader();

        private StreamHeader() {
        }

        public final JSONObject readHeader(InputStream inputStream) {
            inputStream.getClass();
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String tag = FileLruCache.Companion.getTAG();
                    tag.getClass();
                    companion.log(loggingBehavior, tag, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = inputStream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    Logger.Companion companion2 = Logger.Companion;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String tag2 = FileLruCache.Companion.getTAG();
                    tag2.getClass();
                    companion2.log(loggingBehavior2, tag2, "readHeader: stream.read stopped at " + Integer.valueOf(i) + " when expected " + i2);
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, yt.b)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                Logger.Companion companion3 = Logger.Companion;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                String tag3 = FileLruCache.Companion.getTAG();
                tag3.getClass();
                companion3.log(loggingBehavior3, tag3, "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                dm0.j(e.getMessage());
                return null;
            }
        }

        public final void writeHeader(OutputStream outputStream, JSONObject jSONObject) {
            outputStream.getClass();
            jSONObject.getClass();
            String jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
            byte[] bytes = jSONObject2.getBytes(yt.b);
            bytes.getClass();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & 255);
            outputStream.write((bytes.length >> 8) & 255);
            outputStream.write(bytes.length & 255);
            outputStream.write(bytes);
        }
    }

    public FileLruCache(String str, Limits limits) {
        str.getClass();
        limits.getClass();
        this.tag = str;
        this.limits = limits;
        File file = new File(FacebookSdk.getCacheDir(), str);
        this.directory = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastClearCacheTime = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            BufferFile.INSTANCE.deleteAll(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearCache$lambda$1(File[] fileArr) {
        fileArr.getClass();
        for (File file : fileArr) {
            file.delete();
        }
    }

    public static /* synthetic */ InputStream get$default(FileLruCache fileLruCache, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.get(str, str2);
    }

    public static /* synthetic */ OutputStream openPutStream$default(FileLruCache fileLruCache, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileLruCache.openPutStream(str, str2);
    }

    private final void postTrim() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (!this.isTrimPending) {
                this.isTrimPending = true;
                FacebookSdk.getExecutor().execute(new k3(16, this));
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postTrim$lambda$3$lambda$2(FileLruCache fileLruCache) {
        fileLruCache.getClass();
        fileLruCache.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renameToTargetAndTrim(String str, File file) {
        if (!file.renameTo(new File(this.directory, Utility.md5hash(str)))) {
            file.delete();
        }
        postTrim();
    }

    private final void trim() {
        long j;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isTrimPending = false;
            this.isTrimInProgress = true;
            Unit unit = Unit.a;
            reentrantLock.unlock();
            try {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                str.getClass();
                companion.log(loggingBehavior, str, "trim started");
                PriorityQueue priorityQueue = new PriorityQueue();
                File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
                long j2 = 0;
                if (listFiles != null) {
                    j = 0;
                    for (File file : listFiles) {
                        file.getClass();
                        ModifiedFile modifiedFile = new ModifiedFile(file);
                        priorityQueue.add(modifiedFile);
                        Logger.Companion companion2 = Logger.Companion;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                        String str2 = TAG;
                        str2.getClass();
                        companion2.log(loggingBehavior2, str2, "  trim considering time=" + Long.valueOf(modifiedFile.getModified()) + " name=" + modifiedFile.getFile().getName());
                        j2 += file.length();
                        j++;
                    }
                } else {
                    j = 0;
                }
                while (true) {
                    if (j2 <= this.limits.getByteCount() && j <= this.limits.getFileCount()) {
                        this.lock.lock();
                        try {
                            this.isTrimInProgress = false;
                            this.condition.signalAll();
                            Unit unit2 = Unit.a;
                            return;
                        } finally {
                        }
                    }
                    File file2 = ((ModifiedFile) priorityQueue.remove()).getFile();
                    Logger.Companion companion3 = Logger.Companion;
                    LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                    String str3 = TAG;
                    str3.getClass();
                    companion3.log(loggingBehavior3, str3, "  trim removing " + file2.getName());
                    j2 -= file2.length();
                    j += -1;
                    file2.delete();
                }
            } catch (Throwable th) {
                this.lock.lock();
                try {
                    this.isTrimInProgress = false;
                    this.condition.signalAll();
                    Unit unit3 = Unit.a;
                    throw th;
                } finally {
                }
            }
        } finally {
        }
    }

    public final void clearCache() {
        File[] listFiles = this.directory.listFiles(BufferFile.INSTANCE.excludeBufferFiles());
        this.lastClearCacheTime.set(System.currentTimeMillis());
        if (listFiles != null) {
            FacebookSdk.getExecutor().execute(new k3(15, listFiles));
        }
    }

    public final InputStream get(String str, String str2) {
        str.getClass();
        File file = new File(this.directory, Utility.md5hash(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), Utility.DEFAULT_STREAM_BUFFER_SIZE);
            try {
                JSONObject readHeader = StreamHeader.INSTANCE.readHeader(bufferedInputStream);
                if (readHeader == null) {
                    return null;
                }
                if (!Intrinsics.b(readHeader.optString("key"), str)) {
                    return null;
                }
                String optString = readHeader.optString("tag", null);
                if (str2 != null && !str2.equals(optString)) {
                    return null;
                }
                long time = new Date().getTime();
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str3 = TAG;
                str3.getClass();
                companion.log(loggingBehavior, str3, "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                file.setLastModified(time);
                return bufferedInputStream;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getLocation() {
        String path = this.directory.getPath();
        path.getClass();
        return path;
    }

    public final InputStream interceptAndPut(String str, InputStream inputStream) {
        str.getClass();
        inputStream.getClass();
        return new CopyingInputStream(inputStream, openPutStream$default(this, str, null, 2, null));
    }

    public final OutputStream openPutStream(final String str, String str2) {
        str.getClass();
        final File newFile = BufferFile.INSTANCE.newFile(this.directory);
        newFile.delete();
        if (!newFile.createNewFile()) {
            ey.l(newFile.getAbsolutePath(), "Could not create file at ");
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            final long currentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new CloseCallbackOutputStream(fileOutputStream, new StreamCloseCallback() { // from class: com.facebook.internal.FileLruCache$openPutStream$renameToTargetCallback$1
                @Override // com.facebook.internal.FileLruCache.StreamCloseCallback
                public void onClose() {
                    AtomicLong atomicLong;
                    long j = currentTimeMillis;
                    atomicLong = this.lastClearCacheTime;
                    if (j < atomicLong.get()) {
                        newFile.delete();
                    } else {
                        this.renameToTargetAndTrim(str, newFile);
                    }
                }
            }), Utility.DEFAULT_STREAM_BUFFER_SIZE);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!Utility.isNullOrEmpty(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    StreamHeader.INSTANCE.writeHeader(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    Logger.Companion companion = Logger.Companion;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str3 = TAG;
                    str3.getClass();
                    companion.log(loggingBehavior, 5, str3, "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                }
            } catch (Throwable th) {
                bufferedOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e2) {
            Logger.Companion companion2 = Logger.Companion;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
            String str4 = TAG;
            str4.getClass();
            companion2.log(loggingBehavior2, 5, str4, "Error creating buffer output stream: " + e2);
            dm0.j(e2.getMessage());
            return null;
        }
    }

    public final long sizeInBytesForTest() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.isTrimPending && !this.isTrimInProgress) {
                    break;
                }
                try {
                    this.condition.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.a;
        reentrantLock.unlock();
        File[] listFiles = this.directory.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file : listFiles) {
                j += file.length();
            }
        }
        return j;
    }

    public String toString() {
        return "{FileLruCache: tag:" + this.tag + " file:" + this.directory.getName() + '}';
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class ModifiedFile implements Comparable<ModifiedFile> {
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;
        private final File file;
        private final long modified;

        public ModifiedFile(File file) {
            file.getClass();
            this.file = file;
            this.modified = file.lastModified();
        }

        @Override // java.lang.Comparable
        public int compareTo(ModifiedFile modifiedFile) {
            modifiedFile.getClass();
            long j = this.modified;
            long j2 = modifiedFile.modified;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.file.compareTo(modifiedFile.file);
        }

        public boolean equals(Object obj) {
            return (obj instanceof ModifiedFile) && compareTo((ModifiedFile) obj) == 0;
        }

        public final File getFile() {
            return this.file;
        }

        public final long getModified() {
            return this.modified;
        }

        public int hashCode() {
            return ((this.file.hashCode() + 1073) * HASH_MULTIPLIER) + ((int) (this.modified % 2147483647L));
        }

        /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return FileLruCache.TAG;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CloseCallbackOutputStream extends OutputStream {
        private final StreamCloseCallback callback;
        private final OutputStream innerStream;

        public CloseCallbackOutputStream(OutputStream outputStream, StreamCloseCallback streamCloseCallback) {
            outputStream.getClass();
            streamCloseCallback.getClass();
            this.innerStream = outputStream;
            this.callback = streamCloseCallback;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.innerStream.close();
            } finally {
                this.callback.onClose();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.innerStream.flush();
        }

        public final StreamCloseCallback getCallback() {
            return this.callback;
        }

        public final OutputStream getInnerStream() {
            return this.innerStream;
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            this.innerStream.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            bArr.getClass();
            this.innerStream.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.innerStream.write(i);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class CopyingInputStream extends InputStream {
        private final InputStream input;
        private final OutputStream output;

        public CopyingInputStream(InputStream inputStream, OutputStream outputStream) {
            inputStream.getClass();
            outputStream.getClass();
            this.input = inputStream;
            this.output = outputStream;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.input.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                this.input.close();
            } finally {
                this.output.close();
            }
        }

        public final InputStream getInput() {
            return this.input;
        }

        public final OutputStream getOutput() {
            return this.output;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) {
            bArr.getClass();
            int read = this.input.read(bArr);
            if (read > 0) {
                this.output.write(bArr, 0, read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            int read;
            byte[] bArr = new byte[1024];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, 1024L))) >= 0) {
                j2 += read;
            }
            return j2;
        }

        @Override // java.io.InputStream
        public int read() {
            int read = this.input.read();
            if (read >= 0) {
                this.output.write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            int read = this.input.read(bArr, i, i2);
            if (read > 0) {
                this.output.write(bArr, i, read);
            }
            return read;
        }
    }

    public final InputStream get(String str) {
        str.getClass();
        return get$default(this, str, null, 2, null);
    }

    public final OutputStream openPutStream(String str) {
        str.getClass();
        return openPutStream$default(this, str, null, 2, null);
    }
}
