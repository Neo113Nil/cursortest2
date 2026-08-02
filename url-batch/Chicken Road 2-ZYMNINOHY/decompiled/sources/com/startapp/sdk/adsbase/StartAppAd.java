package com.startapp.sdk.adsbase;

import W.RunnableC0117j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import c3.C0297i;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.d7;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.j0;
import com.startapp.sdk.internal.j7;
import com.startapp.sdk.internal.ja;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.l7;
import com.startapp.sdk.internal.m8;
import com.startapp.sdk.internal.n7;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.pf;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StartAppAd extends Ad {

    /* renamed from: a, reason: collision with root package name */
    private final ib f6315a;

    /* renamed from: b, reason: collision with root package name */
    private final ib f6316b;

    /* renamed from: c, reason: collision with root package name */
    private final ib f6317c;

    /* renamed from: d, reason: collision with root package name */
    private CacheKey f6318d;

    /* renamed from: e, reason: collision with root package name */
    private f f6319e;

    /* renamed from: f, reason: collision with root package name */
    private f7 f6320f;

    /* renamed from: g, reason: collision with root package name */
    private AdMode f6321g;

    /* renamed from: h, reason: collision with root package name */
    private AdPreferences f6322h;

    /* renamed from: i, reason: collision with root package name */
    com.startapp.sdk.adsbase.adlisteners.VideoListener f6323i;

    /* renamed from: j, reason: collision with root package name */
    AdDisplayListener f6324j;

    /* renamed from: k, reason: collision with root package name */
    private final h f6325k;

    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartAppAd(Context context) {
        super(context, null, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        ib ibVar = com.startapp.sdk.components.a.a(context).f6551K;
        ib ibVar2 = com.startapp.sdk.components.a.a(context).f6569j;
        ib ibVar3 = com.startapp.sdk.components.a.a(context).f6552M;
        ib ibVar4 = com.startapp.sdk.components.a.a(context).f6553N;
        ib ibVar5 = com.startapp.sdk.components.a.a(context).f6561b;
        ib ibVar6 = com.startapp.sdk.components.a.a(context).n;
        ib ibVar7 = com.startapp.sdk.components.a.a(context).f6541A;
        ib ibVar8 = com.startapp.sdk.components.a.a(context).f6579w;
        ib ibVar9 = com.startapp.sdk.components.a.a(context).f6562c;
        ib ibVar10 = com.startapp.sdk.components.a.a(context).f6560a;
        ib ibVar11 = com.startapp.sdk.components.a.a(context).f6547G;
        ib ibVar12 = com.startapp.sdk.components.a.a(context).f6578u;
        this.f6318d = null;
        this.f6321g = AdMode.AUTOMATIC;
        this.f6322h = null;
        this.f6323i = null;
        this.f6324j = null;
        this.f6325k = new h(this);
        this.f6315a = ibVar10;
        this.f6316b = ibVar11;
        this.f6317c = ibVar12;
        try {
            ((pf) ibVar12.a()).a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        ja.f7141a.f6413a = false;
    }

    @Deprecated
    public static void disableSplash() {
    }

    public static void enableAutoInterstitial() {
        ja.f7141a.f6413a = true;
    }

    @Deprecated
    public static void enableConsent(Context context, boolean z) {
        StartAppSDK.enableConsent(context, z);
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        e eVar = ja.f7141a;
        eVar.f6414b = autoInterstitialPreferences;
        eVar.f6415c = -1L;
        eVar.f6416d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            fh.f6918a.f7000a = sDKAdPreferences;
            e7.d(a3, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle) {
    }

    @Deprecated
    public void close() {
        wb.a(this.context).a(this.f6325k);
        wb.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final /* bridge */ /* synthetic */ a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object a3 = ((p) this.adCacheManager.a()).a(this.f6318d);
        if (a3 instanceof m8) {
            return ((m8) a3).getAdId();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.f6318d == null || ((p) this.adCacheManager.a()).a(this.f6318d) == null) ? placement : ((Ad) ((p) this.adCacheManager.a()).a(this.f6318d)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f6318d);
        return a3 != null ? a3.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f6318d);
        if (a3 != null) {
            return a3.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public boolean isReady() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f6318d);
        if (a3 != null) {
            return a3.isReady();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    @Deprecated
    public void onBackPressed() {
        showAd("exit_ad");
        gh ghVar = fh.f6918a;
        ghVar.f7002c = false;
        ghVar.f7004e = true;
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onRestoreInstanceState(Bundle bundle) {
        int i4 = bundle.getInt("AdMode");
        this.f6321g = AdMode.AUTOMATIC;
        if (i4 == 1) {
            this.f6321g = AdMode.FULLPAGE;
        } else if (i4 == 2) {
            this.f6321g = AdMode.OFFERWALL;
        } else if (i4 == 3) {
            this.f6321g = AdMode.OVERLAY;
        } else if (i4 == 4) {
            this.f6321g = AdMode.REWARDED_VIDEO;
        } else if (i4 == 5) {
            this.f6321g = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f6322h = (AdPreferences) serializable;
        }
    }

    @Deprecated
    public void onResume() {
        if (isReady()) {
            return;
        }
        loadAd();
    }

    @Deprecated
    public void onSaveInstanceState(Bundle bundle) {
        int i4 = m.f6443a[this.f6321g.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 != 4) {
                        i5 = 0;
                    }
                }
            }
        }
        AdPreferences adPreferences = this.f6322h;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i5);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.f6323i = videoListener;
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String str2;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                a0.a(this.context, adEventListener, this, false);
                return;
            }
            return;
        }
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        if (adPreferences.getPlacementId() == null) {
            Context context = this.context;
            String packageName = context.getPackageName();
            String name = getClass().getName();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    str2 = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        str2 = context.getClass().getName();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            adPreferences.setPlacementId(g0.a(packageName, name, str2, (String) null));
        }
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f6929a);
        i iVar = new i(this, adEventListener);
        if (d7.a(false, adPreferences.getAdTag(), false, this.f6321g == AdMode.REWARDED_VIDEO)) {
            b(new j(this, iVar), 1);
            return;
        }
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.z);
        AdPreferences adPreferences2 = this.f6322h;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        this.f6318d = ((p) this.adCacheManager.a()).a(this, this.f6321g, this.f6322h, new k(this, iVar, adPreferences2), str);
    }

    public void loadAd(AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public static void a(StartAppAd startAppAd, i iVar) {
        ((y6) ((x6) startAppAd.eventTracer.a())).c(startAppAd, fi.z);
        AdPreferences adPreferences = startAppAd.f6322h;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        startAppAd.f6318d = ((p) startAppAd.adCacheManager.a()).a(startAppAd, startAppAd.f6321g, startAppAd.f6322h, new k(startAppAd, iVar, adPreferences), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdEventListener adEventListener, int i4) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f6950y);
        AdPreferences adPreferences = this.f6322h;
        if (adPreferences != null && !TextUtils.isEmpty(adPreferences.getAdTag())) {
            g0.a(new RunnableC0117j(this, adEventListener, i4, 5));
        } else {
            adEventListener.onFailedToReceiveAd(null);
        }
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(adEventListener, (String) null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
    }

    public void loadAd(AdEventListener adEventListener, String str) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener, str);
    }

    @Deprecated
    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th) {
            d9.a(th);
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            y.a(this.context, this.f6324j, null);
            return false;
        }
    }

    @Deprecated
    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    public void loadAd(AdMode adMode) {
        loadAd(adMode, new AdPreferences(), (AdEventListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEventListener adEventListener, int i4) {
        AdEventListener adEventListener2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData E4 = MetaData.E();
            ExternalAdConfig v = E4.v();
            if (v != null) {
                try {
                    adUnitConfig = v.getMapping().get(this.f6322h.getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    adEventListener2 = adEventListener;
                    adEventListener2.onFailedToReceiveAd(null);
                    d9.a(th);
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            adEventListener2 = adEventListener;
            try {
                ((j0) this.f6315a.a()).b(adUnitConfig, new com.startapp.sdk.ads.banner.bannerstandard.i(this, adEventListener2, adUnitConfig, i4, E4, 1));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                adEventListener2.onFailedToReceiveAd(null);
                d9.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
            adEventListener2 = adEventListener;
        }
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener) {
        loadAd(adMode, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(adMode, adPreferences, adEventListener, null);
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener, String str) {
        loadAd(adMode, new AdPreferences(), adEventListener, str);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        try {
            ((pf) this.f6317c.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.f6321g = adMode;
        this.f6322h = adPreferences;
        try {
            load(adPreferences, adEventListener, str);
        } catch (Throwable th) {
            d9.a(th);
            if (adEventListener != null) {
                a0.a(this.context, adEventListener, this, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0297i a(AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i4, MetaData metaData, f7 f7Var) {
        DisplayMetrics displayMetrics;
        Point point = new Point();
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        C0297i c0297i = C0297i.f5732a;
        if (f7Var == null) {
            adEventListener.onFailedToReceiveAd(null);
            return c0297i;
        }
        this.f6320f = f7Var;
        n7 n7Var = (n7) f7Var;
        n7Var.f7321c = new l(this, adEventListener, adUnitConfig, i4, metaData, point);
        boolean z = this.f6321g == AdMode.REWARDED_VIDEO;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : n7Var.f7320b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        if (z) {
            RewardedAd.load(n7Var.f7319a, n7Var.f7320b.getAdUnitId(), build, new j7(n7Var));
        } else {
            AdManagerInterstitialAd.load(n7Var.f7319a, n7Var.f7320b.getAdUnitId(), build, new k7(n7Var));
        }
        return c0297i;
    }

    public static void a(StartAppAd startAppAd, boolean z, String uuid, String originalTS, AdPreferences adPreferences, AdUnitConfig config, int i4) {
        Context context = startAppAd.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        ib ibVar = startAppAd.httpClient;
        ib ibVar2 = startAppAd.networkApiExecutor;
        ib ibVar3 = startAppAd.eventTracer;
        ib ibVar4 = startAppAd.motionProcessor;
        z9 z9Var = new z9(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4);
        z9Var.f8022a = startAppAd.f6321g == AdMode.REWARDED_VIDEO;
        z9Var.f8023b = z;
        kotlin.jvm.internal.i.e(uuid, "uuid");
        z9Var.f8024c = uuid;
        kotlin.jvm.internal.i.e(originalTS, "originalTS");
        z9Var.f8026e = originalTS;
        kotlin.jvm.internal.i.e(config, "config");
        z9Var.f8025d = config;
        z9Var.f8029h = Integer.valueOf(i4);
        z9Var.f8030i = config.getSioPrice();
        new aa(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4, z9Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x01bc, code lost:
    
        if (r10 == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(String str, AdDisplayListener adDisplayListener) {
        boolean z;
        boolean z4;
        AdRulesResult adRulesResult;
        String[] strArr;
        String[] strArr2;
        Activity resolveActivityToShowAd;
        try {
            ((pf) this.f6317c.a()).a(32768);
        } catch (Throwable unused) {
        }
        setNotDisplayedReason(null);
        this.f6324j = adDisplayListener;
        if (!canShowAd()) {
            setNotDisplayedReason(NotDisplayedReason.SERVING_ADS_DISABLED);
            y.a(this.context, this.f6324j, this);
            return false;
        }
        boolean z5 = true;
        if (this.f6320f != null && (resolveActivityToShowAd = resolveActivityToShowAd()) != null) {
            g0.a(new R1.e(this, 22, resolveActivityToShowAd));
            return true;
        }
        if (this.f6318d == null) {
            loadAd(this.f6321g, this.f6322h, (AdEventListener) null);
        }
        if (AdsCommonMetaData.k().L() && !si.c(this.context)) {
            setNotDisplayedReason(NotDisplayedReason.APP_IN_BACKGROUND);
        } else {
            Context context = this.context;
            WeakHashMap weakHashMap = si.f7575a;
            if (((f6) com.startapp.sdk.components.a.a(context).f6577t.a()).b()) {
                if (isReady()) {
                    AdPreferences.Placement placement = getPlacement();
                    AdRulesResult a3 = AdsCommonMetaData.k().b().a(placement, str);
                    if (a3.b()) {
                        f b4 = ((p) this.adCacheManager.a()).b(this.f6318d);
                        this.f6319e = b4;
                        if (b4 != null) {
                            z = b4.a(str);
                            if (z) {
                                t.f7582d.a(new s(placement, str));
                                AdPreferences adPreferences = this.f6322h;
                                if (adPreferences == null || adPreferences.equals(new AdPreferences())) {
                                    String str2 = "autoLoadNotShownAdPrefix" + this.f6321g.name();
                                    rf edit = ((sf) this.f6316b.a()).edit();
                                    edit.a(str2, 0);
                                    edit.f7532a.putInt(str2, 0);
                                    if (this.f6321g == AdMode.AUTOMATIC) {
                                        String str3 = "autoLoadNotShownAdPrefix" + AdMode.FULLPAGE.name();
                                        edit.a(str3, 0);
                                        edit.f7532a.putInt(str3, 0);
                                        String str4 = "autoLoadNotShownAdPrefix" + AdMode.OFFERWALL.name();
                                        edit.a(str4, 0);
                                        edit.f7532a.putInt(str4, 0);
                                    }
                                    edit.apply();
                                }
                            } else {
                                Object obj = this.f6319e;
                                if (obj instanceof Ad) {
                                    setNotDisplayedReason(((Ad) obj).getNotDisplayedReason());
                                }
                            }
                            adRulesResult = a3;
                            z5 = false;
                            if (!z || z5) {
                                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnClickCallback"));
                                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                            }
                            if (!z) {
                                NotDisplayedReason notDisplayedReason = getNotDisplayedReason();
                                if (notDisplayedReason == null) {
                                    notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                                    setNotDisplayedReason(notDisplayedReason);
                                }
                                Object a4 = ((p) this.adCacheManager.a()).a(this.f6318d);
                                if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                                    if (z5) {
                                        notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                                    }
                                    Object obj2 = this.f6319e;
                                    if (obj2 != null) {
                                        a4 = obj2;
                                    }
                                    if (a4 instanceof m8) {
                                        strArr2 = ((m8) a4).f7265i;
                                    } else if (a4 instanceof db) {
                                        List list = ((db) a4).f6800a;
                                        ArrayList arrayList = new ArrayList();
                                        if (list != null) {
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.addAll(Arrays.asList(((AdDetails) it.next()).t()));
                                            }
                                        }
                                        strArr2 = (String[]) arrayList.toArray(new String[0]);
                                    } else {
                                        strArr2 = new String[0];
                                    }
                                    g0.a(strArr2, str, 0, notDisplayedReason.toString(), (JSONObject) null);
                                } else if (adRulesResult != null) {
                                    if (a4 instanceof m8) {
                                        strArr = ((m8) a4).f7265i;
                                    } else if (a4 instanceof db) {
                                        List list2 = ((db) a4).f6800a;
                                        ArrayList arrayList2 = new ArrayList();
                                        if (list2 != null) {
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.addAll(Arrays.asList(((AdDetails) it2.next()).t()));
                                            }
                                        }
                                        strArr = (String[]) arrayList2.toArray(new String[0]);
                                    } else {
                                        strArr = new String[0];
                                    }
                                    g0.a(strArr, str, 0, adRulesResult.a());
                                }
                                this.f6319e = null;
                                if (!z5) {
                                    y.a(this.context, this.f6324j, this);
                                }
                            }
                            return z;
                        }
                    } else {
                        setNotDisplayedReason(NotDisplayedReason.AD_RULES);
                    }
                    z = false;
                    adRulesResult = a3;
                    z5 = false;
                    if (!z) {
                    }
                    wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnClickCallback"));
                    wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                    if (!z) {
                    }
                    return z;
                }
                AdMode adMode = this.f6321g;
                if (adMode != AdMode.REWARDED_VIDEO && adMode != AdMode.VIDEO) {
                    if (canShowAd() && AdsCommonMetaData.k().F().r() && MetaData.E().f0()) {
                        AdPreferences adPreferences2 = this.f6322h;
                        if (adPreferences2 == null) {
                            adPreferences2 = new AdPreferences();
                        }
                        adPreferences2.setType(Ad.AdType.NON_VIDEO);
                        AdPreferences.Placement placement2 = getPlacement();
                        f a5 = ((p) this.adCacheManager.a()).a(new CacheKey(placement2, adPreferences2));
                        if (a5 != null && a5.isReady() && AdsCommonMetaData.k().b().a(placement2, str).b()) {
                            a5.setVideoCancelCallBack(true);
                            z4 = a5.a(str);
                        }
                    }
                    z4 = false;
                }
                z5 = false;
                if (!z5) {
                    setNotDisplayedReason(NotDisplayedReason.AD_NOT_READY);
                }
                z = false;
                adRulesResult = null;
                if (!z) {
                }
                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnClickCallback"));
                wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                if (!z) {
                }
                return z;
            }
            setNotDisplayedReason(NotDisplayedReason.NETWORK_PROBLEM);
        }
        z5 = false;
        z = false;
        adRulesResult = null;
        if (!z) {
        }
        wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
        wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
        wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
        wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnClickCallback"));
        wb.a(this.context).a(this.f6325k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        if (!z) {
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        n7 n7Var = (n7) this.f6320f;
        n7Var.getClass();
        kotlin.jvm.internal.i.e(activity, "activity");
        AdManagerInterstitialAd adManagerInterstitialAd = n7Var.f7322d;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new l7(n7Var));
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = n7Var.f7322d;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.show(activity);
        } else {
            n7Var.a(activity);
        }
    }
}
