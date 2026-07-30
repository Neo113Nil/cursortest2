package com.moyoung.dafit.module.common.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.ContextCompat;

/* loaded from: classes4.dex */
public class c0 {
    public static final int APP_DETAILS_SETTINGS_REQUEST_CODE = 10;

    private c0() {
    }

    public static boolean checkSelfPermission(Activity activity, String str) {
        return ContextCompat.checkSelfPermission(activity, str) == 0;
    }

    public static void jumpAppDetailsSetting(Activity activity) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, 10);
    }

    public static boolean checkSelfPermission(Activity activity, String[] strArr) {
        for (String str : strArr) {
            if (!checkSelfPermission(activity, str)) {
                return false;
            }
        }
        return true;
    }
}
