package com.anythink.network.admob;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4632c;
import k2.C4643n;
import k2.EnumC4631b;
import k2.s;
import l2.C4686a;
import l2.C4687b;
import l2.C4688c;
import q2.G0;
import q2.K;
import u2.i;

/* loaded from: classes.dex */
public class GoogleAdATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: b, reason: collision with root package name */
    C4688c f23065b;

    /* renamed from: c, reason: collision with root package name */
    long f23066c;

    /* renamed from: a, reason: collision with root package name */
    C4687b f23064a = null;

    /* renamed from: g, reason: collision with root package name */
    private String f23070g = "";

    /* renamed from: d, reason: collision with root package name */
    int f23067d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f23068e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f23069f = 2;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23071h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends AbstractC4632c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4688c f23076a;

        public AnonymousClass2(C4688c c4688c) {
            this.f23076a = c4688c;
        }

        @Override // k2.AbstractC4632c
        public final void onAdClicked() {
            if (GoogleAdATBannerAdapter.this.f23067d != 1 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f23066c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f23067d = 2;
                googleAdATBannerAdapter.f23066c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdClosed() {
        }

        @Override // k2.AbstractC4632c
        public final void onAdFailedToLoad(C4643n c4643n) {
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdImpression() {
            try {
                if (GoogleAdATBannerAdapter.this.f23065b != null) {
                    AdMobATInitManager.getInstance().a(GoogleAdATBannerAdapter.this.getTrackingInfo().z(), GoogleAdATBannerAdapter.this.f23065b);
                }
            } catch (Throwable unused) {
            }
            CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdLoaded() {
            GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
            C4688c c4688c = this.f23076a;
            googleAdATBannerAdapter.f23065b = c4688c;
            s responseInfo = c4688c.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdATBannerAdapter.this.f23071h.put("response_info", responseInfo);
            }
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // k2.AbstractC4632c
        public final void onAdOpened() {
            if (GoogleAdATBannerAdapter.this.f23067d != 2 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f23066c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f23067d = 1;
                googleAdATBannerAdapter.f23066c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        C4688c c4688c = this.f23065b;
        if (c4688c != null) {
            c4688c.setAdListener(null);
            this.f23065b.a();
            this.f23065b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f23065b;
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, GoogleAdATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        boolean z8;
        K k6;
        if (this.f23071h == null) {
            this.f23071h = new HashMap();
        }
        try {
            C4688c c4688c = this.f23065b;
            if (c4688c != null) {
                Map<String, Object> map = this.f23071h;
                G0 g02 = c4688c.f38724n;
                g02.getClass();
                try {
                    k6 = g02.i;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                }
                if (k6 != null) {
                    z8 = k6.L();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z8));
                }
                z8 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z8));
            }
        } catch (Throwable unused) {
        }
        return this.f23071h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23070g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23070g = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATBannerAdapter.1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdATBannerAdapter.a(GoogleAdATBannerAdapter.this, applicationContext, map, map2);
                }
            });
        } else {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4688c c4688c = new C4688c(context);
        c4688c.setAdSizes(AdmobATConst.a(context, map2, map));
        c4688c.setAdUnitId(this.f23070g);
        c4688c.setAdListener(new AnonymousClass2(c4688c));
        C4686a a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.BANNER);
        a9.getClass();
        C4687b c4687b = new C4687b(a9);
        this.f23064a = c4687b;
        c4688c.c(c4687b);
    }

    public static void a(GoogleAdATBannerAdapter googleAdATBannerAdapter, Context context, Map map, Map map2) {
        C4688c c4688c = new C4688c(context);
        c4688c.setAdSizes(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        c4688c.setAdUnitId(googleAdATBannerAdapter.f23070g);
        c4688c.setAdListener(googleAdATBannerAdapter.new AnonymousClass2(c4688c));
        C4686a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.BANNER);
        a9.getClass();
        C4687b c4687b = new C4687b(a9);
        googleAdATBannerAdapter.f23064a = c4687b;
        c4688c.c(c4687b);
    }
}
