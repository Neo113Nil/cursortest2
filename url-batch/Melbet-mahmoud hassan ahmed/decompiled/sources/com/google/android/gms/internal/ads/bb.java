package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class bb {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f3306c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile y23 f3307d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f3308e = null;

    /* renamed from: a, reason: collision with root package name */
    private final gc f3309a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f3310b;

    public bb(gc gcVar) {
        this.f3309a = gcVar;
        gcVar.k().execute(new ab(this));
    }

    public static final int d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : e().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }

    private static Random e() {
        if (f3308e == null) {
            synchronized (bb.class) {
                if (f3308e == null) {
                    f3308e = new Random();
                }
            }
        }
        return f3308e;
    }

    public final void c(int i7, int i8, long j7, String str, Exception exc) {
        try {
            f3306c.block();
            if (!this.f3310b.booleanValue() || f3307d == null) {
                return;
            }
            v7 F = z7.F();
            F.r(this.f3309a.f5536a.getPackageName());
            F.v(j7);
            if (str != null) {
                F.s(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                F.w(stringWriter.toString());
                F.u(exc.getClass().getName());
            }
            x23 a7 = f3307d.a(F.o().d());
            a7.a(i7);
            if (i8 != -1) {
                a7.b(i8);
            }
            a7.c();
        } catch (Exception unused) {
        }
    }
}
