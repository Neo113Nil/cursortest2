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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static Handler f218a;
    public static ProgressDialog b;

    public static void a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        if (zh.d(str3)) {
            StringBuilder sb = new StringBuilder(str3);
            String a2 = a(str3, (String) null);
            if (a2 != null) {
                sb.append(g.a(g.c(a2)));
            }
            if (trackingParams != null) {
                sb.append(trackingParams.e());
            }
            str3 = sb.toString();
        }
        nh.a(context, str3, null);
        Intent b2 = zh.b(context, str);
        if (b2 != null && str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b2.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b2 != null) {
            try {
                context.startActivity(b2);
            } catch (Throwable th) {
                n8.a(th);
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
            zh.a((Activity) context, false);
        }
        ProgressDialog progressDialog = b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                ProgressDialog progressDialog2 = b;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    try {
                        b.cancel();
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                    b = null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        r2.setPackage(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, String str) {
        boolean z;
        boolean b2 = b(str);
        if (context == null || str == null) {
            return;
        }
        int i = (AdsCommonMetaData.k().I() || !(context instanceof Activity)) ? 344457216 : 76021760;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(i);
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ResolveInfo next = it.next();
            if (next.activityInfo.packageName.equalsIgnoreCase(y5.f505a)) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                z = true;
                break;
            }
        }
        if (!z) {
            try {
                if (MetaData.A().m() && ((af) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("chromeTabs", false)) {
                    g2.a(context, str, b2);
                    return;
                }
            } catch (Throwable th) {
                n8.a(th);
                try {
                    Intent parseUri = Intent.parseUri(str, i);
                    Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentActivities(parseUri, 0).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ResolveInfo next2 = it2.next();
                        if (next2.activityInfo.packageName.equalsIgnoreCase(y5.f505a)) {
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
                    n8.a(th2);
                    return;
                }
            }
        }
        if (b2 && !z) {
            String[] strArr = {"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
            try {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i);
                if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 5) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (m0.a(0, context, str2)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            } catch (Throwable th3) {
                n8.a(th3);
            }
        }
        context.startActivity(intent);
    }

    public static void a(String[] strArr, String str, int i, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig g = MetaData.A().g();
            if (g != null && g.n() && jSONObject != null) {
                n8 n8Var = new n8(o8.d);
                n8Var.d = "viewability_info";
                n8Var.i = str2;
                n8Var.e = zh.b(jSONObject.toString());
                n8Var.a();
            }
        } catch (Throwable th) {
            n8.a(th);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(6, "StartAppSDK", str3);
        } catch (Throwable th2) {
            n8.a(th2);
        }
        a(strArr, str, i, str2);
    }

    public static boolean b(Context context) {
        com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
        if (((com.startapp.sdk.common.advertisingid.b) a2.g.a()).a().c) {
            return false;
        }
        long j = ((af) a2.G.a()).getLong("shared_prefs_CookieFeatureTS", 0L);
        return j == 0 || (((long) AdsCommonMetaData.k().e()) * 86400000) + j <= System.currentTimeMillis();
    }

    public static void a(String[] strArr, String str, int i, String str2) {
        TrackingParams a2 = new TrackingParams(str).a(i).a(str2);
        if (strArr != null && strArr.length != 0) {
            for (String str3 : strArr) {
                if (str3 != null && str3.length() > 0) {
                    n8 n8Var = new n8(o8.j);
                    if (zh.d(str3)) {
                        StringBuilder sb = new StringBuilder(str3);
                        String a3 = a(str3, (String) null);
                        if (a3 != null) {
                            sb.append(g.a(g.c(a3)));
                        }
                        sb.append(a2.e());
                        str3 = sb.toString();
                    }
                    n8Var.e = str3;
                    n8Var.a();
                }
            }
            return;
        }
        n8 n8Var2 = new n8(o8.e);
        n8Var2.d = "Non-impression without trackingUrls";
        n8Var2.i = str2;
        n8Var2.e = zh.a(a2.d());
        n8Var2.a();
    }

    public static ArrayList a(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < arrayList.size()) {
            int i2 = i + 5;
            arrayList2.add(f0.e + "?" + TextUtils.join("&", arrayList.subList(i, Math.min(i2, arrayList.size()))) + "&isShown=false" + "&appPresence=".concat(str));
            i = i2;
        }
        return arrayList2;
    }

    public static void a(Context context, String str, String[] strArr, TrackingParams trackingParams, boolean z, boolean z2) {
        Pair a2 = a(context, strArr, str, trackingParams, z2);
        String str2 = (String) a2.first;
        String str3 = (String) a2.second;
        try {
            if (AdsCommonMetaData.k().J() || TextUtils.isEmpty(str2)) {
                str = g.a(str, str3);
            }
            if (MetaData.A().c0() && z) {
                a(context, str);
            } else if (TextUtils.isEmpty(str2) && b(context)) {
                ((af) com.startapp.sdk.components.a.a(context).G.a()).edit().putLong("shared_prefs_CookieFeatureTS", System.currentTimeMillis()).apply();
                b(context, str + "&cki=1");
            } else {
                b(context, str);
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    public static void a(Context context, String str, String[] strArr, String str2, TrackingParams trackingParams, long j, long j2, boolean z, Boolean bool, boolean z2, Runnable runnable) {
        String a2;
        if (AdsCommonMetaData.k().K()) {
            Pair a3 = a(context, strArr, str, trackingParams, z2);
            String str3 = (String) a3.first;
            String str4 = (String) a3.second;
            StringBuilder append = new StringBuilder().append(str);
            if (!AdsCommonMetaData.k().J() && !TextUtils.isEmpty(str3)) {
                a2 = "";
            } else {
                a2 = g.a(g.c(str4));
            }
            String sb = append.append(a2).toString();
            Intent intent = new Intent("com.startapp.android.OnClickCallback");
            intent.putExtra("dParam", str4);
            db.a(context).a(intent);
            if (a(sb)) {
                if (str2 != null && !str2.isEmpty()) {
                    Locale locale = Locale.ROOT;
                    if (!sb.toLowerCase(locale).contains(str2.toLowerCase(locale))) {
                        n8 n8Var = new n8(o8.e);
                        n8Var.d = "Wrong package reached";
                        n8Var.e = "Expected: " + str2 + ", Link: " + sb;
                        n8Var.g = str4;
                        n8Var.a();
                    }
                }
                b(context, sb);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (context instanceof Activity) {
                zh.a((Activity) context, true);
            }
            try {
                WebView c = ((uj) com.startapp.sdk.components.a.a(context).f160a.a()).c();
                if (b == null) {
                    int i = Build.VERSION.SDK_INT;
                    ProgressDialog progressDialog = new ProgressDialog(context, R.style.Theme.DeviceDefault.Dialog.Alert);
                    b = progressDialog;
                    progressDialog.setTitle((CharSequence) null);
                    b.setMessage("Loading....");
                    b.setIndeterminate(false);
                    b.setCancelable(false);
                    b.setOnCancelListener(new d0(c));
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        b.show();
                    } else if (!(context instanceof Activity) && Settings.canDrawOverlays(context) && b.getWindow() != null) {
                        if (i >= 26) {
                            b.getWindow().setType(2038);
                        } else {
                            b.getWindow().setType(2003);
                        }
                        b.show();
                    }
                }
                c.getSettings().setJavaScriptEnabled(true);
                c.setWebChromeClient(new WebChromeClient());
                c.setWebViewClient(new tc(context, com.startapp.sdk.components.a.a(context).G, com.startapp.sdk.components.a.a(context).D, new Handler(Looper.getMainLooper()), j, j2, z, bool, sb, str2, str4, runnable));
                c.loadUrl(sb);
                return;
            } catch (Throwable th) {
                n8.a(th);
                b(context, sb);
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
        qg qgVar = pg.f382a;
        qgVar.l = true;
        qgVar.e = true;
        String str4 = null;
        if (z || strArr == null) {
            str2 = null;
        } else {
            try {
                str2 = null;
                for (String str5 : strArr) {
                    try {
                        str2 = a(str, str5);
                        if (str2 != null || zh.d(str5)) {
                            str4 = str5;
                            break;
                        }
                    } catch (Throwable th) {
                        th = th;
                        n8.a(th);
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
            if (zh.d(str)) {
                StringBuilder sb2 = new StringBuilder(str);
                String a2 = a(str, (String) null);
                if (a2 != null) {
                    sb2.append(g.a(g.c(a2)));
                }
                if (trackingParams != null) {
                    sb2.append(trackingParams.e());
                }
                sb = sb2.toString();
            } else {
                sb = str;
            }
            nh.a(context, sb, null);
        }
        zh.a(4, context, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad");
    }

    public static boolean a(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        if (!a(str)) {
            WeakHashMap weakHashMap = zh.f528a;
            try {
                if (MetaData.A().n() && ((af) com.startapp.sdk.components.a.a(context).G.a()).getBoolean("chromeTabs", false)) {
                    g2.a(context, str, true);
                    return;
                }
            } catch (Throwable th) {
                n8.a(th);
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
                n8.a(th2);
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
        Activity activity;
        if (Looper.getMainLooper().isCurrentThread()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i = 0; i < 8; i++) {
                if (stackTrace[i].getMethodName().compareTo("doHome") == 0) {
                    return "home";
                }
                if (stackTrace[i].getMethodName().compareTo("onBackPressed") == 0) {
                    qg qgVar = pg.f382a;
                    WeakReference weakReference = qgVar.k;
                    if (!((weakReference == null || (activity = (Activity) weakReference.get()) == null) ? true : activity.isTaskRoot())) {
                        return "interstitial";
                    }
                    qgVar.c = false;
                    qgVar.d = true;
                    return "back";
                }
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
            Handler handler = f218a;
            if (handler == null) {
                handler = new Handler(mainLooper);
                f218a = handler;
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
        return sb.append(String.format(locale, "10%08x", Integer.valueOf((str + str2).hashCode()))).append(str3 != null ? String.format(locale, "ac%08x", Integer.valueOf(str3.hashCode())) : "").append(str4 != null ? String.format(locale, "b1%08x", Integer.valueOf(str4.hashCode())) : "").toString();
    }
}
