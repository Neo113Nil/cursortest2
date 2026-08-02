package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* loaded from: classes.dex */
public final class p7 extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q7 f4303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdManagerAdView f4304b;

    public p7(q7 q7Var, AdManagerAdView adManagerAdView) {
        this.f4303a = q7Var;
        this.f4304b = adManagerAdView;
    }

    public final void onAdClicked() {
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.c();
        }
    }

    public final void onAdClosed() {
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public final void onAdFailedToLoad(LoadAdError errorCode) {
        kotlin.jvm.internal.j.e(errorCode, "errorCode");
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.a(errorCode.toString());
        }
    }

    public final void onAdImpression() {
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    public final void onAdLoaded() {
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.a((View) this.f4304b);
        }
    }

    public final void onAdOpened() {
        c0 c0Var = this.f4303a.f4349e;
        if (c0Var != null) {
            c0Var.a();
        }
    }
}
