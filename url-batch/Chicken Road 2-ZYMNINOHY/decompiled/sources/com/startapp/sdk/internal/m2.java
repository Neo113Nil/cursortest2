package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m2 {
    public static boolean a(Context context, String url, boolean z) {
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.addCategory("android.intent.category.BROWSABLE");
        Bundle bundle = new Bundle();
        Object obj = null;
        bundle.putBinder("android.support.customtabs.extra.SESSION", null);
        intent.putExtras(bundle);
        if (z) {
            try {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.APP_BROWSER");
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent2, 0);
                kotlin.jvm.internal.i.d(queryIntentActivities, "queryIntentActivities(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : queryIntentActivities) {
                    ResolveInfo resolveInfo = (ResolveInfo) obj2;
                    if (resolveInfo != null && (activityInfo2 = resolveInfo.activityInfo) != null && activityInfo2.enabled && activityInfo2.exported && activityInfo2.packageName != null) {
                        arrayList.add(obj2);
                    }
                }
                List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
                kotlin.jvm.internal.i.d(queryIntentActivities2, "queryIntentActivities(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : queryIntentActivities2) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null && (activityInfo = resolveInfo2.activityInfo) != null && activityInfo.enabled && activityInfo.exported && activityInfo.packageName != null) {
                        arrayList2.add(obj3);
                    }
                }
                int size = arrayList.size();
                int i4 = 0;
                loop2: while (true) {
                    if (i4 >= size) {
                        break;
                    }
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    ResolveInfo resolveInfo3 = (ResolveInfo) obj4;
                    if (!arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj5 = arrayList2.get(i5);
                            i5++;
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
                d9.a(th);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            d9.a(th2);
            return false;
        }
    }
}
