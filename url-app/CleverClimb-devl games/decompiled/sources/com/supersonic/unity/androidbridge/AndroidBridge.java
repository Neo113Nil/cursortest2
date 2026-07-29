package com.supersonic.unity.androidbridge;

import android.app.Activity;
import android.text.TextUtils;
import com.supersonic.adapters.adcolony.AdColonyConfig;
import com.supersonic.adapters.applovin.AppLovinConfig;
import com.supersonic.adapters.chartboost.ChartboostConfig;
import com.supersonic.adapters.flurry.FlurryConfig;
import com.supersonic.adapters.hyprmx.HyprMXConfig;
import com.supersonic.adapters.supersonicads.SupersonicConfig;
import com.supersonic.adapters.unityads.UnityAdsConfig;
import com.supersonic.adapters.vungle.VungleConfig;
import com.supersonic.mediationsdk.config.ConfigFile;
import com.supersonic.mediationsdk.logger.SupersonicError;
import com.supersonic.mediationsdk.model.Placement;
import com.supersonic.mediationsdk.sdk.InterstitialListener;
import com.supersonic.mediationsdk.sdk.OfferwallListener;
import com.supersonic.mediationsdk.sdk.RewardedVideoListener;
import com.supersonic.mediationsdk.sdk.Supersonic;
import com.supersonic.mediationsdk.sdk.SupersonicFactory;
import com.supersonicads.sdk.SSAFactory;
import com.unity3d.player.UnityPlayer;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AndroidBridge implements InterstitialListener, OfferwallListener, RewardedVideoListener {
    private static AndroidBridge mInstance;
    private final String SUPERSONIC_EVENT_GAMEOBJECT = "SupersonicEvents";
    private final String ERROR_CODE = "error_code";
    private final String ERROR_DESCRIPTION = "error_description";
    private final String PLACEMENT_NAME = "placement_name";
    private final String REWARD_NAME = "reward_name";
    private final String REWARD_AMOUNT = "reward_amount";

    public void onRewardedVideoShowFail(SupersonicError supersonicError) {
    }

    public static synchronized AndroidBridge getInstance() {
        AndroidBridge androidBridge;
        synchronized (AndroidBridge.class) {
            if (mInstance == null) {
                mInstance = new AndroidBridge();
            }
            androidBridge = mInstance;
        }
        return androidBridge;
    }

    private AndroidBridge() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        supersonicFactory.setRewardedVideoListener(this);
        supersonicFactory.setInterstitialListener(this);
        supersonicFactory.setOfferwallListener(this);
    }

    public Activity getUnityActivity() {
        return UnityPlayer.currentActivity;
    }

    private void sendUnityEvent(String str, String str2) {
        try {
            if (getUnityActivity() != null) {
                if (!TextUtils.isEmpty(str2)) {
                    UnityPlayer.UnitySendMessage("SupersonicEvents", str, str2);
                } else {
                    UnityPlayer.UnitySendMessage("SupersonicEvents", str, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reportAppStarted() {
        SSAFactory.getAdvertiserInstance().reportAppStarted(getUnityActivity());
    }

    public void setPluginData(String str, String str2) {
        ConfigFile.getConfigFile().setPluginData(str, str2);
        SupersonicConfig.getConfigObj().setPluginType(str);
    }

    public void release() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.release(getUnityActivity());
        }
    }

    public void onResume() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.onResume(getUnityActivity());
        }
    }

    public void onPause() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.onPause(getUnityActivity());
        }
    }

    public void setAge(int i) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.setAge(i);
        }
    }

    public void setGender(String str) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.setGender(str);
        }
    }

    public void initRewardedVideo(String str, String str2) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.initRewardedVideo(getUnityActivity(), str, str2);
        }
    }

    public void showRewardedVideo() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.showRewardedVideo();
        }
    }

    public void showRewardedVideo(String str) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.showRewardedVideo(str);
        }
    }

    public boolean isRewardedVideoAvailable() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            return supersonicFactory.isRewardedVideoAvailable();
        }
        return false;
    }

    public String getPlacementInfo(String str) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            Placement placementInfo = supersonicFactory.getPlacementInfo(str);
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("placement_name", String.valueOf(placementInfo.getPlacementName()));
                hashMap.put("reward_name", String.valueOf(placementInfo.getRewardName()));
                hashMap.put("reward_amount", Integer.valueOf(placementInfo.getRewardAmount()));
                return new JSONObject(hashMap).toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void initInterstitial(String str, String str2) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.initInterstitial(getUnityActivity(), str, str2);
        }
    }

    public void showInterstitial() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.showInterstitial();
        }
    }

    public boolean isInterstitialAdAvailalbe() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            return supersonicFactory.isInterstitialAdAvailable();
        }
        return false;
    }

    public void initOfferwall(String str, String str2) {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.initOfferwall(getUnityActivity(), str, str2);
        }
    }

    public void showOfferwall() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.showOfferwall();
        }
    }

    public boolean isOfferwallAvailable() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            return supersonicFactory.isOfferwallAvailable();
        }
        return false;
    }

    public void getOfferwallCredits() {
        Supersonic supersonicFactory = SupersonicFactory.getInstance();
        if (supersonicFactory != null) {
            supersonicFactory.getOfferwallCredits();
        }
    }

    public void onRewardedVideoInitSuccess() {
        sendUnityEvent("onRewardedVideoInitSuccess", "");
    }

    public void onRewardedVideoInitFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onRewardedVideoInitFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onRewardedVideoInitFail", "");
        }
    }

    public void onRewardedVideoAdOpened() {
        sendUnityEvent("onRewardedVideoAdOpened", "");
    }

    public void onRewardedVideoAdClosed() {
        sendUnityEvent("onRewardedVideoAdClosed", "");
    }

    public void onVideoAvailabilityChanged(boolean z) {
        sendUnityEvent("onVideoAvailabilityChanged", String.valueOf(z));
    }

    public void onVideoStart() {
        sendUnityEvent("onVideoStart", "");
    }

    public void onVideoEnd() {
        sendUnityEvent("onVideoEnd", "");
    }

    public void onRewardedVideoAdRewarded(Placement placement) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("placement_id", String.valueOf(placement.getId()));
            hashMap.put("placement_name", placement.getPlacementName());
            hashMap.put("placement_reward_amount", String.valueOf(placement.getRewardAmount()));
            hashMap.put("placement_reward_name", placement.getRewardName());
            sendUnityEvent("onRewardedVideoAdRewarded", new JSONObject(hashMap).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onInterstitialInitSuccess() {
        sendUnityEvent("onInterstitialInitSuccess", "");
    }

    public void onInterstitialInitFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onInterstitialInitFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onInterstitialInitFail", "");
        }
    }

    public void onInterstitialAvailability(boolean z) {
        sendUnityEvent("onInterstitialAvailability", String.valueOf(z));
    }

    public void onInterstitialShowSuccess() {
        sendUnityEvent("onInterstitialShowSuccess", "");
    }

    public void onInterstitialShowFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onInterstitialShowFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onInterstitialShowFail", "");
        }
    }

    public void onInterstitialAdClicked() {
        sendUnityEvent("onInterstitialAdClicked", "");
    }

    public void onInterstitialAdClosed() {
        sendUnityEvent("onInterstitialAdClosed", "");
    }

    public void onOfferwallInitSuccess() {
        sendUnityEvent("onOfferwallInitSuccess", "");
    }

    public void onOfferwallInitFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onOfferwallInitFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onOfferwallInitFail", "");
        }
    }

    public void onOfferwallOpened() {
        sendUnityEvent("onOfferwallOpened", "");
    }

    public void onOfferwallShowFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onOfferwallShowFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onOfferwallShowFail", "");
        }
    }

    public boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("credits", String.valueOf(i));
            hashMap.put("totalCredits", String.valueOf(i2));
            hashMap.put("totalCreditsFlag", String.valueOf(z));
            sendUnityEvent("onOfferwallAdCredited", new JSONObject(hashMap).toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void onGetOfferwallCreditsFail(SupersonicError supersonicError) {
        if (supersonicError != null) {
            sendUnityEvent("onGetOfferwallCreditsFail", parseErrorToEvent(supersonicError.getErrorCode(), supersonicError.getErrorMessage()));
        } else {
            sendUnityEvent("onGetOfferwallCreditsFail", "");
        }
    }

    public void onOfferwallClosed() {
        sendUnityEvent("onOfferwallClosed", "");
    }

    public String parseErrorToEvent(int i, String str) {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("error_code", String.valueOf(i));
            hashMap.put("error_description", str);
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void setSupersonicMaxVideoLength(int i) {
        SupersonicConfig.getConfigObj().setMaxVideoLength(i);
    }

    public void setSupersonicLanguage(String str) {
        SupersonicConfig.getConfigObj().setLanguage(str);
    }

    public void setSupersonicClientSideCallbacks(boolean z) {
        SupersonicConfig.getConfigObj().setClientSideCallbacks(z);
    }

    public void setSupersonicPrivateKey(String str) {
        SupersonicConfig.getConfigObj().setPrivateKey(str);
    }

    public void setSupersonicItemName(String str) {
        SupersonicConfig.getConfigObj().setItemName(str);
    }

    public void setSupersonicItemCount(int i) {
        SupersonicConfig.getConfigObj().setItemCount(i);
    }

    public void setSupersonicRewardedVideoCustomParams(String str) {
        SupersonicConfig.getConfigObj().setRewardedVideoCustomParams(getHashMapFromJsonString(str));
    }

    public HashMap<String, String> getHashMapFromJsonString(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public void setSupersonicOfferwallCustomParams(String str) {
        SupersonicConfig.getConfigObj().setOfferwallCustomParams(getHashMapFromJsonString(str));
    }

    public void setAdColonyClientOptions(String str) {
        AdColonyConfig.getConfigObj().setClientOptions(str);
    }

    public void setAdColonyAppId(String str) {
        AdColonyConfig.getConfigObj().setAppId(str);
    }

    public void setAdColonyDeviceID(String str) {
        AdColonyConfig.getConfigObj().setDeviceID(str);
    }

    public void setAdColonyCustomID(String str) {
        AdColonyConfig.getConfigObj().setCustomID(str);
    }

    public void setAdColonyZoneID(String str) {
        AdColonyConfig.getConfigObj().setZoneID(str);
    }

    public void setVungleAppId(String str) {
        VungleConfig.getConfigObj().setAppId(str);
    }

    public void setUnityAdsGameId(String str) {
        UnityAdsConfig.getConfigObj().setGameId(str);
    }

    public void setUnityAdsZoneId(String str) {
        UnityAdsConfig.getConfigObj().setZoneId(str);
    }

    public void setAppLovinSDKKey(String str) {
        AppLovinConfig.getConfigObj().setSDKKey(str);
    }

    public void setChartboostAppId(String str) {
        ChartboostConfig.getConfigObj().setAppId(str);
    }

    public void setChartboostAppSignature(String str) {
        ChartboostConfig.getConfigObj().setAppSignature(str);
    }

    public void setFlurryApiKey(String str) {
        FlurryConfig.getConfigObj().setApiKey(str);
    }

    public void setFlurryAdSpace(String str) {
        FlurryConfig.getConfigObj().setAdSpace(str);
    }

    public void setHyprmxDistributionId(String str) {
        HyprMXConfig.getConfigObj().setDistributorId(str);
    }

    public void setHyprmxProperyId(String str) {
        HyprMXConfig.getConfigObj().setPropertyId(str);
    }
}
