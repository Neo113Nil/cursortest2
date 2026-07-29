package com.ironsource.b;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import com.ironsource.b.c;
import com.ironsource.b.d.c;
import com.ironsource.b.f.u;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: AbstractAdapter.java */
/* loaded from: classes2.dex */
public abstract class b implements com.ironsource.b.f.i, com.ironsource.b.f.r {
    protected com.ironsource.b.f.d mActiveBannerSmash;
    protected com.ironsource.b.f.l mActiveInterstitialSmash;
    protected u mActiveRewardedVideoSmash;
    protected CopyOnWriteArrayList<com.ironsource.b.f.d> mAllBannerSmashes;
    protected View mCurrentAdNetworkBanner;
    protected l mIronSourceBanner;
    private String mPluginFrameworkVersion;
    private String mPluginType;
    private String mProviderName;
    protected com.ironsource.b.f.p mRewardedInterstitial;
    private com.ironsource.b.d.d mLoggerManager = com.ironsource.b.d.d.c();
    protected CopyOnWriteArrayList<u> mAllRewardedVideoSmashes = new CopyOnWriteArrayList<>();
    protected CopyOnWriteArrayList<com.ironsource.b.f.l> mAllInterstitialSmashes = new CopyOnWriteArrayList<>();
    protected ConcurrentHashMap<String, u> mRewardedVideoPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, com.ironsource.b.f.l> mInterstitialPlacementToListenerMap = new ConcurrentHashMap<>();
    protected ConcurrentHashMap<String, com.ironsource.b.f.d> mBannerPlacementToListenerMap = new ConcurrentHashMap<>();

    protected void addBannerListener(com.ironsource.b.f.d dVar) {
    }

    public void destroyBanner(l lVar, JSONObject jSONObject) {
    }

    public abstract String getCoreSDKVersion();

    public abstract String getVersion();

    public void initBanners(Activity activity, String str, String str2, JSONObject jSONObject, com.ironsource.b.f.d dVar) {
    }

    public void loadBanner(l lVar, JSONObject jSONObject, com.ironsource.b.f.d dVar) {
    }

    public void onPause(Activity activity) {
    }

    public void onResume(Activity activity) {
    }

    public void reloadBanner(JSONObject jSONObject) {
    }

    protected void removeBannerListener(com.ironsource.b.f.d dVar) {
    }

    public void setAge(int i) {
    }

    protected void setConsent(boolean z) {
    }

    public void setGender(String str) {
    }

    public void setLogListener(com.ironsource.b.d.e eVar) {
    }

    public void setMediationSegment(String str) {
    }

    protected void setMediationState(c.a aVar, String str) {
    }

    public b(String str) {
        this.mProviderName = str;
    }

    public String getProviderName() {
        return this.mProviderName;
    }

    protected String getDynamicUserId() {
        return m.a().f();
    }

    void setPluginData(String str, String str2) {
        this.mPluginType = str;
        this.mPluginFrameworkVersion = str2;
    }

    public String getPluginType() {
        return this.mPluginType;
    }

    public String getPluginFrameworkVersion() {
        return this.mPluginFrameworkVersion;
    }

    protected void log(c.a aVar, String str, int i) {
        this.mLoggerManager.b(aVar, str, i);
    }

    protected void removeBannerViews() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.mIronSourceBanner == null || b.this.mCurrentAdNetworkBanner == null || b.this.mCurrentAdNetworkBanner.getParent() != b.this.mIronSourceBanner) {
                        return;
                    }
                    b.this.mIronSourceBanner.removeView(b.this.mCurrentAdNetworkBanner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setRewardedInterstitialListener(com.ironsource.b.f.p pVar) {
        this.mRewardedInterstitial = pVar;
    }

    protected boolean isAdaptersDebugEnabled() {
        return this.mLoggerManager.d();
    }

    public void addRewardedVideoListener(u uVar) {
        this.mAllRewardedVideoSmashes.add(uVar);
    }

    public void removeRewardedVideoListener(u uVar) {
        this.mAllRewardedVideoSmashes.remove(uVar);
    }

    public void addInterstitialListener(com.ironsource.b.f.l lVar) {
        this.mAllInterstitialSmashes.add(lVar);
    }

    public void removeInterstitialListener(com.ironsource.b.f.l lVar) {
        this.mAllInterstitialSmashes.remove(lVar);
    }

    protected boolean isLargeScreen(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        return ((float) displayMetrics.heightPixels) / displayMetrics.density > 720.0f;
    }

    protected int getScreenWidthPixels(Activity activity) {
        return activity.getResources().getDisplayMetrics().widthPixels;
    }
}
