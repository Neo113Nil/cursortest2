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
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.mg;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class Ad {
    private static boolean init = false;
    protected ActivityExtra activityExtra;
    protected final ib adCacheManager;
    private AdInformationOverrides adInfoOverride;
    protected ConsentData consentData;
    protected final ib consentManager;
    protected final Context context;
    private String erid;
    private String eridUrl;
    protected String errorMessage;
    protected final ib eventTracer;
    protected final ib httpClient;
    protected final ib motionProcessor;
    protected final ib networkApiExecutor;
    private NotDisplayedReason notDisplayedReason;
    protected final AdPreferences.Placement placement;
    private String requestUrl;
    private boolean tiedToAdm;
    private AdType type;
    protected final ib videoAdCacheManager;
    private boolean videoCancelCallBack;
    protected final ib webViewCacheLoader;
    protected final ib webViewFactory;
    private WeakReference<Activity> adapterCompatActivity = new WeakReference<>(null);
    protected Serializable extraData = null;
    protected Long adCacheTtl = null;
    private AdState state = AdState.UN_INITIALIZED;
    private Long lastLoadTime = null;
    protected boolean belowMinCPM = false;

    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    public Ad(Context context, AdPreferences.Placement placement, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9) {
        this.context = context;
        this.placement = placement;
        this.eventTracer = ibVar;
        this.consentManager = ibVar2;
        this.adCacheManager = ibVar3;
        this.videoAdCacheManager = ibVar4;
        this.webViewFactory = ibVar5;
        this.httpClient = ibVar6;
        this.networkApiExecutor = ibVar7;
        this.motionProcessor = ibVar8;
        this.webViewCacheLoader = ibVar9;
        WeakHashMap weakHashMap = si.f7575a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    private static boolean b(String str) {
        EnabledConfig e4;
        if (str == null || (e4 = MetaData.E().e()) == null) {
            return true;
        }
        return e4.a(new b0.c(14));
    }

    public boolean canShowAd() {
        return MetaData.E().b();
    }

    public abstract a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str);

    public Long getAdCacheTtl() {
        long fallbackAdCacheTtl = getFallbackAdCacheTtl();
        Long l4 = this.adCacheTtl;
        if (l4 != null) {
            fallbackAdCacheTtl = Math.min(l4.longValue(), fallbackAdCacheTtl);
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

    public long getFallbackAdCacheTtl() {
        return CacheMetaData.b().a().a();
    }

    public Long getLastLoadTime() {
        return this.lastLoadTime;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public AdPreferences.Placement getPlacement() {
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

    public boolean getVideoCancelCallBack() {
        return this.videoCancelCallBack;
    }

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

    public final void loadAds(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        this.tiedToAdm = str != null;
        a2 createService = createService(adPreferences, adEventListener, str);
        if (createService != null) {
            ((y6) ((x6) this.eventTracer.a())).a(this, createService);
            createService.a();
        } else if (adEventListener != null) {
            adEventListener.onFailedToReceiveAd(this);
        }
    }

    public Activity resolveActivityToShowAd() {
        Object obj = this.context;
        if (!(obj instanceof Activity)) {
            obj = this.adapterCompatActivity.get();
        }
        Activity activity = (Activity) obj;
        return activity == null ? fh.f6918a.f7010k : activity;
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

    public void setNotDisplayedReason(NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

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
        ((rk) this.webViewFactory.a()).b();
        boolean z4 = true;
        if (!init) {
            g.f(this.context);
            init = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str2 = "load() was already called.";
            z = true;
        } else {
            str2 = "";
            z = false;
        }
        Context context = this.context;
        WeakHashMap weakHashMap = si.f7575a;
        if (!((f6) com.startapp.sdk.components.a.a(context).f6577t.a()).b()) {
            str2 = "network not available.";
            z = true;
        }
        if (canShowAd()) {
            z4 = z;
        } else {
            str2 = "serving ads disabled";
        }
        if (z4) {
            setErrorMessage("Ad wasn't loaded: ".concat(str2));
            a0.a(this.context, aVar, this, false);
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
            adPreferences.setPlacementId(g0.a(packageName, name, str3, (String) null));
        }
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f6940l);
        ((y6) ((x6) this.eventTracer.a())).a(this, bVar);
        MetaData.E().a(this.context, adPreferences, mg.f7288d.f7291c, b(str), bVar, false);
    }
}
