package com.huawei.hms.framework.common.check;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;

/* loaded from: classes.dex */
public class ProviderCheckUtil {
    private static boolean a(PackageManager packageManager, String str) {
        if (packageManager.checkSignatures("com.huawei.hwid", str) == 0) {
            Logger.v("ProviderCheckUtil", "Valid Provider");
            return true;
        }
        if (packageManager.checkSignatures("com.huawei.hwid.tv", str) != 0) {
            return false;
        }
        Logger.v("ProviderCheckUtil", "Valid Provider in tv");
        return true;
    }

    public static boolean isValid(Uri uri) {
        ApplicationInfo applicationInfo;
        if (uri == null) {
            return false;
        }
        PackageManager packageManager = ContextHolder.getAppContext().getPackageManager();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(uri.getAuthority(), 0);
        if (resolveContentProvider == null || (applicationInfo = resolveContentProvider.applicationInfo) == null) {
            Logger.w("ProviderCheckUtil", "Invalid param");
            return false;
        }
        String str = applicationInfo.packageName;
        Logger.v("ProviderCheckUtil", "Target provider service's package name is : " + str);
        if (str != null) {
            return a(packageManager, str);
        }
        Logger.w("ProviderCheckUtil", "Invalid packageName");
        return false;
    }
}
