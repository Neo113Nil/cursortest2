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
    public final NativeAdPreferences f6203m;

    public a(Context context, nd ndVar, AdPreferences adPreferences, AdEventListener adEventListener, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, NativeAdPreferences nativeAdPreferences) {
        super(context, ndVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE, ibVar, ibVar2, ibVar3, ibVar4);
        this.f6203m = nativeAdPreferences != null ? nativeAdPreferences : new NativeAdPreferences();
    }

    @Override // com.startapp.sdk.internal.t1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c4 = super.c();
        if (c4 == null) {
            return null;
        }
        c4.f6479t0 = this.f6203m.getAdsNumber();
        if (this.f6203m.getImageSize() != null) {
            c4.L = this.f6203m.getImageSize().getWidth();
            c4.f7897M = this.f6203m.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f6203m.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            c4.f6468P0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f6203m.getSecondaryImageSize();
            c4.f6469Q0 = Integer.toString(secondaryImageSize != -1 ? secondaryImageSize : 2);
        }
        if (this.f6203m.isContentAd()) {
            c4.f6470R0 = this.f6203m.isContentAd();
        }
        return c4;
    }
}
