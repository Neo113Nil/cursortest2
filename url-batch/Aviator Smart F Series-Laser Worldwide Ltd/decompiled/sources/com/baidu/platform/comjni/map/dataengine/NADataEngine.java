package com.baidu.platform.comjni.map.dataengine;

import android.os.Bundle;
import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NADataEngine extends NativeComponent {
    private native void nativeCancelThumbImageRequest(long j8);

    private native long nativeCreate();

    private native String nativeGetCurrentStreetId(long j8);

    private native String nativeGetCurrentStreetInfo(long j8, Bundle bundle);

    private native boolean nativeGetHotMapCityInfo(long j8, Bundle bundle);

    private native boolean nativeGetStreetCityInfo(long j8, Bundle bundle);

    private native boolean nativeQueryThumbImage(long j8, String str);

    private native int nativeRelease(long j8);

    private native void nativeSetStreetPOIUID(long j8, String str);

    private native boolean nativeStreetSwitchByUID(long j8, String str, String str2);

    private native boolean nativeStreetSwitchToID(long j8, String str, int i8);

    private native boolean nativeStreetSwitchToIDFromReGeo(long j8, String str, String str2, long j9, long j10);

    private native boolean nativeStreetSwitchToIID(long j8, String str, String str2, boolean z7);

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        this.mNativePointer = nativeCreate();
        return this.mNativePointer;
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        if (this.mNativePointer == 0) {
            return 0;
        }
        int nativeRelease = nativeRelease(this.mNativePointer);
        this.mNativePointer = 0L;
        return nativeRelease;
    }
}
