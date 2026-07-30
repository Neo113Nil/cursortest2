package com.baidu.platform.comapi.bmsdk.cluster;

import com.baidu.platform.comapi.bmsdk.BmObject;

/* loaded from: classes2.dex */
public class BmClusterTemplate extends BmObject {
    private BmClusterTemplate() {
        super(15, nativeCreate());
    }

    private static native long nativeCreate();

    private static native boolean nativeSetClusterUI(long j8, long[] jArr, int i8);
}
