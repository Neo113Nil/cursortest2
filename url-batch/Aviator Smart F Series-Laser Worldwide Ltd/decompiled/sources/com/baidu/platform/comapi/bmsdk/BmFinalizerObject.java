package com.baidu.platform.comapi.bmsdk;

/* loaded from: classes2.dex */
public class BmFinalizerObject {
    private BmFinalizerObject() {
    }

    public static void a(long j8) {
        if (j8 != 0) {
            nativeFinalizer(j8);
        }
    }

    private static native void nativeFinalizer(long j8);
}
