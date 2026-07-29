package com.youappi.sdk.mediation.admob;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.ads.YARewardedVideoAd;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class YouAppiRewardedVideo implements MediationRewardedVideoAdAdapter, YARewardedVideoAd.RewardedVideoAdListener {
    private static final String TAG = "YouAppiRewardedVideo";
    private String accessToken;
    private MediationRewardedVideoAdListener listener;
    private YARewardItem rewardItem;
    private YARewardedVideoAd rewardedVideoAd;

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardClose(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onCardShow(String str) {
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoSkipped(String str, int i) {
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.accessToken = jSONObject.getString(ParamNames.ACCESS_TOKEN);
                if (YouAppiAdMobUtils.initSdk(TAG, context.getApplicationContext(), this.accessToken, bundle2)) {
                    String string2 = jSONObject.getString(ParamNames.AD_UNIT_ID);
                    if (string2 != null) {
                        Log.i(TAG, "Loading Rewarded Video for ad unit: " + string2 + " with access token: " + this.accessToken);
                        setRewardItem(jSONObject);
                        this.rewardedVideoAd = YouAPPi.getInstance().rewardedVideoAd(string2);
                        this.rewardedVideoAd.setRewardedVideoAdListener(this);
                        this.listener = mediationRewardedVideoAdListener;
                        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
                    } else {
                        Log.e(TAG, "Failed creating YouAppi Rewarded Video instance. Ad Unit Id is not configured in AdMob console");
                        mediationRewardedVideoAdListener.onInitializationFailed(this, 0);
                    }
                } else {
                    mediationRewardedVideoAdListener.onInitializationFailed(this, 0);
                }
                return;
            } catch (JSONException e) {
                Log.e(TAG, "Failed Initializing YouAppi SDK. Param value is not setup properly in AdMob console", e);
                mediationRewardedVideoAdListener.onInitializationFailed(this, 0);
                return;
            }
        }
        Log.e(TAG, "Failed Initializing YouAppi SDK. Param value missing for custom event in AdMob console");
        mediationRewardedVideoAdListener.onInitializationFailed(this, 0);
    }

    private void setRewardItem(JSONObject jSONObject) {
        this.rewardItem = new YARewardItem(jSONObject.optString(ParamNames.REWARD_TYPE, "REWARD"), jSONObject.optInt(ParamNames.REWARD_AMOUNT, 1));
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.rewardedVideoAd != null) {
            Log.i(TAG, "Loading Rewarded Video for ad unit: " + this.rewardedVideoAd._adUnitId);
            this.rewardedVideoAd.load();
            return;
        }
        Log.e(TAG, "YouAppi Rewarded Video is not initialized");
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        if (this.rewardedVideoAd != null) {
            Log.i(TAG, "Showing Rewarded Video for ad unit: " + this.rewardedVideoAd._adUnitId);
            this.rewardedVideoAd.show();
            return;
        }
        Log.e(TAG, "YouAppi Rewarded Video is not initialized");
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.rewardedVideoAd != null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Log.i(TAG, "onDestroy");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        Log.i(TAG, "onPause");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        Log.i(TAG, "onResume");
    }

    @Override // com.youappi.sdk.ads.YARewardedVideoAd.RewardedVideoAdListener
    public void onRewarded(String str) {
        if (this.listener != null) {
            this.listener.onRewarded(this, this.rewardItem);
        }
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdClick(String str) {
        if (this.listener != null) {
            this.listener.onAdClicked(this);
        }
    }

    @Override // com.youappi.sdk.ads.YAInterstitialAd.InterstitialAdListener
    public void onAdLeftApplication(String str) {
        if (this.listener != null) {
            this.listener.onAdLeftApplication(this);
        }
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoStart(String str) {
        if (this.listener != null) {
            this.listener.onVideoStarted(this);
        }
    }

    @Override // com.youappi.sdk.ads.YAInterstitialVideoAd.InterstitialVideoAdListener
    public void onVideoEnd(String str) {
        if (this.listener != null) {
            this.listener.onVideoCompleted(this);
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onShowFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        Log.e(TAG, "Failed showing YouAppi Rewarded Video for Ad Unit Id: " + str + " with accessToken: " + this.accessToken + " for reason: " + yAErrorCode, exc);
        if (this.listener != null) {
            this.listener.onAdFailedToLoad(this, 0);
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadSuccess(String str) {
        Log.i(TAG, "YouAppi Interstitial Ad for Ad Unit Id: " + str + " was loaded successfully");
        if (this.listener != null) {
            this.listener.onAdLoaded(this);
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onLoadFailure(String str, YAErrorCode yAErrorCode, Exception exc) {
        Log.e(TAG, "Failed loading YouAppi Rewarded Video for Ad Unit Id: " + str + " with accessToken: " + this.accessToken + " for reason: " + yAErrorCode, exc);
        if (this.listener != null) {
            this.listener.onAdFailedToLoad(this, YouAppiAdMobUtils.toAdMobErrorCode(yAErrorCode));
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdStarted(String str) {
        if (this.listener != null) {
            this.listener.onAdOpened(this);
        }
    }

    @Override // com.youappi.sdk.ads.AdListener
    public void onAdEnded(String str) {
        if (this.listener != null) {
            this.listener.onAdClosed(this);
        }
    }

    private class YARewardItem implements RewardItem {
        private int amount;
        private String type;

        public YARewardItem(String str, int i) {
            this.type = str;
            this.amount = i;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public String getType() {
            return this.type;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public int getAmount() {
            return this.amount;
        }
    }
}
