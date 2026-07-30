package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class jz2 {
    public static final y91 a = ya1.a(kc1.m, o00.Q);

    public static final bz2 a(fz2 fz2Var, k03 k03Var, String str, a00 a00Var, int i, int i2) {
        az2 az2Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f = a00Var.f(fz2Var);
        Object M = a00Var.M();
        Object obj = sz.a;
        if (f || M == obj) {
            M = new bz2(fz2Var, k03Var, str);
            a00Var.i0(M);
        }
        bz2 bz2Var = (bz2) M;
        boolean f2 = a00Var.f(fz2Var) | a00Var.h(bz2Var);
        Object M2 = a00Var.M();
        if (f2 || M2 == obj) {
            M2 = new ih2(10, fz2Var, bz2Var);
            a00Var.i0(M2);
        }
        l41.f(bz2Var, (Function1) M2, a00Var);
        if (fz2Var.g() && (az2Var = (az2) bz2Var.b.getValue()) != null) {
            fz2 fz2Var2 = bz2Var.c;
            az2Var.m.h(az2Var.o.invoke(fz2Var2.f().b()), az2Var.o.invoke(fz2Var2.f().c()), (bm0) az2Var.n.invoke(fz2Var2.f()));
        }
        return bz2Var;
    }

    public static final ez2 b(fz2 fz2Var, Object obj, Object obj2, bm0 bm0Var, k03 k03Var, a00 a00Var) {
        boolean f = a00Var.f(fz2Var);
        Object M = a00Var.M();
        Object obj3 = sz.a;
        if (f || M == obj3) {
            sd sdVar = (sd) k03Var.a.invoke(obj2);
            sdVar.d();
            M = new ez2(fz2Var, obj, sdVar, k03Var);
            a00Var.i0(M);
        }
        ez2 ez2Var = (ez2) M;
        if (fz2Var.g()) {
            ez2Var.h(obj, obj2, bm0Var);
        } else {
            ez2Var.i(obj2, bm0Var);
        }
        boolean f2 = a00Var.f(fz2Var) | a00Var.f(ez2Var);
        Object M2 = a00Var.M();
        if (f2 || M2 == obj3) {
            M2 = new ih2(11, fz2Var, ez2Var);
            a00Var.i0(M2);
        }
        l41.f(ez2Var, (Function1) M2, a00Var);
        return ez2Var;
    }
}
