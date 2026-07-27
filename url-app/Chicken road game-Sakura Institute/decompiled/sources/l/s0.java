package l;

import A.C0028y;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import kotlin.jvm.functions.Function1;
import y2.C1336k;
import y2.EnumC1337l;

/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f7840a = C1336k.b(EnumC1337l.f11671e, n0.f7818d);

    /* JADX WARN: Type inference failed for: r10v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [M2.p, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v3, types: [M2.p, kotlin.jvm.functions.Function1] */
    public static final g0 a(m0 m0Var, v0 v0Var, String str, C0216p c0216p, int i2, int i4) {
        f0 f0Var;
        if ((i4 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i5 = (i2 & 14) ^ 6;
        boolean z4 = true;
        boolean z5 = (i5 > 4 && c0216p.f(m0Var)) || (i2 & 6) == 4;
        Object I3 = c0216p.I();
        Object obj = C0208l.f2826a;
        if (z5 || I3 == obj) {
            I3 = new g0(m0Var, v0Var, str);
            c0216p.c0(I3);
        }
        g0 g0Var = (g0) I3;
        if ((i5 <= 4 || !c0216p.f(m0Var)) && (i2 & 6) != 4) {
            z4 = false;
        }
        boolean h4 = c0216p.h(g0Var) | z4;
        Object I4 = c0216p.I();
        if (h4 || I4 == obj) {
            I4 = new C0028y(m0Var, 21, g0Var);
            c0216p.c0(I4);
        }
        C0192d.d(g0Var, (Function1) I4, c0216p);
        if (m0Var.g() && (f0Var = (f0) g0Var.f7763b.getValue()) != null) {
            ?? r7 = f0Var.f7753i;
            m0 m0Var2 = g0Var.f7764c;
            f0Var.f7751d.f(r7.invoke(m0Var2.f().b()), f0Var.f7753i.invoke(m0Var2.f().c()), (InterfaceC0799z) f0Var.f7752e.invoke(m0Var2.f()));
        }
        return g0Var;
    }

    public static final j0 b(m0 m0Var, Object obj, Object obj2, InterfaceC0799z interfaceC0799z, v0 v0Var, C0216p c0216p, int i2) {
        boolean f4 = c0216p.f(m0Var);
        Object I3 = c0216p.I();
        Object obj3 = C0208l.f2826a;
        if (f4 || I3 == obj3) {
            AbstractC0792s abstractC0792s = (AbstractC0792s) v0Var.f7853a.invoke(obj2);
            abstractC0792s.d();
            I3 = new j0(m0Var, obj, abstractC0792s, v0Var);
            c0216p.c0(I3);
        }
        j0 j0Var = (j0) I3;
        if (m0Var.g()) {
            j0Var.f(obj, obj2, interfaceC0799z);
        } else {
            j0Var.g(obj2, interfaceC0799z);
        }
        boolean f5 = c0216p.f(m0Var) | c0216p.f(j0Var);
        Object I4 = c0216p.I();
        if (f5 || I4 == obj3) {
            I4 = new C0028y(m0Var, 22, j0Var);
            c0216p.c0(I4);
        }
        C0192d.d(j0Var, (Function1) I4, c0216p);
        return j0Var;
    }

    public static final m0 c(Object obj, String str, C0216p c0216p, int i2, int i4) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        Object I3 = c0216p.I();
        G.W w4 = C0208l.f2826a;
        if (I3 == w4) {
            I3 = new m0(new C0761F(obj), null, str);
            c0216p.c0(I3);
        }
        m0 m0Var = (m0) I3;
        m0Var.a(obj, c0216p, (i2 & 8) | 48 | (i2 & 14));
        Object I4 = c0216p.I();
        if (I4 == w4) {
            I4 = new r0(m0Var, 1);
            c0216p.c0(I4);
        }
        C0192d.d(m0Var, (Function1) I4, c0216p);
        return m0Var;
    }
}
