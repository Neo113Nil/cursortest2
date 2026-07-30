package com.anythink.network.admob;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.google.android.gms.internal.ads.C2549Fc;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4642m;
import k2.C4630a;
import k2.C4635f;
import k2.C4636g;
import k2.C4638i;
import k2.C4643n;
import k2.EnumC4631b;
import k2.p;
import q2.E0;
import q2.K;
import q2.V0;
import u2.i;
import v2.AbstractC5123a;
import v2.AbstractC5124b;

/* loaded from: classes.dex */
public class AdmobATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f22966e = "AdmobATInterstitialAdapter";

    /* renamed from: a, reason: collision with root package name */
    AbstractC5123a f22967a;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f22970d;

    /* renamed from: g, reason: collision with root package name */
    private String f22972g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC4642m f22973h;
    private AbstractC5124b i;

    /* renamed from: b, reason: collision with root package name */
    C4636g f22968b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f22971f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f22969c = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f22974j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22975k = false;

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends AbstractC5124b {
        public AnonymousClass1() {
        }

        @Override // k2.x
        public final void onAdFailedToLoad(C4643n c4643n) {
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f22967a = null;
            if (((ATBaseAdInternalAdapter) admobATInterstitialAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
            }
        }

        @Override // k2.x
        public final void onAdLoaded(AbstractC5123a abstractC5123a) {
            AdmobATInterstitialAdapter.this.f22967a = abstractC5123a;
            AdmobATInterstitialAdapter.this.f22970d.put("response_info", abstractC5123a.a());
            AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
            admobATInterstitialAdapter.f22969c = true;
            if (admobATInterstitialAdapter.f22974j) {
                AbstractC5123a abstractC5123a2 = AdmobATInterstitialAdapter.this.f22967a;
                p pVar = new p() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.1.1
                    @Override // k2.p
                    public final void onPaidEvent(C4638i c4638i) {
                        if (AdmobATInterstitialAdapter.this.f22975k) {
                            return;
                        }
                        AdmobATInterstitialAdapter.c(AdmobATInterstitialAdapter.this);
                        AdMobATInitManager.getInstance();
                        AdMobATInitManager.a(AdmobATInterstitialAdapter.this.f22970d, c4638i);
                        if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                            ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                        }
                    }
                };
                C2549Fc c2549Fc = (C2549Fc) abstractC5123a2;
                c2549Fc.getClass();
                try {
                    K k6 = c2549Fc.f24971c;
                    if (k6 != null) {
                        k6.p3(new V0(pVar));
                    }
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                }
            }
            if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATInterstitialAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22978a;

        public AnonymousClass2(Context context) {
            this.f22978a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Context context = this.f22978a;
                String str = AdmobATInterstitialAdapter.this.f22971f;
                AdmobATInterstitialAdapter admobATInterstitialAdapter = AdmobATInterstitialAdapter.this;
                AbstractC5123a.b(context, str, admobATInterstitialAdapter.f22968b, admobATInterstitialAdapter.i);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean c(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.f22975k = true;
        return true;
    }

    public static /* synthetic */ int r(AdmobATInterstitialAdapter admobATInterstitialAdapter) {
        admobATInterstitialAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            AbstractC5123a abstractC5123a = this.f22967a;
            if (abstractC5123a != null) {
                abstractC5123a.c(null);
                this.f22967a = null;
            }
            this.i = null;
            this.f22973h = null;
            this.f22968b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.INTERSTITIAL, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(4, AdmobATSplashAdapter.class);
        hashMap.put(0, AdmobATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22970d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22971f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f22967a != null && this.f22969c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f22971f = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22972g = ATInitMediation.getStringFromMap(map, "payload");
        this.f22974j = ATInitMediation.getIntFromMap(map, j.w.f12786q, 2) == 1;
        if (!TextUtils.isEmpty(this.f22971f)) {
            final Context applicationContext = context.getApplicationContext();
            AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.3
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                    if (((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) AdmobATInterstitialAdapter.this).mLoadListener.onAdLoadError("", str);
                    }
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATInterstitialAdapter.a(AdmobATInterstitialAdapter.this, applicationContext, map, map2);
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
                Log.e(f22966e, "Admob: show(), activity = null");
                return;
            }
            this.f22969c = false;
            AbstractC4642m abstractC4642m = new AbstractC4642m() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4
                @Override // k2.AbstractC4642m
                public final void onAdClicked() {
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
                    AdmobATInterstitialAdapter.r(AdmobATInterstitialAdapter.this);
                }

                @Override // k2.AbstractC4642m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATInterstitialAdapter.this.f22967a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATInterstitialAdapter.this.getTrackingInfo().z(), AdmobATInterstitialAdapter.this.f22967a);
                        }
                    } catch (Throwable unused) {
                    }
                    if (AdmobATInterstitialAdapter.this.f22974j) {
                        AdmobATInterstitialAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATInterstitialAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATInterstitialAdapter.this.f22975k) {
                                    return;
                                }
                                AdmobATInterstitialAdapter.c(AdmobATInterstitialAdapter.this);
                                if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                                    ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                                }
                            }
                        }, 500L);
                    } else if (((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) AdmobATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }
            };
            this.f22973h = abstractC4642m;
            this.f22967a.c(abstractC4642m);
            this.f22967a.d(activity);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4635f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), map, map2, EnumC4631b.INTERSTITIAL, !TextUtils.isEmpty(this.f22972g));
        if (!TextUtils.isEmpty(this.f22972g)) {
            ((E0) a9.f37200u).f39929m = this.f22972g;
        }
        a9.getClass();
        this.f22968b = new C4636g(a9);
        this.f22970d = new HashMap();
        this.i = new AnonymousClass1();
        postOnMainThread(new AnonymousClass2(context));
    }

    public static void a(AdmobATInterstitialAdapter admobATInterstitialAdapter, Context context, Map map, Map map2) {
        C4635f a9 = AdMobATInitManager.getInstance().a(context.getApplicationContext(), (Map<String, Object>) map, (Map<String, Object>) map2, EnumC4631b.INTERSTITIAL, !TextUtils.isEmpty(admobATInterstitialAdapter.f22972g));
        if (!TextUtils.isEmpty(admobATInterstitialAdapter.f22972g)) {
            ((E0) a9.f37200u).f39929m = admobATInterstitialAdapter.f22972g;
        }
        a9.getClass();
        admobATInterstitialAdapter.f22968b = new C4636g(a9);
        admobATInterstitialAdapter.f22970d = new HashMap();
        admobATInterstitialAdapter.i = admobATInterstitialAdapter.new AnonymousClass1();
        admobATInterstitialAdapter.postOnMainThread(admobATInterstitialAdapter.new AnonymousClass2(context));
    }
}
