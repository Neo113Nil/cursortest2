package com.anythink.splashad.api;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATAdMultipleLoadedListener;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATAdRevenueListener;
import com.anythink.core.api.ATAdSourceStatusListener;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNativeAdCustomRender;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.ATRequestingInfo;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.api.AdError;
import com.anythink.core.basead.adx.api.ATAdxBidFloorInfo;
import com.anythink.core.common.a.c;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.g;
import com.anythink.core.common.h.ae;
import com.anythink.core.common.u;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.ab;
import com.anythink.core.common.v.p;
import com.anythink.core.d.l;
import com.anythink.core.d.n;
import com.anythink.splashad.a.a;
import com.anythink.splashad.a.b;
import com.anythink.splashad.a.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class ATSplashAd {
    public static final int DEFAULT_SPLASH_TIMEOUT_TIME = 5000;
    final String TAG;
    public ATAdMultipleLoadedListener adMultipleLoadedListener;
    private ATAdRequest adRequest;
    WeakReference<Activity> mActivityWeakRef;
    c mAdLoadManager;
    ATAdRevenueListener mAdRevenueListener;
    com.anythink.core.common.d.c mAdSourceEventListener;
    Context mContext;
    ATAdSourceStatusListener mDeveloperStatusListener;
    ATEventInterface mDownloadListener;
    int mFetchAdTimeout;
    ATSplashAdListener mListener;
    ATAdMultipleLoadedListener mMultipleLoadedListener;
    private ATNativeAdCustomRender mNativeAdCustomRender;
    String mPlacementId;
    Map<String, Object> mTKExtraMap;

    /* renamed from: com.anythink.splashad.api.ATSplashAd$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ ATAdRequest val$adRequest;
        final /* synthetic */ Map val$finalTkExtraMap;
        final /* synthetic */ int val$loadType;
        final /* synthetic */ long val$startLoadTime;

        /* renamed from: com.anythink.splashad.api.ATSplashAd$2$1, reason: invalid class name */
        public class AnonymousClass1 extends b {
            boolean hasCacheWhenTimeout = false;
            final /* synthetic */ int val$finalTimeout;

            public AnonymousClass1(int i) {
                this.val$finalTimeout = i;
            }

            @Override // com.anythink.splashad.a.b
            public void onAdLoaded(String str, final boolean z8) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onAdLoaded(!anonymousClass1.hasCacheWhenTimeout && z8);
                        }
                    }
                });
            }

            @Override // com.anythink.splashad.a.b
            public void onNoAdError(String str, final AdError adError) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onNoAdError(adError);
                        }
                    }
                });
            }

            @Override // com.anythink.splashad.a.b
            public void onTimeout(final String str) {
                final g a9 = ATSplashAd.this.mAdLoadManager.a(str);
                c.a h9 = a9 != null ? a9.h() : null;
                if (h9 != null) {
                    h9.b();
                }
                ae aeVar = new ae();
                aeVar.a(AnonymousClass2.this.val$finalTkExtraMap);
                aeVar.a(AnonymousClass2.this.val$adRequest);
                ATSplashAd aTSplashAd = ATSplashAd.this;
                com.anythink.core.common.h.c a10 = aTSplashAd.mAdLoadManager.a(aTSplashAd.mContext, aeVar);
                if (a10 != null) {
                    this.hasCacheWhenTimeout = true;
                    if (a9 != null) {
                        if (h9 == null || h9.e() != a10) {
                            String str2 = ATSplashAd.this.mPlacementId;
                            a9.a(9, a10.o());
                        } else {
                            String str3 = ATSplashAd.this.mPlacementId;
                            a9.a(11, a10.o());
                        }
                        e.a(ATSplashAd.this.mPlacementId, str, a9.i(), "1", a10, this.val$finalTimeout, AnonymousClass2.this.val$adRequest);
                        return;
                    }
                }
                t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.2.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str4 = ATSplashAd.this.mPlacementId;
                        String str5 = str;
                        g gVar = a9;
                        l i = gVar != null ? gVar.i() : null;
                        e.a(str4, str5, i, "2", (com.anythink.core.common.h.c) null, r0.val$finalTimeout, AnonymousClass2.this.val$adRequest);
                        ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                        if (aTSplashAdListener != null) {
                            aTSplashAdListener.onAdLoadTimeout();
                        }
                    }
                });
            }
        }

        public AnonymousClass2(int i, Map map, ATAdRequest aTAdRequest, long j9) {
            this.val$loadType = i;
            this.val$finalTkExtraMap = map;
            this.val$adRequest = aTAdRequest;
            this.val$startLoadTime = j9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:
        
            if (r17 > 0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z8;
            boolean z9;
            Activity activity;
            int i = ATSplashAd.this.mFetchAdTimeout;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l a9 = n.a(ATSplashAd.this.mContext).a(ATSplashAd.this.mPlacementId);
            if (a9 == null) {
                a9 = n.a(ATSplashAd.this.mContext).f(ATSplashAd.this.mPlacementId);
            }
            l lVar = a9;
            int bq = lVar != null ? lVar.bq() : -1;
            if (i <= 0) {
                if (bq <= 0) {
                    z8 = false;
                    if (i > 0) {
                        i = 5000;
                        z9 = false;
                    } else {
                        z9 = z8;
                    }
                    int i4 = i;
                    WeakReference<Activity> weakReference = ATSplashAd.this.mActivityWeakRef;
                    AnonymousClass1 anonymousClass1 = null;
                    activity = weakReference == null ? weakReference.get() : null;
                    if (this.val$loadType == 0) {
                        anonymousClass1 = new AnonymousClass1(i4);
                        anonymousClass1.startCountDown(i4);
                    }
                    AnonymousClass1 anonymousClass12 = anonymousClass1;
                    ATSplashAd aTSplashAd = ATSplashAd.this;
                    com.anythink.splashad.a.c cVar = aTSplashAd.mAdLoadManager;
                    if (activity == null) {
                        activity = aTSplashAd.mContext;
                    }
                    cVar.a(activity, anonymousClass12, aTSplashAd.adMultipleLoadedListener, i4, z9, this.val$loadType, aTSplashAd.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adRequest, this.val$startLoadTime, elapsedRealtime);
                    ATSplashAd aTSplashAd2 = ATSplashAd.this;
                    e.a(aTSplashAd2.mPlacementId, lVar, aTSplashAd2.mFetchAdTimeout, bq, i4, this.val$adRequest);
                }
            }
            i = bq;
            z8 = true;
            if (i > 0) {
            }
            int i42 = i;
            WeakReference<Activity> weakReference2 = ATSplashAd.this.mActivityWeakRef;
            AnonymousClass1 anonymousClass13 = null;
            if (weakReference2 == null) {
            }
            if (this.val$loadType == 0) {
            }
            AnonymousClass1 anonymousClass122 = anonymousClass13;
            ATSplashAd aTSplashAd3 = ATSplashAd.this;
            com.anythink.splashad.a.c cVar2 = aTSplashAd3.mAdLoadManager;
            if (activity == null) {
            }
            cVar2.a(activity, anonymousClass122, aTSplashAd3.adMultipleLoadedListener, i42, z9, this.val$loadType, aTSplashAd3.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adRequest, this.val$startLoadTime, elapsedRealtime);
            ATSplashAd aTSplashAd22 = ATSplashAd.this;
            e.a(aTSplashAd22.mPlacementId, lVar, aTSplashAd22.mFetchAdTimeout, bq, i42, this.val$adRequest);
        }
    }

    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener) {
        this(context, str, aTSplashAdListener, 0);
    }

    public static void entryAdScenario(String str, String str2) {
        t.b().a(str, str2, "4", (Map<String, Object>) null);
    }

    private ATAdStatusInfo getAdStatus() {
        if (t.b().g() != null && !TextUtils.isEmpty(t.b().p()) && !TextUtils.isEmpty(t.b().q())) {
            return this.mAdLoadManager.a(this.mContext, this.mTKExtraMap);
        }
        Log.e(this.TAG, "SDK init error!");
        return null;
    }

    public ATAdStatusInfo checkAdStatus() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new ATAdStatusInfo(false, false, null);
        }
        ab.b(this.mPlacementId, j.r.f12704t, j.r.f12682C, adStatus.toString(), "");
        return adStatus;
    }

    public List<ATAdInfo> checkValidAdCaches() {
        com.anythink.splashad.a.c cVar = this.mAdLoadManager;
        if (cVar != null) {
            return cVar.a(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        ATAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean isReady = adStatus.isReady();
        ab.b(this.mPlacementId, j.r.f12704t, j.r.f12681B, String.valueOf(isReady), "");
        return isReady;
    }

    public void loadAd() {
        loadAd((ATAdRequest) null);
    }

    @Deprecated
    public void onDestory() {
    }

    public void setAdDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    public void setAdListener(ATSplashAdListener aTSplashAdListener) {
        this.mListener = aTSplashAdListener;
    }

    public void setAdMultipleLoadedListener(ATAdMultipleLoadedListener aTAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = aTAdMultipleLoadedListener;
    }

    public void setAdRevenueListener(ATAdRevenueListener aTAdRevenueListener) {
        this.mAdRevenueListener = aTAdRevenueListener;
    }

    public void setAdSourceStatusListener(ATAdSourceStatusListener aTAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new com.anythink.core.common.d.c();
        }
        this.mDeveloperStatusListener = aTAdSourceStatusListener;
        this.mAdSourceEventListener.setAdSourceStatusListener(aTAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        u.a().a(this.mPlacementId, map);
    }

    public void setNativeAdCustomRender(ATNativeAdCustomRender aTNativeAdCustomRender) {
        this.mNativeAdCustomRender = aTNativeAdCustomRender;
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        show(activity, viewGroup, "");
    }

    @Deprecated
    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener, int i, String str2) {
        this(context, str, aTSplashAdListener, i);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        t.b().a(str, str2, "4", map);
    }

    @Deprecated
    public void loadAd(ATAdxBidFloorInfo aTAdxBidFloorInfo) {
        loadAd(aTAdxBidFloorInfo != null ? new ATAdRequest.Builder().setATAdxBidFloorInfo(aTAdxBidFloorInfo).build() : null);
    }

    @Deprecated
    public void show(Activity activity, ViewGroup viewGroup, String str) {
        show(activity, viewGroup, (ATSplashSkipInfo) null, p.e(str));
    }

    public ATSplashAd(Context context, String str, ATSplashAdListener aTSplashAdListener, int i) {
        this.TAG = getClass().getSimpleName();
        this.adMultipleLoadedListener = new ATAdMultipleLoadedListener() { // from class: com.anythink.splashad.api.ATSplashAd.1
            @Override // com.anythink.core.api.ATAdMultipleLoadedListener
            public void onAdMultipleLoaded(final ATRequestingInfo aTRequestingInfo) {
                t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ATAdMultipleLoadedListener aTAdMultipleLoadedListener = ATSplashAd.this.mMultipleLoadedListener;
                        if (aTAdMultipleLoadedListener != null) {
                            aTAdMultipleLoadedListener.onAdMultipleLoaded(aTRequestingInfo);
                        }
                    }
                });
            }
        };
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mListener = aTSplashAdListener;
        this.mFetchAdTimeout = i;
        if (context instanceof Activity) {
            this.mActivityWeakRef = new WeakReference<>((Activity) context);
        }
        this.mAdLoadManager = com.anythink.splashad.a.c.a(context, str);
    }

    public void show(Activity activity, ViewGroup viewGroup, ATSplashSkipInfo aTSplashSkipInfo) {
        show(activity, viewGroup, aTSplashSkipInfo, (ATShowConfig) null);
    }

    public void loadAd(ATAdRequest aTAdRequest) {
        loadAd(aTAdRequest, 0);
    }

    @Deprecated
    public void show(Activity activity, ViewGroup viewGroup, ATSplashSkipInfo aTSplashSkipInfo, String str) {
        show(activity, viewGroup, aTSplashSkipInfo, p.e(str));
    }

    private void loadAd(ATAdRequest aTAdRequest, int i) {
        HashMap hashMap;
        ab.a(this.mPlacementId, j.r.f12704t, j.r.f12709y, j.r.f12699o, "", true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.adRequest = aTAdRequest;
        if (this.mTKExtraMap != null) {
            hashMap = new HashMap(this.mTKExtraMap);
        } else {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = hashMap;
        this.mAdLoadManager.a();
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass2(i, hashMap2, aTAdRequest, elapsedRealtime));
    }

    public void show(Activity activity, ViewGroup viewGroup, ATSplashSkipInfo aTSplashSkipInfo, ATShowConfig aTShowConfig) {
        ab.b(this.mPlacementId, j.r.f12704t, j.r.f12680A, j.r.f12699o, "");
        if (t.b().g() == null || TextUtils.isEmpty(t.b().p()) || TextUtils.isEmpty(t.b().q())) {
            Log.e(this.TAG, "SDK init error!");
            return;
        }
        if (activity == null) {
            Log.e(this.TAG, "Splash Activity is null.");
        }
        if (viewGroup == null) {
            Log.e(this.TAG, "Splash Container is null.");
        } else {
            this.mAdLoadManager.a(activity, viewGroup, new a() { // from class: com.anythink.splashad.api.ATSplashAd.3
                @Override // com.anythink.splashad.a.a
                public void onAdClick(final ATAdInfo aTAdInfo) {
                    t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.3.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdClick(aTAdInfo);
                            }
                        }
                    });
                }

                @Override // com.anythink.splashad.a.a
                public void onAdDismiss(final ATAdInfo aTAdInfo, final ATSplashAdExtraInfo aTSplashAdExtraInfo) {
                    t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.3.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdDismiss(aTAdInfo, aTSplashAdExtraInfo);
                            }
                        }
                    });
                }

                @Override // com.anythink.splashad.a.a
                public void onAdShow(final ATAdInfo aTAdInfo) {
                    t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.3.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATAdRevenueListener aTAdRevenueListener = ATSplashAd.this.mAdRevenueListener;
                            if (aTAdRevenueListener != null) {
                                aTAdRevenueListener.onAdRevenuePaid(aTAdInfo);
                            }
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener != null) {
                                aTSplashAdListener.onAdShow(aTAdInfo);
                            }
                        }
                    });
                }

                @Override // com.anythink.splashad.a.a
                public void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z8) {
                    t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAdListener aTSplashAdListener = ATSplashAd.this.mListener;
                            if (aTSplashAdListener == null || !(aTSplashAdListener instanceof ATSplashExListener)) {
                                return;
                            }
                            ((ATSplashExListener) aTSplashAdListener).onDeeplinkCallback(aTAdInfo, z8);
                        }
                    });
                }

                @Override // com.anythink.splashad.a.a
                public void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
                    t.b().b(new Runnable() { // from class: com.anythink.splashad.api.ATSplashAd.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ATSplashAd aTSplashAd = ATSplashAd.this;
                            ATSplashAdListener aTSplashAdListener = aTSplashAd.mListener;
                            if (aTSplashAdListener == null || !(aTSplashAdListener instanceof ATSplashExListener)) {
                                return;
                            }
                            ATSplashExListener aTSplashExListener = (ATSplashExListener) aTSplashAdListener;
                            Context context2 = context;
                            if (context2 == null) {
                                context2 = aTSplashAd.mContext;
                            }
                            aTSplashExListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                        }
                    });
                }
            }, this.mDownloadListener, aTSplashSkipInfo, aTShowConfig, this.mTKExtraMap, this.mNativeAdCustomRender);
        }
    }
}
