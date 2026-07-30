package com.baidu.platform.comapi.bmsdk.style;

/* loaded from: classes2.dex */
public class BmGifResource extends BmDrawableResource {
    private BmGifResource() {
        super(58, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetData(long j8, byte[] bArr, int i8, int i9, int i10);
}
