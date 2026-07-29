package com.facebook.ads.internal.q.c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.settings.a;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.mopub.common.Constants;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g {
    private Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    public static void a(g gVar, Context context, Uri uri, String str) {
        boolean z = a(uri.getScheme()) && uri.getHost().equals("play.google.com");
        if (uri.getScheme().equals("market") || z) {
            try {
                gVar.a(context, uri);
                return;
            } catch (c unused) {
            }
        }
        gVar.a(context, uri, str);
    }

    private boolean a(Context context) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(GooglePlayServicesUtilLight.GOOGLE_PLAY_STORE_URI_STRING)), 0).iterator();
        while (it.hasNext()) {
            if (it.next().activityInfo.applicationInfo.packageName.equals("com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String str) {
        return Constants.HTTP.equalsIgnoreCase(str) || Constants.HTTPS.equalsIgnoreCase(str);
    }

    private void b(Context context, Uri uri) {
        context.startActivity(c(context, uri));
    }

    private void b(Context context, Uri uri, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.facebook.ads.AudienceNetworkActivity");
        intent.addFlags(268435456);
        intent.putExtra(AudienceNetworkActivity.VIEW_TYPE, a.EnumC0351a.BROWSER);
        intent.putExtra(AudienceNetworkActivity.BROWSER_URL, uri.toString());
        intent.putExtra(AudienceNetworkActivity.CLIENT_TOKEN, str);
        intent.putExtra(AudienceNetworkActivity.HANDLER_TIME, System.currentTimeMillis());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setClassName(context.getPackageName(), "com.facebook.ads.InterstitialAdActivity");
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException unused2) {
                b(context, uri);
            }
        }
    }

    private Intent c(Context context, Uri uri) {
        Intent a2 = a(uri);
        a2.addCategory("android.intent.category.BROWSABLE");
        a2.addFlags(268435456);
        a2.putExtra("com.android.browser.application_id", context.getPackageName());
        a2.putExtra("create_new_tab", false);
        return a2;
    }

    public void a(Context context, Uri uri) {
        if (!a(context)) {
            throw new c();
        }
        Intent c2 = c(context, uri);
        c2.setPackage("com.android.vending");
        context.startActivity(c2);
    }

    public void a(Context context, Uri uri, String str) {
        if (a(uri.getScheme()) && com.facebook.ads.internal.l.a.f(context)) {
            b(context, uri, str);
        } else {
            b(context, uri);
        }
    }
}
