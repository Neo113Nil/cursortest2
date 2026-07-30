package com.anythink.network.admob;

import F2.b;
import F2.c;
import F2.d;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.network.admob.GoogleAdATConst;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.google.android.gms.internal.ads.C3695of;
import com.google.android.gms.internal.ads.C3856rf;
import com.google.android.gms.internal.ads.InterfaceC3047cf;
import com.google.android.gms.internal.ads.InterfaceC3211ff;
import com.google.android.gms.internal.ads.Vx;
import java.util.HashMap;
import java.util.Map;
import k2.AbstractC4642m;
import k2.C4630a;
import k2.C4643n;
import k2.EnumC4631b;
import k2.q;
import l2.C4686a;
import l2.C4687b;
import u2.i;

/* loaded from: classes.dex */
public class GoogleAdATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: e, reason: collision with root package name */
    private static final String f23109e = "GoogleAdATRewardedVideoAdapter";

    /* renamed from: a, reason: collision with root package name */
    c f23110a;

    /* renamed from: g, reason: collision with root package name */
    private d f23115g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC4642m f23116h;
    private q i;

    /* renamed from: b, reason: collision with root package name */
    C4687b f23111b = null;

    /* renamed from: f, reason: collision with root package name */
    private String f23114f = "";

    /* renamed from: c, reason: collision with root package name */
    boolean f23112c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f23113d = false;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f23117j = new HashMap();

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            c cVar = this.f23110a;
            if (cVar != null) {
                ((C3695of) cVar).f33158c.f34424n = null;
                this.f23110a = null;
            }
            this.f23115g = null;
            this.f23116h = null;
            this.i = null;
            this.f23111b = null;
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23117j;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23114f;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        return this.f23110a != null && this.f23113d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23114f = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            startLoadAd(context.getApplicationContext(), map, map2);
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z8, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z8, z9);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            if (activity == null) {
                Log.e(f23109e, "show(), activity = null");
                return;
            }
            this.f23113d = false;
            if (!TextUtils.isEmpty(this.mUserData) && this.mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                this.mUserData = this.mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, this.f23114f);
            }
            c cVar = this.f23110a;
            String str = this.mUserId;
            String str2 = this.mUserData;
            C3695of c3695of = (C3695of) cVar;
            c3695of.getClass();
            try {
                InterfaceC3211ff interfaceC3211ff = c3695of.f33156a;
                if (interfaceC3211ff != null) {
                    interfaceC3211ff.o3(new C3856rf(str, str2));
                }
            } catch (RemoteException e6) {
                i.i("#007 Could not call remote method.", e6);
            }
            AbstractC4642m abstractC4642m = new AbstractC4642m() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.2
                @Override // k2.AbstractC4642m
                public final void onAdClicked() {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdDismissedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f23110a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z());
                        }
                    } catch (Throwable unused) {
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdFailedToShowFullScreenContent(C4630a c4630a) {
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(String.valueOf(c4630a.f38688a), c4630a.f38689b);
                    }
                }

                @Override // k2.AbstractC4642m
                public final void onAdShowedFullScreenContent() {
                    try {
                        if (GoogleAdATRewardedVideoAdapter.this.f23110a != null) {
                            AdMobATInitManager.getInstance().a(GoogleAdATRewardedVideoAdapter.this.getTrackingInfo().z(), GoogleAdATRewardedVideoAdapter.this.f23110a);
                        }
                    } catch (Throwable unused) {
                    }
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    googleAdATRewardedVideoAdapter.f23112c = false;
                    if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }
            };
            this.f23116h = abstractC4642m;
            ((C3695of) this.f23110a).f33158c.f34424n = abstractC4642m;
            q qVar = new q() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.3
                @Override // k2.q
                public final void onUserEarnedReward(b bVar) {
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    if (!googleAdATRewardedVideoAdapter.f23112c) {
                        googleAdATRewardedVideoAdapter.f23112c = true;
                        if (((CustomRewardVideoAdapter) googleAdATRewardedVideoAdapter).mImpressionListener != null) {
                            ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                        }
                    }
                    if (bVar != null) {
                        try {
                            if (GoogleAdATRewardedVideoAdapter.this.f23117j == null) {
                                GoogleAdATRewardedVideoAdapter.this.f23117j = new HashMap();
                            }
                            HashMap hashMap = new HashMap();
                            InterfaceC3047cf interfaceC3047cf = (InterfaceC3047cf) ((Vx) bVar).f28329u;
                            int i = 0;
                            if (interfaceC3047cf != null) {
                                try {
                                    i = interfaceC3047cf.f();
                                } catch (RemoteException e9) {
                                    i.g("Could not forward getAmount to RewardItem", e9);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_AMOUNT, Integer.valueOf(i));
                            String str3 = null;
                            if (interfaceC3047cf != null) {
                                try {
                                    str3 = interfaceC3047cf.c();
                                } catch (RemoteException e10) {
                                    i.g("Could not forward getType to RewardItem", e10);
                                }
                            }
                            hashMap.put(GoogleAdATConst.REWARD_EXTRA.REWARD_EXTRA_KEY_REWARD_TYPE, str3);
                            GoogleAdATRewardedVideoAdapter.this.f23117j.put(ATAdConst.REWARD_EXTRA.REWARD_INFO, hashMap);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    if (((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) GoogleAdATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }
            };
            this.i = qVar;
            this.f23110a.d(activity, qVar);
        }
    }

    public void startLoadAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4686a a9 = AdMobATInitManager.getInstance().a(context, map, map2, EnumC4631b.REWARDED);
        a9.getClass();
        this.f23111b = new C4687b(a9);
        postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    GoogleAdATRewardedVideoAdapter.this.f23115g = new d() { // from class: com.anythink.network.admob.GoogleAdATRewardedVideoAdapter.1.1
                        @Override // k2.x
                        public final void onAdFailedToLoad(C4643n c4643n) {
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f23110a = null;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(String.valueOf(c4643n.f38688a), c4643n.f38689b);
                            }
                        }

                        @Override // k2.x
                        public final void onAdLoaded(c cVar) {
                            GoogleAdATRewardedVideoAdapter.this.f23110a = cVar;
                            GoogleAdATRewardedVideoAdapter.this.f23117j.put("response_info", cVar.a());
                            GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                            googleAdATRewardedVideoAdapter.f23113d = true;
                            if (((ATBaseAdInternalAdapter) googleAdATRewardedVideoAdapter).mLoadListener != null) {
                                ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        }
                    };
                    Context context2 = context;
                    String str = GoogleAdATRewardedVideoAdapter.this.f23114f;
                    GoogleAdATRewardedVideoAdapter googleAdATRewardedVideoAdapter = GoogleAdATRewardedVideoAdapter.this;
                    c.c(context2, str, googleAdATRewardedVideoAdapter.f23111b, googleAdATRewardedVideoAdapter.f23115g);
                } catch (Throwable th) {
                    if (((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener != null) {
                        ((ATBaseAdInternalAdapter) GoogleAdATRewardedVideoAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                    }
                }
            }
        });
    }
}
