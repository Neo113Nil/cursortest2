package s5;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21645a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f21646b;

    enum a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    b(Context context, Activity activity) {
        this.f21645a = context;
        this.f21646b = activity;
    }

    boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f21645a.getPackageManager());
        if (resolveActivity == null) {
            Log.i("UrlLauncher", "component name for " + str + " is null");
            return false;
        }
        Log.i("UrlLauncher", "component name for " + str + " is " + resolveActivity.toShortString());
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    void b() {
        this.f21645a.sendBroadcast(new Intent(WebViewActivity.f17606j));
    }

    a c(String str, Bundle bundle, boolean z6, boolean z7, boolean z8) {
        Activity activity = this.f21646b;
        if (activity == null) {
            return a.NO_ACTIVITY;
        }
        try {
            this.f21646b.startActivity(z6 ? WebViewActivity.b(activity, str, z7, z8, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return a.OK;
        } catch (ActivityNotFoundException unused) {
            return a.ACTIVITY_NOT_FOUND;
        }
    }

    void d(Activity activity) {
        this.f21646b = activity;
    }
}
