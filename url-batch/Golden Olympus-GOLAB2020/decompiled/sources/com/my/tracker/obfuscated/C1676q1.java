package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.b9;
import com.ironsource.c9;

/* renamed from: com.my.tracker.obfuscated.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1676q1 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C1676q1 f21503b;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f21504a;

    private C1676q1(SharedPreferences sharedPreferences) {
        this.f21504a = sharedPreferences;
    }

    public String a() {
        return c(b9.i.f15541W);
    }

    public long b() {
        return b("appGalleryTrackedTime");
    }

    public String c() {
        return c("appId");
    }

    public String d() {
        return c("appSetId");
    }

    public long e() {
        return b("appSetIdScope");
    }

    public String f() {
        return c("appVersionName");
    }

    public String g() {
        return c("appsHash");
    }

    public String h() {
        return c(c9.f15699c);
    }

    public String i() {
        return c("firebaseAppInstanceId");
    }

    public long j() {
        return b("installTimestamp");
    }

    public String k() {
        return c("instanceId");
    }

    public long l() {
        return b("lastUpdateTimestamp");
    }

    public String m() {
        return c("referrer");
    }

    public long n() {
        long b4 = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return b4;
    }

    public boolean o() {
        return a("apiReferrerSent");
    }

    public boolean p() {
        return a("huaweiApiReferrerSent");
    }

    public boolean q() {
        return a("preinstallRead");
    }

    public boolean r() {
        return a("referrerSent");
    }

    public void s() {
        a("apiReferrerSent", true);
    }

    public void t() {
        a("huaweiApiReferrerSent", true);
    }

    public void u() {
        a("preinstallRead", true);
    }

    public void v() {
        a("referrerSent", true);
    }

    boolean a(String str) {
        try {
            return this.f21504a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    long b(String str) {
        try {
            return this.f21504a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    String c(String str) {
        try {
            return this.f21504a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public void d(String str) {
        a(b9.i.f15541W, str);
    }

    public void e(String str) {
        a("appId", str);
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a(c9.f15699c, str);
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public void l(String str) {
        a("referrer", str);
    }

    public static C1676q1 a(Context context) {
        C1676q1 c1676q1;
        C1676q1 c1676q12 = f21503b;
        if (c1676q12 != null) {
            return c1676q12;
        }
        synchronized (C1676q1.class) {
            try {
                c1676q1 = f21503b;
                if (c1676q1 == null) {
                    c1676q1 = new C1676q1(context.getSharedPreferences("mytracker_prefs", 0));
                    f21503b = c1676q1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1676q1;
    }

    public void b(long j4) {
        a("installTimestamp", j4);
    }

    public void c(long j4) {
        a("lastUpdateTimestamp", j4);
    }

    public void d(long j4) {
        a("lastStopTimeStampSec", j4);
    }

    void a(String str, boolean z4) {
        try {
            this.f21504a.edit().putBoolean(str, z4).commit();
        } catch (Throwable th) {
            AbstractC1708y2.a("PrefsCache error: ", th);
        }
    }

    void a(String str, long j4) {
        try {
            this.f21504a.edit().putLong(str, j4).commit();
        } catch (Throwable th) {
            AbstractC1708y2.a("PrefsCache error: ", th);
        }
    }

    void a(String str, String str2) {
        try {
            this.f21504a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            AbstractC1708y2.a("PrefsCache error: ", th);
        }
    }

    public void a(long j4) {
        a("appGalleryTrackedTime", j4);
    }

    public void a(int i4) {
        a("appSetIdScope", i4);
    }
}
