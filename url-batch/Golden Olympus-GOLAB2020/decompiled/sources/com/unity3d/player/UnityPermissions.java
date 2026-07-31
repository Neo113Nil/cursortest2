package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes2.dex */
public class UnityPermissions {
    private static final String SKIP_DIALOG_METADATA_NAME = "unityplayer.SkipPermissionsDialog";

    private static boolean checkInfoForMetadata(PackageItemInfo packageItemInfo) {
        try {
            return packageItemInfo.metaData.getBoolean(SKIP_DIALOG_METADATA_NAME);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean hasUserAuthorizedPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void requestUserPermissions(Activity activity, String[] strArr, IPermissionRequestCallbacks iPermissionRequestCallbacks) {
        if (activity == 0 || strArr == null || strArr.length == 0) {
            return;
        }
        if (activity instanceof IUnityPermissionRequestSupport) {
            ((IUnityPermissionRequestSupport) activity).requestPermissions(new PermissionRequest(strArr, iPermissionRequestCallbacks));
        } else {
            activity.requestPermissions(strArr, 96489);
        }
    }

    static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean skipPermissionsDialog(Activity activity) {
        try {
            PackageManager packageManager = activity.getPackageManager();
            ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(activity.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (checkInfoForMetadata(activityInfo)) {
                return true;
            }
            return checkInfoForMetadata(applicationInfo);
        } catch (Exception unused) {
            return false;
        }
    }
}
