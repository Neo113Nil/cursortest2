package com.startapp.sdk.ads.banner;

import B0.n;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.f1;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gk;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.pf;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.xf;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class BannerBase extends RelativeLayout {
    private static final int LOAD_BANNER = 1;
    private static final int LOAD_BANNER_DELAYED = 2;
    private static final String LOG_TAG = "BannerBase";
    private static final long MIN_REFRESH_INTERVAL_MILLIS = 10000;
    private static final long RELOAD_CHECK_INTERVAL_MILLIS = 2000;
    protected final ib adCacheManager;
    private AdPreferences adPreferences;
    protected AdRulesResult adRulesResult;
    private boolean attachedToWindow;
    private boolean clicked;
    protected final ib consentManager;
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;
    private String error;
    protected final ib eventTracer;
    private boolean firstLoad;
    private final Handler handler;
    private final Object handlerLock;
    protected final ib httpClient;
    private long loadedUptimeMillis;
    protected final ib motionProcessor;
    protected final ib networkApiExecutor;
    protected int offset;
    protected final ib runtimeClassDetector;
    private final Runnable scheduleReloadTask;
    private boolean shouldReloadBanner;
    protected final ib showIntentionsKeeper;
    protected final ib videoAdCacheManager;
    protected gk viewabilityRunner;
    protected final ib webViewCacheLoader;
    protected final ib webViewFactory;

    public BannerBase(Context context, AttributeSet attributeSet, int i3, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11) {
        super(context, attributeSet, i3);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.scheduleReloadTask = new n(6, this);
        this.handler = new Handler(Looper.getMainLooper(), new a(this));
        this.handlerLock = new Object();
        this.eventTracer = ibVar;
        this.consentManager = ibVar2;
        this.adCacheManager = ibVar3;
        this.videoAdCacheManager = ibVar4;
        this.webViewFactory = ibVar5;
        this.httpClient = ibVar6;
        this.networkApiExecutor = ibVar7;
        this.motionProcessor = ibVar8;
        this.webViewCacheLoader = ibVar9;
        this.runtimeClassDetector = ibVar10;
        this.showIntentionsKeeper = ibVar11;
        setAdTag(new f1(context, attributeSet).f3775a);
        try {
            ((pf) ibVar10.a()).a(512);
        } catch (Throwable unused) {
        }
    }

    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || AdaptMetaData.b().a().b()) {
            setFirstLoad(false);
            t.f4445d.a(new s(AdPreferences.Placement.INAPP_BANNER, getAdTag()));
        }
    }

    public void cancelDelayedLoading() {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
        }
    }

    public void cancelReloadTask() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.scheduleReloadTask);
        cancelDelayedLoading();
    }

    public Point getAdLoadingSize() {
        return new Point(getWidthInDp(), getHeightInDp());
    }

    public AdPreferences getAdPreferences() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences;
        }
        AdPreferences adPreferences2 = new AdPreferences();
        this.adPreferences = adPreferences2;
        return adPreferences2;
    }

    public String getAdTag() {
        return getAdPreferences().getAdTag();
    }

    public abstract String getBannerName();

    public String getErrorMessage() {
        return this.error;
    }

    public abstract int getHeightInDp();

    public long getRefreshDelayMillis() {
        return 0L;
    }

    public abstract int getRefreshRate();

    public long getTimePassedSinceAdLoadedToViewMillis() {
        return SystemClock.uptimeMillis() - this.loadedUptimeMillis;
    }

    public View getViewableBanner() {
        return this;
    }

    public abstract int getWidthInDp();

    public abstract void hideBanner();

    public void init() {
        if (!isInEditMode()) {
            initRuntime();
            return;
        }
        setMinimumWidth(ii.a(getContext(), getWidthInDp()));
        setMinimumHeight(ii.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    public abstract void initRuntime();

    public boolean isAdLoadedToView() {
        return this.loadedUptimeMillis > 0;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    public boolean isTiedToAdm() {
        return false;
    }

    public void load(String str) {
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
        if (this.adRulesResult != null && !AdaptMetaData.b().a().b()) {
            if (this.adRulesResult.b()) {
                reload(str);
            }
        } else {
            AdRulesResult a3 = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_BANNER, getAdTag());
            this.adRulesResult = a3;
            if (a3.b()) {
                reload(str);
            } else {
                hideBanner();
            }
        }
    }

    public void loadAd(int i3, int i4) {
        loadAd(i3, i4, null);
    }

    public void loadBanner(String str) {
        try {
            ((pf) this.runtimeClassDetector.a()).a(1024);
        } catch (Throwable unused) {
        }
        synchronized (this.handlerLock) {
            try {
                if (!this.handler.hasMessages(1)) {
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 1;
                    this.handler.sendMessage(obtain);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void loadBannerDelayed(long j3) {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, j3);
        }
    }

    public void loadBannerImpl(String str) {
        scheduleReloadTask();
        load(str);
    }

    public void onAdLoadedToView() {
        getContext();
        WeakHashMap weakHashMap = si.f4438a;
        Log.println(2, "StartAppSDK", "Banner start rendering the ad content");
        this.loadedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ((pf) this.runtimeClassDetector.a()).a(4096);
        } catch (Throwable unused) {
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        cancelReloadTask();
        gk gkVar = this.viewabilityRunner;
        if (gkVar != null) {
            gkVar.a();
            this.viewabilityRunner = null;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.adRulesResult = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt("offset");
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt("offset", this.offset);
        bundle.putBoolean("firstLoad", this.firstLoad);
        bundle.putBoolean("shouldReloadBanner", this.shouldReloadBanner);
        return bundle;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            this.attachedToWindow = false;
            cancelReloadTask();
            return;
        }
        if (this.shouldReloadBanner) {
            this.shouldReloadBanner = false;
            load(null);
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    public AdPreferences prepareAdPreferences() {
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(g0.a(this));
        }
        adPreferences.setHardwareAccelerated(p0.a(this, this.attachedToWindow));
        return adPreferences;
    }

    public abstract void reload(String str);

    public void scheduleReloadTask() {
        AdRulesResult adRulesResult;
        if (!isInEditMode() && CacheMetaData.d() && this.attachedToWindow && !isTiedToAdm()) {
            long max = Math.max(0L, getRefreshDelayMillis());
            long max2 = ((this.loadedUptimeMillis + Math.max(MIN_REFRESH_INTERVAL_MILLIS, getRefreshRate())) - max) - SystemClock.uptimeMillis();
            if (max2 > 0) {
                removeCallbacks(this.scheduleReloadTask);
                if (max <= 0) {
                    max2 = Math.min(RELOAD_CHECK_INTERVAL_MILLIS, max2);
                }
                postDelayed(this.scheduleReloadTask, max2);
                return;
            }
            if (isShown() || ((adRulesResult = this.adRulesResult) != null && !adRulesResult.b())) {
                load(null);
            }
            loadBannerDelayed(MetaData.E().M() * 1000);
        }
    }

    public void setAdPreferences(AdPreferences adPreferences) {
        this.adPreferences = adPreferences != null ? new AdPreferences(adPreferences) : null;
    }

    public void setAdTag(String str) {
        getAdPreferences().setAdTag(str);
    }

    public void setClicked(boolean z) {
        this.clicked = z;
    }

    public void setErrorMessage(String str) {
        this.error = str;
    }

    public void setFirstLoad(boolean z) {
        this.firstLoad = z;
    }

    public boolean shouldSendImpression(xf xfVar) {
        return xfVar != null && xfVar.f4731j.get() == 0;
    }

    public void startVisibilityRunnable(xf xfVar) {
        if (this.viewabilityRunner != null) {
            return;
        }
        gk gkVar = new gk(getViewableBanner(), getAdLoadingSize(), xfVar, BannerMetaData.c().a());
        this.viewabilityRunner = gkVar;
        if (gkVar.c()) {
            gkVar.run();
        }
    }

    public void loadAd(int i3, int i4, String str) {
        if (i3 > getWidthInDp() && i4 > getHeightInDp()) {
            this.desirableSizeForManualLoading = new Point(i3, i4);
        }
        loadBanner(str);
    }

    public void loadAd() {
        loadBanner(null);
    }

    public void loadAd(String str) {
        loadBanner(str);
    }
}
