package com.google.android.gms.internal.ads;

import io.invertase.googlemobileads.ReactNativeGoogleMobileAdsEvent;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public enum zzflr {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(ReactNativeGoogleMobileAdsEvent.GOOGLE_MOBILE_ADS_EVENT_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzi;

    zzflr(String str) {
        this.zzi = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzi;
    }
}
