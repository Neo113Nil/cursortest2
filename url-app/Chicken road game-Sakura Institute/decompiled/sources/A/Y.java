package A;

import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import w.EnumC1256E;
import w.o0;

/* loaded from: classes.dex */
public final class Y implements w.Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f75a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f76b;

    public Y(a0 a0Var, boolean z4) {
        this.f75a = a0Var;
        this.f76b = z4;
    }

    @Override // w.Y
    public final void a() {
        a0 a0Var = this.f75a;
        a0Var.f98o.setValue(null);
        a0Var.f99p.setValue(null);
        a0Var.p(true);
    }

    @Override // w.Y
    public final void b() {
        a0 a0Var = this.f75a;
        a0Var.f98o.setValue(null);
        a0Var.f99p.setValue(null);
        a0Var.p(true);
    }

    @Override // w.Y
    public final void c(long j4) {
    }

    @Override // w.Y
    public final void d(long j4) {
        a0 a0Var = this.f75a;
        long h4 = Y.c.h(a0Var.f97n, j4);
        a0Var.f97n = h4;
        a0Var.f99p.setValue(new Y.c(Y.c.h(a0Var.f95l, h4)));
        G0.y j5 = a0Var.j();
        Y.c g4 = a0Var.g();
        Intrinsics.c(g4);
        C0022s c0022s = C0023t.f188g;
        a0.a(a0Var, j5, g4.f4372a, false, this.f76b, c0022s, true);
        a0Var.p(false);
    }

    @Override // w.Y
    public final void e() {
        o0 d4;
        boolean z4 = this.f76b;
        EnumC1256E enumC1256E = z4 ? EnumC1256E.f11020e : EnumC1256E.f11021i;
        a0 a0Var = this.f75a;
        a0Var.f98o.setValue(enumC1256E);
        long i2 = a0Var.i(z4);
        float f4 = G.f21a;
        long c4 = AbstractC0345a.c(Y.c.d(i2), Y.c.e(i2) - 1.0f);
        w.P p4 = a0Var.f87d;
        if (p4 == null || (d4 = p4.d()) == null) {
            return;
        }
        long e4 = d4.e(c4);
        a0Var.f95l = e4;
        a0Var.f99p.setValue(new Y.c(e4));
        a0Var.f97n = 0L;
        a0Var.f100q = -1;
        w.P p5 = a0Var.f87d;
        if (p5 != null) {
            p5.f11070q.setValue(Boolean.TRUE);
        }
        a0Var.p(false);
    }

    @Override // w.Y
    public final void onCancel() {
    }
}
