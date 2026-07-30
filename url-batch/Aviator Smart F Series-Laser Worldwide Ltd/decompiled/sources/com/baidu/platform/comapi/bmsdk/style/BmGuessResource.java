package com.baidu.platform.comapi.bmsdk.style;

/* loaded from: classes2.dex */
public class BmGuessResource extends BmDrawableResource {
    private BmGuessResource() {
        super(59, nativeCreate());
    }

    private static native boolean nativeBuildDefaultGradientBkImage(long j8);

    private static native boolean nativeBuildResource(long j8, String str, boolean z7);

    private static native long nativeCreate();

    public BmGuessResource(String str) {
        super(59, nativeCreate());
        nativeBuildResource(this.nativeInstance, str, false);
    }
}
