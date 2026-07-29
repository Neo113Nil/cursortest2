package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static String f2309a = "Volley";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2310b = Log.isLoggable(f2309a, 2);

    public static void a(String str, Object... objArr) {
        if (f2310b) {
            Log.v(f2309a, e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        Log.d(f2309a, e(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f2309a, e(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f2309a, e(str, objArr), th);
    }

    public static void d(String str, Object... objArr) {
        Log.wtf(f2309a, e(str, objArr));
    }

    private static String e(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            }
            if (!stackTrace[i].getClass().equals(t.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String valueOf = String.valueOf(String.valueOf(substring.substring(substring.lastIndexOf(36) + 1)));
                String valueOf2 = String.valueOf(String.valueOf(stackTrace[i].getMethodName()));
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
                sb.append(valueOf);
                sb.append(".");
                sb.append(valueOf2);
                str2 = sb.toString();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* compiled from: VolleyLog.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f2311a = t.f2310b;

        /* renamed from: b, reason: collision with root package name */
        private final List<C0297a> f2312b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private boolean f2313c = false;

        a() {
        }

        /* compiled from: VolleyLog.java */
        /* renamed from: com.android.volley.t$a$a, reason: collision with other inner class name */
        private static class C0297a {

            /* renamed from: a, reason: collision with root package name */
            public final String f2314a;

            /* renamed from: b, reason: collision with root package name */
            public final long f2315b;

            /* renamed from: c, reason: collision with root package name */
            public final long f2316c;

            public C0297a(String str, long j, long j2) {
                this.f2314a = str;
                this.f2315b = j;
                this.f2316c = j2;
            }
        }

        public synchronized void a(String str, long j) {
            if (this.f2313c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f2312b.add(new C0297a(str, j, SystemClock.elapsedRealtime()));
        }

        public synchronized void a(String str) {
            this.f2313c = true;
            long a2 = a();
            if (a2 <= 0) {
                return;
            }
            long j = this.f2312b.get(0).f2316c;
            t.b("(%-4d ms) %s", Long.valueOf(a2), str);
            for (C0297a c0297a : this.f2312b) {
                long j2 = c0297a.f2316c;
                t.b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(c0297a.f2315b), c0297a.f2314a);
                j = j2;
            }
        }

        protected void finalize() throws Throwable {
            if (this.f2313c) {
                return;
            }
            a("Request on the loose");
            t.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }

        private long a() {
            if (this.f2312b.size() == 0) {
                return 0L;
            }
            return this.f2312b.get(this.f2312b.size() - 1).f2316c - this.f2312b.get(0).f2316c;
        }
    }
}
