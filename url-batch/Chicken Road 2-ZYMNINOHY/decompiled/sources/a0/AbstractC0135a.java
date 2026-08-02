package a0;

import T.C0096n;
import T.C0097o;
import a.AbstractC0124a;
import q0.C1353B;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0135a implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f4038b;

    /* renamed from: d, reason: collision with root package name */
    public m0 f4040d;

    /* renamed from: e, reason: collision with root package name */
    public int f4041e;

    /* renamed from: f, reason: collision with root package name */
    public b0.i f4042f;

    /* renamed from: g, reason: collision with root package name */
    public W.D f4043g;

    /* renamed from: h, reason: collision with root package name */
    public int f4044h;

    /* renamed from: i, reason: collision with root package name */
    public q0.b0 f4045i;

    /* renamed from: j, reason: collision with root package name */
    public C0097o[] f4046j;

    /* renamed from: k, reason: collision with root package name */
    public long f4047k;

    /* renamed from: l, reason: collision with root package name */
    public long f4048l;
    public boolean n;
    public boolean o;

    /* renamed from: q, reason: collision with root package name */
    public C1353B f4051q;

    /* renamed from: r, reason: collision with root package name */
    public t0.r f4052r;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4037a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final l2.e f4039c = new l2.e(24, false);

    /* renamed from: m, reason: collision with root package name */
    public long f4049m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public T.T f4050p = T.T.f2704a;

    public AbstractC0135a(int i4) {
        this.f4038b = i4;
    }

    public static int f(int i4, int i5, int i6, int i7) {
        return i4 | i5 | i6 | 128 | i7;
    }

    public static boolean n(int i4, boolean z) {
        int i5 = i4 & 7;
        if (i5 != 4) {
            return z && i5 == 3;
        }
        return true;
    }

    public final void A(C0097o[] c0097oArr, q0.b0 b0Var, long j4, long j5, C1353B c1353b) {
        AbstractC0124a.t(!this.n);
        this.f4045i = b0Var;
        this.f4051q = c1353b;
        if (this.f4049m == Long.MIN_VALUE) {
            this.f4049m = j4;
        }
        this.f4046j = c0097oArr;
        this.f4047k = j5;
        w(c0097oArr, j4, j5, c1353b);
    }

    public final void B(long j4, boolean z, boolean z4) {
        this.n = false;
        this.f4048l = j4;
        this.f4049m = j4;
        if (!z4) {
            q0.b0 b0Var = this.f4045i;
            b0Var.getClass();
            z4 = b0Var.k(j4 - this.f4047k) != 0;
        }
        r(j4, z, z4);
    }

    public abstract int D(C0097o c0097o);

    public int E() {
        return 0;
    }

    public boolean F(long j4) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0146l g(Exception exc, C0097o c0097o, boolean z, int i4) {
        int i5;
        if (c0097o != null && !this.o) {
            this.o = true;
            try {
                i5 = D(c0097o) & 7;
            } catch (C0146l unused) {
            } finally {
                this.o = false;
            }
            return new C0146l(1, exc, i4, k(), this.f4041e, c0097o, c0097o != null ? 4 : i5, this.f4051q, z);
        }
        i5 = 4;
        return new C0146l(1, exc, i4, k(), this.f4041e, c0097o, c0097o != null ? 4 : i5, this.f4051q, z);
    }

    public long i(long j4, long j5) {
        if (this.f4044h == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public S j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.f4049m == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public abstract void r(long j4, boolean z, boolean z4);

    public final int y(l2.e eVar, Z.f fVar, int i4) {
        q0.b0 b0Var = this.f4045i;
        b0Var.getClass();
        int n = b0Var.n(eVar, fVar, i4);
        if (n == -4) {
            if (fVar.g(4)) {
                this.f4049m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j4 = fVar.f3783g + this.f4047k;
            fVar.f3783g = j4;
            this.f4049m = Math.max(this.f4049m, j4);
            return n;
        }
        if (n == -5) {
            C0097o c0097o = (C0097o) eVar.f14271c;
            c0097o.getClass();
            long j5 = c0097o.f2872s;
            if (j5 != Long.MAX_VALUE) {
                C0096n a3 = c0097o.a();
                a3.f2834r = j5 + this.f4047k;
                eVar.f14271c = new C0097o(a3);
            }
        }
        return n;
    }

    public abstract void z(long j4, long j5);

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f4, float f5) {
    }

    @Override // a0.i0
    public void c(int i4, Object obj) {
    }

    public void q(boolean z, boolean z4) {
    }

    public void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
    }
}
