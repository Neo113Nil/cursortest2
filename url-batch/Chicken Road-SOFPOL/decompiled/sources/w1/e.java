package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends q6.j implements p6.c {

    /* renamed from: f, reason: collision with root package name */
    public static final e f7623f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f7624g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f7625h;
    public static final e i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f7626j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f7627k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f7628l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f7629m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f7630n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f7631o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f7632p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f7633q;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7634e;

    static {
        int i8 = 1;
        f7623f = new e(i8, 0);
        f7624g = new e(i8, 1);
        f7625h = new e(i8, 2);
        i = new e(i8, 3);
        f7626j = new e(i8, 4);
        f7627k = new e(i8, 5);
        f7628l = new e(i8, 6);
        f7629m = new e(i8, 7);
        f7630n = new e(i8, 8);
        f7631o = new e(i8, 9);
        f7632p = new e(i8, 10);
        f7633q = new e(i8, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i8, int i9) {
        super(i8);
        this.f7634e = i9;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f7634e) {
            case 0:
                ((c) obj).u0();
                break;
            case 1:
                o1 o1Var = (o1) obj;
                if (o1Var.v()) {
                    n0 n0Var = o1Var.f7744e;
                    if (!n0Var.f7730n) {
                        p6.c d8 = o1Var.f7743d.d();
                        o.j0 j0Var = n0Var.f7733q;
                        if (d8 != null) {
                            n0Var.f0(o1Var, 9223372034707292159L, 0L);
                            n0Var.f7726j = d8;
                        } else if (j0Var != null) {
                            Object[] objArr = j0Var.f5484c;
                            long[] jArr = j0Var.f5482a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j7 = jArr[i8];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((255 & j7) < 128) {
                                                n0Var.r0((o.k0) objArr[(i8 << 3) + i10]);
                                            }
                                            j7 >>= 8;
                                        }
                                        if (i9 != 8) {
                                        }
                                    }
                                    if (i8 != length) {
                                        i8++;
                                    }
                                }
                            }
                            j0Var.a();
                        }
                    }
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                j1 j1Var = ((d1) obj).L;
                if (j1Var != null) {
                    j1Var.invalidate();
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                d1 d1Var = (d1) obj;
                if (d1Var.v() && d1Var.c1(true)) {
                    f0 f0Var = d1Var.f7614r;
                    j0 j0Var2 = f0Var.G;
                    if (j0Var2.f7696l > 0) {
                        if (j0Var2.f7695k || j0Var2.f7694j) {
                            f0Var.T(false);
                        }
                        j0Var2.f7700p.g0();
                    }
                    f0Var.M();
                    x1.t tVar = (x1.t) i0.a(f0Var);
                    e2.a rectManager = tVar.getRectManager();
                    if (d1Var == f0Var.F.f7598d) {
                        rectManager.g(f0Var, false);
                        rectManager.e(f0Var);
                    } else {
                        rectManager.f(f0Var);
                    }
                    if (f0Var.N > 0) {
                        a0.a0 a0Var = tVar.Q.f7790e;
                        a0Var.getClass();
                        if (f0Var.N > 0) {
                            ((o0.e) a0Var.f11e).b(f0Var);
                            f0Var.M = true;
                        }
                        tVar.D(null);
                    }
                }
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                g1 g1Var = (g1) obj;
                if (g1Var.v()) {
                    g1Var.f7673d.F();
                }
                break;
            case 5:
                f0 f0Var2 = (f0) obj;
                if (f0Var2.G()) {
                    f0Var2.T(false);
                }
                break;
            case 6:
                f0 f0Var3 = (f0) obj;
                if (f0Var3.G()) {
                    f0Var3.T(false);
                }
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                f0 f0Var4 = (f0) obj;
                if (f0Var4.G()) {
                    f0Var4.R(false);
                }
                break;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                f0 f0Var5 = (f0) obj;
                if (f0Var5.G()) {
                    f0Var5.R(false);
                }
                break;
            case x.v0.f8304b /* 9 */:
                f0 f0Var6 = (f0) obj;
                if (f0Var6.G()) {
                    f0.S(f0Var6, false, 7);
                }
                break;
            case x.v0.f8306d /* 10 */:
                f0 f0Var7 = (f0) obj;
                if (f0Var7.G()) {
                    f0.U(f0Var7, false, 7);
                }
                break;
            default:
                f0 f0Var8 = (f0) obj;
                if (f0Var8.G()) {
                    f0Var8.E();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
