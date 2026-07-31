package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.w5;
import com.startapp.sdk.internal.w6;
import com.startapp.sdk.internal.z2;
import com.startapp.sdk.internal.zh;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class Ad {
    private static boolean init = false;
    protected ActivityExtra activityExtra;
    protected final pa adCacheManager;
    private AdInformationOverrides adInfoOverride;
    protected ConsentData consentData;
    protected final pa consentManager;
    protected final Context context;
    private String erid;
    private String eridUrl;
    protected String errorMessage;
    protected final pa eventTracer;
    protected final pa httpClient;
    protected final pa motionProcessor;
    protected final pa networkApiExecutor;
    private NotDisplayedReason notDisplayedReason;
    protected final AdPreferences.Placement placement;
    private String requestUrl;
    private boolean tiedToAdm;
    private AdType type;
    private boolean videoCancelCallBack;
    protected final pa videoDownloader;
    protected final pa webViewCacheLoader;
    protected final pa webViewFactory;
    private WeakReference<Activity> adapterCompatActivity = new WeakReference<>(null);
    protected Serializable extraData = null;
    protected Long adCacheTtl = null;
    private AdState state = AdState.UN_INITIALIZED;
    private Long lastLoadTime = null;
    protected boolean belowMinCPM = false;

    /* compiled from: Sta */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* compiled from: Sta */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    public Ad(Context context, AdPreferences.Placement placement, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        this.context = context;
        this.placement = placement;
        this.eventTracer = paVar;
        this.consentManager = paVar2;
        this.adCacheManager = paVar3;
        this.videoDownloader = paVar4;
        this.webViewFactory = paVar5;
        this.httpClient = paVar6;
        this.networkApiExecutor = paVar7;
        this.motionProcessor = paVar8;
        this.webViewCacheLoader = paVar9;
        WeakHashMap weakHashMap = zh.f528a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    private static boolean b(String str) {
        EnabledConfig d;
        if (str == null || (d = MetaData.A().d()) == null) {
            return true;
        }
        return d.a(new z2() { // from class: com.startapp.sdk.adsbase.Ad$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.internal.z2
            public final long a() {
                long currentTimeMillis;
                currentTimeMillis = System.currentTimeMillis();
                return currentTimeMillis;
            }
        });
    }

    protected boolean canShowAd() {
        return MetaData.A().b();
    }

    protected abstract v1 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public Long getAdCacheTtl() {
        long fallbackAdCacheTtl = getFallbackAdCacheTtl();
        Long l = this.adCacheTtl;
        if (l != null) {
            fallbackAdCacheTtl = Math.min(l.longValue(), fallbackAdCacheTtl);
        }
        return Long.valueOf(fallbackAdCacheTtl);
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.context;
    }

    public String getDParam() {
        return null;
    }

    public String getErid() {
        return this.erid;
    }

    public String getEridUrl() {
        return this.eridUrl;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    protected long getFallbackAdCacheTtl() {
        return CacheMetaData.b().a().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    protected AdPreferences.Placement getPlacement() {
        return this.placement;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean hasAdCacheTtlPassed() {
        return this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > getAdCacheTtl().longValue();
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !hasAdCacheTtlPassed();
    }

    public boolean isTiedToAdm() {
        return this.tiedToAdm;
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), null);
    }

    protected final void loadAds(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        this.tiedToAdm = str != null;
        v1 createService = createService(adPreferences, adEventListener, str);
        if (createService != null) {
            ((w6) this.eventTracer.a()).a(this, createService);
            createService.a();
        } else if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }

    protected Activity resolveActivityToShowAd() {
        Object obj = this.context;
        if (!(obj instanceof Activity)) {
            obj = this.adapterCompatActivity.get();
        }
        Activity activity = (Activity) obj;
        if (activity != null) {
            return activity;
        }
        WeakReference weakReference = pg.f382a.k;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void setActivityExtra(ActivityExtra activityExtra) {
        this.activityExtra = activityExtra;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        if (context instanceof Activity) {
            this.adapterCompatActivity = new WeakReference<>((Activity) context);
        }
    }

    public void setErid(String str) {
        this.erid = str;
    }

    public void setEridUrl(String str) {
        this.eridUrl = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    protected void setNotDisplayedReason(NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setVideoCancelCallBack(boolean z) {
        this.videoCancelCallBack = z;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, null);
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String str2;
        boolean z;
        String str3;
        a aVar = new a(this, adEventListener);
        ((uj) this.webViewFactory.a()).b();
        boolean z2 = true;
        if (!init) {
            g.f(this.context);
            init = true;
        }
        if (this.state == AdState.UN_INITIALIZED) {
            str2 = "";
            z = false;
        } else {
            str2 = "load() was already called.";
            z = true;
        }
        Context context = this.context;
        WeakHashMap weakHashMap = zh.f528a;
        if (!((w5) com.startapp.sdk.components.a.a(context).t.a()).b()) {
            str2 = "network not available.";
            z = true;
        }
        if (canShowAd()) {
            z2 = z;
        } else {
            str2 = "serving ads disabled";
        }
        if (z2) {
            setErrorMessage("Ad wasn't loaded: ".concat(str2));
            a0.a(this.context, (AdEventListener) aVar, this, false);
            return;
        }
        setState(AdState.PROCESSING);
        b bVar = new b(this, adPreferences, aVar, str);
        if (adPreferences != null && adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        if (adPreferences != null && adPreferences.getPlacementId() == null) {
            Context context2 = this.context;
            String packageName = context2.getPackageName();
            String name = getClass().getName();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    str3 = null;
                    break;
                } else {
                    if (context2 instanceof Activity) {
                        str3 = context2.getClass().getName();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            adPreferences.setPlacementId(e0.a(packageName, name, str3, (String) null));
        }
        ((w6) this.eventTracer.a()).c(this, mh.l);
        ((w6) this.eventTracer.a()).a(this, bVar);
        MetaData.A().a(this.context, adPreferences, vf.d.c, b(str), bVar, false);
    }
}
