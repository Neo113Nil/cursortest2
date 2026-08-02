package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.nd;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nd f6217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeAdPreferences f6218b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f6219c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f6220d;

    public j(StartAppNativeAd startAppNativeAd, nd ndVar, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        this.f6220d = startAppNativeAd;
        this.f6217a = ndVar;
        this.f6218b = nativeAdPreferences;
        this.f6219c = adEventListener;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        ib ibVar;
        ib ibVar2;
        Context context;
        AtomicBoolean atomicBoolean;
        if (ad != null) {
            this.f6220d.setErrorMessage(ad.getErrorMessage());
        }
        ibVar = ((Ad) this.f6220d).eventTracer;
        ((y6) ((x6) ibVar.a())).c(this.f6220d, fi.f6935g);
        ibVar2 = ((Ad) this.f6220d).eventTracer;
        ((y6) ((x6) ibVar2.a())).b(this.f6220d, fi.f6930b);
        context = ((Ad) this.f6220d).context;
        a0.a(context, this.f6219c, this.f6220d, false);
        atomicBoolean = this.f6220d.loading;
        atomicBoolean.set(false);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f6220d.initNativeAdList(this.f6217a, this.f6218b, this.f6219c);
    }
}
