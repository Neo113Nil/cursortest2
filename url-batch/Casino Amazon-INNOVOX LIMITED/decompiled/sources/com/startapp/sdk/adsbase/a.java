package com.startapp.sdk.adsbase;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.x5;
import com.startapp.sdk.internal.zh;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f119a;
    public final /* synthetic */ Ad b;

    public a(Ad ad, AdEventListener adEventListener) {
        this.b = ad;
        this.f119a = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        a0.a(this.b.context, this.f119a, ad, false);
        String errorMessage = ad != null ? ad.getErrorMessage() : null;
        if (errorMessage == null) {
            errorMessage = "";
        } else if (errorMessage.contains("204")) {
            errorMessage = "NO FILL";
        }
        zh.a(6, this.b.context, "Failed to load " + (ad != null ? zh.a(ad) : "") + " ad: " + errorMessage);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.b.lastLoadTime = Long.valueOf(System.currentTimeMillis());
        a0.b(this.b.context, this.f119a, ad, false);
        ConsentData consentData = ad.getConsentData();
        if (consentData != null) {
            ((x5) this.b.consentManager.a()).a(consentData.f(), consentData.e(), consentData.a(), false, true);
        }
        zh.a(4, this.b.context, "Loaded " + zh.a(ad) + " ad with creative ID - " + ad.getAdId());
    }
}
