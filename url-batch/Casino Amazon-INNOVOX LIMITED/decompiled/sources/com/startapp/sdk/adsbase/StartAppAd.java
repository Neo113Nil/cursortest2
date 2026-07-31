package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
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
import com.startapp.sdk.internal.af;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.ig;
import com.startapp.sdk.internal.ka;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q9;
import com.startapp.sdk.internal.qg;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.t0;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.x7;
import com.startapp.sdk.internal.xe;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.ze;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class StartAppAd extends Ad {

    /* renamed from: a, reason: collision with root package name */
    private final pa f117a;
    private final pa b;
    private CacheKey c;
    private f d;
    private AdMode e;
    private AdPreferences f;
    com.startapp.sdk.adsbase.adlisteners.VideoListener g;
    AdDisplayListener h;
    private final h i;

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
        pa paVar = com.startapp.sdk.components.a.a(context).K;
        pa paVar2 = com.startapp.sdk.components.a.a(context).i;
        pa paVar3 = com.startapp.sdk.components.a.a(context).M;
        pa paVar4 = com.startapp.sdk.components.a.a(context).S;
        pa paVar5 = com.startapp.sdk.components.a.a(context).f160a;
        pa paVar6 = com.startapp.sdk.components.a.a(context).m;
        pa paVar7 = com.startapp.sdk.components.a.a(context).A;
        pa paVar8 = com.startapp.sdk.components.a.a(context).w;
        pa paVar9 = com.startapp.sdk.components.a.a(context).b;
        pa paVar10 = com.startapp.sdk.components.a.a(context).G;
        pa paVar11 = com.startapp.sdk.components.a.a(context).u;
        this.c = null;
        this.e = AdMode.AUTOMATIC;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = new h(this);
        this.f117a = paVar10;
        this.b = paVar11;
        try {
            ((xe) paVar11.a()).a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        q9.f389a.f141a = false;
    }

    @Deprecated
    public static void disableSplash() {
    }

    public static void enableAutoInterstitial() {
        q9.f389a.f141a = true;
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
        e eVar = q9.f389a;
        eVar.b = autoInterstitialPreferences;
        eVar.c = -1L;
        eVar.d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a2 = t0.a(context);
        if (a2 != null) {
            pg.f382a.f394a = sDKAdPreferences;
            z6.c(a2, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
    }

    @Deprecated
    public void close() {
        db.a(this.context).a(this.i);
        db.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    protected final /* bridge */ /* synthetic */ v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object a2 = ((p) this.adCacheManager.a()).a(this.c);
        if (a2 instanceof x7) {
            return zh.a(((x7) a2).b, "@adId@", "@adId@");
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    protected final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.c == null || ((p) this.adCacheManager.a()).a(this.c) == null) ? placement : ((Ad) ((p) this.adCacheManager.a()).a(this.c)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f a2 = ((p) this.adCacheManager.a()).a(this.c);
        return a2 != null ? a2.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f a2 = ((p) this.adCacheManager.a()).a(this.c);
        if (a2 != null) {
            return a2.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public boolean isReady() {
        f a2 = ((p) this.adCacheManager.a()).a(this.c);
        if (a2 != null) {
            return a2.isReady();
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
        qg qgVar = pg.f382a;
        qgVar.c = false;
        qgVar.d = true;
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onRestoreInstanceState(Bundle bundle) {
        AdMode adMode = (AdMode) bundle.getSerializable("AdMode");
        if (adMode == null) {
            adMode = AdMode.AUTOMATIC;
        }
        this.e = adMode;
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f = (AdPreferences) serializable;
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
        AdPreferences adPreferences = this.f;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putSerializable("AdMode", this.e);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.g = videoListener;
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0197, code lost:
    
        if (r10 == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(String str, AdDisplayListener adDisplayListener) {
        boolean z;
        AdRulesResult adRulesResult;
        boolean z2;
        boolean z3;
        String[] strArr;
        String[] strArr2;
        try {
            ((xe) this.b.a()).a(32768);
        } catch (Throwable unused) {
        }
        setNotDisplayedReason(null);
        this.h = adDisplayListener;
        if (!canShowAd()) {
            setNotDisplayedReason(NotDisplayedReason.SERVING_ADS_DISABLED);
            y.a(this.context, this.h, this);
            return false;
        }
        if (this.c == null) {
            loadAd(this.e, this.f, (AdEventListener) null);
        }
        if (!AdsCommonMetaData.k().L() || zh.c(this.context)) {
            Context context = this.context;
            WeakHashMap weakHashMap = zh.f528a;
            if (((w5) com.startapp.sdk.components.a.a(context).t.a()).b()) {
                if (isReady()) {
                    AdPreferences.Placement placement = getPlacement();
                    AdRulesResult a2 = AdsCommonMetaData.k().b().a(placement, str);
                    if (a2.b()) {
                        f b = ((p) this.adCacheManager.a()).b(this.c);
                        this.d = b;
                        if (b != null) {
                            z2 = b.a(str);
                            if (z2) {
                                t.d.a(new s(placement, str));
                                AdPreferences adPreferences = this.f;
                                if (adPreferences == null || adPreferences.equals(new AdPreferences())) {
                                    String str2 = "autoLoadNotShownAdPrefix" + this.e.name();
                                    ze edit = ((af) this.f117a.a()).edit();
                                    edit.putInt(str2, 0);
                                    if (this.e == AdMode.AUTOMATIC) {
                                        edit.putInt("autoLoadNotShownAdPrefix" + AdMode.FULLPAGE.name(), 0);
                                        edit.putInt("autoLoadNotShownAdPrefix" + AdMode.OFFERWALL.name(), 0);
                                    }
                                    edit.apply();
                                }
                            } else {
                                Object obj = this.d;
                                if (obj instanceof Ad) {
                                    setNotDisplayedReason(((Ad) obj).getNotDisplayedReason());
                                }
                            }
                            adRulesResult = a2;
                            z = false;
                        }
                    } else {
                        setNotDisplayedReason(NotDisplayedReason.AD_RULES);
                    }
                    z2 = false;
                    adRulesResult = a2;
                    z = false;
                } else {
                    AdMode adMode = this.e;
                    if (adMode != AdMode.REWARDED_VIDEO && adMode != AdMode.VIDEO) {
                        z = true;
                        if (canShowAd() && AdsCommonMetaData.k().F().t() && MetaData.A().Z()) {
                            AdPreferences adPreferences2 = this.f;
                            if (adPreferences2 == null) {
                                adPreferences2 = new AdPreferences();
                            }
                            adPreferences2.setType(Ad.AdType.NON_VIDEO);
                            AdPreferences.Placement placement2 = getPlacement();
                            f a3 = ((p) this.adCacheManager.a()).a(new CacheKey(placement2, adPreferences2));
                            if (a3 != null && a3.isReady() && AdsCommonMetaData.k().b().a(placement2, str).b()) {
                                a3.setVideoCancelCallBack(true);
                                z3 = a3.a(str);
                            }
                        }
                        z3 = false;
                    }
                    z = false;
                    if (!z) {
                        setNotDisplayedReason(NotDisplayedReason.AD_NOT_READY);
                    }
                    adRulesResult = null;
                    z2 = false;
                }
                if (!z2 || z) {
                    db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                    db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                    db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                    db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.OnClickCallback"));
                    db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                }
                if (!z2) {
                    NotDisplayedReason notDisplayedReason = getNotDisplayedReason();
                    if (notDisplayedReason == null) {
                        notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                        setNotDisplayedReason(notDisplayedReason);
                    }
                    Object a4 = ((p) this.adCacheManager.a()).a(this.c);
                    if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                        if (z) {
                            notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                        }
                        Object obj2 = this.d;
                        if (obj2 != null) {
                            a4 = obj2;
                        }
                        if (a4 instanceof x7) {
                            strArr2 = ((x7) a4).i;
                        } else if (a4 instanceof ka) {
                            List list = ((ka) a4).f302a;
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
                        e0.a(strArr2, str, 0, notDisplayedReason.toString(), (JSONObject) null);
                    } else if (adRulesResult != null) {
                        if (a4 instanceof x7) {
                            strArr = ((x7) a4).i;
                        } else if (a4 instanceof ka) {
                            List list2 = ((ka) a4).f302a;
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
                        e0.a(strArr, str, 0, adRulesResult.a());
                    }
                    this.d = null;
                    if (!z) {
                        y.a(this.context, this.h, this);
                    }
                }
                return z2;
            }
            setNotDisplayedReason(NotDisplayedReason.NETWORK_PROBLEM);
        } else {
            setNotDisplayedReason(NotDisplayedReason.APP_IN_BACKGROUND);
        }
        adRulesResult = null;
        z = false;
        z2 = false;
        if (!z2) {
        }
        db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
        db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
        db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
        db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.OnClickCallback"));
        db.a(this.context).a(this.i, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        if (!z2) {
        }
        return z2;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String str2;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                a0.a(this.context, adEventListener, (Ad) this, false);
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
            adPreferences.setPlacementId(e0.a(packageName, name, str2, (String) null));
        }
        ((w6) this.eventTracer.a()).a((Object) this, mh.f340a);
        i iVar = new i(this, adEventListener);
        ((w6) this.eventTracer.a()).c(this, mh.y);
        if (this.f == null) {
            new AdPreferences();
        }
        this.c = ((p) this.adCacheManager.a()).a(this, this.e, this.f, new ig(iVar), str);
    }

    public void loadAd(AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(adEventListener, (String) null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    public void loadAd(AdEventListener adEventListener, String str) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener, str);
    }

    @Deprecated
    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th) {
            n8.a(th);
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            y.a(this.context, this.h, null);
            return false;
        }
    }

    @Deprecated
    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    public void loadAd(AdMode adMode) {
        loadAd(adMode, new AdPreferences(), (AdEventListener) null);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, (AdEventListener) null);
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

    @Deprecated
    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            n8.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        try {
            ((xe) this.b.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.e = adMode;
        this.f = adPreferences;
        try {
            load(adPreferences, adEventListener, str);
        } catch (Throwable th) {
            n8.a(th);
            if (adEventListener != null) {
                a0.a(this.context, adEventListener, (Ad) this, false);
            }
        }
    }
}
