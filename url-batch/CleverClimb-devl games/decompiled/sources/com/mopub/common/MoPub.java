package com.mopub.common;

import android.app.Activity;
import android.content.Context;
import com.mopub.common.ExternalViewabilitySessionManager;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.PersonalInfoManager;
import com.mopub.common.util.ManifestUtils;
import com.mopub.common.util.Reflection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class MoPub {
    private static final int DEFAULT_LOCATION_PRECISION = 6;
    private static final String MOPUB_REWARDED_VIDEOS = "com.mopub.mobileads.MoPubRewardedVideos";
    private static final String MOPUB_REWARDED_VIDEO_MANAGER = "com.mopub.mobileads.MoPubRewardedVideoManager";
    public static final String SDK_VERSION = "5.0.0";
    private static AdvancedBiddingTokens sAdvancedBiddingTokens;
    private static PersonalInfoManager sPersonalInfoManager;
    private static Method sUpdateActivityMethod;
    private static volatile LocationAwareness sLocationAwareness = LocationAwareness.NORMAL;
    private static volatile int sLocationPrecision = 6;
    private static final long DEFAULT_LOCATION_REFRESH_TIME_MILLIS = 60000;
    private static volatile long sMinimumLocationRefreshTimeMillis = DEFAULT_LOCATION_REFRESH_TIME_MILLIS;
    private static volatile BrowserAgent sBrowserAgent = BrowserAgent.IN_APP;
    private static volatile boolean sIsBrowserAgentOverriddenByClient = false;
    private static boolean sSearchedForUpdateActivityMethod = false;
    private static boolean sAdvancedBiddingEnabled = true;
    private static boolean sSdkInitialized = false;

    public enum LocationAwareness {
        NORMAL,
        TRUNCATED,
        DISABLED
    }

    public enum BrowserAgent {
        IN_APP,
        NATIVE;

        public static BrowserAgent fromHeader(Integer num) {
            if (num == null) {
                return IN_APP;
            }
            return num.intValue() == 1 ? NATIVE : IN_APP;
        }
    }

    public static LocationAwareness getLocationAwareness() {
        Preconditions.checkNotNull(sLocationAwareness);
        return sLocationAwareness;
    }

    public static void setLocationAwareness(LocationAwareness locationAwareness) {
        Preconditions.checkNotNull(locationAwareness);
        sLocationAwareness = locationAwareness;
    }

    public static int getLocationPrecision() {
        return sLocationPrecision;
    }

    public static void setLocationPrecision(int i) {
        sLocationPrecision = Math.min(Math.max(0, i), 6);
    }

    public static void setMinimumLocationRefreshTimeMillis(long j) {
        sMinimumLocationRefreshTimeMillis = j;
    }

    public static long getMinimumLocationRefreshTimeMillis() {
        return sMinimumLocationRefreshTimeMillis;
    }

    public static void setBrowserAgent(BrowserAgent browserAgent) {
        Preconditions.checkNotNull(browserAgent);
        sBrowserAgent = browserAgent;
        sIsBrowserAgentOverriddenByClient = true;
    }

    public static void setBrowserAgentFromAdServer(BrowserAgent browserAgent) {
        Preconditions.checkNotNull(browserAgent);
        if (sIsBrowserAgentOverriddenByClient) {
            MoPubLog.w("Browser agent already overridden by client with value " + sBrowserAgent);
            return;
        }
        sBrowserAgent = browserAgent;
    }

    public static BrowserAgent getBrowserAgent() {
        Preconditions.checkNotNull(sBrowserAgent);
        return sBrowserAgent;
    }

    public static void setAdvancedBiddingEnabled(boolean z) {
        sAdvancedBiddingEnabled = z;
    }

    public static boolean isAdvancedBiddingEnabled() {
        return sAdvancedBiddingEnabled;
    }

    public static void initializeSdk(Context context, SdkConfiguration sdkConfiguration, SdkInitializationListener sdkInitializationListener) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(sdkConfiguration);
        MoPubLog.d("Initializing MoPub");
        if ((context instanceof Activity) && Reflection.classFound(MOPUB_REWARDED_VIDEO_MANAGER)) {
            initializeRewardedVideo((Activity) context, sdkConfiguration);
        }
        if (sSdkInitialized) {
            MoPubLog.d("MoPub SDK is already initialized");
            return;
        }
        sSdkInitialized = true;
        CompositeSdkInitializationListener compositeSdkInitializationListener = sdkInitializationListener == null ? null : new CompositeSdkInitializationListener(sdkInitializationListener, 2);
        sPersonalInfoManager = new PersonalInfoManager(context, sdkConfiguration.getAdUnitId(), compositeSdkInitializationListener);
        ClientMetadata.getInstance(context);
        sAdvancedBiddingTokens = new AdvancedBiddingTokens(compositeSdkInitializationListener);
        sAdvancedBiddingTokens.addAdvancedBidders(sdkConfiguration.getAdvancedBidders());
        ManifestUtils.checkSdkActivitiesDeclared(context);
    }

    public static boolean isSdkInitialized() {
        return sSdkInitialized;
    }

    public static boolean canCollectPersonalInformation() {
        return sPersonalInfoManager != null && sPersonalInfoManager.canCollectPersonalInformation();
    }

    static String getAdvancedBiddingTokensJson(Context context) {
        Preconditions.checkNotNull(context);
        if (!isAdvancedBiddingEnabled() || sAdvancedBiddingTokens == null) {
            return null;
        }
        return sAdvancedBiddingTokens.getTokensAsJsonString(context);
    }

    public static PersonalInfoManager getPersonalInformationManager() {
        return sPersonalInfoManager;
    }

    @VisibleForTesting
    static boolean isBrowserAgentOverriddenByClient() {
        return sIsBrowserAgentOverriddenByClient;
    }

    @VisibleForTesting
    @Deprecated
    public static void resetBrowserAgent() {
        sBrowserAgent = BrowserAgent.IN_APP;
        sIsBrowserAgentOverriddenByClient = false;
    }

    public static void onCreate(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onCreate(activity);
        updateActivity(activity);
    }

    public static void onStart(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onStart(activity);
        updateActivity(activity);
    }

    public static void onPause(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onPause(activity);
    }

    public static void onResume(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onResume(activity);
        updateActivity(activity);
    }

    public static void onRestart(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onRestart(activity);
        updateActivity(activity);
    }

    public static void onStop(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onStop(activity);
    }

    public static void onDestroy(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onDestroy(activity);
    }

    public static void onBackPressed(Activity activity) {
        MoPubLifecycleManager.getInstance(activity).onBackPressed(activity);
    }

    public static void disableViewability(ExternalViewabilitySessionManager.ViewabilityVendor viewabilityVendor) {
        Preconditions.checkNotNull(viewabilityVendor);
        viewabilityVendor.disable();
    }

    private static void initializeRewardedVideo(Activity activity, SdkConfiguration sdkConfiguration) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(sdkConfiguration);
        try {
            new Reflection.MethodBuilder(null, "initializeRewardedVideo").setStatic(Class.forName(MOPUB_REWARDED_VIDEOS)).setAccessible().addParam((Class<Class>) Activity.class, (Class) activity).addParam((Class<Class>) SdkConfiguration.class, (Class) sdkConfiguration).execute();
        } catch (ClassNotFoundException unused) {
            MoPubLog.w("initializeRewardedVideo was called without the rewarded video module");
        } catch (NoSuchMethodException unused2) {
            MoPubLog.w("initializeRewardedVideo was called without the rewarded video module");
        } catch (Exception e) {
            MoPubLog.e("Error while initializing rewarded video", e);
        }
    }

    @VisibleForTesting
    static void updateActivity(Activity activity) {
        if (!sSearchedForUpdateActivityMethod) {
            sSearchedForUpdateActivityMethod = true;
            try {
                sUpdateActivityMethod = Reflection.getDeclaredMethodWithTraversal(Class.forName(MOPUB_REWARDED_VIDEO_MANAGER), "updateActivity", Activity.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        }
        if (sUpdateActivityMethod != null) {
            try {
                sUpdateActivityMethod.invoke(null, activity);
            } catch (IllegalAccessException e) {
                MoPubLog.e("Error while attempting to access the update activity method - this should not have happened", e);
            } catch (InvocationTargetException e2) {
                MoPubLog.e("Error while attempting to access the update activity method - this should not have happened", e2);
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    static void clearAdvancedBidders() {
        sAdvancedBiddingTokens = null;
        sPersonalInfoManager = null;
        sSdkInitialized = false;
        sPersonalInfoManager = null;
    }

    @VisibleForTesting
    @Deprecated
    static void setPersonalInfoManager(PersonalInfoManager personalInfoManager) {
        sPersonalInfoManager = personalInfoManager;
    }
}
