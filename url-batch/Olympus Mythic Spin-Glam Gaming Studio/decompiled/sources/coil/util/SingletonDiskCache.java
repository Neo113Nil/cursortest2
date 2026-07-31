package coil.util;

import android.content.Context;
import coil.disk.DiskCache;
import kotlin.io.FilesKt;

/* compiled from: Utils.kt */
/* loaded from: classes5.dex */
public final class SingletonDiskCache {
    public static final SingletonDiskCache INSTANCE = new SingletonDiskCache();
    private static DiskCache instance;

    private SingletonDiskCache() {
    }

    public final synchronized DiskCache get(Context context) {
        DiskCache diskCache;
        diskCache = instance;
        if (diskCache == null) {
            diskCache = new DiskCache.Builder().directory(FilesKt.resolve(Utils.getSafeCacheDir(context), "image_cache")).build();
            instance = diskCache;
        }
        return diskCache;
    }
}
