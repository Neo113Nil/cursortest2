package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.si;

/* loaded from: classes.dex */
public final class a implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f3244b;

    public a(Ad ad, AdEventListener adEventListener) {
        this.f3244b = ad;
        this.f3243a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        a0.a(this.f3244b.context, this.f3243a, ad, false);
        String errorMessage = ad != null ? ad.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        } else if (errorMessage.contains("204")) {
            errorMessage = "NO FILL";
        }
        Context context = this.f3244b.context;
        StringBuilder sb = new StringBuilder("Failed to load ");
        sb.append(ad != null ? si.a(ad) : "");
        sb.append(" ad: ");
        sb.append(errorMessage);
        si.a(6, context, sb.toString());
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3244b.lastLoadTime = Long.valueOf(System.currentTimeMillis());
        a0.b(this.f3244b.context, this.f3243a, ad, false);
        ConsentData consentData = ad.getConsentData();
        if (consentData != null) {
            ((g6) this.f3244b.consentManager.a()).a(consentData.f(), consentData.e(), consentData.a(), false, true);
        }
        si.a(4, this.f3244b.context, "Loaded " + si.a(ad) + " ad with creative ID - " + ad.getAdId());
    }
}
