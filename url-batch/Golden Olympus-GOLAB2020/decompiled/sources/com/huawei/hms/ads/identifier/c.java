package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.huawei.hms.common.PackageConstants;

/* loaded from: classes.dex */
public abstract class c {
    public static String a(Context context) {
        return b(context, "com.huawei.hwid") ? "com.huawei.hwid" : b(context, PackageConstants.SERVICES_PACKAGE_ALL_SCENE) ? PackageConstants.SERVICES_PACKAGE_ALL_SCENE : b(context, "com.huawei.hwid.tv") ? "com.huawei.hwid.tv" : "com.huawei.hwid";
    }

    public static boolean b(Context context, String str) {
        return c(context, str) != null;
    }

    public static PackageInfo c(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    return packageManager.getPackageInfo(str, UserVerificationMethods.USER_VERIFY_PATTERN);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                str2 = "getPackageInfo NameNotFoundException";
                Log.w("ApkUtil", str2);
                return null;
            } catch (Exception unused2) {
                str2 = "getPackageInfo Exception";
                Log.w("ApkUtil", str2);
                return null;
            }
        }
        return null;
    }
}
