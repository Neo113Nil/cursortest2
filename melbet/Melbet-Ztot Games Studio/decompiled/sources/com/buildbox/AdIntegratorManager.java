package com.buildbox;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;
import androidx.preference.PreferenceManager;
import com.buildbox.adapter.admob.AdIntegrator;
import com.buildbox.consent.ConsentHelper;
import com.buildbox.consent.SdkConsentInfo;
import com.secrethq.utils.PTJniHelper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class AdIntegratorManager implements AdIntegratorManagerInterface {
    private static WeakReference<Activity> activity;
    private static AdIntegratorManager instance;
    private static HashMap<String, AdIntegratorInterface> integrators = new HashMap<>();
    private static String TAG = "AdIntegratorManager";

    public static native void bannerFailedNative(String str);

    public static native void bannerLoadedNative(String str);

    public static native void interstitialClosedNative(String str);

    public static native void interstitialFailedNative(String str);

    public static native void interstitialLoadedNative(String str);

    public static native void remoteConfigResultNative(boolean z, String str);

    public static native void rewardedVideoDidEndNative(String str, boolean z);

    public static native void rewardedVideoDidRewardNative(String str, boolean z);

    public static native void rewardedVideoFailedNative(String str);

    public static native void rewardedVideoLoadedNative(String str);

    public static native void sdkFailedNative(String str);

    public static native void sdkLoadedNative(String str);

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void bannerAdZoneAttempt(String str, String str2, boolean z) {
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void interstitialAdZoneAttempt(String str, String str2, boolean z) {
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoAdZoneAttempt(String str, String str2, boolean z) {
    }

    public static AdIntegratorManager getInstance() {
        if (instance == null) {
            instance = new AdIntegratorManager();
        }
        return instance;
    }

    public static void initBridge(Activity activity2) {
        activity = new WeakReference<>(activity2);
        integrators.put("admob", new AdIntegrator());
    }

    public static void fetchRemoteConfig() {
        new GetRemoteAdboxConfigTask().execute(new String[0]);
    }

    public static void initSdk(String str, final HashMap<String, String> hashMap) {
        final boolean z = PreferenceManager.getDefaultSharedPreferences(activity.get()).getBoolean(ConsentHelper.getConsentKey(str), false);
        final boolean targetsChildren = PTJniHelper.targetsChildren();
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.1
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.setTargetsChildren(targetsChildren);
                    AdIntegratorInterface.this.setUserConsent(z);
                    AdIntegratorInterface.this.initAds(hashMap, AdIntegratorManager.activity, AdIntegratorManager.getInstance());
                    AdIntegratorInterface.this.setTargetsChildren(targetsChildren);
                    AdIntegratorInterface.this.setUserConsent(z);
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        Log.d(TAG, "failing ad network " + str);
        getInstance().networkFailed(str);
    }

    public static void cleanupSdk(String str) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            Log.d(TAG, "cleaning up sdk for " + str);
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.2
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.cleanup();
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void initBanner(String str) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.3
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.initBanner();
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void initInterstitial(String str) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.4
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.initInterstitial();
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void initRewardedVideo(String str) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.5
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.initRewardedVideo();
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static boolean showBanner(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.showBanner();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return false;
    }

    public static void hideBanner(String str) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.6
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.hideBanner();
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static boolean showInterstitial(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.showInterstitial();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return false;
    }

    public static boolean showRewardedVideo(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.showRewardedVideo();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return false;
    }

    public static boolean isBannerVisible(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.isBannerVisible();
        }
        return false;
    }

    public static boolean isRewardedVideoAvailable(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.isRewardedVideoAvailable();
        }
        return false;
    }

    public static void setUserConsent(String str, final boolean z) {
        final AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.7
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorInterface.this.setUserConsent(z);
                }
            });
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void revokeAllConsent() {
        activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.8
            @Override // java.lang.Runnable
            public void run() {
                SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences((Context) AdIntegratorManager.activity.get());
                for (SdkConsentInfo sdkConsentInfo : ConsentHelper.getSdkConsentInfos()) {
                    Log.d(AdIntegratorManager.TAG, "Revoking consent for " + sdkConsentInfo.getSdkId());
                    defaultSharedPreferences.edit().putBoolean(ConsentHelper.getConsentKey(sdkConsentInfo.getSdkId()), false).commit();
                    AdIntegratorInterface adIntegratorInterface = (AdIntegratorInterface) AdIntegratorManager.integrators.get(sdkConsentInfo.getSdkId());
                    if (adIntegratorInterface != null) {
                        adIntegratorInterface.setUserConsent(false);
                    } else {
                        Log.e(AdIntegratorManager.TAG, "Ad network " + sdkConsentInfo.getSdkId() + " not found in map");
                    }
                }
                Toast.makeText((Context) AdIntegratorManager.activity.get(), "Consent revoked for all ad networks", 0).show();
            }
        });
    }

    public static boolean sdkNeedsInit(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.sdkNeedsInit();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return false;
    }

    public static boolean sdkIsReady(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.sdkIsReady();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return false;
    }

    public static int bannerLoadStateForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.bannerLoadState();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return 0;
    }

    public static int interstitialLoadStateForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.interstitialLoadState();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return 0;
    }

    public static int rewardedVideoLoadStateForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            return adIntegratorInterface.rewardedVideoLoadState();
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
        return 0;
    }

    public static void clearBannerLoadStateErrorsForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            adIntegratorInterface.clearBannerLoadStateErrors();
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void clearInterstitialLoadStateErrorsForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            adIntegratorInterface.clearInterstitialLoadStateErrors();
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    public static void clearRewardedVideoLoadStateErrorsForNetwork(String str) {
        AdIntegratorInterface adIntegratorInterface = integrators.get(str);
        if (adIntegratorInterface != null) {
            adIntegratorInterface.clearRewardedVideoLoadStateErrors();
            return;
        }
        Log.e(TAG, "Ad network " + str + " not found in map");
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void bannerImpression(String str) {
        Log.d(TAG, "Banner impression");
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void interstitialImpression(String str) {
        Log.d(TAG, "Interstitial impression");
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoImpression(String str) {
        Log.d(TAG, "Rewarded video impression");
    }

    public static void onActivityCreated(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityCreated(activity2);
        }
    }

    public static void onActivityStarted(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityStarted(activity2);
        }
    }

    public static void onActivityResumed(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityResumed(activity2);
        }
    }

    public static void onActivityPaused(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityPaused(activity2);
        }
    }

    public static void onActivityStopped(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityStopped(activity2);
        }
    }

    public static void onActivityDestroyed(Activity activity2) {
        Iterator<Map.Entry<String, AdIntegratorInterface>> it = integrators.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onActivityDestroyed(activity2);
        }
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void interstitialClosed(String str) {
        interstitialClosedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoDidReward(String str, boolean z) {
        rewardedVideoDidRewardNative(str, z);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoDidEnd(String str, boolean z) {
        rewardedVideoDidEndNative(str, z);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void bannerLoaded(String str) {
        bannerLoadedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void interstitialLoaded(String str) {
        interstitialLoadedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoLoaded(String str) {
        rewardedVideoLoadedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void bannerFailed(String str) {
        bannerFailedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void interstitialFailed(String str) {
        interstitialFailedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void rewardedVideoFailed(String str) {
        rewardedVideoFailedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void sdkLoaded(String str) {
        sdkLoadedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void networkLoaded(String str) {
        sdkLoadedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void sdkFailed(String str) {
        sdkFailedNative(str);
    }

    @Override // com.buildbox.AdIntegratorManagerInterface
    public void networkFailed(String str) {
        sdkFailedNative(str);
    }

    public static CustomIntegrator getCustomIntegrator() {
        if (!integrators.containsKey("custom")) {
            return null;
        }
        AdIntegratorInterface adIntegratorInterface = integrators.get("custom");
        if (adIntegratorInterface instanceof CustomIntegrator) {
            return (CustomIntegrator) adIntegratorInterface;
        }
        return null;
    }

    private static class GetRemoteAdboxConfigTask extends AsyncTask<String, Integer, String> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onProgressUpdate(Integer... numArr) {
        }

        private GetRemoteAdboxConfigTask() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public String doInBackground(String... strArr) {
            String str = "adbox-vungle";
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((HttpsURLConnection) new URL("https://sdks.api.8cell.com/zones/network_priority.json").openConnection()).getInputStream()));
                str = "";
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    str = str + readLine;
                }
                bufferedReader.close();
            } catch (Exception e) {
                Log.e(AdIntegratorManager.TAG, "unable to fetch remote config");
                e.printStackTrace();
                AdIntegratorManager.remoteConfigResultNative(false, str);
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(final String str) {
            ((Activity) AdIntegratorManager.activity.get()).runOnUiThread(new Runnable() { // from class: com.buildbox.AdIntegratorManager.GetRemoteAdboxConfigTask.1
                @Override // java.lang.Runnable
                public void run() {
                    AdIntegratorManager.remoteConfigResultNative(true, str);
                }
            });
        }
    }
}
