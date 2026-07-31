package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.io0;
import d3.c;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<c, q0.c>, MediationInterstitialAdapter<c, q0.c> {

    /* renamed from: a, reason: collision with root package name */
    private View f2199a;

    /* renamed from: b, reason: collision with root package name */
    CustomEventBanner f2200b;

    /* renamed from: c, reason: collision with root package name */
    CustomEventInterstitial f2201c;

    private static <T> T a(String str) {
        try {
            return (T) Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            io0.g(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    public void destroy() {
        CustomEventBanner customEventBanner = this.f2200b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2201c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    @RecentlyNonNull
    public Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.f2199a;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, com.google.ads.mediation.b
    @RecentlyNonNull
    public Class<q0.c> getServerParametersType() {
        return q0.c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull com.google.ads.mediation.c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull q0.c cVar2, @RecentlyNonNull p0.c cVar3, @RecentlyNonNull com.google.ads.mediation.a aVar, @RecentlyNonNull c cVar4) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(cVar2.f20163b);
        this.f2200b = customEventBanner;
        if (customEventBanner == null) {
            cVar.b(this, p0.a.INTERNAL_ERROR);
        } else {
            this.f2200b.requestBannerAd(new a(this, cVar), activity, cVar2.f20162a, cVar2.f20164c, cVar3, aVar, cVar4 == null ? null : cVar4.a(cVar2.f20162a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull q0.c cVar, @RecentlyNonNull com.google.ads.mediation.a aVar, @RecentlyNonNull c cVar2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(cVar.f20163b);
        this.f2201c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.a(this, p0.a.INTERNAL_ERROR);
        } else {
            this.f2201c.requestInterstitialAd(new b(this, this, dVar), activity, cVar.f20162a, cVar.f20164c, aVar, cVar2 == null ? null : cVar2.a(cVar.f20162a));
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f2201c.showInterstitial();
    }
}
