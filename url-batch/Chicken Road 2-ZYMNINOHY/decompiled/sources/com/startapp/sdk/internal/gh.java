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
    public static int f6998u;
    public static int v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f6999w;

    /* renamed from: a, reason: collision with root package name */
    public SDKAdPreferences f7000a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7002c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7004e;

    /* renamed from: f, reason: collision with root package name */
    public long f7005f;

    /* renamed from: g, reason: collision with root package name */
    public Application f7006g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f7007h;

    /* renamed from: i, reason: collision with root package name */
    public dh f7008i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f7009j;

    /* renamed from: k, reason: collision with root package name */
    public Activity f7010k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7011l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7012m;
    public boolean n;
    public TreeMap o;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f7013p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7014q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7015r;

    /* renamed from: s, reason: collision with root package name */
    public v0 f7016s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7017t;

    public gh() {
        WeakHashMap weakHashMap = si.f7575a;
        this.f7001b = true;
        this.f7002c = false;
        this.f7003d = false;
        this.f7004e = false;
        this.f7007h = new HashMap();
        this.f7009j = new AtomicBoolean();
        this.f7011l = false;
        this.f7012m = true;
        this.n = false;
        this.f7013p = null;
    }

    public static void c(Context context) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            context = a3;
        }
        k8 k8Var = (k8) com.startapp.sdk.components.a.a(context).f6581y.a();
        k8Var.f7181a.post(new C(context, 0));
    }

    public static boolean d(Context context) {
        SharedPreferences sharedPreferences = (SharedPreferences) com.startapp.sdk.components.a.a(context).f6549I.a();
        if (sharedPreferences.contains("isma")) {
            return sharedPreferences.getBoolean("isma", false) ? sharedPreferences.contains("iscd") && !sharedPreferences.getBoolean("iscd", false) : (sharedPreferences.contains("iscd") && sharedPreferences.getBoolean("iscd", false)) ? false : true;
        }
        if (sharedPreferences.contains("iscd")) {
            return !sharedPreferences.getBoolean("iscd", false);
        }
        return true;
    }

    public static void e(Context context) {
        fh.f6918a.a(context, null, null, null, null, true);
    }

    public final void a(Context context, final String str, final String str2, final SDKAdPreferences sDKAdPreferences, final Runnable runnable) {
        Context a3 = w0.a(context);
        final Context context2 = a3 != null ? a3 : context;
        try {
            ((pf) com.startapp.sdk.components.a.a(context2).f6578u.a()).a(256);
        } catch (Throwable unused) {
        }
        ((k8) com.startapp.sdk.components.a.a(context2).f6581y.a()).f7181a.post(new Runnable() { // from class: com.startapp.sdk.internal.B
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
        sf sfVar = (sf) com.startapp.sdk.components.a.a(context).f6547G.a();
        int i4 = sfVar.getInt("shared_prefs_app_version_id", -1);
        int a3 = p0.a(context);
        if (i4 > 0 && a3 > i4) {
            this.n = true;
        }
        rf edit = sfVar.edit();
        edit.a("shared_prefs_app_version_id", Integer.valueOf(a3));
        edit.f7532a.putInt("shared_prefs_app_version_id", a3);
        edit.apply();
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a a3 = com.startapp.sdk.components.a.a(context);
        rf edit = ((sf) a3.f6547G.a()).edit();
        Boolean bool = Boolean.FALSE;
        edit.a("periodicInfoEventPaused", bool);
        edit.f7532a.putBoolean("periodicInfoEventPaused", false);
        edit.a("periodicMetadataPaused", bool);
        edit.f7532a.putBoolean("periodicMetadataPaused", false);
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
        if (application == null || this.f7016s != null) {
            return;
        }
        v0 v0Var = new v0(this);
        this.f7016s = v0Var;
        application.registerActivityLifecycleCallbacks(v0Var);
        try {
            kf kfVar = ((pf) com.startapp.sdk.components.a.a(context).f6578u.a()).f7453e;
            if (kfVar == null) {
                throw new RuntimeException();
            }
            application.registerActivityLifecycleCallbacks(kfVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:46|(1:48)|(6:49|50|51|52|(1:54)|56)|(14:58|(1:60)|61|62|63|(3:65|66|(3:68|(4:74|75|76|(3:81|82|83)(3:78|79|80))(3:70|71|72)|73)(1:84))|108|85|86|(2:88|(1:92))|93|(4:95|(1:97)|98|99)|(1:104)|105)|111|61|62|63|(0)|108|85|86|(0)|93|(0)|(2:102|104)|105) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cb, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b A[Catch: all -> 0x018e, TryCatch #5 {all -> 0x018e, blocks: (B:50:0x012f, B:56:0x0152, B:58:0x0185, B:62:0x0197, B:66:0x01a9, B:68:0x01ac, B:75:0x01be, B:86:0x01ce, B:88:0x021b, B:90:0x0228, B:92:0x022c, B:93:0x0236, B:95:0x024d, B:97:0x0257, B:98:0x025a, B:111:0x0191, B:113:0x014f, B:52:0x0140, B:54:0x0148), top: B:49:0x012f, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024d A[Catch: all -> 0x018e, TryCatch #5 {all -> 0x018e, blocks: (B:50:0x012f, B:56:0x0152, B:58:0x0185, B:62:0x0197, B:66:0x01a9, B:68:0x01ac, B:75:0x01be, B:86:0x01ce, B:88:0x021b, B:90:0x0228, B:92:0x022c, B:93:0x0236, B:95:0x024d, B:97:0x0257, B:98:0x025a, B:111:0x0191, B:113:0x014f, B:52:0x0140, B:54:0x0148), top: B:49:0x012f, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, Runnable runnable, boolean z) {
        boolean z4;
        MetaDataRequest$RequestReason metaDataRequest$RequestReason;
        boolean z5;
        com.startapp.sdk.components.a a3;
        boolean z6;
        boolean contains;
        WeakHashMap weakHashMap = si.f7575a;
        int i4 = f6998u;
        boolean z7 = false;
        if (i4 == 0 && z) {
            ec ecVar = new ec(context);
            if (ecVar.f6854c != null || ecVar.f6855d != null) {
                rf edit = ((sf) com.startapp.sdk.components.a.a(context).f6549I.a()).edit();
                Boolean bool = ecVar.f6854c;
                if (bool != null) {
                    boolean equals = Boolean.TRUE.equals(bool);
                    edit.a("isma", Boolean.valueOf(equals));
                    edit.f7532a.putBoolean("isma", equals);
                }
                Boolean bool2 = ecVar.f6855d;
                if (bool2 != null) {
                    boolean equals2 = Boolean.TRUE.equals(bool2);
                    edit.a("iscd", Boolean.valueOf(equals2));
                    edit.f7532a.putBoolean("iscd", equals2);
                }
                edit.apply();
            }
            StartAppSDK.enableConsent(context, ecVar.f6853b);
            str2 = ecVar.f6852a;
            if (TextUtils.isEmpty(str2)) {
                q0 q0Var = (q0) com.startapp.sdk.components.a.a(context).f6572m.a();
                synchronized (q0Var.f7466a) {
                    contains = q0Var.f7467b.contains("2696a7f502faed4b");
                }
                if (contains) {
                    str2 = q0Var.a();
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                z = false;
            }
        }
        R1.e eVar = new R1.e(context, 26, runnable);
        int i5 = v;
        eh ehVar = new eh(context, eVar, i5 == 1 || i5 == 2, i5 == 2);
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        MetaData.E().a(new ah(new Handler(myLooper), ehVar));
        int i6 = z ? 1 : 2;
        if (i6 > i4) {
            f6998u = i6;
            if (z) {
                metaDataRequest$RequestReason = MetaDataRequest$RequestReason.IMPLICIT_LAUNCH;
            } else {
                MetaDataRequest$RequestReason metaDataRequest$RequestReason2 = MetaDataRequest$RequestReason.LAUNCH;
                if (TextUtils.isEmpty(str2)) {
                    if (!si.d(context)) {
                        int i7 = p0.f7428a;
                        try {
                            z5 = u6.a(context);
                        } catch (Throwable unused) {
                            z5 = false;
                        }
                        if (!z5) {
                            Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                        }
                    }
                    throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
                }
                ((q0) com.startapp.sdk.components.a.a(context).f6572m.a()).a(str, str2);
                this.f7000a = sDKAdPreferences;
                e7.d(context, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
                metaDataRequest$RequestReason = metaDataRequest$RequestReason2;
            }
            if (i4 == 0) {
                if (((Random) si.f7578d.a()).nextDouble() < 0.0d) {
                    Log.i("StartAppSDK", "!SDK-VERSION-STRING!:com.startapp.startappsdk:inapp-sdk:5.3.0");
                }
                try {
                    a3 = com.startapp.sdk.components.a.a(context);
                    a3.L.a();
                    i0 i0Var = (i0) a3.f6550J.a();
                    try {
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        if (!(defaultUncaughtExceptionHandler instanceof i0)) {
                            Thread.setDefaultUncaughtExceptionHandler(i0Var);
                            i0Var.f7075a = defaultUncaughtExceptionHandler;
                        }
                    } catch (Throwable th) {
                        d9.a(th);
                    }
                    u0 u0Var = (u0) a3.f6556Q.a();
                    u0Var.f7637a.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    u0Var.f7640d = elapsedRealtime;
                    u0Var.f7641e = elapsedRealtime;
                    ((t9) a3.f6574q.a()).a();
                    ((j0) a3.f6560a.a()).a();
                } catch (Throwable th2) {
                    d9.a(th2);
                }
                if (p0.a(context, "android.permission.INTERNET")) {
                    if (!p0.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    }
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                    z6 = false;
                    int i8 = 0;
                    while (!z6) {
                        try {
                            if (i8 >= activityInfoArr.length) {
                                break;
                            }
                            int i9 = i8 + 1;
                            ActivityInfo activityInfo = activityInfoArr[i8];
                            if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                                int i10 = activityInfo.flags & 512;
                                i8 = i9;
                                z6 = i10 == 0;
                            } else {
                                i8 = i9;
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused2) {
                        }
                    }
                    this.f7012m = !z6;
                    ((com.startapp.sdk.common.advertisingid.b) a3.f6567h.a()).a(d(context));
                    b(context);
                    com.startapp.sdk.adsbase.g.c(context);
                    ((di) a3.f6558S.a()).b();
                    ((zc) a3.f6559T.a()).a();
                    a3.f6548H.a();
                    i6.f7084a = new CookieManager(new ge(context), CookiePolicy.ACCEPT_ALL);
                    f(context);
                    a(context);
                    g(context);
                    if (context instanceof Application) {
                        Application application = (Application) context;
                        this.f7006g = application;
                        if (this.f7009j.compareAndSet(false, true) && this.f7008i == null) {
                            dh dhVar = new dh();
                            application.registerActivityLifecycleCallbacks(dhVar);
                            this.f7008i = dhVar;
                        }
                    }
                    MetaData.E().a((g6) a3.f6569j.a());
                    WeakHashMap weakHashMap2 = si.f7575a;
                    if (MetaData.c(context)) {
                        AdsCommonMetaData.a(context);
                        BannerMetaData.a(context);
                        if (this.f7001b) {
                            CacheMetaData.a(context);
                        }
                        AdInformationMetaData.b(context);
                        z7 = true;
                    }
                    if (z7 && v == 0) {
                        v = 1;
                    }
                    WeakHashMap weakHashMap3 = si.f7575a;
                    ehVar.f6873c = z7;
                }
                si.a(6, context, "Please grant the mandatory permissions : INTERNET & ACCESS_NETWORK_STATE, SDK could not be initialized.");
                ActivityInfo[] activityInfoArr2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
                z6 = false;
                int i82 = 0;
                while (!z6) {
                }
                this.f7012m = !z6;
                ((com.startapp.sdk.common.advertisingid.b) a3.f6567h.a()).a(d(context));
                b(context);
                com.startapp.sdk.adsbase.g.c(context);
                ((di) a3.f6558S.a()).b();
                ((zc) a3.f6559T.a()).a();
                a3.f6548H.a();
                i6.f7084a = new CookieManager(new ge(context), CookiePolicy.ACCEPT_ALL);
                f(context);
                a(context);
                g(context);
                if (context instanceof Application) {
                }
                MetaData.E().a((g6) a3.f6569j.a());
                WeakHashMap weakHashMap22 = si.f7575a;
                if (MetaData.c(context)) {
                }
                if (z7) {
                    v = 1;
                }
                WeakHashMap weakHashMap32 = si.f7575a;
                ehVar.f6873c = z7;
            }
            mg.f7288d.a(context, metaDataRequest$RequestReason);
        } else if (!z && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                if (!si.d(context)) {
                    int i11 = p0.f7428a;
                    try {
                        z4 = u6.a(context);
                    } catch (Throwable unused3) {
                        z4 = false;
                    }
                    if (!z4) {
                        Log.w("StartAppSDK", new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n"));
                    }
                }
                throw new IllegalArgumentException("\n+-------------------------------------------------------------+\n|                S   T   A   R   T   A   P   P                |\n| - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - |\n| Invalid App ID passed to init, please provide valid App ID  |\n|                                                             |\n|   https://support.start.io/hc/en-us/articles/360014774799   |\n+-------------------------------------------------------------+\n");
            }
            z7 = ((q0) com.startapp.sdk.components.a.a(context).f6572m.a()).a(str, str2);
            if (z7) {
                mg.f7288d.a(context, MetaDataRequest$RequestReason.LAUNCH);
            }
        }
        ehVar.f6875e = true;
        WeakHashMap weakHashMap4 = si.f7575a;
        if (!(ehVar.f6873c ? ehVar.f6874d : true) || ehVar.f6872b) {
            return;
        }
        ehVar.f6872b = true;
        g0.a(ehVar.f6871a);
    }

    public static void a(Context context, Runnable runnable) {
        if (!f6999w) {
            f6999w = true;
            String str = "StartApp SDK initialized, version " + StartAppSDK.getVersion();
            WeakHashMap weakHashMap = si.f7575a;
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
        rf edit = ((sf) com.startapp.sdk.components.a.a(context).f6547G.a()).edit();
        edit.a("chromeTabs", Boolean.valueOf(z));
        edit.f7532a.putBoolean("chromeTabs", z);
        edit.apply();
    }
}
