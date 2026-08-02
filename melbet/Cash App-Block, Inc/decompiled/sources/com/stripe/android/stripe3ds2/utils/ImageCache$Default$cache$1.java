package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.stripe.android.uicore.image.LoadedImage;

/* loaded from: classes9.dex */
public final class ImageCache$Default$cache$1 extends LruCache {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageCache$Default$cache$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Bitmap bitmap = (Bitmap) obj2;
                ((String) obj).getClass();
                bitmap.getClass();
                return bitmap.getByteCount() / 1024;
            default:
                LoadedImage loadedImage = (LoadedImage) obj2;
                ((String) obj).getClass();
                loadedImage.getClass();
                return loadedImage.bitmap.getByteCount() / 1024;
        }
    }
}
