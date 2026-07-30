package com.baidu.platform.comapi.bmsdk.cluster;

import com.baidu.platform.comapi.bmsdk.BmDrawItem;

/* loaded from: classes2.dex */
public class BmClusterGroup extends BmDrawItem {
    private BmClusterGroup() {
        super(14, nativeCreate());
    }

    private static native boolean nativeAddMarker(long j8, long j9);

    private static native boolean nativeClearMarkers(long j8);

    private static native long nativeCreate();

    private static native boolean nativeRemoveMarker(long j8, long j9);

    private static native boolean nativeSetClusterTemplate(long j8, long j9);
}
