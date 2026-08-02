package com.startapp.sdk.internal;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* loaded from: classes.dex */
public final class l7 extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n7 f4083a;

    public l7(n7 n7Var) {
        this.f4083a = n7Var;
    }

    public final void onAdClicked() {
        com.startapp.sdk.adsbase.l lVar = this.f4083a.f4189c;
        if (lVar != null) {
            lVar.c();
        }
    }

    public final void onAdDismissedFullScreenContent() {
        com.startapp.sdk.adsbase.l lVar = this.f4083a.f4189c;
        if (lVar != null) {
            lVar.b();
        }
    }

    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        kotlin.jvm.internal.j.e(adError, "adError");
        com.startapp.sdk.adsbase.l lVar = this.f4083a.f4189c;
        if (lVar != null) {
            adError.toString();
            lVar.e();
        }
    }

    public final void onAdImpression() {
        com.startapp.sdk.adsbase.l lVar = this.f4083a.f4189c;
        if (lVar != null) {
            lVar.d();
        }
    }

    public final void onAdShowedFullScreenContent() {
        com.startapp.sdk.adsbase.l lVar = this.f4083a.f4189c;
        if (lVar != null) {
            lVar.a();
        }
    }
}
