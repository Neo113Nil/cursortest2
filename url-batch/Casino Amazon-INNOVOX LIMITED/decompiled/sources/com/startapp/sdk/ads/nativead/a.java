package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.p1;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.vc;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a extends p1 {
    public final NativeAdPreferences m;

    public a(Context context, vc vcVar, AdPreferences adPreferences, AdEventListener adEventListener, pa paVar, pa paVar2, pa paVar3, pa paVar4, NativeAdPreferences nativeAdPreferences) {
        super(context, vcVar, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE, paVar, paVar2, paVar3, paVar4);
        this.m = nativeAdPreferences != null ? nativeAdPreferences : new NativeAdPreferences();
    }

    @Override // com.startapp.sdk.internal.p1
    public final void a(Ad ad) {
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a c = super.c();
        if (c == null) {
            return null;
        }
        c.t0 = this.m.getAdsNumber();
        NativeAdPreferences.NativeAdBitmapSize imageSize = this.m.getImageSize();
        NativeAdPreferences nativeAdPreferences = this.m;
        if (imageSize != null) {
            c.L = nativeAdPreferences.getImageSize().getWidth();
            c.M = this.m.getImageSize().getHeight();
        } else {
            int primaryImageSize = nativeAdPreferences.getPrimaryImageSize();
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            c.P0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.m.getSecondaryImageSize();
            c.Q0 = Integer.toString(secondaryImageSize != -1 ? secondaryImageSize : 2);
        }
        if (this.m.isContentAd()) {
            c.R0 = this.m.isContentAd();
        }
        return c;
    }
}
