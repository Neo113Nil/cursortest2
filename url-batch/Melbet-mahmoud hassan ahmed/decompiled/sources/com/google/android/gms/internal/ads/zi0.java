package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zi0 {
    private int A;
    private final String B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private int f15130a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15131b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f15132c;

    /* renamed from: d, reason: collision with root package name */
    private int f15133d;

    /* renamed from: e, reason: collision with root package name */
    private int f15134e;

    /* renamed from: f, reason: collision with root package name */
    private int f15135f;

    /* renamed from: g, reason: collision with root package name */
    private String f15136g;

    /* renamed from: h, reason: collision with root package name */
    private int f15137h;

    /* renamed from: i, reason: collision with root package name */
    private int f15138i;

    /* renamed from: j, reason: collision with root package name */
    private int f15139j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15140k;

    /* renamed from: l, reason: collision with root package name */
    private int f15141l;

    /* renamed from: m, reason: collision with root package name */
    private double f15142m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f15143n;

    /* renamed from: o, reason: collision with root package name */
    private String f15144o;

    /* renamed from: p, reason: collision with root package name */
    private String f15145p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f15146q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f15147r;

    /* renamed from: s, reason: collision with root package name */
    private final String f15148s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f15149t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f15150u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f15151v;

    /* renamed from: w, reason: collision with root package name */
    private final String f15152w;

    /* renamed from: x, reason: collision with root package name */
    private final String f15153x;

    /* renamed from: y, reason: collision with root package name */
    private float f15154y;

    /* renamed from: z, reason: collision with root package name */
    private int f15155z;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:23|24)(1:22)))|9|10|11|12|(0)|16|(1:18)(3:20|23|24)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1 A[Catch: Exception -> 0x00c2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c2, blocks: (B:12:0x0093, B:14:0x00a1), top: B:11:0x0093 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zi0(Context context) {
        ActivityInfo activityInfo;
        PackageInfo f7;
        String sb;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo f8;
        PackageManager packageManager = context.getPackageManager();
        c(context);
        e(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f15146q = b(packageManager, "geo:0,0?q=donuts") != null;
        this.f15147r = b(packageManager, "http://www.google.com") != null;
        this.f15148s = locale.getCountry();
        y2.t.q();
        qw.b();
        this.f15149t = bo0.m();
        this.f15150u = v3.h.c(context);
        this.f15151v = v3.h.d(context);
        this.f15152w = locale.getLanguage();
        ResolveInfo b7 = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str = null;
        if (b7 != null && (activityInfo = b7.activityInfo) != null) {
            try {
                f7 = w3.c.a(context).f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (f7 != null) {
                int i7 = f7.versionCode;
                String str2 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                sb2.append(i7);
                sb2.append(".");
                sb2.append(str2);
                sb = sb2.toString();
                this.f15153x = sb;
                f8 = w3.c.a(context).f("com.android.vending", 128);
                if (f8 != null) {
                    int i8 = f8.versionCode;
                    String str3 = f8.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 12);
                    sb3.append(i8);
                    sb3.append(".");
                    sb3.append(str3);
                    str = sb3.toString();
                }
                this.B = str;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f15154y = displayMetrics.density;
                    this.f15155z = displayMetrics.widthPixels;
                    this.A = displayMetrics.heightPixels;
                }
                return;
            }
        }
        sb = null;
        this.f15153x = sb;
        f8 = w3.c.a(context).f("com.android.vending", 128);
        if (f8 != null) {
        }
        this.B = str;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f15154y = displayMetrics.density;
        this.f15155z = displayMetrics.widthPixels;
        this.A = displayMetrics.heightPixels;
    }

    public zi0(Context context, aj0 aj0Var) {
        c(context);
        e(context);
        d(context);
        this.f15144o = Build.FINGERPRINT;
        this.f15145p = Build.DEVICE;
        boolean z6 = false;
        if (v3.l.a() && l20.g(context)) {
            z6 = true;
        }
        this.C = z6;
        this.f15146q = aj0Var.f2828a;
        this.f15147r = aj0Var.f2829b;
        this.f15148s = aj0Var.f2831d;
        this.f15149t = aj0Var.f2832e;
        this.f15150u = aj0Var.f2833f;
        this.f15151v = aj0Var.f2834g;
        this.f15152w = aj0Var.f2835h;
        this.f15153x = aj0Var.f2836i;
        this.B = aj0Var.f2837j;
        this.f15154y = aj0Var.f2840m;
        this.f15155z = aj0Var.f2841n;
        this.A = aj0Var.f2842o;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            y2.t.p().s(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f15130a = audioManager.getMode();
                this.f15131b = audioManager.isMusicActive();
                this.f15132c = audioManager.isSpeakerphoneOn();
                this.f15133d = audioManager.getStreamVolume(3);
                this.f15134e = audioManager.getRingerMode();
                this.f15135f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                y2.t.p().s(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f15130a = -2;
        this.f15131b = false;
        this.f15132c = false;
        this.f15133d = 0;
        this.f15134e = 2;
        this.f15135f = 0;
    }

    private final void d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            this.f15142m = -1.0d;
            this.f15143n = false;
        } else {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f15142m = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            this.f15143n = intExtra == 2 || intExtra == 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15136g = telephonyManager.getNetworkOperator();
        if (v3.l.k()) {
            if (((Boolean) sw.c().b(m10.f8247l6)).booleanValue()) {
                networkType = 0;
                this.f15138i = networkType;
                this.f15139j = telephonyManager.getPhoneType();
                this.f15137h = -2;
                this.f15140k = false;
                this.f15141l = -1;
                y2.t.q();
                if (a3.g2.f(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.f15137h = activeNetworkInfo.getType();
                    this.f15141l = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.f15137h = -1;
                }
                this.f15140k = connectivityManager.isActiveNetworkMetered();
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.f15138i = networkType;
        this.f15139j = telephonyManager.getPhoneType();
        this.f15137h = -2;
        this.f15140k = false;
        this.f15141l = -1;
        y2.t.q();
        if (a3.g2.f(context, "android.permission.ACCESS_NETWORK_STATE")) {
        }
    }

    public final aj0 a() {
        return new aj0(this.f15130a, this.f15146q, this.f15147r, this.f15136g, this.f15148s, this.f15149t, this.f15150u, this.f15151v, this.f15131b, this.f15132c, this.f15152w, this.f15153x, this.B, this.f15133d, this.f15137h, this.f15138i, this.f15139j, this.f15134e, this.f15135f, this.f15154y, this.f15155z, this.A, this.f15142m, this.f15143n, this.f15140k, this.f15141l, this.f15144o, this.C, this.f15145p);
    }
}
