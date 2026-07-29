package com.appsflyer;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static long f3441a = System.currentTimeMillis();

    public enum a {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private int g;

        a(int i) {
            this.g = i;
        }

        public final int a() {
            return this.g;
        }
    }

    public static void a(String str, boolean z) {
        if (a.INFO.a() <= j.a().a("logLevel", a.NONE.a())) {
            Log.i("AppsFlyer_4.8.10", b(str, false));
        }
        if (z) {
            ag.a().b("I", b(str, true));
        }
    }

    public static void a() {
        f3441a = System.currentTimeMillis();
    }

    private static String b(String str, boolean z) {
        if (!z && a.VERBOSE.a() != j.a().a("logLevel", a.NONE.a())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(a(System.currentTimeMillis() - f3441a));
        sb.append(") ");
        sb.append(str);
        return sb.toString();
    }

    private static void a(String str, Throwable th, boolean z) {
        if ((a.ERROR.a() <= j.a().a("logLevel", a.NONE.a())) && z) {
            Log.e("AppsFlyer_4.8.10", b(str, false), th);
        }
        ag.a().a(th);
    }

    public static void a(String str) {
        if (a.VERBOSE.a() <= j.a().a("logLevel", a.NONE.a())) {
            Log.v("AppsFlyer_4.8.10", b(str, false));
        }
        ag.a().b("V", b(str, true));
    }

    public static void d(String str) {
        a(str, true);
    }

    public static void a(String str, Throwable th) {
        a(str, th, false);
    }

    private static String a(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long millis = j - TimeUnit.HOURS.toMillis(hours);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
        long millis2 = millis - TimeUnit.MINUTES.toMillis(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis2);
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(millis2 - TimeUnit.SECONDS.toMillis(seconds))));
    }

    static void b(String str) {
        if (!j.a().e()) {
            Log.d("AppsFlyer_4.8.10", b(str, false));
        }
        ag.a().b("F", str);
    }

    public static void c(String str) {
        if (a.DEBUG.a() <= j.a().a("logLevel", a.NONE.a())) {
            Log.d("AppsFlyer_4.8.10", b(str, false));
        }
        ag.a().b("D", b(str, true));
    }

    public static void e(String str) {
        if (a.WARNING.a() <= j.a().a("logLevel", a.NONE.a())) {
            Log.w("AppsFlyer_4.8.10", b(str, false));
        }
        ag.a().b("W", b(str, true));
    }
}
