package com.startapp.sdk.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class qg {
    public static int u;
    public static int v;
    public static boolean w;

    /* renamed from: a, reason: collision with root package name */
    public SDKAdPreferences f394a;
    public final boolean b;
    public volatile boolean c;
    public volatile boolean d;
    public boolean e;
    public long f;
    public Application g;
    public final HashMap h;
    public ng i;
    public final AtomicBoolean j;
    public volatile WeakReference k;
    public boolean l;
    public boolean m;
    public boolean n;
    public TreeMap o;
    public Bundle p;
    public boolean q;
    public boolean r;
    public s0 s;
    public boolean t;

    public qg() {
        WeakHashMap weakHashMap = zh.f528a;
        this.b = true;
        this.h = new HashMap();
        this.j = new AtomicBoolean();
        this.l = false;
        this.m = true;
        this.n = false;
        this.p = null;
    }

    public static void c(final Context context) {
        Context a2 = t0.a(context);
        if (a2 != null) {
            context = a2;
        }
        v7 v7Var = (v7) com.startapp.sdk.components.a.a(context).y.a();
        v7Var.f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.qg$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                qg.e(context);
            }
        });
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferences = (SharedPreferences) com.startapp.sdk.components.a.a(context).I.a();
        if (sharedPreferences.contains("isma")) {
            return sharedPreferences.getBoolean("isma", false) ? sharedPreferences.contains("iscd") && !sharedPreferences.getBoolean("iscd", false) : (sharedPreferences.contains("iscd") && sharedPreferences.getBoolean("iscd", false)) ? false : true;
        }
        if (sharedPreferences.contains("iscd")) {
            return !sharedPreferences.getBoolean("iscd", false);
        }
        return true;
    }

    public static void e(Context context) {
        pg.f382a.a(context, null, null, null, null, true);
    }

    public final void a(Context context, final String str, final String str2, final SDKAdPreferences sDKAdPreferences, final Runnable runnable) {
        Context a2 = t0.a(context);
        final Context context2 = a2 != null ? a2 : context;
        try {
            ((xe) com.startapp.sdk.components.a.a(context2).u.a()).a(256);
        } catch (Throwable unused) {
        }
        ((v7) com.startapp.sdk.components.a.a(context2).y.a()).f464a.post(new Runnable() { // from class: com.startapp.sdk.internal.qg$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                qg.this.b(context2, str, str2, sDKAdPreferences, runnable);
            }
        });
    }

    public final /* synthetic */ void b(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable) {
        a(context, str, str2, sDKAdPreferences, runnable, false);
    }

    public final void f(Context context) {
        com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
        ((af) a2.G.a()).edit().putBoolean("periodicInfoEventPaused", false).putBoolean("periodicMetadataPaused", false).apply();
        lg lgVar = new lg(this, context, a2);
        if (MetaData.A().h0()) {
            lgVar.a(null, false);
        } else {
            MetaData.A().a(lgVar);
        }
    }

    public final void b(Context context) {
        Context a2 = t0.a(context);
        Application application = a2 instanceof Application ? (Application) a2 : context instanceof Application ? (Application) context : context instanceof Activity ? ((Activity) context).getApplication() : context instanceof Service ? ((Service) context).getApplication() : null;
        if (application == null || this.s != null) {
            return;
        }
        s0 s0Var = new s0(this);
        this.s = s0Var;
        application.registerActivityLifecycleCallbacks(s0Var);
        try {
            se seVar = ((xe) com.startapp.sdk.components.a.a(context).u.a()).e;
            if (seVar == null) {
                throw new RuntimeException();
            }
            application.registerActivityLifecycleCallbacks(seVar);
        } catch (Throwable unused) {
        }
    }

    public final void a(final Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, final Runnable runnable, boolean z) {
        boolean z2;
        MetaDataRequest$RequestReason metaDataRequest$RequestReason;
        boolean z3;
        boolean z4;
        boolean contains;
        WeakHashMap weakHashMap = zh.f528a;
        int i = u;
        boolean z5 = false;
        if (i == 0 && z) {
            lb lbVar = new lb(context);
            if (lbVar.c != null || lbVar.d != null) {
                ze edit = ((af) com.startapp.sdk.components.a.a(context).I.a()).edit();
                Boolean bool = lbVar.c;
                if (bool != null) {
                    edit.putBoolean("isma", Boolean.TRUE.equals(bool));
                }
                Boolean bool2 = lbVar.d;
                if (bool2 != null) {
                    edit.putBoolean("iscd", Boolean.TRUE.equals(bool2));
                }
                edit.apply();
            }
            StartAppSDK.enableConsent(context, lbVar.b);
            str2 = lbVar.f318a;
            if (TextUtils.isEmpty(str2)) {
                n0 n0Var = (n0) com.startapp.sdk.components.a.a(context).l.a();
                synchronized (n0Var.f343a) {
                    contains = n0Var.b.contains("2696a7f502faed4b");
                }
                if (contains) {
                    str2 = n0Var.a();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                z = false;
            }
        }
        Runnable runnable2 = new Runnable() { // from class: com.startapp.sdk.internal.qg$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                qg.a(context, runnable);
            }
        };
        int i2 = v;
        og ogVar = new og(context, runnable2, i2 == 1 || i2 == 2, i2 == 2);
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        MetaData.A().a(new kg(new Handler(myLooper), ogVar));
        int i3 = z ? 1 : 2;
        if (i3 > i) {
            u = i3;
            if (z) {
                metaDataRequest$RequestReason = MetaDataRequest$RequestReason.IMPLICIT_LAUNCH;
            } else {
                MetaDataRequest$RequestReason metaDataRequest$RequestReason2 = MetaDataRequest$RequestReason.LAUNCH;
                if (TextUtils.isEmpty(str2)) {
                    if (!zh.d(context)) {
                        int i4 = m0.f327a;
                        try {
                            z3 = t6.a(context);
                        } catch (Throwable unused) {
                            z3 = false;
                        }
                        if (!z3) {
                            Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                        }
                    }
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                ((n0) com.startapp.sdk.components.a.a(context).l.a()).a(str, str2);
                this.f394a = sDKAdPreferences;
                z6.c(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
                metaDataRequest$RequestReason = metaDataRequest$RequestReason2;
            }
            if (i == 0) {
                if (((Random) zh.d.a()).nextDouble() < 0.0d) {
                    Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:5.3.2");
                }
                try {
                    com.startapp.sdk.components.a a2 = com.startapp.sdk.components.a.a(context);
                    a2.L.a();
                    g0 g0Var = (g0) a2.J.a();
                    try {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        if (!(defaultUncaughtExceptionHandler instanceof g0)) {
                            Thread.setDefaultUncaughtExceptionHandler(g0Var);
                            g0Var.f243a = defaultUncaughtExceptionHandler;
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                    r0 r0Var = (r0) a2.P.a();
                    r0Var.f397a.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    r0Var.d = elapsedRealtime;
                    r0Var.e = elapsedRealtime;
                    ((d9) a2.p.a()).a();
                    if (!m0.a(context, "android.permission.INTERNET") || !m0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        zh.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                    }
                    try {
                        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                        z4 = false;
                        int i5 = 0;
                        while (!z4) {
                            try {
                                if (i5 >= activityInfoArr.length) {
                                    break;
                                }
                                int i6 = i5 + 1;
                                ActivityInfo activityInfo = activityInfoArr[i5];
                                if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                                    int i7 = activityInfo.flags & 512;
                                    i5 = i6;
                                    z4 = i7 == 0;
                                } else {
                                    i5 = i6;
                                }
                            } catch (PackageManager.NameNotFoundException | Exception unused2) {
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | Exception unused3) {
                        z4 = false;
                    }
                    this.m = !z4;
                    ((com.startapp.sdk.common.advertisingid.b) a2.g.a()).a(d(context));
                    b(context);
                    com.startapp.sdk.adsbase.g.c(context);
                    ((hc) a2.R.a()).a();
                    a2.H.a();
                    z5.f519a = new CookieManager(new sd(context), CookiePolicy.ACCEPT_ALL);
                    af afVar = (af) com.startapp.sdk.components.a.a(context).G.a();
                    int i8 = afVar.getInt("shared_prefs_app_version_id", -1);
                    int a3 = m0.a(context);
                    if (i8 > 0 && a3 > i8) {
                        this.n = true;
                    }
                    afVar.edit().putInt("shared_prefs_app_version_id", a3).apply();
                    a(context);
                    f(context);
                    if (context instanceof Application) {
                        Application application = (Application) context;
                        this.g = application;
                        if (this.j.compareAndSet(false, true) && this.i == null) {
                            ng ngVar = new ng();
                            application.registerActivityLifecycleCallbacks(ngVar);
                            this.i = ngVar;
                        }
                    }
                    MetaData.A().a((x5) a2.i.a());
                    WeakHashMap weakHashMap2 = zh.f528a;
                    if (MetaData.c(context)) {
                        AdsCommonMetaData.a(context);
                        BannerMetaData.a(context);
                        if (this.b) {
                            CacheMetaData.a(context);
                        }
                        AdInformationMetaData.b(context);
                        z5 = true;
                    }
                } catch (Throwable th2) {
                    n8.a(th2);
                }
                if (z5 && v == 0) {
                    v = 1;
                }
                WeakHashMap weakHashMap3 = zh.f528a;
                ogVar.c = z5;
            }
            vf.d.a(context, metaDataRequest$RequestReason);
        } else if (!z && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                if (!zh.d(context)) {
                    int i9 = m0.f327a;
                    try {
                        z2 = t6.a(context);
                    } catch (Throwable unused4) {
                        z2 = false;
                    }
                    if (!z2) {
                        Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                    }
                }
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
            z5 = ((n0) com.startapp.sdk.components.a.a(context).l.a()).a(str, str2);
            if (z5) {
                vf.d.a(context, MetaDataRequest$RequestReason.LAUNCH);
            }
        }
        ogVar.e = true;
        WeakHashMap weakHashMap4 = zh.f528a;
        if (!(ogVar.c ? ogVar.d : true) || ogVar.b) {
            return;
        }
        ogVar.b = true;
        e0.a(ogVar.f368a);
    }

    public static void a(Context context, Runnable runnable) {
        if (!w) {
            w = true;
            String str = "StartApp SDK initialized, version " + StartAppSDK.getVersion();
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(4, "StartAppSDK", str);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void a(boolean z, id idVar) {
        n8 n8Var = new n8(o8.i);
        n8Var.j = z;
        try {
            com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.T.f374a;
            if (aVar != null) {
                ((d9) aVar.p.a()).a(n8Var);
            } else if (idVar != null) {
                idVar.a(Boolean.FALSE);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        if (r9.contains("com.android.chrome") != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context) {
        String str = "com.android.chrome";
        boolean z = false;
        String str2 = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            String str3 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    str = (String) arrayList.get(0);
                } else if (!TextUtils.isEmpty(str3)) {
                    try {
                        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                        if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                            for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                                IntentFilter intentFilter = resolveInfo2.filter;
                                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        n8.a(th);
                    }
                    if (arrayList.contains(str3)) {
                        str2 = str3;
                    }
                }
                str2 = str;
            }
        } catch (Throwable th2) {
            n8.a(th2);
        }
        if (str2 != null) {
            Intent intent3 = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
            intent3.setPackage(str2);
            z = !context.getPackageManager().queryIntentServices(intent3, 0).isEmpty();
        }
        ((af) com.startapp.sdk.components.a.a(context).G.a()).edit().putBoolean("chromeTabs", z).apply();
    }
}
