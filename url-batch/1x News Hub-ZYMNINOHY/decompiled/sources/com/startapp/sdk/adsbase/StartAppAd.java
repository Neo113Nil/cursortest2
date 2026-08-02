package com.startapp.sdk.adsbase;

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
import b2.C0195i;
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
    private final ib f3228a;

    /* renamed from: b, reason: collision with root package name */
    private final ib f3229b;

    /* renamed from: c, reason: collision with root package name */
    private final ib f3230c;

    /* renamed from: d, reason: collision with root package name */
    private CacheKey f3231d;

    /* renamed from: e, reason: collision with root package name */
    private f f3232e;
    private f7 f;

    /* renamed from: g, reason: collision with root package name */
    private AdMode f3233g;

    /* renamed from: h, reason: collision with root package name */
    private AdPreferences f3234h;

    /* renamed from: i, reason: collision with root package name */
    com.startapp.sdk.adsbase.adlisteners.VideoListener f3235i;

    /* renamed from: j, reason: collision with root package name */
    AdDisplayListener f3236j;

    /* renamed from: k, reason: collision with root package name */
    private final h f3237k;

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
        ib ibVar = com.startapp.sdk.components.a.a(context).f3453K;
        ib ibVar2 = com.startapp.sdk.components.a.a(context).f3470j;
        ib ibVar3 = com.startapp.sdk.components.a.a(context).f3454M;
        ib ibVar4 = com.startapp.sdk.components.a.a(context).f3455N;
        ib ibVar5 = com.startapp.sdk.components.a.a(context).f3463b;
        ib ibVar6 = com.startapp.sdk.components.a.a(context).f3474n;
        ib ibVar7 = com.startapp.sdk.components.a.a(context).f3443A;
        ib ibVar8 = com.startapp.sdk.components.a.a(context).f3481w;
        ib ibVar9 = com.startapp.sdk.components.a.a(context).f3464c;
        ib ibVar10 = com.startapp.sdk.components.a.a(context).f3462a;
        ib ibVar11 = com.startapp.sdk.components.a.a(context).f3449G;
        ib ibVar12 = com.startapp.sdk.components.a.a(context).f3480u;
        this.f3231d = null;
        this.f3233g = AdMode.AUTOMATIC;
        this.f3234h = null;
        this.f3235i = null;
        this.f3236j = null;
        this.f3237k = new h(this);
        this.f3228a = ibVar10;
        this.f3229b = ibVar11;
        this.f3230c = ibVar12;
        try {
            ((pf) ibVar12.a()).a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        ja.f4014a.f3323a = false;
    }

    @Deprecated
    public static void disableSplash() {
    }

    public static void enableAutoInterstitial() {
        ja.f4014a.f3323a = true;
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
        e eVar = ja.f4014a;
        eVar.f3324b = autoInterstitialPreferences;
        eVar.f3325c = -1L;
        eVar.f3326d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            fh.f3800a.f3878a = sDKAdPreferences;
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
        wb.a(this.context).a(this.f3237k);
        wb.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final /* bridge */ /* synthetic */ a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object a3 = ((p) this.adCacheManager.a()).a(this.f3231d);
        if (a3 instanceof m8) {
            return ((m8) a3).getAdId();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.f3231d == null || ((p) this.adCacheManager.a()).a(this.f3231d) == null) ? placement : ((Ad) ((p) this.adCacheManager.a()).a(this.f3231d)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3231d);
        return a3 != null ? a3.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3231d);
        if (a3 != null) {
            return a3.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public boolean isReady() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3231d);
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
        gh ghVar = fh.f3800a;
        ghVar.f3880c = false;
        ghVar.f3882e = true;
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onRestoreInstanceState(Bundle bundle) {
        int i3 = bundle.getInt("AdMode");
        this.f3233g = AdMode.AUTOMATIC;
        if (i3 == 1) {
            this.f3233g = AdMode.FULLPAGE;
        } else if (i3 == 2) {
            this.f3233g = AdMode.OFFERWALL;
        } else if (i3 == 3) {
            this.f3233g = AdMode.OVERLAY;
        } else if (i3 == 4) {
            this.f3233g = AdMode.REWARDED_VIDEO;
        } else if (i3 == 5) {
            this.f3233g = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f3234h = (AdPreferences) serializable;
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
        int i3 = m.f3351a[this.f3233g.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 3;
                if (i3 != 3) {
                    i4 = 4;
                    if (i3 != 4) {
                        i4 = 0;
                    }
                }
            }
        }
        AdPreferences adPreferences = this.f3234h;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i4);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.f3235i = videoListener;
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
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3811a);
        i iVar = new i(this, adEventListener);
        if (d7.a(false, adPreferences.getAdTag(), false, this.f3233g == AdMode.REWARDED_VIDEO)) {
            b(new j(this, iVar), 1);
            return;
        }
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.z);
        AdPreferences adPreferences2 = this.f3234h;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        this.f3231d = ((p) this.adCacheManager.a()).a(this, this.f3233g, this.f3234h, new k(this, iVar, adPreferences2), str);
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
        AdPreferences adPreferences = startAppAd.f3234h;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        startAppAd.f3231d = ((p) startAppAd.adCacheManager.a()).a(startAppAd, startAppAd.f3233g, startAppAd.f3234h, new k(startAppAd, iVar, adPreferences), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdEventListener adEventListener, int i3) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3832y);
        AdPreferences adPreferences = this.f3234h;
        if (adPreferences != null && !TextUtils.isEmpty(adPreferences.getAdTag())) {
            g0.a(new S.a(i3, 4, this, adEventListener));
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
            y.a(this.context, this.f3236j, null);
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
    public /* synthetic */ void a(AdEventListener adEventListener, int i3) {
        AdEventListener adEventListener2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData E3 = MetaData.E();
            ExternalAdConfig v = E3.v();
            if (v != null) {
                try {
                    adUnitConfig = v.getMapping().get(this.f3234h.getAdTag());
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
                ((j0) this.f3228a.a()).b(adUnitConfig, new com.startapp.sdk.ads.banner.bannerstandard.i(this, adEventListener2, adUnitConfig, i3, E3, 1));
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
            ((pf) this.f3230c.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.f3233g = adMode;
        this.f3234h = adPreferences;
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
    public C0195i a(AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i3, MetaData metaData, f7 f7Var) {
        DisplayMetrics displayMetrics;
        Point point = new Point();
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        C0195i c0195i = C0195i.f2555a;
        if (f7Var == null) {
            adEventListener.onFailedToReceiveAd(null);
            return c0195i;
        }
        this.f = f7Var;
        n7 n7Var = (n7) f7Var;
        n7Var.f4189c = new l(this, adEventListener, adUnitConfig, i3, metaData, point);
        boolean z = this.f3233g == AdMode.REWARDED_VIDEO;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : n7Var.f4188b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        if (z) {
            RewardedAd.load(n7Var.f4187a, n7Var.f4188b.getAdUnitId(), build, new j7(n7Var));
        } else {
            AdManagerInterstitialAd.load(n7Var.f4187a, n7Var.f4188b.getAdUnitId(), build, new k7(n7Var));
        }
        return c0195i;
    }

    public static void a(StartAppAd startAppAd, boolean z, String uuid, String originalTS, AdPreferences adPreferences, AdUnitConfig config, int i3) {
        Context context = startAppAd.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        ib ibVar = startAppAd.httpClient;
        ib ibVar2 = startAppAd.networkApiExecutor;
        ib ibVar3 = startAppAd.eventTracer;
        ib ibVar4 = startAppAd.motionProcessor;
        z9 z9Var = new z9(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4);
        z9Var.f4872a = startAppAd.f3233g == AdMode.REWARDED_VIDEO;
        z9Var.f4873b = z;
        kotlin.jvm.internal.j.e(uuid, "uuid");
        z9Var.f4874c = uuid;
        kotlin.jvm.internal.j.e(originalTS, "originalTS");
        z9Var.f4876e = originalTS;
        kotlin.jvm.internal.j.e(config, "config");
        z9Var.f4875d = config;
        z9Var.f4878h = Integer.valueOf(i3);
        z9Var.f4879i = config.getSioPrice();
        new aa(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4, z9Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c3, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(String str, AdDisplayListener adDisplayListener) {
        AdRulesResult adRulesResult;
        boolean z;
        boolean z2;
        String[] strArr;
        String[] strArr2;
        Activity resolveActivityToShowAd;
        try {
            ((pf) this.f3230c.a()).a(32768);
        } catch (Throwable unused) {
        }
        setNotDisplayedReason(null);
        this.f3236j = adDisplayListener;
        if (!canShowAd()) {
            setNotDisplayedReason(NotDisplayedReason.SERVING_ADS_DISABLED);
            y.a(this.context, this.f3236j, this);
            return false;
        }
        boolean z3 = true;
        if (this.f != null && (resolveActivityToShowAd = resolveActivityToShowAd()) != null) {
            g0.a(new A1.a(this, 6, resolveActivityToShowAd));
            return true;
        }
        if (this.f3231d == null) {
            loadAd(this.f3233g, this.f3234h, (AdEventListener) null);
        }
        if (AdsCommonMetaData.k().L() && !si.c(this.context)) {
            setNotDisplayedReason(NotDisplayedReason.APP_IN_BACKGROUND);
        } else {
            Context context = this.context;
            WeakHashMap weakHashMap = si.f4438a;
            if (((f6) com.startapp.sdk.components.a.a(context).f3479t.a()).b()) {
                if (isReady()) {
                    AdPreferences.Placement placement = getPlacement();
                    AdRulesResult a3 = AdsCommonMetaData.k().b().a(placement, str);
                    if (a3.b()) {
                        f b3 = ((p) this.adCacheManager.a()).b(this.f3231d);
                        this.f3232e = b3;
                        if (b3 != null) {
                            z = b3.a(str);
                            if (z) {
                                t.f4445d.a(new s(placement, str));
                                AdPreferences adPreferences = this.f3234h;
                                if (adPreferences == null || adPreferences.equals(new AdPreferences())) {
                                    String str2 = "autoLoadNotShownAdPrefix" + this.f3233g.name();
                                    rf edit = ((sf) this.f3229b.a()).edit();
                                    edit.a(str2, 0);
                                    edit.f4395a.putInt(str2, 0);
                                    if (this.f3233g == AdMode.AUTOMATIC) {
                                        String str3 = "autoLoadNotShownAdPrefix" + AdMode.FULLPAGE.name();
                                        edit.a(str3, 0);
                                        edit.f4395a.putInt(str3, 0);
                                        String str4 = "autoLoadNotShownAdPrefix" + AdMode.OFFERWALL.name();
                                        edit.a(str4, 0);
                                        edit.f4395a.putInt(str4, 0);
                                    }
                                    edit.apply();
                                }
                            } else {
                                Object obj = this.f3232e;
                                if (obj instanceof Ad) {
                                    setNotDisplayedReason(((Ad) obj).getNotDisplayedReason());
                                }
                            }
                            adRulesResult = a3;
                            z3 = false;
                        }
                    } else {
                        setNotDisplayedReason(NotDisplayedReason.AD_RULES);
                    }
                    z = false;
                    adRulesResult = a3;
                    z3 = false;
                } else {
                    AdMode adMode = this.f3233g;
                    if (adMode != AdMode.REWARDED_VIDEO && adMode != AdMode.VIDEO) {
                        if (canShowAd() && AdsCommonMetaData.k().F().r() && MetaData.E().f0()) {
                            AdPreferences adPreferences2 = this.f3234h;
                            if (adPreferences2 == null) {
                                adPreferences2 = new AdPreferences();
                            }
                            adPreferences2.setType(Ad.AdType.NON_VIDEO);
                            AdPreferences.Placement placement2 = getPlacement();
                            f a4 = ((p) this.adCacheManager.a()).a(new CacheKey(placement2, adPreferences2));
                            if (a4 != null && a4.isReady() && AdsCommonMetaData.k().b().a(placement2, str).b()) {
                                a4.setVideoCancelCallBack(true);
                                z2 = a4.a(str);
                            }
                        }
                        z2 = false;
                    }
                    z3 = false;
                    if (!z3) {
                        setNotDisplayedReason(NotDisplayedReason.AD_NOT_READY);
                    }
                    adRulesResult = null;
                    z = false;
                }
                if (!z || z3) {
                    wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.OnClickCallback"));
                    wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                }
                if (!z) {
                    NotDisplayedReason notDisplayedReason = getNotDisplayedReason();
                    if (notDisplayedReason == null) {
                        notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                        setNotDisplayedReason(notDisplayedReason);
                    }
                    Object a5 = ((p) this.adCacheManager.a()).a(this.f3231d);
                    if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                        if (z3) {
                            notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                        }
                        Object obj2 = this.f3232e;
                        if (obj2 != null) {
                            a5 = obj2;
                        }
                        if (a5 instanceof m8) {
                            strArr2 = ((m8) a5).f4136i;
                        } else if (a5 instanceof db) {
                            List list = ((db) a5).f3687a;
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
                        if (a5 instanceof m8) {
                            strArr = ((m8) a5).f4136i;
                        } else if (a5 instanceof db) {
                            List list2 = ((db) a5).f3687a;
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
                    this.f3232e = null;
                    if (!z3) {
                        y.a(this.context, this.f3236j, this);
                    }
                }
                return z;
            }
            setNotDisplayedReason(NotDisplayedReason.NETWORK_PROBLEM);
        }
        adRulesResult = null;
        z3 = false;
        z = false;
        if (!z) {
        }
        wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.OnClickCallback"));
        wb.a(this.context).a(this.f3237k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        if (!z) {
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        n7 n7Var = (n7) this.f;
        n7Var.getClass();
        kotlin.jvm.internal.j.e(activity, "activity");
        AdManagerInterstitialAd adManagerInterstitialAd = n7Var.f4190d;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new l7(n7Var));
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = n7Var.f4190d;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.show(activity);
        } else {
            n7Var.a(activity);
        }
    }
}
