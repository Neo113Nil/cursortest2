package com.onevcat.uniwebview;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b2 {
    public final Activity a;
    public final String b;
    public final String c;
    public final c2 d;
    public CustomTabsClient e;
    public CustomTabsSession f;
    public Integer g;
    public boolean h;

    public b2(Activity activity, String name, String url, C0042f messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = url;
        this.d = messageSender;
        C0069o c0069o = C0069o.b;
        c0069o.getClass();
        Intrinsics.checkNotNullParameter(this, "browsing");
        Intrinsics.checkNotNullParameter(name, "name");
        C0060l c0060l = C0060l.b;
        String a = AbstractC0075q.a("Adding safe browsing to manager: ", name, c0060l, "message");
        EnumC0057k enumC0057k = EnumC0057k.DEBUG;
        c0060l.a(enumC0057k, a);
        c0069o.a.put(name, this);
        Intrinsics.checkNotNullParameter(activity, "activity");
        c0060l.getClass();
        Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", "message");
        c0060l.a(enumC0057k, "Checking CustomTabsService resolve info.");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "activity.packageManager.…ervices(serviceIntent, 0)");
        String message = "Resolved information: " + queryIntentServices;
        Intrinsics.checkNotNullParameter(message, "message");
        c0060l.a(enumC0057k, message);
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull((List) queryIntentServices);
        if (resolveInfo == null || CustomTabsClient.bindCustomTabsService(activity, resolveInfo.serviceInfo.packageName, new Z1(this))) {
            return;
        }
        Intrinsics.checkNotNullParameter("Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.", "message");
        c0060l.a(EnumC0057k.CRITICAL, "Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        Integer num = this.g;
        if (num != null) {
            builder.setToolbarColor(num.intValue());
        }
        builder.build().launchUrl(activity, Uri.parse(url));
    }
}
