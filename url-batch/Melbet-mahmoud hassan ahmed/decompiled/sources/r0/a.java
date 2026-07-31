package r0;

import android.util.Pair;
import r0.r3;

/* loaded from: classes.dex */
public abstract class a extends r3 {

    /* renamed from: h, reason: collision with root package name */
    private final int f20385h;

    /* renamed from: i, reason: collision with root package name */
    private final t1.s0 f20386i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f20387j;

    public a(boolean z6, t1.s0 s0Var) {
        this.f20387j = z6;
        this.f20386i = s0Var;
        this.f20385h = s0Var.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i7, boolean z6) {
        if (z6) {
            return this.f20386i.c(i7);
        }
        if (i7 < this.f20385h - 1) {
            return i7 + 1;
        }
        return -1;
    }

    private int H(int i7, boolean z6) {
        if (z6) {
            return this.f20386i.f(i7);
        }
        if (i7 > 0) {
            return i7 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i7);

    protected abstract int E(int i7);

    protected abstract int F(int i7);

    protected abstract r3 I(int i7);

    @Override // r0.r3
    public int e(boolean z6) {
        if (this.f20385h == 0) {
            return -1;
        }
        if (this.f20387j) {
            z6 = false;
        }
        int e7 = z6 ? this.f20386i.e() : 0;
        while (I(e7).u()) {
            e7 = G(e7, z6);
            if (e7 == -1) {
                return -1;
            }
        }
        return F(e7) + I(e7).e(z6);
    }

    @Override // r0.r3
    public final int f(Object obj) {
        int f7;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B = B(obj);
        Object A = A(obj);
        int x6 = x(B);
        if (x6 == -1 || (f7 = I(x6).f(A)) == -1) {
            return -1;
        }
        return E(x6) + f7;
    }

    @Override // r0.r3
    public int g(boolean z6) {
        int i7 = this.f20385h;
        if (i7 == 0) {
            return -1;
        }
        if (this.f20387j) {
            z6 = false;
        }
        int g7 = z6 ? this.f20386i.g() : i7 - 1;
        while (I(g7).u()) {
            g7 = H(g7, z6);
            if (g7 == -1) {
                return -1;
            }
        }
        return F(g7) + I(g7).g(z6);
    }

    @Override // r0.r3
    public int i(int i7, int i8, boolean z6) {
        if (this.f20387j) {
            if (i8 == 1) {
                i8 = 2;
            }
            z6 = false;
        }
        int z7 = z(i7);
        int F = F(z7);
        int i9 = I(z7).i(i7 - F, i8 != 2 ? i8 : 0, z6);
        if (i9 != -1) {
            return F + i9;
        }
        int G = G(z7, z6);
        while (G != -1 && I(G).u()) {
            G = G(G, z6);
        }
        if (G != -1) {
            return F(G) + I(G).e(z6);
        }
        if (i8 == 2) {
            return e(z6);
        }
        return -1;
    }

    @Override // r0.r3
    public final r3.b k(int i7, r3.b bVar, boolean z6) {
        int y6 = y(i7);
        int F = F(y6);
        I(y6).k(i7 - E(y6), bVar, z6);
        bVar.f20914h += F;
        if (z6) {
            bVar.f20913g = D(C(y6), o2.a.e(bVar.f20913g));
        }
        return bVar;
    }

    @Override // r0.r3
    public final r3.b l(Object obj, r3.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x6 = x(B);
        int F = F(x6);
        I(x6).l(A, bVar);
        bVar.f20914h += F;
        bVar.f20913g = obj;
        return bVar;
    }

    @Override // r0.r3
    public int p(int i7, int i8, boolean z6) {
        if (this.f20387j) {
            if (i8 == 1) {
                i8 = 2;
            }
            z6 = false;
        }
        int z7 = z(i7);
        int F = F(z7);
        int p7 = I(z7).p(i7 - F, i8 != 2 ? i8 : 0, z6);
        if (p7 != -1) {
            return F + p7;
        }
        int H = H(z7, z6);
        while (H != -1 && I(H).u()) {
            H = H(H, z6);
        }
        if (H != -1) {
            return F(H) + I(H).g(z6);
        }
        if (i8 == 2) {
            return g(z6);
        }
        return -1;
    }

    @Override // r0.r3
    public final Object q(int i7) {
        int y6 = y(i7);
        return D(C(y6), I(y6).q(i7 - E(y6)));
    }

    @Override // r0.r3
    public final r3.d s(int i7, r3.d dVar, long j7) {
        int z6 = z(i7);
        int F = F(z6);
        int E = E(z6);
        I(z6).s(i7 - F, dVar, j7);
        Object C = C(z6);
        if (!r3.d.f20923w.equals(dVar.f20927f)) {
            C = D(C, dVar.f20927f);
        }
        dVar.f20927f = C;
        dVar.f20941t += E;
        dVar.f20942u += E;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i7);

    protected abstract int z(int i7);
}
