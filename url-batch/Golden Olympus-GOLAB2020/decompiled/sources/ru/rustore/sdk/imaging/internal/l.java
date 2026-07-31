package ru.rustore.sdk.imaging.internal;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l extends LruCache<String, Bitmap> {
    public l(int i4) {
        super(i4);
    }

    @Override // android.util.LruCache
    public final int sizeOf(String str, Bitmap bitmap) {
        String key = str;
        Bitmap bitmap2 = bitmap;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap2, "bitmap");
        return bitmap2.getByteCount() / 1024;
    }
}
