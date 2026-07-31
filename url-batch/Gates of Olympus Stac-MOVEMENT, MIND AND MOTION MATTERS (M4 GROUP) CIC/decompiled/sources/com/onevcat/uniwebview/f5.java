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

/* loaded from: classes.dex */
public final class f5 {
    public final Activity a;
    public final String b;
    public final String c;
    public final g5 d;
    public CustomTabsClient e;
    public CustomTabsSession f;
    public Integer g;
    public boolean h;

    public f5(Activity activity, String name, String url, h messageSender) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(messageSender, "messageSender");
        this.a = activity;
        this.b = name;
        this.c = url;
        this.d = messageSender;
        t tVar = t.b;
        s.a().a(this, name);
        a();
    }

    public final void a() {
        Activity activity = this.a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        o oVar = o.b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Checking CustomTabsService resolve info.", "message");
        n nVar = n.DEBUG;
        oVar.a(nVar, "Checking CustomTabsService resolve info.");
        List<ResolveInfo> queryIntentServices = activity.getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "activity.packageManager.…ervices(serviceIntent, 0)");
        String message = "Resolved information: " + queryIntentServices;
        Intrinsics.checkNotNullParameter(message, "message");
        oVar.a(nVar, message);
        ResolveInfo resolveInfo = (ResolveInfo) CollectionsKt.firstOrNull((List) queryIntentServices);
        if (resolveInfo == null || CustomTabsClient.bindCustomTabsService(this.a, resolveInfo.serviceInfo.packageName, new d5(this))) {
            return;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter("Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.", "message");
        oVar.a(n.CRITICAL, "Custom Tabs didn't bind to a tab service. Something goes wrong. Trying to show the browser without a session.");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        Integer num = this.g;
        if (num != null) {
            builder.setToolbarColor(num.intValue());
        }
        builder.build().launchUrl(this.a, Uri.parse(this.c));
    }
}
