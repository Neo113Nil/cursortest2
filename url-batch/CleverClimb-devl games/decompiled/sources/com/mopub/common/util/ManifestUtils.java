package com.mopub.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.privacy.ConsentDialogActivity;
import com.mopub.mobileads.MraidVideoPlayerActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ManifestUtils {
    private static final String CONSENT_ACTIVITY = "com.mopub.common.privacy.ConsentDialogActivity";
    private static final String MOPUB_ACTIVITY = "com.mopub.mobileads.MoPubActivity";
    private static final String MRAID_ACTIVITY = "com.mopub.mobileads.MraidActivity";
    private static final List<Class<? extends Activity>> REQUIRED_NATIVE_SDK_ACTIVITIES;
    private static final List<Class<? extends Activity>> REQUIRED_SDK_ACTIVITIES;
    private static final String REWARDED_MRAID_ACTIVITY = "com.mopub.mobileads.RewardedMraidActivity";
    private static FlagCheckUtil sFlagCheckUtil = new FlagCheckUtil();
    private static final List<Class<? extends Activity>> REQUIRED_WEB_VIEW_SDK_ACTIVITIES = new ArrayList(4);

    private ManifestUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        try {
            Class<?> cls = Class.forName(MOPUB_ACTIVITY);
            Class<?> cls2 = Class.forName(MRAID_ACTIVITY);
            Class<?> cls3 = Class.forName(REWARDED_MRAID_ACTIVITY);
            REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(cls);
            REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(cls2);
            REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(cls3);
        } catch (ClassNotFoundException unused) {
            MoPubLog.i("ManifestUtils running without interstitial module");
        }
        REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(MraidVideoPlayerActivity.class);
        REQUIRED_WEB_VIEW_SDK_ACTIVITIES.add(MoPubBrowser.class);
        REQUIRED_NATIVE_SDK_ACTIVITIES = new ArrayList(1);
        REQUIRED_NATIVE_SDK_ACTIVITIES.add(MoPubBrowser.class);
        REQUIRED_SDK_ACTIVITIES = new ArrayList(1);
        REQUIRED_SDK_ACTIVITIES.add(ConsentDialogActivity.class);
    }

    public static void checkSdkActivitiesDeclared(Context context) {
        if (Preconditions.NoThrow.checkNotNull(context, "context is not allowed to be null")) {
            displayWarningForMissingActivities(context, REQUIRED_SDK_ACTIVITIES);
            displayWarningForMisconfiguredActivities(context, REQUIRED_SDK_ACTIVITIES);
        }
    }

    public static void checkWebViewActivitiesDeclared(Context context) {
        if (Preconditions.NoThrow.checkNotNull(context, "context is not allowed to be null")) {
            displayWarningForMissingActivities(context, REQUIRED_WEB_VIEW_SDK_ACTIVITIES);
            displayWarningForMisconfiguredActivities(context, REQUIRED_WEB_VIEW_SDK_ACTIVITIES);
        }
    }

    public static void checkNativeActivitiesDeclared(Context context) {
        if (Preconditions.NoThrow.checkNotNull(context, "context is not allowed to be null")) {
            displayWarningForMissingActivities(context, REQUIRED_NATIVE_SDK_ACTIVITIES);
            displayWarningForMisconfiguredActivities(context, REQUIRED_NATIVE_SDK_ACTIVITIES);
        }
    }

    @VisibleForTesting
    static void displayWarningForMissingActivities(Context context, List<Class<? extends Activity>> list) {
        List<Class<? extends Activity>> filterDeclaredActivities = filterDeclaredActivities(context, list, false);
        if (filterDeclaredActivities.isEmpty()) {
            return;
        }
        logWarningToast(context);
        logMissingActivities(filterDeclaredActivities);
    }

    @VisibleForTesting
    static void displayWarningForMisconfiguredActivities(Context context, List<Class<? extends Activity>> list) {
        List<Class<? extends Activity>> misconfiguredActivities = getMisconfiguredActivities(context, filterDeclaredActivities(context, list, true));
        if (misconfiguredActivities.isEmpty()) {
            return;
        }
        logWarningToast(context);
        logMisconfiguredActivities(context, misconfiguredActivities);
    }

    public static boolean isDebuggable(Context context) {
        return Utils.bitMaskContainsFlag(context.getApplicationInfo().flags, 2);
    }

    private static List<Class<? extends Activity>> filterDeclaredActivities(Context context, List<Class<? extends Activity>> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Class<? extends Activity> cls : list) {
            if (Intents.deviceCanHandleIntent(context, new Intent(context, cls)) == z) {
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    @TargetApi(13)
    private static List<Class<? extends Activity>> getMisconfiguredActivities(Context context, List<Class<? extends Activity>> list) {
        ArrayList arrayList = new ArrayList();
        for (Class<? extends Activity> cls : list) {
            try {
                ActivityConfigChanges activityConfigChanges = getActivityConfigChanges(context, cls);
                if (!activityConfigChanges.hasKeyboardHidden || !activityConfigChanges.hasOrientation || !activityConfigChanges.hasScreenSize) {
                    arrayList.add(cls);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList;
    }

    private static void logMissingActivities(List<Class<? extends Activity>> list) {
        StringBuilder sb = new StringBuilder("AndroidManifest permissions for the following required MoPub activities are missing:\n");
        for (Class<? extends Activity> cls : list) {
            sb.append("\n\t");
            sb.append(cls.getName());
        }
        sb.append("\n\nPlease update your manifest to include them.");
        MoPubLog.w(sb.toString());
    }

    private static void logMisconfiguredActivities(Context context, List<Class<? extends Activity>> list) {
        StringBuilder sb = new StringBuilder("In AndroidManifest, the android:configChanges param is missing values for the following MoPub activities:\n");
        for (Class<? extends Activity> cls : list) {
            try {
                ActivityConfigChanges activityConfigChanges = getActivityConfigChanges(context, cls);
                if (!activityConfigChanges.hasKeyboardHidden) {
                    sb.append("\n\tThe android:configChanges param for activity " + cls.getName() + " must include keyboardHidden.");
                }
                if (!activityConfigChanges.hasOrientation) {
                    sb.append("\n\tThe android:configChanges param for activity " + cls.getName() + " must include orientation.");
                }
                if (!activityConfigChanges.hasScreenSize) {
                    sb.append("\n\tThe android:configChanges param for activity " + cls.getName() + " must include screenSize.");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        sb.append("\n\nPlease update your manifest to include them.");
        MoPubLog.w(sb.toString());
    }

    private static ActivityConfigChanges getActivityConfigChanges(Context context, Class<? extends Activity> cls) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(context, cls.getName()), 0);
        ActivityConfigChanges activityConfigChanges = new ActivityConfigChanges();
        activityConfigChanges.hasKeyboardHidden = sFlagCheckUtil.hasFlag(cls, activityInfo.configChanges, 32);
        activityConfigChanges.hasOrientation = sFlagCheckUtil.hasFlag(cls, activityInfo.configChanges, 128);
        activityConfigChanges.hasScreenSize = true;
        activityConfigChanges.hasScreenSize = sFlagCheckUtil.hasFlag(cls, activityInfo.configChanges, 1024);
        return activityConfigChanges;
    }

    private static void logWarningToast(Context context) {
        if (isDebuggable(context)) {
            Toast makeText = Toast.makeText(context, "ERROR: YOUR MOPUB INTEGRATION IS INCOMPLETE.\nCheck logcat and update your AndroidManifest.xml with the correct activities and configuration.", 1);
            makeText.setGravity(7, 0, 0);
            makeText.show();
        }
    }

    private static class ActivityConfigChanges {
        public boolean hasKeyboardHidden;
        public boolean hasOrientation;
        public boolean hasScreenSize;

        private ActivityConfigChanges() {
        }
    }

    @VisibleForTesting
    @Deprecated
    static List<Class<? extends Activity>> getRequiredWebViewSdkActivities() {
        return REQUIRED_WEB_VIEW_SDK_ACTIVITIES;
    }

    @VisibleForTesting
    @Deprecated
    static List<Class<? extends Activity>> getRequiredNativeSdkActivities() {
        return REQUIRED_NATIVE_SDK_ACTIVITIES;
    }

    @VisibleForTesting
    @Deprecated
    static void setFlagCheckUtil(FlagCheckUtil flagCheckUtil) {
        sFlagCheckUtil = flagCheckUtil;
    }

    static class FlagCheckUtil {
        FlagCheckUtil() {
        }

        public boolean hasFlag(Class cls, int i, int i2) {
            return Utils.bitMaskContainsFlag(i, i2);
        }
    }
}
