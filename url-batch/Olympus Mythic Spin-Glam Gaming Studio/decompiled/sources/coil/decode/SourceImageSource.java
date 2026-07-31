package coil.decode;

import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* compiled from: ImageSource.kt */
/* loaded from: classes9.dex */
public final class SourceImageSource extends ImageSource {
    private final File cacheDirectory;
    private Path file;
    private boolean isClosed;
    private final ImageSource.Metadata metadata;
    private BufferedSource source;

    @Override // coil.decode.ImageSource
    public ImageSource.Metadata getMetadata() {
        return this.metadata;
    }

    public SourceImageSource(BufferedSource bufferedSource, File file, ImageSource.Metadata metadata) {
        super(null);
        this.cacheDirectory = file;
        this.metadata = metadata;
        this.source = bufferedSource;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    public FileSystem getFileSystem() {
        return FileSystem.SYSTEM;
    }

    @Override // coil.decode.ImageSource
    public synchronized BufferedSource source() {
        assertNotClosed();
        BufferedSource bufferedSource = this.source;
        if (bufferedSource != null) {
            return bufferedSource;
        }
        FileSystem fileSystem = getFileSystem();
        Path path = this.file;
        Intrinsics.checkNotNull(path);
        BufferedSource buffer = Okio.buffer(fileSystem.source(path));
        this.source = buffer;
        return buffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.isClosed = true;
            BufferedSource bufferedSource = this.source;
            if (bufferedSource != null) {
                Utils.closeQuietly(bufferedSource);
            }
            Path path = this.file;
            if (path != null) {
                getFileSystem().delete(path);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void assertNotClosed() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }
}
