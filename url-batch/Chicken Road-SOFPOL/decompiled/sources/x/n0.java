package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 extends y0.l implements w1.v {

    /* renamed from: r, reason: collision with root package name */
    public float f8251r;

    /* renamed from: s, reason: collision with root package name */
    public float f8252s;

    /* renamed from: t, reason: collision with root package name */
    public float f8253t;

    /* renamed from: u, reason: collision with root package name */
    public float f8254u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8255v;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    @Override // w1.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        int i;
        int i8;
        int i9;
        int j8;
        int h8;
        int i10;
        int g3;
        long a8;
        int i11 = 0;
        if (Float.isNaN(this.f8253t)) {
            i = Integer.MAX_VALUE;
        } else {
            i = n0Var.H(this.f8253t);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.f8254u)) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = n0Var.H(this.f8254u);
            if (i8 < 0) {
                i8 = 0;
            }
        }
        if (!Float.isNaN(this.f8251r)) {
            i9 = n0Var.H(this.f8251r);
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i) {
                i9 = i;
            }
        }
        i9 = 0;
        if (!Float.isNaN(this.f8252s)) {
            int H = n0Var.H(this.f8252s);
            if (H < 0) {
                H = 0;
            }
            if (H > i8) {
                H = i8;
            }
            if (H != Integer.MAX_VALUE) {
                i11 = H;
            }
        }
        long a9 = r2.b.a(i9, i, i11, i8);
        if (this.f8255v) {
            int j9 = r2.a.j(j7);
            int h9 = r2.a.h(j7);
            int i12 = r2.a.i(j7);
            int g7 = r2.a.g(j7);
            int j10 = r2.a.j(a9);
            if (j10 < j9) {
                j10 = j9;
            }
            if (j10 > h9) {
                j10 = h9;
            }
            int h10 = r2.a.h(a9);
            if (h10 >= j9) {
                j9 = h10;
            }
            if (j9 <= h9) {
                h9 = j9;
            }
            int i13 = r2.a.i(a9);
            if (i13 < i12) {
                i13 = i12;
            }
            if (i13 > g7) {
                i13 = g7;
            }
            int g8 = r2.a.g(a9);
            if (g8 >= i12) {
                i12 = g8;
            }
            if (i12 <= g7) {
                g7 = i12;
            }
            a8 = r2.b.a(j10, h9, i13, g7);
        } else {
            if (Float.isNaN(this.f8251r)) {
                j8 = r2.a.j(j7);
                int h11 = r2.a.h(a9);
                if (j8 > h11) {
                    j8 = h11;
                }
            } else {
                j8 = r2.a.j(a9);
            }
            if (Float.isNaN(this.f8253t)) {
                h8 = r2.a.h(j7);
                int j11 = r2.a.j(a9);
                if (h8 < j11) {
                    h8 = j11;
                }
            } else {
                h8 = r2.a.h(a9);
            }
            if (Float.isNaN(this.f8252s)) {
                i10 = r2.a.i(j7);
                int g9 = r2.a.g(a9);
                if (i10 > g9) {
                    i10 = g9;
                }
            } else {
                i10 = r2.a.i(a9);
            }
            if (Float.isNaN(this.f8254u)) {
                g3 = r2.a.g(j7);
                int i14 = r2.a.i(a9);
                if (g3 < i14) {
                    g3 = i14;
                }
            } else {
                g3 = r2.a.g(a9);
            }
            a8 = r2.b.a(j8, h8, i10, g3);
        }
        u1.l0 e8 = d0Var.e(a8);
        return n0Var.e0(e8.f7230d, e8.f7231e, d6.v.f2327d, new a0.m(e8, 4));
    }
}
