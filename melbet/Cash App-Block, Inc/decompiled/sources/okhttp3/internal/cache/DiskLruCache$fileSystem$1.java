package okhttp3.internal.cache;

import okio.ForwardingFileSystem;
import okio.Path;
import okio.Sink;

/* loaded from: classes3.dex */
public final class DiskLruCache$fileSystem$1 extends ForwardingFileSystem {
    @Override // okio.ForwardingFileSystem, okio.FileSystem
    public final Sink sink(Path path, boolean z) {
        path.getClass();
        Path parent = path.parent();
        if (parent != null) {
            createDirectories(parent);
        }
        return super.sink(path, z);
    }
}
