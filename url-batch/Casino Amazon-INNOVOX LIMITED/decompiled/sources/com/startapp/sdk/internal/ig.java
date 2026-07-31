package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ig implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.adsbase.i f277a;

    public ig(com.startapp.sdk.adsbase.i iVar) {
        this.f277a = iVar;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f277a.onFailedToReceiveAd(ad);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f277a.onReceiveAd(ad);
    }
}
