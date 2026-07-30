package com.baidu.platform.comapi.bmsdk;

import com.baidu.platform.comapi.bmsdk.style.BmTextStyle;

/* loaded from: classes2.dex */
public class BmTextPathMarker extends BmDrawItem {

    /* renamed from: i, reason: collision with root package name */
    private String f8916i;

    /* renamed from: j, reason: collision with root package name */
    private BmTextStyle f8917j;

    public BmTextPathMarker() {
        super(6, nativeCreate());
    }

    private static native boolean nativeAddGeoElement(long j8, long j9);

    private static native boolean nativeClearGeoElements(long j8);

    private static native long nativeCreate();

    private static native boolean nativeSetGeoElement(long j8, long j9);

    private static native boolean nativeSetStyle(long j8, long j9);

    private static native boolean nativeSetText(long j8, String str);

    public boolean a(String str) {
        this.f8916i = str;
        return nativeSetText(this.nativeInstance, str);
    }

    public boolean a(BmTextStyle bmTextStyle) {
        this.f8917j = bmTextStyle;
        return bmTextStyle != null ? nativeSetStyle(this.nativeInstance, bmTextStyle.nativeInstance) : nativeSetStyle(this.nativeInstance, 0L);
    }

    public boolean a(BmGeoElement bmGeoElement) {
        return nativeAddGeoElement(this.nativeInstance, bmGeoElement.getNativeInstance());
    }
}
