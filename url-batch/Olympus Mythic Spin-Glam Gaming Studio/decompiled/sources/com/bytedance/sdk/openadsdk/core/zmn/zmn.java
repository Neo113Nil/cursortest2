package com.bytedance.sdk.openadsdk.core.zmn;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.sdk.component.utils.iqz;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class zmn {
    private static Boolean fs;
    private static String zmn;

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, h.u);
        p0.launchUrl(p1, p2);
    }

    public static String zmn(Context context) {
        String str = zmn;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                zmn = null;
            } else if (!TextUtils.isEmpty(str2) && !zmn(context, intent) && arrayList.contains(str2)) {
                zmn = str2;
            } else {
                zmn = (String) arrayList.get(0);
            }
        } catch (Throwable th) {
            iqz.zn("CustomTabsHelper", th.getMessage());
        }
        return zmn;
    }

    private static boolean zmn(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int zmn() {
        Boolean bool = fs;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static int fs(Context context) {
        return !TextUtils.isEmpty(zmn(context)) ? 1 : 0;
    }

    public static void zmn(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.intent.setPackage(str);
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntent, context, uri);
    }
}
