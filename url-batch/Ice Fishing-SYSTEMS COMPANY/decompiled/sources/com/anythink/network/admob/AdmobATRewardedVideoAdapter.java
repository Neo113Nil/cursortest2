package com.anythink.network.admob;

import F2.c;
import F2.d;
import G2.a;
import G2.b;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.d.j;
import com.anythink.network.admob.AdmobATConst;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.android.gms.internal.ads.C3695of;
import com.google.android.gms.internal.ads.C3856rf;
import com.google.android.gms.internal.ads.C4018uf;
import com.google.android.gms.internal.ads.InterfaceC3047cf;
import com.google.android.gms.internal.ads.InterfaceC3211ff;
import com.google.android.gms.internal.ads.Vx;
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
import k2.q;
import k2.s;
import q2.E0;
import q2.InterfaceC4921w0;
import q2.V0;
import u2.i;

/* loaded from: classes.dex */
public class AdmobATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: g, reason: collision with root package name */
    private static final String f23009g = "AdmobATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f23010a;

    /* renamed from: c, reason: collision with root package name */
    a f23012c;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Object> f23015f;
    private String i;

    /* renamed from: k, reason: collision with root package name */
    private d f23018k;

    /* renamed from: l, reason: collision with root package name */
    private AbstractC4642m f23019l;

    /* renamed from: m, reason: collision with root package name */
    private q f23020m;

    /* renamed from: n, reason: collision with root package name */
    private b f23021n;

    /* renamed from: b, reason: collision with root package name */
    C4636g f23011b = null;

    /* renamed from: h, reason: collision with root package name */
    private String f23016h = "";

    /* renamed from: j, reason: collision with root package name */
    private int f23017j = 1;

    /* renamed from: d, reason: collision with root package name */
    boolean f23013d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f23014e = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f23022o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23023p = false;

    /* renamed from: com.anythink.network.admob.AdmobATRewardedVideoAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23028a;

        public AnonymousClass2(Context context) {
            this.f23028a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f23018k = new d() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1
                    @Override // k2.x
                    public final void onAdFailedToLoad(C4643n c4643n) {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23010a = null;
                        if (((ATBaseAdInternalAdapter) admobATRewardedVideoAdapter).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
                        }
                    }

                    @Override // k2.x
                    public final void onAdLoaded(c cVar) {
                        AdmobATRewardedVideoAdapter.this.f23010a = cVar;
                        AdmobATRewardedVideoAdapter.this.f23015f.put("response_info", cVar.a());
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23014e = true;
                        if (admobATRewardedVideoAdapter.f23022o) {
                            c cVar2 = AdmobATRewardedVideoAdapter.this.f23010a;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.2.1.1
                                @Override // k2.p
                                public final void onPaidEvent(C4638i c4638i) {
                                    if (AdmobATRewardedVideoAdapter.this.f23023p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f23015f, c4638i);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C3695of c3695of = (C3695of) cVar2;
                            c3695of.getClass();
                            try {
                                InterfaceC3211ff interfaceC3211ff = c3695of.f33156a;
                                if (interfaceC3211ff != null) {
                                    interfaceC3211ff.p1(new V0(pVar));
                                }
                            } catch (RemoteException e6) {
                                i.i("#007 Could not call remote method.", e6);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f23028a;
                String str = AdmobATRewardedVideoAdapter.this.f23016h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                c.b(context, str, admobATRewardedVideoAdapter.f23011b, admobATRewardedVideoAdapter.f23018k);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    /* renamed from: com.anythink.network.admob.AdmobATRewardedVideoAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f23032a;

        public AnonymousClass3(Context context) {
            this.f23032a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATRewardedVideoAdapter.this.f23021n = new b() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1
                    @Override // k2.x
                    public final void onAdFailedToLoad(C4643n c4643n) {
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
                        }
                    }

                    @Override // k2.x
                    public final void onAdLoaded(a aVar) {
                        AdmobATRewardedVideoAdapter.this.f23012c = aVar;
                        C4018uf c4018uf = (C4018uf) aVar;
                        c4018uf.getClass();
                        InterfaceC4921w0 interfaceC4921w0 = null;
                        try {
                            InterfaceC3211ff interfaceC3211ff = c4018uf.f34633a;
                            if (interfaceC3211ff != null) {
                                interfaceC4921w0 = interfaceC3211ff.m();
                            }
                        } catch (RemoteException e6) {
                            i.i("#007 Could not call remote method.", e6);
                        }
                        AdmobATRewardedVideoAdapter.this.f23015f.put("response_info", new s(interfaceC4921w0));
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                        admobATRewardedVideoAdapter.f23014e = true;
                        if (admobATRewardedVideoAdapter.f23022o) {
                            a aVar2 = AdmobATRewardedVideoAdapter.this.f23012c;
                            p pVar = new p() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.3.1.1
                                @Override // k2.p
                                public final void onPaidEvent(C4638i c4638i) {
                                    if (AdmobATRewardedVideoAdapter.this.f23023p) {
                                        return;
                                    }
                                    AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                    AdMobATInitManager.getInstance();
                                    AdMobATInitManager.a(AdmobATRewardedVideoAdapter.this.f23015f, c4638i);
                                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                    }
                                }
                            };
                            C4018uf c4018uf2 = (C4018uf) aVar2;
                            c4018uf2.getClass();
                            try {
                                InterfaceC3211ff interfaceC3211ff2 = c4018uf2.f34633a;
                                if (interfaceC3211ff2 != null) {
                                    interfaceC3211ff2.p1(new V0(pVar));
                                }
                            } catch (RemoteException e9) {
                                i.i("#007 Could not call remote method.", e9);
                            }
                        }
                        if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                        }
                    }
                };
                Context context = this.f23032a;
                String str = AdmobATRewardedVideoAdapter.this.f23016h;
                AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                a.a(context, str, admobATRewardedVideoAdapter.f23011b, admobATRewardedVideoAdapter.f23021n);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    public static /* synthetic */ boolean g(AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter) {
        admobATRewardedVideoAdapter.f23023p = true;
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f23010a;
            if (cVar != null) {
                ((C3695of) cVar).f33158c.f34424n = null;
                this.f23010a = null;
            }
            this.f23018k = null;
            this.f23019l = null;
            this.f23020m = null;
            this.f23021n = null;
            this.f23011b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        if (map.containsKey("unit_type")) {
            this.f23017j = Integer.parseInt(map.get("unit_type").toString());
        }
        EnumC4631b enumC4631b = EnumC4631b.REWARDED;
        if (this.f23017j == 2) {
            enumC4631b = EnumC4631b.REWARDED_INTERSTITIAL;
        }
        AdMobATInitManager.getInstance().a(context, map, map2, enumC4631b, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, AdmobATInterstitialAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23015f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23016h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        int i;
        return this.f23014e && (((i = this.f23017j) == 1 && this.f23010a != null) || (i == 2 && this.f23012c != null));
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        this.f23016h = ATInitMediation.getStringFromMap(map, "unit_id");
        this.i = ATInitMediation.getStringFromMap(map, "payload");
        this.f23022o = ATInitMediation.getIntFromMap(map, j.w.f12786q, 2) == 1;
        if (TextUtils.isEmpty(this.f23016h)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        if (map.containsKey("unit_type")) {
            this.f23017j = Integer.parseInt(map.get("unit_type").toString());
        }
        final Context applicationContext = context.getApplicationContext();
        AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.1
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                AdmobATRewardedVideoAdapter.this.startLoadAd(applicationContext, map, map2);
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23009g, "Admob: show(), activity = null");
                return;
            }
            this.f23014e = false;
            this.f23019l = new AbstractC4642m() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4
                @Override // k2.AbstractC4642m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z());
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4630a.f38688a), c4630a.f38689b);
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (AdmobATRewardedVideoAdapter.this.f23012c != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f23012c);
                        }
                        if (AdmobATRewardedVideoAdapter.this.f23010a != null) {
                            AdMobATInitManager.getInstance().a(AdmobATRewardedVideoAdapter.this.getTrackingInfo().z(), AdmobATRewardedVideoAdapter.this.f23010a);
                        }
                    } catch (Throwable unused) {
                    }
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    admobATRewardedVideoAdapter.f23013d = false;
                    if (admobATRewardedVideoAdapter.f23022o) {
                        AdmobATRewardedVideoAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (AdmobATRewardedVideoAdapter.this.f23023p) {
                                    return;
                                }
                                AdmobATRewardedVideoAdapter.g(AdmobATRewardedVideoAdapter.this);
                                if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                                    ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                                }
                            }
                        }, 500L);
                    } else if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.f23020m = new q() { // from class: com.anythink.network.admob.AdmobATRewardedVideoAdapter.5
                @Override // k2.q
                public final void onUserEarnedReward(F2.b bVar) {
                    AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter = AdmobATRewardedVideoAdapter.this;
                    if (!admobATRewardedVideoAdapter.f23013d) {
                        admobATRewardedVideoAdapter.f23013d = true;
                        if (((CustomRewardVideoAdapter) admobATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    try {
                        AdmobATRewardedVideoAdapter admobATRewardedVideoAdapter2 = AdmobATRewardedVideoAdapter.this;
                        if (admobATRewardedVideoAdapter2.f23015f == null) {
                            admobATRewardedVideoAdapter2.f23015f = new HashMap();
                        }
                        if (bVar != null) {
                            HashMap hashMap = new HashMap();
                            InterfaceC3047cf interfaceC3047cf = (InterfaceC3047cf) ((Vx) bVar).f28329u;
                            int i = 0;
                            if (interfaceC3047cf != null) {
                                try {
                                    i = interfaceC3047cf.f();
                                } catch (RemoteException e6) {
                                    i.g("Could not forward getAmount to RewardItem", e6);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str = null;
                            if (interfaceC3047cf != null) {
                                try {
                                    str = interfaceC3047cf.c();
                                } catch (RemoteException e9) {
                                    i.g("Could not forward getType to RewardItem", e9);
                                }
                            }
                            hashMap.put(AdmobATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str);
                            AdmobATRewardedVideoAdapter.this.f23015f.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) AdmobATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            if (this.f23017j == 2) {
                ((C4018uf) this.f23012c).f34635c.f34424n = this.f23019l;
                String str = this.mUserId;
                String str2 = this.mUserData;
                C4018uf c4018uf = (C4018uf) this.f23012c;
                c4018uf.getClass();
                try {
                    InterfaceC3211ff interfaceC3211ff = c4018uf.f34633a;
                    if (interfaceC3211ff != null) {
                        interfaceC3211ff.o3(new C3856rf(str, str2));
                    }
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                }
                if (ATSDK.isNetworkLogDebug()) {
                    Log.i(f23009g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
                }
                this.f23012c.b(activity, this.f23020m);
                return;
            }
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23016h);
            }
            String str3 = this.mUserId;
            String str4 = this.mUserData;
            C3695of c3695of = (C3695of) this.f23010a;
            c3695of.getClass();
            try {
                InterfaceC3211ff interfaceC3211ff2 = c3695of.f33156a;
                if (interfaceC3211ff2 != null) {
                    interfaceC3211ff2.o3(new C3856rf(str3, str4));
                }
            } catch (RemoteException e9) {
                i.i("#007 Could not call remote method.", e9);
            }
            if (ATSDK.isNetworkLogDebug()) {
                Log.i(f23009g, "ServerSideVerificationOptions: userId:" + str3 + "||userCustomData:" + str4);
            }
            c cVar = this.f23010a;
            ((C3695of) cVar).f33158c.f34424n = this.f23019l;
            cVar.d(activity, this.f23020m);
        }
    }

    public void startLoadAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        this.f23015f = new HashMap();
        if (this.f23017j != 2) {
            C4635f a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.REWARDED, !TextUtils.isEmpty(this.i));
            if (!TextUtils.isEmpty(this.i)) {
                ((E0) a9.f37200u).f39929m = this.i;
            }
            a9.getClass();
            this.f23011b = new C4636g(a9);
            startLoadRewardedVideoAd(context);
            return;
        }
        C4635f a10 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.REWARDED_INTERSTITIAL, !TextUtils.isEmpty(this.i));
        if (!TextUtils.isEmpty(this.i)) {
            ((E0) a10.f37200u).f39929m = this.i;
        }
        a10.getClass();
        this.f23011b = new C4636g(a10);
        startLoadInterstitlalRewardAd(context);
    }

    public void startLoadInterstitlalRewardAd(Context context) {
        postOnMainThread(new AnonymousClass3(context));
    }

    public void startLoadRewardedVideoAd(Context context) {
        postOnMainThread(new AnonymousClass2(context));
    }

    private void b(Activity activity) {
        if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
            this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23016h);
        }
        String str = this.mUserId;
        String str2 = this.mUserData;
        C3695of c3695of = (C3695of) this.f23010a;
        c3695of.getClass();
        try {
            InterfaceC3211ff interfaceC3211ff = c3695of.f33156a;
            if (interfaceC3211ff != null) {
                interfaceC3211ff.o3(new C3856rf(str, str2));
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f23009g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        c cVar = this.f23010a;
        ((C3695of) cVar).f33158c.f34424n = this.f23019l;
        cVar.d(activity, this.f23020m);
    }

    private void a(Activity activity) {
        ((C4018uf) this.f23012c).f34635c.f34424n = this.f23019l;
        String str = this.mUserId;
        String str2 = this.mUserData;
        C4018uf c4018uf = (C4018uf) this.f23012c;
        c4018uf.getClass();
        try {
            InterfaceC3211ff interfaceC3211ff = c4018uf.f34633a;
            if (interfaceC3211ff != null) {
                interfaceC3211ff.o3(new C3856rf(str, str2));
            }
        } catch (RemoteException e6) {
            i.i("#007 Could not call remote method.", e6);
        }
        if (ATSDK.isNetworkLogDebug()) {
            Log.i(f23009g, "ServerSideVerificationOptions: userId:" + str + "||userCustomData:" + str2);
        }
        this.f23012c.b(activity, this.f23020m);
    }
}
