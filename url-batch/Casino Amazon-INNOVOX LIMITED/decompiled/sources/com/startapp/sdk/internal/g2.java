package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g2 {
    public static boolean a(Context context, String str, boolean z) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        context.getClass();
        str.getClass();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        Bundle bundle = new Bundle();
        Object obj = null;
        bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
        intent.putExtras(bundle);
        if (z) {
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.APP_BROWSER");
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                queryIntentActivities.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : queryIntentActivities) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj2;
                    if (resolveInfo != null && (activityInfo2 = resolveInfo.activityInfo) != null && activityInfo2.enabled && activityInfo2.exported && activityInfo2.packageName != null) {
                        arrayList.add(obj2);
                    }
                }
                List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
                queryIntentActivities2.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : queryIntentActivities2) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null && (activityInfo = resolveInfo2.activityInfo) != null && activityInfo.enabled && activityInfo.exported && activityInfo.packageName != null) {
                        arrayList2.add(obj3);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                loop2: while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj4 = arrayList.get(i);
                    i++;
                    ResolveInfo resolveInfo3 = (ResolveInfo) obj4;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj5 = arrayList2.get(i2);
                            i2++;
                            if (resolveInfo3.activityInfo.packageName.equals(((ResolveInfo) obj5).activityInfo.packageName)) {
                                obj = obj4;
                                break loop2;
                            }
                        }
                    }
                }
                ResolveInfo resolveInfo4 = (ResolveInfo) obj;
                if (resolveInfo4 != null) {
                    intent.setPackage(resolveInfo4.activityInfo.packageName);
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            n8.a(th2);
            return false;
        }
    }
}
