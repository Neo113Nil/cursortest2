package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4642m;
import k2.C4630a;
import k2.C4643n;
import k2.EnumC4631b;
import l2.C4686a;
import l2.C4687b;
import v2.AbstractC5123a;
import v2.AbstractC5124b;

/* loaded from: classes.dex */
public class GoogleAdATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final String f23078d = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5123a f23079a;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC4642m f23083f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC5124b f23084g;

    /* renamed from: b, reason: collision with root package name */
    C4687b f23080b = null;

    /* renamed from: e, reason: collision with root package name */
    private String f23082e = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f23081c = false;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23085h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5124b {
        public AnonymousClass1() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(C4643n c4643n) {
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f23079a = null;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC5123a abstractC5123a) {
            GoogleAdATInterstitialAdapter.this.f23079a = abstractC5123a;
            GoogleAdATInterstitialAdapter.this.f23085h.put("response_info", abstractC5123a.a());
            GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
            googleAdATInterstitialAdapter.f23081c = true;
            if (((ATBaseAdInternalAdapter) googleAdATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.GoogleAdATInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23087a;

        public AnonymousClass2(Context context) {
            this.f23087a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f23087a;
                String str = GoogleAdATInterstitialAdapter.this.f23082e;
                GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter = GoogleAdATInterstitialAdapter.this;
                AbstractC5123a.b(context, str, googleAdATInterstitialAdapter.f23080b, googleAdATInterstitialAdapter.f23084g);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ int n(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter) {
        googleAdATInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            AbstractC5123a abstractC5123a = this.f23079a;
            if (abstractC5123a != null) {
                abstractC5123a.c(null);
                this.f23079a = null;
            }
            this.f23084g = null;
            this.f23083f = null;
            this.f23080b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(4, GoogleAdATSplashAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23085h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23082e;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23079a != null && this.f23081c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23082e = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    GoogleAdATInterstitialAdapter.a(GoogleAdATInterstitialAdapter.this, applicationContext, map, map2);
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

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23078d, "show(), activity = null");
                return;
            }
            this.f23081c = false;
            AbstractC4642m abstractC4642m = new AbstractC4642m() { // from class: com.anythink.network.admob.GoogleAdATInterstitialAdapter.4
                @Override // k2.AbstractC4642m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f23079a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
                    GoogleAdATInterstitialAdapter.n(GoogleAdATInterstitialAdapter.this);
                }

                @Override // k2.AbstractC4642m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATInterstitialAdapter.this.f23079a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATInterstitialAdapter.this.getTrackingInfo().z(), GoogleAdATInterstitialAdapter.this.f23079a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) GoogleAdATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.f23083f = abstractC4642m;
            this.f23079a.c(abstractC4642m);
            this.f23079a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4686a a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.INTERSTITIAL);
        a9.getClass();
        this.f23080b = new C4687b(a9);
        this.f23084g = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(GoogleAdATInterstitialAdapter googleAdATInterstitialAdapter, Context context, Map map, Map map2) {
        C4686a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.INTERSTITIAL);
        a9.getClass();
        googleAdATInterstitialAdapter.f23080b = new C4687b(a9);
        googleAdATInterstitialAdapter.f23084g = googleAdATInterstitialAdapter.new AnonymousClass1();
        googleAdATInterstitialAdapter.postOnMainThread(googleAdATInterstitialAdapter.new AnonymousClass2(context));
    }
}
