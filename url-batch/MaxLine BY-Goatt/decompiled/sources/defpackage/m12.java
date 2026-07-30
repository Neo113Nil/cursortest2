package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class m12 implements ca0 {
    public boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(m12 m12Var, n12 n12Var) {
        m12Var.getClass();
        if (n12Var instanceof jm1) {
            ((jm1) n12Var).m(m12Var.m);
        }
    }

    public static void g(m12 m12Var, n12 n12Var, int i, int i2) {
        m12Var.getClass();
        a(m12Var, n12Var);
        n12Var.i0(s31.c((i2 & 4294967295L) | (i << 32), n12Var.q), 0.0f, null);
    }

    public static void h(m12 m12Var, n12 n12Var, long j) {
        m12Var.getClass();
        a(m12Var, n12Var);
        n12Var.i0(s31.c(j, n12Var.q), 0.0f, null);
    }

    public static void i(m12 m12Var, n12 n12Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (m12Var.c() == u81.m || m12Var.e() == 0) {
            a(m12Var, n12Var);
            n12Var.i0(s31.c(j, n12Var.q), 0.0f, null);
        } else {
            int e = (m12Var.e() - n12Var.m) - ((int) (j >> 32));
            a(m12Var, n12Var);
            n12Var.i0(s31.c((e << 32) | (((int) (j & 4294967295L)) & 4294967295L), n12Var.q), 0.0f, null);
        }
    }

    public static void j(m12 m12Var, n12 n12Var, int i, int i2) {
        int i3 = o12.b;
        gs1 gs1Var = gs1.y;
        long j = (i << 32) | (i2 & 4294967295L);
        if (m12Var.c() == u81.m || m12Var.e() == 0) {
            a(m12Var, n12Var);
            n12Var.i0(s31.c(j, n12Var.q), 0.0f, gs1Var);
        } else {
            int e = (m12Var.e() - n12Var.m) - ((int) (j >> 32));
            a(m12Var, n12Var);
            n12Var.i0(s31.c((e << 32) | (((int) (j & 4294967295L)) & 4294967295L), n12Var.q), 0.0f, gs1Var);
        }
    }

    public static void l(m12 m12Var, n12 n12Var, Function1 function1) {
        m12Var.getClass();
        a(m12Var, n12Var);
        n12Var.i0(s31.c(0L, n12Var.q), 0.0f, function1);
    }

    public static void m(m12 m12Var, n12 n12Var, long j) {
        int i = o12.b;
        gs1 gs1Var = gs1.y;
        m12Var.getClass();
        a(m12Var, n12Var);
        n12Var.i0(s31.c(j, n12Var.q), 0.0f, gs1Var);
    }

    public float b(ay0 ay0Var) {
        return Float.NaN;
    }

    public abstract u81 c();

    public abstract int e();
}
