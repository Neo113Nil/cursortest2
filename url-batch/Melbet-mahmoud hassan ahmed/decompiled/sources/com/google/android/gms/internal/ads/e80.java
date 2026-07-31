package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e80 {
    public static final Intent a(Uri uri, Context context, gb gbVar, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent b(Intent intent, ResolveInfo resolveInfo, Context context, gb gbVar, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static final ResolveInfo c(Intent intent, Context context, gb gbVar, View view) {
        return d(intent, new ArrayList(), context, gbVar, view);
    }

    public static final ResolveInfo d(Intent intent, ArrayList<ResolveInfo> arrayList, Context context, gb gbVar, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            y2.t.p().s(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= queryIntentActivities.size()) {
                    break;
                }
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i7).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                }
                i7++;
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}
