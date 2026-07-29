package com.mopub.mobileads;

import android.app.Activity;
import android.text.TextUtils;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPubReward;
import com.mopub.common.Preconditions;
import com.mopub.common.SdkConfiguration;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.ReflectionTarget;
import com.mopub.mobileads.MoPubRewardedVideoManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class MoPubRewardedVideos {
    @ReflectionTarget
    private static void initializeRewardedVideo(Activity activity, MediationSettings... mediationSettingsArr) {
        Preconditions.checkNotNull(activity);
        MoPubRewardedVideoManager.init(activity, mediationSettingsArr);
    }

    @ReflectionTarget
    private static void initializeRewardedVideo(Activity activity, List<Class<? extends CustomEventRewardedVideo>> list, MediationSettings... mediationSettingsArr) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(list);
        MoPubRewardedVideoManager.init(activity, mediationSettingsArr);
        MoPubRewardedVideoManager.initNetworks(activity, list);
    }

    @ReflectionTarget
    private static void initializeRewardedVideo(Activity activity, SdkConfiguration sdkConfiguration) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(sdkConfiguration);
        List<String> networksToInit = sdkConfiguration.getNetworksToInit();
        ArrayList arrayList = new ArrayList();
        if (networksToInit != null) {
            for (String str : networksToInit) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        arrayList.add(Class.forName(str).asSubclass(CustomEventRewardedVideo.class));
                    } catch (ClassCastException unused) {
                        MoPubLog.w("Unable to cast " + str + " to Class<? extends CustomEventRewardedVideo>.");
                    } catch (ClassNotFoundException unused2) {
                        MoPubLog.w("Ignoring unknown class name " + str);
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            initializeRewardedVideo(activity, arrayList, sdkConfiguration.getMediationSettings());
        } else {
            initializeRewardedVideo(activity, sdkConfiguration.getMediationSettings());
        }
    }

    @ReflectionTarget
    public static void setRewardedVideoListener(MoPubRewardedVideoListener moPubRewardedVideoListener) {
        MoPubRewardedVideoManager.setVideoListener(moPubRewardedVideoListener);
    }

    @ReflectionTarget
    public static void loadRewardedVideo(String str, MediationSettings... mediationSettingsArr) {
        Preconditions.checkNotNull(str);
        MoPubRewardedVideoManager.loadVideo(str, null, mediationSettingsArr);
    }

    @ReflectionTarget
    public static void loadRewardedVideo(String str, MoPubRewardedVideoManager.RequestParameters requestParameters, MediationSettings... mediationSettingsArr) {
        Preconditions.checkNotNull(str);
        MoPubRewardedVideoManager.loadVideo(str, requestParameters, mediationSettingsArr);
    }

    @ReflectionTarget
    public static boolean hasRewardedVideo(String str) {
        Preconditions.checkNotNull(str);
        return MoPubRewardedVideoManager.hasVideo(str);
    }

    @ReflectionTarget
    public static void showRewardedVideo(String str) {
        Preconditions.checkNotNull(str);
        MoPubRewardedVideoManager.showVideo(str);
    }

    @ReflectionTarget
    public static void showRewardedVideo(String str, String str2) {
        Preconditions.checkNotNull(str);
        MoPubRewardedVideoManager.showVideo(str, str2);
    }

    @ReflectionTarget
    public static Set<MoPubReward> getAvailableRewards(String str) {
        Preconditions.checkNotNull(str);
        return MoPubRewardedVideoManager.getAvailableRewards(str);
    }

    @ReflectionTarget
    public static void selectReward(String str, MoPubReward moPubReward) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(moPubReward);
        MoPubRewardedVideoManager.selectReward(str, moPubReward);
    }
}
