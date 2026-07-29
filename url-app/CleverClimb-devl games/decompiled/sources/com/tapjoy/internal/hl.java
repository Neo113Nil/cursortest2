package com.tapjoy.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class hl {

    /* renamed from: a, reason: collision with root package name */
    protected static a f8290a;

    /* renamed from: b, reason: collision with root package name */
    private static hl f8291b;

    public abstract void a(a aVar);

    public abstract boolean b();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8292a;

        /* renamed from: b, reason: collision with root package name */
        public final String f8293b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8294c = SystemClock.elapsedRealtime();

        /* renamed from: d, reason: collision with root package name */
        public final fj f8295d = new fj(60000);

        public a(String str, String str2) {
            this.f8292a = str;
            this.f8293b = str2;
        }
    }

    protected static void a(hl hlVar) {
        synchronized (hl.class) {
            f8291b = hlVar;
            a aVar = f8290a;
            if (aVar != null) {
                f8290a = null;
                hlVar.a(aVar);
            }
        }
    }

    public static void a(String str, String str2) {
        synchronized (hl.class) {
            a aVar = new a(str, str2);
            if (f8291b != null) {
                f8290a = null;
                f8291b.a(aVar);
            } else {
                f8290a = aVar;
            }
        }
    }

    public static boolean c() {
        if (f8291b != null && f8291b.b()) {
            return true;
        }
        a aVar = f8290a;
        return (aVar == null || aVar.f8295d.a()) ? false : true;
    }
}
