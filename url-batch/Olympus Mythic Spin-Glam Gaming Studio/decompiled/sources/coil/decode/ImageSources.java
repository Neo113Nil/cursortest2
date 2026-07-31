package coil.decode;

import android.content.Context;
import coil.decode.ImageSource;
import coil.util.Utils;
import java.io.Closeable;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Path;

/* compiled from: ImageSource.kt */
/* loaded from: classes15.dex */
public abstract class ImageSources {
    public static /* synthetic */ ImageSource create$default(Path path, FileSystem fileSystem, String str, Closeable closeable, int i, Object obj) {
        if ((i & 2) != 0) {
            fileSystem = FileSystem.SYSTEM;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            closeable = null;
        }
        return create(path, fileSystem, str, closeable);
    }

    public static final ImageSource create(Path path, FileSystem fileSystem, String str, Closeable closeable) {
        return new FileImageSource(path, fileSystem, str, closeable, null);
    }

    public static final ImageSource create(BufferedSource bufferedSource, Context context) {
        return new SourceImageSource(bufferedSource, Utils.getSafeCacheDir(context), null);
    }

    public static final ImageSource create(BufferedSource bufferedSource, Context context, ImageSource.Metadata metadata) {
        return new SourceImageSource(bufferedSource, Utils.getSafeCacheDir(context), metadata);
    }
}
