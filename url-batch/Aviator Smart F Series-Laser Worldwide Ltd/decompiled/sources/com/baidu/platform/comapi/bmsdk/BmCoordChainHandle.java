package com.baidu.platform.comapi.bmsdk;

/* loaded from: classes2.dex */
public class BmCoordChainHandle extends BmObject {
    public BmCoordChainHandle() {
        super(71, nativeCreate());
    }

    private static native long nativeCreate();

    private static native int[] nativeGetIndexs(long j8);

    private static native double[] nativeGetP0Points(long j8);

    private static native boolean nativeHandle(long j8, double[] dArr, int i8, int i9);

    private static native boolean nativeSetCoordAlgorithm(long j8, int i8);

    private static native boolean nativeSetCoordChainType(long j8, int i8);

    private static native boolean nativeSetThreshold(long j8, double d8);
}
