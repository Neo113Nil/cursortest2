package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class un0 {

    /* renamed from: g, reason: collision with root package name */
    final String f12867g;

    /* renamed from: h, reason: collision with root package name */
    private final a3.t1 f12868h;

    /* renamed from: a, reason: collision with root package name */
    long f12861a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f12862b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f12863c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f12864d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f12865e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f12866f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f12869i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f12870j = 0;

    public un0(String str, a3.t1 t1Var) {
        this.f12867g = str;
        this.f12868h = t1Var;
    }

    private final void g() {
        if (h30.f6054a.e().booleanValue()) {
            synchronized (this.f12866f) {
                this.f12863c--;
                this.f12864d--;
            }
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f12866f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f12868h.K() ? "" : this.f12867g);
            bundle.putLong("basets", this.f12862b);
            bundle.putLong("currts", this.f12861a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f12863c);
            bundle.putInt("preqs_in_session", this.f12864d);
            bundle.putLong("time_in_session", this.f12865e);
            bundle.putInt("pclick", this.f12869i);
            bundle.putInt("pimp", this.f12870j);
            Context a7 = kj0.a(context);
            int identifier = a7.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z6 = false;
            if (identifier == 0) {
                str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
            } else {
                try {
                    if (identifier == a7.getPackageManager().getActivityInfo(new ComponentName(a7.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z6 = true;
                    } else {
                        io0.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    io0.g("Fail to fetch AdActivity theme");
                    str2 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
                }
                bundle.putBoolean("support_transparent_background", z6);
            }
            io0.f(str2);
            bundle.putBoolean("support_transparent_background", z6);
        }
        return bundle;
    }

    public final void b() {
        synchronized (this.f12866f) {
            this.f12869i++;
        }
    }

    public final void c() {
        synchronized (this.f12866f) {
            this.f12870j++;
        }
    }

    public final void d() {
        g();
    }

    public final void e() {
        g();
    }

    public final void f(kv kvVar, long j7) {
        synchronized (this.f12866f) {
            long c7 = this.f12868h.c();
            long b7 = y2.t.a().b();
            if (this.f12862b == -1) {
                if (b7 - c7 > ((Long) sw.c().b(m10.H0)).longValue()) {
                    this.f12864d = -1;
                } else {
                    this.f12864d = this.f12868h.a();
                }
                this.f12862b = j7;
            }
            this.f12861a = j7;
            Bundle bundle = kvVar.f7645h;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.f12863c++;
            int i7 = this.f12864d + 1;
            this.f12864d = i7;
            if (i7 == 0) {
                this.f12865e = 0L;
                this.f12868h.N(b7);
            } else {
                this.f12865e = b7 - this.f12868h.g();
            }
        }
    }
}
