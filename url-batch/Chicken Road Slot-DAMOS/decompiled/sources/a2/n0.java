package a2;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n0 implements x2.c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n0 n0Var, o0 o0Var) {
        n0Var.getClass();
        if (o0Var instanceof c2.y0) {
            ((c2.y0) o0Var).q();
        }
    }

    public static void o(n0 n0Var, o0 o0Var, long j) {
        n0Var.getClass();
        a(n0Var, o0Var);
        o0Var.Z(x2.i.c(j, o0Var.f135s), 0.0f, null);
    }

    public static void p(n0 n0Var, o0 o0Var, int i3, int i10) {
        long j = (i3 << 32) | (i10 & 4294967295L);
        if (n0Var.c() == x2.l.f10330d || n0Var.e() == 0) {
            a(n0Var, o0Var);
            o0Var.Z(x2.i.c(j, o0Var.f135s), 0.0f, null);
        } else {
            int e2 = (n0Var.e() - o0Var.f131d) - ((int) (j >> 32));
            a(n0Var, o0Var);
            o0Var.Z(x2.i.c((e2 << 32) | (((int) (j & 4294967295L)) & 4294967295L), o0Var.f135s), 0.0f, null);
        }
    }

    public static void q(n0 n0Var, o0 o0Var) {
        int i3 = q0.f142b;
        p0 p0Var = p0.f136e;
        long j = 0;
        long j3 = (j & 4294967295L) | (j << 32);
        if (n0Var.c() == x2.l.f10330d || n0Var.e() == 0) {
            a(n0Var, o0Var);
            o0Var.Z(x2.i.c(j3, o0Var.f135s), 0.0f, p0Var);
        } else {
            int e2 = (n0Var.e() - o0Var.f131d) - ((int) (j3 >> 32));
            a(n0Var, o0Var);
            o0Var.Z(x2.i.c((e2 << 32) | (((int) (j3 & 4294967295L)) & 4294967295L), o0Var.f135s), 0.0f, p0Var);
        }
    }

    public static void v(n0 n0Var, o0 o0Var, Function1 function1) {
        n0Var.getClass();
        long j = 0;
        a(n0Var, o0Var);
        o0Var.Z(x2.i.c((j & 4294967295L) | (j << 32), o0Var.f135s), 0.0f, function1);
    }

    public float b(k kVar) {
        return Float.NaN;
    }

    public abstract x2.l c();

    public abstract int e();

    public final void h(o0 o0Var, int i3, int i10, float f3) {
        a(this, o0Var);
        o0Var.Z(x2.i.c((i10 & 4294967295L) | (i3 << 32), o0Var.f135s), f3, null);
    }
}
