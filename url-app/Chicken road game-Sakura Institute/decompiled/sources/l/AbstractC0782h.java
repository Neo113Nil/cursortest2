package l;

import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.InterfaceC0191c0;
import G.X0;
import a.AbstractC0345a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0782h {

    /* renamed from: a, reason: collision with root package name */
    public static final X f7765a = AbstractC0779e.i(0.0f, null, 7);

    static {
        Object obj = C0.f7563a;
        new M0.e(0.1f);
        u3.l.N(0.5f, 0.5f);
        AbstractC0345a.c(0.5f, 0.5f);
    }

    public static final X0 a(float f4, u0 u0Var, C0216p c0216p, int i2) {
        return b(new M0.e(f4), w0.f7858c, u0Var, null, "DpAnimation", null, c0216p, (i2 << 3) & 896, 8);
    }

    public static final X0 b(Object obj, v0 v0Var, InterfaceC0787m interfaceC0787m, Float f4, String str, Function1 function1, C0216p c0216p, int i2, int i4) {
        InterfaceC0787m interfaceC0787m2 = interfaceC0787m;
        Object obj2 = C0208l.f2826a;
        Float f5 = (i4 & 8) != 0 ? null : f4;
        Object I3 = c0216p.I();
        if (I3 == obj2) {
            I3 = C0192d.K(null, G.W.f2779l);
            c0216p.c0(I3);
        }
        InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
        Object I4 = c0216p.I();
        if (I4 == obj2) {
            I4 = new C0778d(obj, v0Var, f5);
            c0216p.c0(I4);
        }
        C0778d c0778d = (C0778d) I4;
        InterfaceC0191c0 N3 = C0192d.N(function1, c0216p);
        if (f5 != null && (interfaceC0787m2 instanceof X)) {
            X x2 = (X) interfaceC0787m2;
            if (!Intrinsics.a(x2.f7660c, f5)) {
                interfaceC0787m2 = new X(x2.f7658a, x2.f7659b, f5);
            }
        }
        InterfaceC0191c0 N4 = C0192d.N(interfaceC0787m2, c0216p);
        Object I5 = c0216p.I();
        if (I5 == obj2) {
            I5 = Y2.l.a(-1, 6, null);
            c0216p.c0(I5);
        }
        Y2.i iVar = (Y2.i) I5;
        boolean h4 = c0216p.h(iVar) | ((((i2 & 14) ^ 6) > 4 && c0216p.h(obj)) || (i2 & 6) == 4);
        Object I6 = c0216p.I();
        if (h4 || I6 == obj2) {
            I6 = new A.f0(iVar, 5, obj);
            c0216p.c0(I6);
        }
        C0192d.g((Function0) I6, c0216p);
        boolean h5 = c0216p.h(iVar) | c0216p.h(c0778d) | c0216p.f(N4) | c0216p.f(N3);
        Object I7 = c0216p.I();
        if (h5 || I7 == obj2) {
            I7 = new C0781g(iVar, c0778d, N4, N3, null);
            c0216p.c0(I7);
        }
        C0192d.e(c0216p, iVar, (Function2) I7);
        X0 x02 = (X0) interfaceC0191c0.getValue();
        return x02 == null ? c0778d.f7700c : x02;
    }
}
