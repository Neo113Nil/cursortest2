package w1;

import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends q6.j implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final g f7661f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f7662g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f7663h;
    public static final g i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7664e;

    static {
        int i8 = 2;
        f7661f = new g(i8, 0);
        f7662g = new g(i8, 1);
        f7663h = new g(i8, 2);
        i = new g(i8, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i8, int i9) {
        super(i8);
        this.f7664e = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7664e) {
            case 0:
                ((Number) obj2).intValue();
                ((i) obj).getClass();
                break;
            case 1:
                u1.e0 e0Var = (u1.e0) obj2;
                f0 f0Var = (f0) ((i) obj);
                if (!q6.i.a(f0Var.f7658x, e0Var)) {
                    f0Var.f7658x = e0Var;
                    f0Var.C();
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                ((f0) ((i) obj)).b0((y0.m) obj2);
                break;
            default:
                m0.a0 a0Var = (m0.a0) obj2;
                f0 f0Var2 = (f0) ((i) obj);
                f0Var2.B = a0Var;
                b1 b1Var = f0Var2.F;
                u2 u2Var = x1.b1.f8370h;
                u0.g gVar = (u0.g) a0Var;
                gVar.getClass();
                f0Var2.Y((r2.c) m0.b.r(gVar, u2Var));
                r2.l lVar = (r2.l) m0.b.r(gVar, x1.b1.f8375n);
                if (f0Var2.f7660z != lVar) {
                    f0Var2.f7660z = lVar;
                    f0Var2.C();
                    f0 s5 = f0Var2.s();
                    if (s5 != null) {
                        s5.A();
                    }
                    f0Var2.B();
                    for (y0.l lVar2 = b1Var.f7600f; lVar2 != null; lVar2 = lVar2.i) {
                        lVar2.b0();
                    }
                }
                f0Var2.c0((x1.u1) m0.b.r(gVar, x1.b1.f8380s));
                y0.l lVar3 = b1Var.f7600f;
                if ((lVar3.f8709g & 32768) != 0) {
                    while (lVar3 != null) {
                        if ((lVar3.f8708f & 32768) != 0) {
                            l lVar4 = lVar3;
                            ?? r22 = 0;
                            while (lVar4 != 0) {
                                if (lVar4 instanceof j) {
                                    y0.l lVar5 = ((y0.l) ((j) lVar4)).f8706d;
                                    if (lVar5.f8718q) {
                                        e1.c(lVar5);
                                    } else {
                                        lVar5.f8714m = true;
                                    }
                                } else if ((lVar4.f8708f & 32768) != 0 && (lVar4 instanceof l)) {
                                    y0.l lVar6 = lVar4.f7707s;
                                    int i8 = 0;
                                    lVar4 = lVar4;
                                    r22 = r22;
                                    while (lVar6 != null) {
                                        if ((lVar6.f8708f & 32768) != 0) {
                                            i8++;
                                            r22 = r22;
                                            if (i8 == 1) {
                                                lVar4 = lVar6;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar4 != 0) {
                                                    r22.b(lVar4);
                                                    lVar4 = 0;
                                                }
                                                r22.b(lVar6);
                                            }
                                        }
                                        lVar6 = lVar6.i;
                                        lVar4 = lVar4;
                                        r22 = r22;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                lVar4 = f.f(r22);
                            }
                        }
                        if ((lVar3.f8709g & 32768) != 0) {
                            lVar3 = lVar3.i;
                        }
                    }
                }
                break;
        }
        return c6.m.f1757a;
    }
}
