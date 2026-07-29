package com.youappi.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.youappi.sdk.ads.YAInterstitialAd;
import com.youappi.sdk.ads.YAInterstitialVideoAd;
import com.youappi.sdk.ads.YARewardedVideoAd;
import com.youappi.sdk.logic.Logger;

/* loaded from: classes2.dex */
public class YouAPPi {
    private static final String TAG = "YouAPPi";
    private static YouAPPi _instance;
    private b _logicManager;
    private boolean ageRestrictedUser;
    private String dynamicUserId;
    private boolean sendApps;
    private boolean userConsent;

    private YouAPPi() {
        this.userConsent = false;
        this.ageRestrictedUser = false;
        this.sendApps = false;
        this._logicManager = new c();
    }

    private YouAPPi(Context context, String str, String str2, boolean z) {
        this.userConsent = false;
        this.ageRestrictedUser = false;
        this.sendApps = false;
        this._logicManager = new a(context, str, str2);
        this.userConsent = z;
    }

    public static synchronized YouAPPi getInstance() {
        YouAPPi youAPPi;
        synchronized (YouAPPi.class) {
            if (_instance == null) {
                _instance = new YouAPPi();
            }
            youAPPi = _instance;
        }
        return youAPPi;
    }

    public static String getVersionStr() {
        return "4.3.10";
    }

    public static synchronized boolean init(Context context, String str, boolean z) {
        boolean z2;
        synchronized (YouAPPi.class) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            z2 = false;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(packageName)) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (_instance != null && ((_instance.getLogicManager() instanceof c) || !_instance.getLogicManager().a().equals(applicationContext2) || !_instance.getLogicManager().d().equals(str) || !_instance.getLogicManager().e().equals(packageName))) {
                    _instance.cleanup();
                    _instance = null;
                }
                if (_instance == null) {
                    _instance = new YouAPPi(applicationContext2, str, packageName, z);
                }
                _instance._logicManager.f().log(TAG, "init");
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean isMoat() {
        return com.youappi.sdk.net.trackers.a.a();
    }

    public void cleanup() {
        this._logicManager.f().log(TAG, "cleanup");
        this._logicManager.b();
        _instance = null;
    }

    public String getDynamicUserId() {
        return this.dynamicUserId;
    }

    b getLogicManager() {
        return this._logicManager;
    }

    public boolean hasUserConsent() {
        return this.userConsent;
    }

    public YAInterstitialAd interstitialAd(String str) {
        return (YAInterstitialAd) this._logicManager.a(AdType.CARD, YAInterstitialAd.class, str);
    }

    public YAInterstitialVideoAd interstitialVideoAd(String str) {
        return (YAInterstitialVideoAd) this._logicManager.a(AdType.VIDEO, YAInterstitialVideoAd.class, str);
    }

    public boolean isAgeRestrictedUser() {
        return this.ageRestrictedUser;
    }

    public boolean isRestrictedUser() {
        return !hasUserConsent() || isAgeRestrictedUser();
    }

    public boolean isSendApps() {
        return this.sendApps;
    }

    public YARewardedVideoAd rewardedVideoAd(String str) {
        return (YARewardedVideoAd) this._logicManager.a(AdType.REWARDED_VIDEO, YARewardedVideoAd.class, str);
    }

    public void setAgeRestrictedUser(boolean z) {
        this.ageRestrictedUser = z;
    }

    public void setDynamicUserId(String str) {
        this.dynamicUserId = str;
    }

    public void setLogLevel(int i) {
        this._logicManager.a(i);
    }

    public void setLogListener(Logger.LogListener logListener) {
        this._logicManager.a(logListener);
    }

    public void setSendApps(boolean z) {
        this.sendApps = z;
    }

    public void setUserConsent(boolean z) {
        this.userConsent = z;
    }
}
