package com.startapp.sdk.internal;

import android.R;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f3845a;

    /* renamed from: b, reason: collision with root package name */
    public static ProgressDialog f3846b;

    public static void a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        if (si.e(str3)) {
            StringBuilder sb = new StringBuilder(str3);
            String a3 = a(str3, (String) null);
            if (a3 != null) {
                sb.append(AbstractC0288g.a(AbstractC0288g.c(a3)));
            }
            if (trackingParams != null) {
                sb.append(trackingParams.e());
            }
            str3 = sb.toString();
        }
        gi.a(context, str3, null);
        Intent b3 = si.b(context, str);
        if (b3 != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b3.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b3 != null) {
            try {
                context.startActivity(b3);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    public static String c(Context context) {
        ApplicationInfo applicationInfo;
        try {
            return context.getResources().getString(context.getApplicationInfo().labelRes);
        } catch (Throwable unused) {
            PackageManager packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            } catch (Throwable unused2) {
                applicationInfo = null;
            }
            return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Welcome!");
        }
    }

    public static void d(Context context) {
        if (context != null && (context instanceof Activity)) {
            si.a((Activity) context, false);
        }
        ProgressDialog progressDialog = f3846b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                try {
                    ProgressDialog progressDialog2 = f3846b;
                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                        try {
                            f3846b.cancel();
                        } catch (Throwable th) {
                            d9.a(th);
                        }
                        f3846b = null;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r2.setPackage(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, String str) {
        boolean z;
        boolean b3 = b(str);
        if (context == null || str == null) {
            return;
        }
        int i3 = (AdsCommonMetaData.k().I() || !(context instanceof Activity)) ? 344457216 : 76021760;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(i3);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.equalsIgnoreCase(h6.f3927a)) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                z = true;
                break;
            }
        }
        if (!z) {
            try {
                if (MetaData.E().n() && ((sf) com.startapp.sdk.components.a.a(context).f3449G.a()).getBoolean("chromeTabs", false)) {
                    m2.a(context, str, b3);
                    return;
                }
            } catch (Throwable th) {
                d9.a(th);
                try {
                    Intent parseUri = Intent.parseUri(str, i3);
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(parseUri, 0).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ResolveInfo next2 = it2.next();
                        if (next2.activityInfo.packageName.equalsIgnoreCase(h6.f3927a)) {
                            ActivityInfo activityInfo2 = next2.activityInfo;
                            parseUri.setComponent(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                            break;
                        }
                    }
                    if (!(context instanceof Activity)) {
                        parseUri.addFlags(268435456);
                    }
                    context.startActivity(parseUri);
                    return;
                } catch (Throwable th2) {
                    d9.a(th2);
                    return;
                }
            }
        }
        if (b3 && !z) {
            String[] strArr = {"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
            try {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i3);
                if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 5) {
                            break;
                        }
                        String str2 = strArr[i4];
                        if (p0.a(0, context, str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            } catch (Throwable th3) {
                d9.a(th3);
            }
        }
        context.startActivity(intent);
    }

    public static void a(String[] strArr, String str, int i3, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig h3 = MetaData.E().h();
            if (h3 != null && h3.m() && jSONObject != null) {
                d9 d9Var = new d9(e9.f3724d);
                d9Var.f3680d = "viewability_info";
                d9Var.f3684i = str2;
                d9Var.f3681e = si.b(jSONObject.toString());
                d9Var.a();
            }
        } catch (Throwable th) {
            d9.a(th);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(6, "StartAppSDK", str3);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        a(strArr, str, i3, str2);
    }

    public static void a(String[] strArr, String str, int i3, String str2) {
        TrackingParams a3 = new TrackingParams(str).a(i3).a(str2);
        if (strArr != null && strArr.length != 0) {
            for (String str3 : strArr) {
                if (str3 != null && str3.length() > 0) {
                    d9 d9Var = new d9(e9.f3729j);
                    if (si.e(str3)) {
                        StringBuilder sb = new StringBuilder(str3);
                        String a4 = a(str3, (String) null);
                        if (a4 != null) {
                            sb.append(AbstractC0288g.a(AbstractC0288g.c(a4)));
                        }
                        sb.append(a3.e());
                        str3 = sb.toString();
                    }
                    d9Var.f3681e = str3;
                    d9Var.a();
                }
            }
            return;
        }
        d9 d9Var2 = new d9(e9.f3725e);
        d9Var2.f3680d = "Non-impression without trackingUrls";
        d9Var2.f3684i = str2;
        d9Var2.f3681e = si.a(a3.d());
        d9Var2.a();
    }

    public static boolean b(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        if (((com.startapp.sdk.common.advertisingid.b) a3.f3468h.a()).a().f4043c) {
            return false;
        }
        long j3 = ((sf) a3.f3449G.a()).getLong("shared_prefs_CookieFeatureTS", 0L);
        return j3 == 0 || (((long) AdsCommonMetaData.k().e()) * 86400000) + j3 <= System.currentTimeMillis();
    }

    public static ArrayList a(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            int i4 = i3 + 5;
            arrayList2.add(h0.f3915e + "?" + TextUtils.join("&", arrayList.subList(i3, Math.min(i4, arrayList.size()))) + "&isShown=false" + "&appPresence=".concat(str));
            i3 = i4;
        }
        return arrayList2;
    }

    public static void a(Context context, String str, String[] strArr, TrackingParams trackingParams, boolean z, boolean z2) {
        Pair a3 = a(context, strArr, str, trackingParams, z2);
        String str2 = (String) a3.first;
        String str3 = (String) a3.second;
        try {
            if (AdsCommonMetaData.k().J() || TextUtils.isEmpty(str2)) {
                str = AbstractC0288g.a(str, str3);
            }
            if (MetaData.E().i0() && z) {
                a(context, str);
                return;
            }
            if (TextUtils.isEmpty(str2) && b(context)) {
                rf edit = ((sf) com.startapp.sdk.components.a.a(context).f3449G.a()).edit();
                long currentTimeMillis = System.currentTimeMillis();
                edit.a("shared_prefs_CookieFeatureTS", Long.valueOf(currentTimeMillis));
                edit.f4395a.putLong("shared_prefs_CookieFeatureTS", currentTimeMillis);
                edit.apply();
                b(context, str + "&cki=1");
                return;
            }
            b(context, str);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public static void a(Context context, String str, String[] strArr, String str2, TrackingParams trackingParams, long j3, long j4, boolean z, Boolean bool, boolean z2, Runnable runnable) {
        String a3;
        if (AdsCommonMetaData.k().K()) {
            Pair a4 = a(context, strArr, str, trackingParams, z2);
            String str3 = (String) a4.first;
            String str4 = (String) a4.second;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (!AdsCommonMetaData.k().J() && !TextUtils.isEmpty(str3)) {
                a3 = "";
            } else {
                a3 = AbstractC0288g.a(AbstractC0288g.c(str4));
            }
            sb.append(a3);
            String sb2 = sb.toString();
            Intent intent = new Intent("com.startapp.android.OnClickCallback");
            intent.putExtra("dParam", str4);
            wb.a(context).a(intent);
            if (a(sb2)) {
                if (str2 != null && !str2.isEmpty()) {
                    Locale locale = Locale.ROOT;
                    if (!sb2.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                        d9 d9Var = new d9(e9.f3725e);
                        d9Var.f3680d = "Wrong package reached";
                        d9Var.f3681e = "Expected: " + str2 + ", Link: " + sb2;
                        d9Var.f3682g = str4;
                        d9Var.a();
                    }
                }
                b(context, sb2);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (context instanceof Activity) {
                si.a((Activity) context, true);
            }
            try {
                WebView c3 = ((rk) com.startapp.sdk.components.a.a(context).f3463b.a()).c();
                if (f3846b == null) {
                    int i3 = Build.VERSION.SDK_INT;
                    ProgressDialog progressDialog = new ProgressDialog(context, R.style.Theme.DeviceDefault.Dialog.Alert);
                    f3846b = progressDialog;
                    progressDialog.setTitle((CharSequence) null);
                    f3846b.setMessage("Loading....");
                    f3846b.setIndeterminate(false);
                    f3846b.setCancelable(false);
                    f3846b.setOnCancelListener(new f0(c3));
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        f3846b.show();
                    } else if (!(context instanceof Activity) && Settings.canDrawOverlays(context) && f3846b.getWindow() != null) {
                        if (i3 >= 26) {
                            f3846b.getWindow().setType(2038);
                        } else {
                            f3846b.getWindow().setType(2003);
                        }
                        f3846b.show();
                    }
                }
                c3.getSettings().setJavaScriptEnabled(true);
                c3.setWebChromeClient(new WebChromeClient());
                c3.setWebViewClient(new ld(context, com.startapp.sdk.components.a.a(context).f3449G, com.startapp.sdk.components.a.a(context).f3446D, new Handler(Looper.getMainLooper()), j3, j4, z, bool, sb2, str2, str4, runnable));
                c3.loadUrl(sb2);
                return;
            } catch (Throwable th) {
                d9.a(th);
                b(context, sb2);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        a(context, str, strArr, trackingParams, z, z2);
    }

    public static Pair a(Context context, String[] strArr, String str, TrackingParams trackingParams, boolean z) {
        String str2;
        if (strArr != null) {
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    a(context, str3, trackingParams);
                }
            }
        }
        gh ghVar = fh.f3800a;
        ghVar.f3888l = true;
        ghVar.f3881d = true;
        String str4 = null;
        if (z || strArr == null) {
            str2 = null;
        } else {
            try {
                str2 = null;
                for (String str5 : strArr) {
                    try {
                        str2 = a(str, str5);
                        if (str2 != null || si.e(str5)) {
                            str4 = str5;
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        d9.a(th);
                        return new Pair(str4, str2);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
            }
        }
        return new Pair(str4, str2);
    }

    public static void a(Context context, String str, TrackingParams trackingParams) {
        String sb;
        if (context == null) {
            return;
        }
        if (str != null && str.length() > 0) {
            if (si.e(str)) {
                StringBuilder sb2 = new StringBuilder(str);
                String a3 = a(str, (String) null);
                if (a3 != null) {
                    sb2.append(AbstractC0288g.a(AbstractC0288g.c(a3)));
                }
                if (trackingParams != null) {
                    sb2.append(trackingParams.e());
                }
                sb = sb2.toString();
            } else {
                sb = str;
            }
            gi.a(context, sb, null);
        }
        si.a(4, context, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad");
    }

    public static boolean a(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        if (!a(str)) {
            WeakHashMap weakHashMap = si.f4438a;
            try {
                if (MetaData.E().o() && ((sf) com.startapp.sdk.components.a.a(context).f3449G.a()).getBoolean("chromeTabs", false)) {
                    m2.a(context, str, true);
                    return;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
            Intent intent = new Intent(context, (Class<?>) OverlayActivity.class);
            intent.addFlags(524288);
            intent.addFlags(32768);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.getIndex());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable th2) {
                d9.a(th2);
                return;
            }
        }
        b(context, str);
    }

    public static String a(String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        if (str == null) {
            return null;
        }
        String[] split = str.split("[?&]d=");
        if (split.length >= 2) {
            return split[1].split("[?&]")[0];
        }
        return null;
    }

    public static String a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i3 = 0; i3 < 8; i3++) {
            if (stackTrace[i3].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i3].getMethodName().compareTo("onBackPressed") == 0) {
                gh ghVar = fh.f3800a;
                Activity activity = ghVar.f3887k;
                if (!(activity != null ? activity.isTaskRoot() : true)) {
                    return "interstitial";
                }
                ghVar.f3880c = false;
                ghVar.f3882e = true;
                return "back";
            }
        }
        return "interstitial";
    }

    public static boolean a(Context context) {
        if (AdsCommonMetaData.k().a()) {
            return b(context);
        }
        return false;
    }

    public static void a(Runnable runnable) {
        if (runnable != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                runnable.run();
                return;
            }
            Handler handler = f3845a;
            if (handler == null) {
                handler = new Handler(mainLooper);
                f3845a = handler;
            }
            handler.post(runnable);
        }
    }

    public static String a(BannerBase bannerBase) {
        View view = bannerBase;
        StringBuilder sb = null;
        String str = null;
        while (view != null) {
            if (str == null) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        str = null;
                        break;
                    }
                    if (context instanceof Activity) {
                        str = context.getClass().getName();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            int id = view.getId();
            if (id != -1 && id != 0) {
                try {
                    String resourceEntryName = view.getResources().getResourceEntryName(id);
                    if (sb == null) {
                        sb = new StringBuilder();
                    } else {
                        sb.insert(0, "/");
                    }
                    sb.insert(0, resourceEntryName);
                } catch (Resources.NotFoundException unused) {
                }
            }
            view = view.getParent() instanceof View ? (View) view.getParent() : null;
        }
        Pair pair = new Pair(str, sb != null ? sb.toString() : null);
        return a(bannerBase.getContext().getPackageName(), bannerBase.getClass().getName(), (String) pair.first, (String) pair.second);
    }

    public static String a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        sb.append(String.format(locale, "10%08x", Integer.valueOf((str + str2).hashCode())));
        sb.append(str3 != null ? String.format(locale, "ac%08x", Integer.valueOf(str3.hashCode())) : "");
        sb.append(str4 != null ? String.format(locale, "b1%08x", Integer.valueOf(str4.hashCode())) : "");
        return sb.toString();
    }
}
