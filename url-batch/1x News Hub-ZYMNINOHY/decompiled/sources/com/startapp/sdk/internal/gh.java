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
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class gh {

    /* renamed from: u, reason: collision with root package name */
    public static int f3876u;
    public static int v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f3877w;

    /* renamed from: a, reason: collision with root package name */
    public SDKAdPreferences f3878a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3879b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3880c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3881d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3882e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public Application f3883g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f3884h;

    /* renamed from: i, reason: collision with root package name */
    public dh f3885i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f3886j;

    /* renamed from: k, reason: collision with root package name */
    public Activity f3887k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3888l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3889m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3890n;
    public TreeMap o;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f3891p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3892q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3893r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f3894s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3895t;

    public gh() {
        WeakHashMap weakHashMap = si.f4438a;
        this.f3879b = true;
        this.f3880c = false;
        this.f3881d = false;
        this.f3882e = false;
        this.f3884h = new HashMap();
        this.f3886j = new AtomicBoolean();
        this.f3888l = false;
        this.f3889m = true;
        this.f3890n = false;
        this.f3891p = null;
    }

    public static void c(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        k8 k8Var = (k8) com.startapp.sdk.components.a.a(context).f3483y.a();
        k8Var.f4053a.post(new S.f(context, 2));
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferences = (SharedPreferences) com.startapp.sdk.components.a.a(context).f3451I.a();
        if (sharedPreferences.contains("isma")) {
            return sharedPreferences.getBoolean("isma", false) ? sharedPreferences.contains("iscd") && !sharedPreferences.getBoolean("iscd", false) : (sharedPreferences.contains("iscd") && sharedPreferences.getBoolean("iscd", false)) ? false : true;
        }
        if (sharedPreferences.contains("iscd")) {
            return !sharedPreferences.getBoolean("iscd", false);
        }
        return true;
    }

    public static void e(Context context) {
        fh.f3800a.a(context, null, null, null, null, true);
    }

    public final void a(Context context, final String str, final String str2, final SDKAdPreferences sDKAdPreferences, final Runnable runnable) {
        Context a3 = w0.a(context);
        final Context context2 = a3 != null ? a3 : context;
        try {
            ((pf) com.startapp.sdk.components.a.a(context2).f3480u.a()).a(256);
        } catch (Throwable unused) {
        }
        ((k8) com.startapp.sdk.components.a.a(context2).f3483y.a()).f4053a.post(new Runnable() { // from class: com.startapp.sdk.internal.A
            @Override // java.lang.Runnable
            public final void run() {
                gh.this.b(context2, str, str2, sDKAdPreferences, runnable);
            }
        });
    }

    public final /* synthetic */ void b(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable) {
        a(context, str, str2, sDKAdPreferences, runnable, false);
    }

    public final void f(Context context) {
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f3449G.a();
        int i3 = sfVar.getInt("shared_prefs_app_version_id", -1);
        int a3 = p0.a(context);
        if (i3 > 0 && a3 > i3) {
            this.f3890n = true;
        }
        rf edit = sfVar.edit();
        edit.a("shared_prefs_app_version_id", Integer.valueOf(a3));
        edit.f4395a.putInt("shared_prefs_app_version_id", a3);
        edit.apply();
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        rf edit = ((sf) a3.f3449G.a()).edit();
        Boolean bool = Boolean.FALSE;
        edit.a("periodicInfoEventPaused", bool);
        edit.f4395a.putBoolean("periodicInfoEventPaused", false);
        edit.a("periodicMetadataPaused", bool);
        edit.f4395a.putBoolean("periodicMetadataPaused", false);
        edit.apply();
        bh bhVar = new bh(this, context, a3);
        if (MetaData.E().n0()) {
            bhVar.a(null, false);
        } else {
            MetaData.E().a(bhVar);
        }
    }

    public final void b(Context context) {
        Context a3 = w0.a(context);
        Application application = a3 instanceof Application ? (Application) a3 : context instanceof Application ? (Application) context : context instanceof Activity ? ((Activity) context).getApplication() : context instanceof Service ? ((Service) context).getApplication() : null;
        if (application == null || this.f3894s != null) {
            return;
        }
        v0 v0Var = new v0(this);
        this.f3894s = v0Var;
        application.registerActivityLifecycleCallbacks(v0Var);
        try {
            kf kfVar = ((pf) com.startapp.sdk.components.a.a(context).f3480u.a()).f4318e;
            if (kfVar == null) {
                throw new RuntimeException();
            }
            application.registerActivityLifecycleCallbacks(kfVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:46|(1:48)|(6:49|50|51|52|(1:54)|56)|(14:58|(1:60)|61|62|63|(3:65|66|(5:68|(1:81)(3:70|71|(2:73|74)(4:78|79|80|77))|75|76|77)(1:82))|106|83|84|(2:86|(1:90))|91|(4:93|(1:95)|96|97)|(1:102)|103)|109|61|62|63|(0)|106|83|84|(0)|91|(0)|(2:100|102)|103) */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ca, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021a A[Catch: all -> 0x018e, TryCatch #6 {all -> 0x018e, blocks: (B:50:0x012f, B:56:0x0152, B:58:0x0185, B:62:0x0197, B:66:0x01a9, B:68:0x01ac, B:70:0x01be, B:84:0x01cd, B:86:0x021a, B:88:0x0227, B:90:0x022b, B:91:0x0235, B:93:0x024c, B:95:0x0256, B:96:0x0259, B:109:0x0191, B:111:0x014f, B:52:0x0140, B:54:0x0148), top: B:49:0x012f, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024c A[Catch: all -> 0x018e, TryCatch #6 {all -> 0x018e, blocks: (B:50:0x012f, B:56:0x0152, B:58:0x0185, B:62:0x0197, B:66:0x01a9, B:68:0x01ac, B:70:0x01be, B:84:0x01cd, B:86:0x021a, B:88:0x0227, B:90:0x022b, B:91:0x0235, B:93:0x024c, B:95:0x0256, B:96:0x0259, B:109:0x0191, B:111:0x014f, B:52:0x0140, B:54:0x0148), top: B:49:0x012f, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable, boolean z) {
        boolean z2;
        MetaDataRequest$RequestReason metaDataRequest$RequestReason;
        boolean z3;
        com.startapp.sdk.components.a a3;
        boolean z4;
        boolean contains;
        WeakHashMap weakHashMap = si.f4438a;
        int i3 = f3876u;
        boolean z5 = false;
        if (i3 == 0 && z) {
            ec ecVar = new ec(context);
            if (ecVar.f3740c != null || ecVar.f3741d != null) {
                rf edit = ((sf) com.startapp.sdk.components.a.a(context).f3451I.a()).edit();
                Boolean bool = ecVar.f3740c;
                if (bool != null) {
                    boolean equals = Boolean.TRUE.equals(bool);
                    edit.a("isma", Boolean.valueOf(equals));
                    edit.f4395a.putBoolean("isma", equals);
                }
                Boolean bool2 = ecVar.f3741d;
                if (bool2 != null) {
                    boolean equals2 = Boolean.TRUE.equals(bool2);
                    edit.a("iscd", Boolean.valueOf(equals2));
                    edit.f4395a.putBoolean("iscd", equals2);
                }
                edit.apply();
            }
            StartAppSDK.enableConsent(context, ecVar.f3739b);
            str2 = ecVar.f3738a;
            if (TextUtils.isEmpty(str2)) {
                q0 q0Var = (q0) com.startapp.sdk.components.a.a(context).f3473m.a();
                synchronized (q0Var.f4330a) {
                    contains = q0Var.f4331b.contains("2696a7f502faed4b");
                }
                if (contains) {
                    str2 = q0Var.a();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                z = false;
            }
        }
        A1.a aVar = new A1.a(context, 10, runnable);
        int i4 = v;
        eh ehVar = new eh(context, aVar, i4 == 1 || i4 == 2, i4 == 2);
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        MetaData.E().a(new ah(new Handler(myLooper), ehVar));
        int i5 = z ? 1 : 2;
        if (i5 > i3) {
            f3876u = i5;
            if (z) {
                metaDataRequest$RequestReason = MetaDataRequest$RequestReason.IMPLICIT_LAUNCH;
            } else {
                MetaDataRequest$RequestReason metaDataRequest$RequestReason2 = MetaDataRequest$RequestReason.LAUNCH;
                if (TextUtils.isEmpty(str2)) {
                    if (!si.d(context)) {
                        int i6 = p0.f4293a;
                        try {
                            z3 = u6.a(context);
                        } catch (Throwable unused) {
                            z3 = false;
                        }
                        if (!z3) {
                            Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                        }
                    }
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                ((q0) com.startapp.sdk.components.a.a(context).f3473m.a()).a(str, str2);
                this.f3878a = sDKAdPreferences;
                e7.d(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
                metaDataRequest$RequestReason = metaDataRequest$RequestReason2;
            }
            if (i3 == 0) {
                if (((Random) si.f4441d.a()).nextDouble() < 0.0d) {
                    Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:5.3.0");
                }
                try {
                    a3 = com.startapp.sdk.components.a.a(context);
                    a3.L.a();
                    i0 i0Var = (i0) a3.f3452J.a();
                    try {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        if (!(defaultUncaughtExceptionHandler instanceof i0)) {
                            Thread.setDefaultUncaughtExceptionHandler(i0Var);
                            i0Var.f3950a = defaultUncaughtExceptionHandler;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    u0 u0Var = (u0) a3.f3458Q.a();
                    u0Var.f4498a.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    u0Var.f4501d = elapsedRealtime;
                    u0Var.f4502e = elapsedRealtime;
                    ((t9) a3.f3476q.a()).a();
                    ((j0) a3.f3462a.a()).a();
                } catch (Throwable th2) {
                    d9.a(th2);
                }
                if (p0.a(context, "android.permission.INTERNET")) {
                    if (!p0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    }
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                    z4 = false;
                    int i7 = 0;
                    while (!z4) {
                        try {
                            if (i7 >= activityInfoArr.length) {
                                break;
                            }
                            int i8 = i7 + 1;
                            ActivityInfo activityInfo = activityInfoArr[i7];
                            if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                                if ((activityInfo.flags & 512) == 0) {
                                    z4 = true;
                                } else {
                                    i7 = i8;
                                    z4 = false;
                                }
                            }
                            i7 = i8;
                        } catch (PackageManager.NameNotFoundException | Exception unused2) {
                        }
                    }
                    this.f3889m = !z4;
                    ((com.startapp.sdk.common.advertisingid.b) a3.f3468h.a()).a(d(context));
                    b(context);
                    com.startapp.sdk.adsbase.g.c(context);
                    ((di) a3.f3460S.a()).b();
                    ((zc) a3.f3461T.a()).a();
                    a3.f3450H.a();
                    i6.f3959a = new CookieManager(new ge(context), CookiePolicy.ACCEPT_ALL);
                    f(context);
                    a(context);
                    g(context);
                    if (context instanceof Application) {
                        Application application = (Application) context;
                        this.f3883g = application;
                        if (this.f3886j.compareAndSet(false, true) && this.f3885i == null) {
                            dh dhVar = new dh();
                            application.registerActivityLifecycleCallbacks(dhVar);
                            this.f3885i = dhVar;
                        }
                    }
                    MetaData.E().a((g6) a3.f3470j.a());
                    WeakHashMap weakHashMap2 = si.f4438a;
                    if (MetaData.c(context)) {
                        AdsCommonMetaData.a(context);
                        BannerMetaData.a(context);
                        if (this.f3879b) {
                            CacheMetaData.a(context);
                        }
                        AdInformationMetaData.b(context);
                        z5 = true;
                    }
                    if (z5 && v == 0) {
                        v = 1;
                    }
                    WeakHashMap weakHashMap3 = si.f4438a;
                    ehVar.f3758c = z5;
                }
                si.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                ActivityInfo[] activityInfoArr2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                z4 = false;
                int i72 = 0;
                while (!z4) {
                }
                this.f3889m = !z4;
                ((com.startapp.sdk.common.advertisingid.b) a3.f3468h.a()).a(d(context));
                b(context);
                com.startapp.sdk.adsbase.g.c(context);
                ((di) a3.f3460S.a()).b();
                ((zc) a3.f3461T.a()).a();
                a3.f3450H.a();
                i6.f3959a = new CookieManager(new ge(context), CookiePolicy.ACCEPT_ALL);
                f(context);
                a(context);
                g(context);
                if (context instanceof Application) {
                }
                MetaData.E().a((g6) a3.f3470j.a());
                WeakHashMap weakHashMap22 = si.f4438a;
                if (MetaData.c(context)) {
                }
                if (z5) {
                    v = 1;
                }
                WeakHashMap weakHashMap32 = si.f4438a;
                ehVar.f3758c = z5;
            }
            mg.f4159d.a(context, metaDataRequest$RequestReason);
        } else if (!z && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                if (!si.d(context)) {
                    int i9 = p0.f4293a;
                    try {
                        z2 = u6.a(context);
                    } catch (Throwable unused3) {
                        z2 = false;
                    }
                    if (!z2) {
                        Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                    }
                }
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
            z5 = ((q0) com.startapp.sdk.components.a.a(context).f3473m.a()).a(str, str2);
            if (z5) {
                mg.f4159d.a(context, MetaDataRequest$RequestReason.LAUNCH);
            }
        }
        ehVar.f3760e = true;
        WeakHashMap weakHashMap4 = si.f4438a;
        if (!(ehVar.f3758c ? ehVar.f3759d : true) || ehVar.f3757b) {
            return;
        }
        ehVar.f3757b = true;
        g0.a(ehVar.f3756a);
    }

    public static void a(Context context, Runnable runnable) {
        if (!f3877w) {
            f3877w = true;
            String str = "StartApp SDK initialized, version " + StartAppSDK.getVersion();
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(4, "StartAppSDK", str);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (r9.contains("com.android.chrome") != false) goto L49;
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
                intent2.setAction("android.support.customtabs.action.CustomTabsService");
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
                        d9.a(th);
                    }
                    if (arrayList.contains(str3)) {
                        str2 = str3;
                    }
                }
                str2 = str;
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        if (str2 != null) {
            Intent intent3 = new Intent("android.support.customtabs.action.CustomTabsService");
            intent3.setPackage(str2);
            z = !context.getPackageManager().queryIntentServices(intent3, 0).isEmpty();
        }
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f3449G.a()).edit();
        edit.a("chromeTabs", Boolean.valueOf(z));
        edit.f4395a.putBoolean("chromeTabs", z);
        edit.apply();
    }
}
