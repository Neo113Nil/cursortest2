package c2;

import android.graphics.Paint;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x extends i1 {

    /* renamed from: f0, reason: collision with root package name */
    public static final y6.l f1700f0;

    /* renamed from: d0, reason: collision with root package name */
    public v f1701d0;

    /* renamed from: e0, reason: collision with root package name */
    public w f1702e0;

    static {
        y6.l e2 = k1.v.e();
        e2.h(k1.p.f5339e);
        ((Paint) e2.f10660e).setStrokeWidth(1.0f);
        e2.j(1);
        f1700f0 = e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(g0 g0Var, v vVar) {
        super(g0Var);
        this.f1701d0 = vVar;
        this.f1702e0 = g0Var.f1556v != null ? new w(this) : null;
        if ((((d1.k) vVar).f3305d.f3307i & 512) == 0) {
            return;
        }
        kotlin.collections.i0.j();
        throw null;
    }

    @Override // c2.i1
    public final p0 B0() {
        return this.f1702e0;
    }

    @Override // c2.i1
    public final d1.k D0() {
        return ((d1.k) this.f1701d0).f3305d;
    }

    @Override // c2.i1
    public final void S0(k1.n nVar, n1.b bVar) {
        i1 i1Var;
        i1 i1Var2 = this.C;
        i1Var2.getClass();
        i1Var2.w0(nVar, bVar);
        if (!j0.a(this.B).getShowLayoutBounds() || (i1Var = this.C) == null) {
            return;
        }
        if (x2.k.a(this.f133i, i1Var.f133i) && x2.i.a(i1Var.M, 0L)) {
            return;
        }
        long j = this.f133i;
        nVar.a(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f1700f0);
    }

    @Override // a2.o0
    public final void Z(long j, float f3, Function1 function1) {
        T0(j, f3, function1);
        if (this.f1634w) {
            return;
        }
        O0();
        i1 i1Var = this.C;
        i1Var.getClass();
        i1Var.f1635x = this.f1635x;
        l0().b();
        i1Var.f1635x = false;
    }

    @Override // a2.f0
    public final a2.o0 c(long j) {
        b0(j);
        v vVar = this.f1701d0;
        i1 i1Var = this.C;
        i1Var.getClass();
        W0(vVar.v(this, i1Var, j));
        N0();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c1(v vVar) {
        if (vVar.equals(this.f1701d0) || (((d1.k) vVar).f3305d.f3307i & 512) == 0) {
            this.f1701d0 = vVar;
        } else {
            kotlin.collections.i0.j();
        }
    }

    @Override // c2.o0
    public final int d0(a2.a aVar) {
        w wVar = this.f1702e0;
        if (wVar == null) {
            return k.c(this, aVar);
        }
        s.c0 c0Var = wVar.G;
        int c10 = c0Var.c(aVar);
        if (c10 >= 0) {
            return c0Var.f8279c[c10];
        }
        return Integer.MIN_VALUE;
    }

    @Override // c2.i1
    public final void y0() {
        if (this.f1702e0 == null) {
            this.f1702e0 = new w(this);
        }
    }
}
