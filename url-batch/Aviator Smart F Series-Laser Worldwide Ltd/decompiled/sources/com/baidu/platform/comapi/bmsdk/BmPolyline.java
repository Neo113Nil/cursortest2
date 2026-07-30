package com.baidu.platform.comapi.bmsdk;

/* loaded from: classes2.dex */
public class BmPolyline extends BmBaseLine {
    public BmPolyline() {
        super(8, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeUseGeodesic(long j8, boolean z7);
}
