package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import c3.n;
import c3.p;
import c3.s;
import c3.u;
import c3.x;
import c3.y;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.bo0;
import com.google.android.gms.internal.ads.cz;
import com.google.android.gms.internal.ads.qw;
import com.google.android.gms.internal.ads.zzcql;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import r2.f;
import r2.g;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, u, zzcql, y {

    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private r2.f adLoader;

    @RecentlyNonNull
    protected r2.j mAdView;

    @RecentlyNonNull
    protected b3.a mInterstitialAd;

    r2.g buildAdRequest(Context context, c3.e eVar, Bundle bundle, Bundle bundle2) {
        g.a aVar = new g.a();
        Date c7 = eVar.c();
        if (c7 != null) {
            aVar.j(c7);
        }
        int k7 = eVar.k();
        if (k7 != 0) {
            aVar.k(k7);
        }
        Set<String> e7 = eVar.e();
        if (e7 != null) {
            Iterator<String> it = e7.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        Location j7 = eVar.j();
        if (j7 != null) {
            aVar.f(j7);
        }
        if (eVar.d()) {
            qw.b();
            aVar.i(bo0.t(context));
        }
        if (eVar.h() != -1) {
            aVar.m(eVar.h() == 1);
        }
        aVar.l(eVar.b());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.c();
    }

    @RecentlyNonNull
    protected abstract Bundle buildExtrasBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.mAdView;
    }

    b3.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        x xVar = new x();
        xVar.b(1);
        return xVar.a();
    }

    @Override // c3.y
    public cz getVideoController() {
        r2.j jVar = this.mAdView;
        if (jVar != null) {
            return jVar.e().b();
        }
        return null;
    }

    f.a newAdLoader(Context context, String str) {
        return new f.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        r2.j jVar = this.mAdView;
        if (jVar != null) {
            jVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // c3.u
    public void onImmersiveModeUpdated(boolean z6) {
        b3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z6);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        r2.j jVar = this.mAdView;
        if (jVar != null) {
            jVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, c3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        r2.j jVar = this.mAdView;
        if (jVar != null) {
            jVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull c3.i iVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull r2.h hVar, @RecentlyNonNull c3.e eVar, @RecentlyNonNull Bundle bundle2) {
        r2.j jVar = new r2.j(context);
        this.mAdView = jVar;
        jVar.setAdSize(new r2.h(hVar.j(), hVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new h(this, iVar));
        this.mAdView.b(buildAdRequest(context, eVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull c3.e eVar, @RecentlyNonNull Bundle bundle2) {
        b3.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new i(this, nVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull p pVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull s sVar, @RecentlyNonNull Bundle bundle2) {
        k kVar = new k(this, pVar);
        f.a e7 = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).e(kVar);
        e7.g(sVar.g());
        e7.f(sVar.f());
        if (sVar.i()) {
            e7.d(kVar);
        }
        if (sVar.a()) {
            for (String str : sVar.zza().keySet()) {
                e7.b(str, kVar, true != sVar.zza().get(str).booleanValue() ? null : kVar);
            }
        }
        r2.f a7 = e7.a();
        this.adLoader = a7;
        a7.a(buildAdRequest(context, sVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        b3.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.f(null);
        }
    }
}
