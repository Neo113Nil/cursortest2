package A;

import G.C0205j0;
import a.AbstractC0345a;
import h0.C0647b;
import h0.InterfaceC0646a;
import kotlin.jvm.internal.Intrinsics;
import w.EnumC1256E;
import w.EnumC1257F;
import w.o0;

/* loaded from: classes.dex */
public final class X implements w.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f74b;

    public /* synthetic */ X(a0 a0Var, int i2) {
        this.f73a = i2;
        this.f74b = a0Var;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }

    @Override // w.Y
    public final void a() {
        switch (this.f73a) {
            case 0:
                a0 a0Var = this.f74b;
                a0Var.f98o.setValue(null);
                a0Var.f99p.setValue(null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // w.Y
    public final void b() {
        switch (this.f73a) {
            case 0:
                a0 a0Var = this.f74b;
                a0Var.f98o.setValue(null);
                a0Var.f99p.setValue(null);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // w.Y
    public final void c(long j4) {
        o0 d4;
        o0 d5;
        o0 d6;
        switch (this.f73a) {
            case 0:
                a0 a0Var = this.f74b;
                long i2 = a0Var.i(true);
                float f4 = G.f21a;
                long c4 = AbstractC0345a.c(Y.c.d(i2), Y.c.e(i2) - 1.0f);
                w.P p4 = a0Var.f87d;
                if (p4 != null && (d4 = p4.d()) != null) {
                    long e4 = d4.e(c4);
                    a0Var.f95l = e4;
                    a0Var.f99p.setValue(new Y.c(e4));
                    a0Var.f97n = 0L;
                    a0Var.f98o.setValue(EnumC1256E.f11019d);
                    a0Var.p(false);
                    break;
                }
                break;
            default:
                a0 a0Var2 = this.f74b;
                if (a0Var2.h()) {
                    C0205j0 c0205j0 = a0Var2.f98o;
                    if (((EnumC1256E) c0205j0.getValue()) == null) {
                        c0205j0.setValue(EnumC1256E.f11021i);
                        a0Var2.f100q = -1;
                        a0Var2.k();
                        w.P p5 = a0Var2.f87d;
                        if (p5 == null || (d6 = p5.d()) == null || !d6.c(j4)) {
                            w.P p6 = a0Var2.f87d;
                            if (p6 != null && (d5 = p6.d()) != null) {
                                int a4 = a0Var2.f85b.a(d5.b(j4, true));
                                G0.y c5 = a0.c(a0Var2.j().f3093a, M1.a.j(a4, a4));
                                a0Var2.f(false);
                                InterfaceC0646a interfaceC0646a = a0Var2.f91h;
                                if (interfaceC0646a != null) {
                                    ((C0647b) interfaceC0646a).a();
                                }
                                a0Var2.f86c.invoke(c5);
                            }
                        } else if (a0Var2.j().f3093a.f328a.length() != 0) {
                            a0Var2.f(false);
                            a0Var2.f96m = Integer.valueOf((int) (a0.a(a0Var2, G0.y.a(a0Var2.j(), null, A0.K.f299b, 5), j4, true, false, C0023t.f186e, true) >> 32));
                        }
                        a0Var2.n(EnumC1257F.f11023d);
                        a0Var2.f95l = j4;
                        a0Var2.f99p.setValue(new Y.c(j4));
                        a0Var2.f97n = 0L;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [M2.p, kotlin.jvm.functions.Function1] */
    @Override // w.Y
    public final void d(long j4) {
        o0 d4;
        InterfaceC0646a interfaceC0646a;
        o0 d5;
        switch (this.f73a) {
            case 0:
                a0 a0Var = this.f74b;
                a0Var.f97n = Y.c.h(a0Var.f97n, j4);
                w.P p4 = a0Var.f87d;
                if (p4 != null && (d4 = p4.d()) != null) {
                    a0Var.f99p.setValue(new Y.c(Y.c.h(a0Var.f95l, a0Var.f97n)));
                    G0.s sVar = a0Var.f85b;
                    Y.c g4 = a0Var.g();
                    Intrinsics.c(g4);
                    int a4 = sVar.a(d4.b(g4.f4372a, true));
                    long j5 = M1.a.j(a4, a4);
                    if (!A0.K.a(j5, a0Var.j().f3094b)) {
                        w.P p5 = a0Var.f87d;
                        if ((p5 == null || ((Boolean) p5.f11070q.getValue()).booleanValue()) && (interfaceC0646a = a0Var.f91h) != null) {
                            ((C0647b) interfaceC0646a).a();
                        }
                        a0Var.f86c.invoke(a0.c(a0Var.j().f3093a, j5));
                        break;
                    }
                }
                break;
            default:
                a0 a0Var2 = this.f74b;
                if (a0Var2.h() && a0Var2.j().f3093a.f328a.length() != 0) {
                    a0Var2.f97n = Y.c.h(a0Var2.f97n, j4);
                    w.P p6 = a0Var2.f87d;
                    if (p6 != null && (d5 = p6.d()) != null) {
                        a0Var2.f99p.setValue(new Y.c(Y.c.h(a0Var2.f95l, a0Var2.f97n)));
                        Integer num = a0Var2.f96m;
                        C0022s c0022s = C0023t.f186e;
                        if (num == null) {
                            Y.c g5 = a0Var2.g();
                            Intrinsics.c(g5);
                            if (!d5.c(g5.f4372a)) {
                                int a5 = a0Var2.f85b.a(d5.b(a0Var2.f95l, true));
                                G0.s sVar2 = a0Var2.f85b;
                                Y.c g6 = a0Var2.g();
                                Intrinsics.c(g6);
                                if (a5 == sVar2.a(d5.b(g6.f4372a, true))) {
                                    c0022s = C0023t.f185d;
                                }
                                G0.y j6 = a0Var2.j();
                                Y.c g7 = a0Var2.g();
                                Intrinsics.c(g7);
                                a0.a(a0Var2, j6, g7.f4372a, false, false, c0022s, true);
                                int i2 = A0.K.f300c;
                            }
                        }
                        Integer num2 = a0Var2.f96m;
                        int intValue = num2 != null ? num2.intValue() : d5.b(a0Var2.f95l, false);
                        Y.c g8 = a0Var2.g();
                        Intrinsics.c(g8);
                        int b4 = d5.b(g8.f4372a, false);
                        if (a0Var2.f96m != null || intValue != b4) {
                            G0.y j7 = a0Var2.j();
                            Y.c g9 = a0Var2.g();
                            Intrinsics.c(g9);
                            a0.a(a0Var2, j7, g9.f4372a, false, false, c0022s, true);
                            int i22 = A0.K.f300c;
                        }
                    }
                    a0Var2.p(false);
                    break;
                }
                break;
        }
    }

    @Override // w.Y
    public final void e() {
        int i2 = this.f73a;
    }

    public void i() {
        a0 a0Var = this.f74b;
        a0Var.f98o.setValue(null);
        a0Var.f99p.setValue(null);
        a0Var.p(true);
        a0Var.f96m = null;
        boolean b4 = A0.K.b(a0Var.j().f3094b);
        a0Var.n(b4 ? EnumC1257F.f11025i : EnumC1257F.f11024e);
        w.P p4 = a0Var.f87d;
        if (p4 != null) {
            p4.f11066m.setValue(Boolean.valueOf(!b4 && j0.c.D(a0Var, true)));
        }
        w.P p5 = a0Var.f87d;
        if (p5 != null) {
            p5.f11067n.setValue(Boolean.valueOf(!b4 && j0.c.D(a0Var, false)));
        }
        w.P p6 = a0Var.f87d;
        if (p6 == null) {
            return;
        }
        p6.f11068o.setValue(Boolean.valueOf(b4 && j0.c.D(a0Var, true)));
    }

    @Override // w.Y
    public final void onCancel() {
        switch (this.f73a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }
}
