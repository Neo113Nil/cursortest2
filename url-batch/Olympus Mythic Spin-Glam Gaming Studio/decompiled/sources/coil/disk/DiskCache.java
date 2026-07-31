package coil.disk;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import okio.FileSystem;
import okio.Path;

/* compiled from: DiskCache.kt */
/* loaded from: classes13.dex */
public interface DiskCache {

    /* compiled from: DiskCache.kt */
    public interface Editor {
        void abort();

        Snapshot commitAndGet();

        Path getData();

        Path getMetadata();
    }

    /* compiled from: DiskCache.kt */
    public interface Snapshot extends Closeable {
        Editor closeAndEdit();

        Path getData();

        Path getMetadata();
    }

    Editor edit(String str);

    Snapshot get(String str);

    FileSystem getFileSystem();

    /* compiled from: DiskCache.kt */
    public static final class Builder {
        private Path directory;
        private long maxSizeBytes;
        private FileSystem fileSystem = FileSystem.SYSTEM;
        private double maxSizePercent = 0.02d;
        private long minimumMaxSizeBytes = 10485760;
        private long maximumMaxSizeBytes = 262144000;
        private CoroutineDispatcher cleanupDispatcher = Dispatchers.getIO();

        public final Builder directory(File file) {
            return directory(Path.Companion.get$default(Path.INSTANCE, file, false, 1, (Object) null));
        }

        public final Builder directory(Path path) {
            this.directory = path;
            return this;
        }

        public final DiskCache build() {
            long j;
            Path path = this.directory;
            if (path == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.maxSizePercent > 0.0d) {
                try {
                    StatFs statFs = new StatFs(path.toFile().getAbsolutePath());
                    j = RangesKt.coerceIn((long) (this.maxSizePercent * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    j = this.minimumMaxSizeBytes;
                }
            } else {
                j = this.maxSizeBytes;
            }
            return new RealDiskCache(j, path, this.fileSystem, this.cleanupDispatcher);
        }
    }
}
