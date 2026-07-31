package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import c3.e;
import c3.i;
import c3.n;
import c3.p;
import c3.s;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.io0;
import java.util.Objects;
import r2.h;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e, reason: collision with root package name */
    static final r2.a f2430e = new r2.a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a, reason: collision with root package name */
    private View f2431a;

    /* renamed from: b, reason: collision with root package name */
    CustomEventBanner f2432b;

    /* renamed from: c, reason: collision with root package name */
    CustomEventInterstitial f2433c;

    /* renamed from: d, reason: collision with root package name */
    CustomEventNative f2434d;

    private static <T> T a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.f2431a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f2432b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2433c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f2434d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f2432b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f2433c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f2434d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f2432b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f2433c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f2434d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull h hVar, @RecentlyNonNull e eVar, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f2432b = customEventBanner;
        if (customEventBanner == null) {
            iVar.d(this, f2430e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f2432b;
        Objects.requireNonNull(customEventBanner2);
        customEventBanner2.requestBannerAd(context, new a(this, iVar), bundle.getString("parameter"), hVar, eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f2433c = customEventInterstitial;
        if (customEventInterstitial == null) {
            nVar.f(this, f2430e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f2433c;
        Objects.requireNonNull(customEventInterstitial2);
        customEventInterstitial2.requestInterstitialAd(context, new b(this, this, nVar), bundle.getString("parameter"), eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f2434d = customEventNative;
        if (customEventNative == null) {
            pVar.n(this, f2430e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f2434d;
        Objects.requireNonNull(customEventNative2);
        customEventNative2.requestNativeAd(context, new c(this, pVar), bundle.getString("parameter"), sVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f2433c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
