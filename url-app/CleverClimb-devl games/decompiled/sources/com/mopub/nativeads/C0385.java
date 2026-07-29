package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import com.aiming.mdt.Callback;
import com.aiming.mdt.utils.AdLog;
import com.mopub.nativeads.CustomEventNative;

/* renamed from: com.mopub.nativeads.ʻ, reason: contains not printable characters */
/* loaded from: classes2.dex */
final class C0385 implements Callback {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ AdtNative f1314;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ CustomEventNative.CustomEventNativeListener f1315;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ Context f1316;

    C0385(AdtNative adtNative, Context context, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
        this.f1314 = adtNative;
        this.f1316 = context;
        this.f1315 = customEventNativeListener;
    }

    @Override // com.aiming.mdt.Callback
    public final void onError(String str) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(AdtNative.f1277);
        sb.append("---AdtAds--init onError");
        singleton.LogD(sb.toString());
    }

    @Override // com.aiming.mdt.Callback
    public final void onSuccess() {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(AdtNative.f1277);
        sb.append("---AdtAds--init success");
        singleton.LogD(sb.toString());
        this.f1314.m1345((Activity) this.f1316, this.f1315);
    }
}
