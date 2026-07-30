package com.baidu.platform.comapi.bmsdk;

/* loaded from: classes2.dex */
public class Bm3DModelGroup extends BmDrawItem {
    private Bm3DModelGroup() {
        super(21, nativeCreate());
    }

    private static native boolean nativeAddNode3D(long j8, double[] dArr, int i8);

    private static native boolean nativeClear3DNode(long j8);

    private static native long nativeCreate();

    private static native boolean nativeLoad(long j8, String str, int i8);

    private static native boolean nativeSetLightBreathLevel(long j8, int i8, int i9);

    private static native boolean nativeSetLightEnable(long j8, int i8);

    private static native boolean nativeSetScaleByLevel(long j8, boolean z7);
}
