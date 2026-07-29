package com.mopub.mobileads;

import android.app.Activity;
import android.text.TextUtils;
import com.mopub.common.MoPub;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.ConsentStatus;
import com.mopub.common.privacy.PersonalInfoManager;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.mediation.IUnityAdsExtendedListener;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class UnityRouter {
    private static final String GAME_ID_KEY = "gameId";
    private static final String PLACEMENT_ID_KEY = "placementId";
    private static final String ZONE_ID_KEY = "zoneId";
    private static String sCurrentPlacementId;
    private static final UnityAdsListener sUnityAdsListener = new UnityAdsListener();
    private static Map<String, IUnityAdsExtendedListener> mUnityAdsListeners = new HashMap();

    static boolean initUnityAds(Map<String, String> map, Activity activity) {
        ConsentStatus personalInfoConsentStatus;
        PersonalInfoManager personalInformationManager = MoPub.getPersonalInformationManager();
        if (personalInformationManager != null && ((personalInfoConsentStatus = personalInformationManager.getPersonalInfoConsentStatus()) == ConsentStatus.EXPLICIT_YES || personalInfoConsentStatus == ConsentStatus.EXPLICIT_NO)) {
            MetaData metaData = new MetaData(activity.getApplicationContext());
            if (personalInfoConsentStatus == ConsentStatus.EXPLICIT_YES) {
                metaData.set("gdpr.consent", true);
            } else {
                metaData.set("gdpr.consent", false);
            }
            metaData.commit();
        }
        String str = map.get(GAME_ID_KEY);
        if (str == null || str.isEmpty()) {
            MoPubLog.e("gameId is missing or entered incorrectly in the MoPub UI");
            return false;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(activity);
        mediationMetaData.setName("MoPub");
        mediationMetaData.setVersion("5.0.0");
        mediationMetaData.commit();
        UnityAds.initialize(activity, str, sUnityAdsListener);
        return true;
    }

    static String placementIdForServerExtras(Map<String, String> map, String str) {
        String str2;
        if (map.containsKey("placementId")) {
            str2 = map.get("placementId");
        } else {
            str2 = map.containsKey(ZONE_ID_KEY) ? map.get(ZONE_ID_KEY) : null;
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    static void showAd(Activity activity, String str) {
        sCurrentPlacementId = str;
        UnityAds.show(activity, str);
    }

    static void addListener(String str, IUnityAdsExtendedListener iUnityAdsExtendedListener) {
        mUnityAdsListeners.put(str, iUnityAdsExtendedListener);
    }

    static void removeListener(String str) {
        mUnityAdsListeners.remove(str);
    }

    private static class UnityAdsListener implements IUnityAdsExtendedListener {
        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsPlacementStateChanged(String str, UnityAds.PlacementState placementState, UnityAds.PlacementState placementState2) {
        }

        private UnityAdsListener() {
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsReady(String str) {
            IUnityAdsExtendedListener iUnityAdsExtendedListener = (IUnityAdsExtendedListener) UnityRouter.mUnityAdsListeners.get(str);
            if (iUnityAdsExtendedListener != null) {
                iUnityAdsExtendedListener.onUnityAdsReady(str);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsStart(String str) {
            IUnityAdsExtendedListener iUnityAdsExtendedListener = (IUnityAdsExtendedListener) UnityRouter.mUnityAdsListeners.get(str);
            if (iUnityAdsExtendedListener != null) {
                iUnityAdsExtendedListener.onUnityAdsStart(str);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsFinish(String str, UnityAds.FinishState finishState) {
            IUnityAdsExtendedListener iUnityAdsExtendedListener = (IUnityAdsExtendedListener) UnityRouter.mUnityAdsListeners.get(str);
            if (iUnityAdsExtendedListener != null) {
                iUnityAdsExtendedListener.onUnityAdsFinish(str, finishState);
            }
        }

        @Override // com.unity3d.ads.mediation.IUnityAdsExtendedListener
        public void onUnityAdsClick(String str) {
            IUnityAdsExtendedListener iUnityAdsExtendedListener = (IUnityAdsExtendedListener) UnityRouter.mUnityAdsListeners.get(str);
            if (iUnityAdsExtendedListener != null) {
                iUnityAdsExtendedListener.onUnityAdsClick(str);
            }
        }

        @Override // com.unity3d.ads.IUnityAdsListener
        public void onUnityAdsError(UnityAds.UnityAdsError unityAdsError, String str) {
            IUnityAdsExtendedListener iUnityAdsExtendedListener = (IUnityAdsExtendedListener) UnityRouter.mUnityAdsListeners.get(UnityRouter.sCurrentPlacementId);
            if (iUnityAdsExtendedListener != null) {
                iUnityAdsExtendedListener.onUnityAdsError(unityAdsError, str);
            }
        }
    }

    static final class UnityAdsUtils {
        UnityAdsUtils() {
        }

        static MoPubErrorCode getMoPubErrorCode(UnityAds.UnityAdsError unityAdsError) {
            switch (unityAdsError) {
                case VIDEO_PLAYER_ERROR:
                    return MoPubErrorCode.VIDEO_PLAYBACK_ERROR;
                case INVALID_ARGUMENT:
                    return MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR;
                case INTERNAL_ERROR:
                    return MoPubErrorCode.NETWORK_INVALID_STATE;
                default:
                    return MoPubErrorCode.NETWORK_NO_FILL;
            }
        }
    }

    static class UnityAdsException extends RuntimeException {
        private final UnityAds.UnityAdsError errorCode;

        public UnityAdsException(UnityAds.UnityAdsError unityAdsError, String str, Object... objArr) {
            this(unityAdsError, String.format(str, objArr));
        }

        public UnityAdsException(UnityAds.UnityAdsError unityAdsError, String str) {
            super(str);
            this.errorCode = unityAdsError;
        }

        public UnityAds.UnityAdsError getErrorCode() {
            return this.errorCode;
        }
    }
}
