package com.baidu.platform.comapi.bmsdk.style;

import android.graphics.Bitmap;
import android.graphics.NinePatch;

/* loaded from: classes2.dex */
public class BmBitmapResource extends BmDrawableResource {
    private BmBitmapResource() {
        super(56, nativeCreate());
    }

    private void a(Bitmap bitmap, boolean z7) {
        b a8;
        if (bitmap != null) {
            nativeSetBitmap(this.nativeInstance, bitmap, hashCode(), bitmap.hashCode(), z7);
            if (bitmap.getNinePatchChunk() == null || !NinePatch.isNinePatchChunk(bitmap.getNinePatchChunk()) || (a8 = b.a(bitmap.getNinePatchChunk())) == null) {
                return;
            }
            int i8 = a8.f8974a[0];
            int width = bitmap.getWidth();
            int[] iArr = a8.f8974a;
            a(a8.f8975b, a8.f8976c, new int[]{i8, width - iArr[1], iArr[2], bitmap.getHeight() - a8.f8974a[3]});
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeSetBitmap(long j8, Bitmap bitmap, int i8, int i9, boolean z7);

    private static native boolean nativeSetFillArea(long j8, int i8, int i9, int i10, int i11);

    private static native boolean nativeSetScaleX(long j8, int[] iArr, int i8);

    private static native boolean nativeSetScaleY(long j8, int[] iArr, int i8);

    public BmBitmapResource(Bitmap bitmap) {
        super(56, nativeCreate());
        a(bitmap, false);
    }

    private void a(int[] iArr, int[] iArr2, int[] iArr3) {
        if (iArr != null && iArr.length > 0) {
            nativeSetScaleX(this.nativeInstance, iArr, iArr.length);
        }
        if (iArr2 != null && iArr2.length > 0) {
            nativeSetScaleY(this.nativeInstance, iArr2, iArr2.length);
        }
        if (iArr3 == null || iArr3.length != 4) {
            return;
        }
        nativeSetFillArea(this.nativeInstance, iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
    }
}
