package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.vc;
import com.startapp.sdk.internal.w6;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class j implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc f102a;
    public final /* synthetic */ NativeAdPreferences b;
    public final /* synthetic */ AdEventListener c;
    public final /* synthetic */ StartAppNativeAd d;

    public j(StartAppNativeAd startAppNativeAd, vc vcVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.d = startAppNativeAd;
        this.f102a = vcVar;
        this.b = nativeAdPreferences;
        this.c = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        pa paVar;
        pa paVar2;
        Context context;
        AtomicBoolean atomicBoolean;
        if (ad != null) {
            this.d.setErrorMessage(ad.getErrorMessage());
        }
        paVar = ((Ad) this.d).eventTracer;
        ((w6) paVar.a()).c(this.d, mh.g);
        paVar2 = ((Ad) this.d).eventTracer;
        ((w6) paVar2.a()).b(this.d, mh.b);
        context = ((Ad) this.d).context;
        a0.a(context, this.c, (Ad) this.d, false);
        atomicBoolean = this.d.loading;
        atomicBoolean.set(false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.d.initNativeAdList(this.f102a, this.b, this.c);
    }
}
