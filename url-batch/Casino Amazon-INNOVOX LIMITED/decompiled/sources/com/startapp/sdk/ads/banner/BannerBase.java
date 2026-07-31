package com.startapp.sdk.ads.banner;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.c1;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.jj;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.xe;
import com.startapp.sdk.internal.zh;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class BannerBase extends RelativeLayout {
    private static final int LOAD_BANNER = 1;
    private static final int LOAD_BANNER_DELAYED = 2;
    private static final String LOG_TAG = "BannerBase";
    private static final long MIN_REFRESH_INTERVAL_MILLIS = 10000;
    private static final long RELOAD_CHECK_INTERVAL_MILLIS = 2000;
    protected final pa adCacheManager;
    private AdPreferences adPreferences;
    protected AdRulesResult adRulesResult;
    private boolean attachedToWindow;
    private boolean clicked;
    protected final pa consentManager;
    protected Point desirableSizeForManualLoading;
    protected boolean drawn;
    private String error;
    protected final pa eventTracer;
    private boolean firstLoad;
    private final Handler handler;
    private final Object handlerLock;
    protected final pa httpClient;
    private long loadedUptimeMillis;
    protected final pa motionProcessor;
    protected final pa networkApiExecutor;
    protected int offset;
    protected final pa runtimeClassDetector;
    private final Runnable scheduleReloadTask;
    private boolean shouldReloadBanner;
    protected final pa showIntentionsKeeper;
    protected final pa videoDownloader;
    protected jj viewabilityRunner;
    protected final pa webViewCacheLoader;
    protected final pa webViewFactory;

    public BannerBase(Context context, AttributeSet attributeSet, int i, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10, pa paVar11) {
        super(context, attributeSet, i);
        this.attachedToWindow = false;
        this.offset = 0;
        this.firstLoad = true;
        this.drawn = false;
        this.clicked = false;
        this.shouldReloadBanner = false;
        this.scheduleReloadTask = new Runnable() { // from class: com.startapp.sdk.ads.banner.BannerBase$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BannerBase.this.scheduleReloadTask();
            }
        };
        this.handler = new Handler(Looper.getMainLooper(), new a(this));
        this.handlerLock = new Object();
        this.eventTracer = paVar;
        this.consentManager = paVar2;
        this.adCacheManager = paVar3;
        this.videoDownloader = paVar4;
        this.webViewFactory = paVar5;
        this.httpClient = paVar6;
        this.networkApiExecutor = paVar7;
        this.motionProcessor = paVar8;
        this.webViewCacheLoader = paVar9;
        this.runtimeClassDetector = paVar10;
        this.showIntentionsKeeper = paVar11;
        setAdTag(new c1(context, attributeSet).f191a);
        try {
            ((xe) paVar10.a()).a(512);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addDisplayEventOnLoad() {
        if (isFirstLoad() || AdaptMetaData.b().a().b()) {
            setFirstLoad(false);
            t.d.a(new s(AdPreferences.Placement.INAPP_BANNER, getAdTag()));
        }
    }

    protected void cancelDelayedLoading() {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancelReloadTask() {
        if (isInEditMode()) {
            return;
        }
        removeCallbacks(this.scheduleReloadTask);
        cancelDelayedLoading();
    }

    protected Point getAdLoadingSize() {
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

    protected String getAdTag() {
        return getAdPreferences().getAdTag();
    }

    protected abstract String getBannerName();

    public String getErrorMessage() {
        return this.error;
    }

    protected abstract int getHeightInDp();

    protected long getRefreshDelayMillis() {
        return 0L;
    }

    protected abstract int getRefreshRate();

    protected long getTimePassedSinceAdLoadedToViewMillis() {
        return SystemClock.uptimeMillis() - this.loadedUptimeMillis;
    }

    protected View getViewableBanner() {
        return this;
    }

    protected abstract int getWidthInDp();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void hideBanner();

    protected void init() {
        if (!isInEditMode()) {
            initRuntime();
            return;
        }
        setMinimumWidth(ph.a(getContext(), getWidthInDp()));
        setMinimumHeight(ph.a(getContext(), getHeightInDp()));
        setBackgroundColor(Color.rgb(169, 169, 169));
        TextView textView = new TextView(getContext());
        textView.setText(getBannerName());
        textView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        addView(textView, layoutParams);
    }

    protected abstract void initRuntime();

    protected boolean isAdLoadedToView() {
        return this.loadedUptimeMillis > 0;
    }

    public boolean isClicked() {
        return this.clicked;
    }

    public boolean isFirstLoad() {
        return this.firstLoad;
    }

    protected boolean isTiedToAdm() {
        return false;
    }

    protected void load(String str) {
        jj jjVar = this.viewabilityRunner;
        if (jjVar != null) {
            jjVar.a();
            this.viewabilityRunner = null;
        }
        if (this.adRulesResult != null && !AdaptMetaData.b().a().b()) {
            if (this.adRulesResult.b()) {
                reload(str);
            }
        } else {
            AdRulesResult a2 = AdaptMetaData.b().a().a(AdPreferences.Placement.INAPP_BANNER, getAdTag());
            this.adRulesResult = a2;
            if (a2.b()) {
                reload(str);
            } else {
                hideBanner();
            }
        }
    }

    public void loadAd(int i, int i2) {
        loadAd(i, i2, null);
    }

    protected void loadBanner(String str) {
        try {
            ((xe) this.runtimeClassDetector.a()).a(1024);
        } catch (Throwable unused) {
        }
        synchronized (this.handlerLock) {
            if (!this.handler.hasMessages(1)) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 1;
                this.handler.sendMessage(obtain);
            }
        }
    }

    protected void loadBannerDelayed(long j) {
        synchronized (this.handlerLock) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, j);
        }
    }

    protected void loadBannerImpl(String str) {
        scheduleReloadTask();
        load(str);
    }

    protected void onAdLoadedToView() {
        getContext();
        WeakHashMap weakHashMap = zh.f528a;
        Log.println(2, "StartAppSDK", "Banner start rendering the ad content");
        this.loadedUptimeMillis = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            ((xe) this.runtimeClassDetector.a()).a(4096);
        } catch (Throwable unused) {
        }
        this.attachedToWindow = true;
        scheduleReloadTask();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        cancelReloadTask();
        jj jjVar = this.viewabilityRunner;
        if (jjVar != null) {
            jjVar.a();
            this.viewabilityRunner = null;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.adRulesResult = (AdRulesResult) bundle.getSerializable("adRulesResult");
        this.adPreferences = (AdPreferences) bundle.getSerializable("adPreferences");
        this.offset = bundle.getInt(TypedValues.Cycle.S_WAVE_OFFSET);
        this.firstLoad = bundle.getBoolean("firstLoad");
        this.shouldReloadBanner = bundle.getBoolean("shouldReloadBanner");
        super.onRestoreInstanceState(bundle.getParcelable("upperState"));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (isClicked()) {
            setClicked(false);
            this.shouldReloadBanner = true;
        }
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("upperState", onSaveInstanceState);
        bundle.putSerializable("adRulesResult", this.adRulesResult);
        bundle.putSerializable("adPreferences", this.adPreferences);
        bundle.putInt(TypedValues.Cycle.S_WAVE_OFFSET, this.offset);
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

    protected AdPreferences prepareAdPreferences() {
        AdPreferences adPreferences = getAdPreferences();
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(e0.a(this));
        }
        adPreferences.setHardwareAccelerated(m0.a(this, this.attachedToWindow));
        return adPreferences;
    }

    protected abstract void reload(String str);

    protected void scheduleReloadTask() {
        AdRulesResult adRulesResult;
        if (!isInEditMode() && CacheMetaData.d() && this.attachedToWindow && !isTiedToAdm()) {
            long max = Math.max(0L, getRefreshDelayMillis());
            long max2 = ((this.loadedUptimeMillis + Math.max(10000L, getRefreshRate())) - max) - SystemClock.uptimeMillis();
            if (max2 > 0) {
                removeCallbacks(this.scheduleReloadTask);
                if (max <= 0) {
                    max2 = Math.min(2000L, max2);
                }
                postDelayed(this.scheduleReloadTask, max2);
                return;
            }
            if (isShown() || ((adRulesResult = this.adRulesResult) != null && !adRulesResult.b())) {
                load(null);
            }
            loadBannerDelayed(MetaData.A().H() * 1000);
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

    protected boolean shouldSendImpression(ff ffVar) {
        return ffVar != null && ffVar.j.get() == 0;
    }

    protected void startVisibilityRunnable(ff ffVar) {
        if (this.viewabilityRunner != null) {
            return;
        }
        jj jjVar = new jj(getViewableBanner(), getAdLoadingSize(), ffVar, BannerMetaData.c().a());
        this.viewabilityRunner = jjVar;
        if (jjVar.c()) {
            jjVar.run();
        }
    }

    public void loadAd(int i, int i2, String str) {
        if (i > getWidthInDp() && i2 > getHeightInDp()) {
            this.desirableSizeForManualLoading = new Point(i, i2);
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
