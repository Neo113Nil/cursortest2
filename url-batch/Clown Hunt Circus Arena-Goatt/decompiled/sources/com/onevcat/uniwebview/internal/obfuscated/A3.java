package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.browser.customtabs.CustomTabsService;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class A3 {
    public static ResolveInfo a(Activity activity) {
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        ResolveInfo resolveInfo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        y3 queryServices = new y3(activity);
        z3 resolveDefaultBrowser = new z3(activity);
        List userPreferredPackages = CollectionsKt.toList(B3.E);
        List<String> chromiumBasedPackages = B3.D;
        Intrinsics.checkNotNullParameter(queryServices, "queryServices");
        Intrinsics.checkNotNullParameter(resolveDefaultBrowser, "resolveDefaultBrowser");
        Intrinsics.checkNotNullParameter(userPreferredPackages, "userPreferredPackages");
        Intrinsics.checkNotNullParameter(chromiumBasedPackages, "chromiumBasedPackages");
        B b = B.b;
        b.getClass();
        Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", "message");
        A a = A.DEBUG;
        b.a(a, "Checking CustomTabsService resolve info.");
        List list = (List) queryServices.invoke(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION));
        String message = "Resolved information: " + list;
        Intrinsics.checkNotNullParameter(message, "message");
        b.a(a, message);
        Iterator it = userPreferredPackages.iterator();
        do {
            Object obj4 = null;
            if (!it.hasNext()) {
                String str2 = (String) resolveDefaultBrowser.invoke();
                if (str2 != null && chromiumBasedPackages.contains(str2)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        if (Intrinsics.areEqual(((ResolveInfo) obj3).serviceInfo.packageName, str2)) {
                            break;
                        }
                    }
                    ResolveInfo resolveInfo2 = (ResolveInfo) obj3;
                    if (resolveInfo2 != null) {
                        B b2 = B.b;
                        String message2 = "Using default Chromium-based browser: ".concat(str2);
                        b2.getClass();
                        Intrinsics.checkNotNullParameter(message2, "message");
                        b2.a(A.DEBUG, message2);
                        return resolveInfo2;
                    }
                }
                if (str2 != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it3.next();
                        if (Intrinsics.areEqual(((ResolveInfo) obj2).serviceInfo.packageName, str2)) {
                            break;
                        }
                    }
                    ResolveInfo resolveInfo3 = (ResolveInfo) obj2;
                    if (resolveInfo3 != null) {
                        B b3 = B.b;
                        String message3 = "Using default browser: ".concat(str2);
                        b3.getClass();
                        Intrinsics.checkNotNullParameter(message3, "message");
                        b3.a(A.DEBUG, message3);
                        return resolveInfo3;
                    }
                }
                if (userPreferredPackages.isEmpty()) {
                    for (String str3 : chromiumBasedPackages) {
                        Iterator it4 = list.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it4.next();
                            if (Intrinsics.areEqual(((ResolveInfo) obj).serviceInfo.packageName, str3)) {
                                break;
                            }
                        }
                        ResolveInfo resolveInfo4 = (ResolveInfo) obj;
                        if (resolveInfo4 != null) {
                            B b4 = B.b;
                            b4.a(A.DEBUG, AbstractC0045e.a("Using fallback Chromium browser: ", str3, b4, "message"));
                            return resolveInfo4;
                        }
                    }
                }
                ResolveInfo resolveInfo5 = (ResolveInfo) CollectionsKt.firstOrNull(list);
                if (resolveInfo5 != null) {
                    B b5 = B.b;
                    String message4 = "Using fallback browser: " + resolveInfo5.serviceInfo.packageName;
                    b5.getClass();
                    Intrinsics.checkNotNullParameter(message4, "message");
                    b5.a(A.DEBUG, message4);
                }
                return resolveInfo5;
            }
            str = (String) it.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                }
                Object next = it5.next();
                if (Intrinsics.areEqual(((ResolveInfo) next).serviceInfo.packageName, str)) {
                    obj4 = next;
                    break;
                }
            }
            resolveInfo = (ResolveInfo) obj4;
        } while (resolveInfo == null);
        B b6 = B.b;
        b6.a(A.DEBUG, AbstractC0045e.a("Using preferred browser: ", str, b6, "message"));
        return resolveInfo;
    }
}
