package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.nd;
import com.startapp.sdk.internal.t1;

/* loaded from: classes.dex */
public final class a extends t1 {

    /* renamed from: m, reason: collision with root package name */
    public final NativeAdPreferences f3120m;

    public a(Context context, nd ndVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, NativeAdPreferences nativeAdPreferences) {
        super(context, ndVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE, ibVar, ibVar2, ibVar3, ibVar4);
        this.f3120m = nativeAdPreferences != null ? nativeAdPreferences : new NativeAdPreferences();
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c3 = super.c();
        if (c3 == null) {
            return null;
        }
        c3.f3384t0 = this.f3120m.getAdsNumber();
        if (this.f3120m.getImageSize() != null) {
            c3.L = this.f3120m.getImageSize().getWidth();
            c3.f4751M = this.f3120m.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f3120m.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            c3.f3374P0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f3120m.getSecondaryImageSize();
            c3.f3375Q0 = Integer.toString(secondaryImageSize != -1 ? secondaryImageSize : 2);
        }
        if (this.f3120m.isContentAd()) {
            c3.R0 = this.f3120m.isContentAd();
        }
        return c3;
    }
}
