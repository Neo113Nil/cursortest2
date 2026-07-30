package com.baidu.platform.comapi.bmsdk;

import com.baidu.mapapi.map.Track;

/* loaded from: classes2.dex */
public class BmTrack extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private Track f8918i;

    public BmTrack() {
        super(25, nativeCreate());
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetTrackMove(long j8, boolean z7);

    public void a(Track track) {
        this.f8918i = track;
    }

    public boolean c(boolean z7) {
        return nativeSetTrackMove(this.nativeInstance, z7);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
    }
}
