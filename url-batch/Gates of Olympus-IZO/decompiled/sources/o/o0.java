package o;

import D1.C0014b;
import F.C0047j0;
import m0.C0620e;
import t0.AbstractC0898f;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public h0 f6592a;

    /* renamed from: b, reason: collision with root package name */
    public n.e0 f6593b;

    /* renamed from: c, reason: collision with root package name */
    public C0737m f6594c;

    /* renamed from: d, reason: collision with root package name */
    public J f6595d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6596e;

    /* renamed from: f, reason: collision with root package name */
    public C0014b f6597f;

    /* renamed from: g, reason: collision with root package name */
    public int f6598g = 1;

    /* renamed from: h, reason: collision with root package name */
    public N f6599h = androidx.compose.foundation.gestures.a.f3623a;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f6600i = new l0(this);

    /* renamed from: j, reason: collision with root package name */
    public final C0047j0 f6601j = new C0047j0(25, this);

    public o0(h0 h0Var, n.e0 e0Var, C0737m c0737m, J j3, boolean z3, C0014b c0014b) {
        this.f6592a = h0Var;
        this.f6593b = e0Var;
        this.f6594c = c0737m;
        this.f6595d = j3;
        this.f6596e = z3;
        this.f6597f = c0014b;
    }

    public static final long a(o0 o0Var, N n3, long j3, int i3) {
        long j4;
        C0620e c0620e = (C0620e) o0Var.f6597f.f536b;
        C0620e c0620e2 = null;
        C0620e c0620e3 = (c0620e == null || !c0620e.p) ? null : (C0620e) AbstractC0898f.k(c0620e);
        long j5 = 0;
        long z02 = c0620e3 != null ? c0620e3.z0(j3, i3) : 0L;
        long g3 = a0.c.g(j3, z02);
        long d3 = o0Var.d(o0Var.g(n3.a(o0Var.f(o0Var.d(a0.c.a(g3, o0Var.f6595d == J.f6444e ? 1 : 2))))));
        long g4 = a0.c.g(g3, d3);
        C0620e c0620e4 = (C0620e) o0Var.f6597f.f536b;
        if (c0620e4 != null && c0620e4.p) {
            c0620e2 = (C0620e) AbstractC0898f.k(c0620e4);
        }
        C0620e c0620e5 = c0620e2;
        if (c0620e5 != null) {
            j4 = d3;
            j5 = c0620e5.x0(d3, g4, i3);
        } else {
            j4 = d3;
        }
        return a0.c.h(a0.c.h(z02, j4), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j3, R1.c cVar) {
        i0 i0Var;
        int i3;
        Z1.s sVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i4 = i0Var.f6541g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                i0Var.f6541g = i4 - Integer.MIN_VALUE;
                Object obj = i0Var.f6539e;
                Object obj2 = Q1.a.f3113d;
                i3 = i0Var.f6541g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    Z1.s sVar2 = new Z1.s();
                    sVar2.f3479d = j3;
                    n.X x3 = n.X.f6036d;
                    Y1.e k0Var = new k0(this, sVar2, j3, null);
                    i0Var.f6538d = sVar2;
                    i0Var.f6541g = 1;
                    if (e(x3, k0Var, i0Var) == obj2) {
                        return obj2;
                    }
                    sVar = sVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = i0Var.f6538d;
                    I2.l.Q(obj);
                }
                return new M0.n(sVar.f3479d);
            }
        }
        i0Var = new i0(this, cVar);
        Object obj3 = i0Var.f6539e;
        Object obj22 = Q1.a.f3113d;
        i3 = i0Var.f6541g;
        if (i3 != 0) {
        }
        return new M0.n(sVar.f3479d);
    }

    public final float c(float f3) {
        return this.f6596e ? f3 * (-1) : f3;
    }

    public final long d(long j3) {
        return this.f6596e ? a0.c.i(j3, -1.0f) : j3;
    }

    public final Object e(n.X x3, Y1.e eVar, R1.c cVar) {
        Object e3 = this.f6592a.e(x3, new n0(this, eVar, null), cVar);
        return e3 == Q1.a.f3113d ? e3 : L1.z.f2729a;
    }

    public final float f(long j3) {
        return this.f6595d == J.f6444e ? a0.c.d(j3) : a0.c.e(j3);
    }

    public final long g(float f3) {
        if (f3 == 0.0f) {
            return 0L;
        }
        return this.f6595d == J.f6444e ? I2.l.f(f3, 0.0f) : I2.l.f(0.0f, f3);
    }
}
