package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import g.c;

/* loaded from: classes.dex */
public final class zzcaf implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f15364a;

    /* renamed from: b, reason: collision with root package name */
    private c3.n f15365b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f15366c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        io0.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        io0.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        io0.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, c3.n nVar, Bundle bundle, c3.e eVar, Bundle bundle2) {
        this.f15365b = nVar;
        if (nVar == null) {
            io0.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            io0.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f15365b.c(this, 0);
            return;
        }
        if (!v3.l.a() || !l20.g(context)) {
            io0.g("Default browser does not support custom tabs. Bailing out.");
            this.f15365b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            io0.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f15365b.c(this, 0);
        } else {
            this.f15364a = (Activity) context;
            this.f15366c = Uri.parse(string);
            this.f15365b.k(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        g.c a7 = new c.a().a();
        a7.f16206a.setData(this.f15366c);
        a3.g2.f72i.post(new tf0(this, new AdOverlayInfoParcel(new z2.f(a7.f16206a, null), null, new sf0(this), null, new po0(0, 0, false, false, false), null, null)));
        y2.t.p().n();
    }
}
