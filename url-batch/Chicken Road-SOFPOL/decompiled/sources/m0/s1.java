package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5102e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5103f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5104g;

    public /* synthetic */ s1(int i, int i8, Object obj, Object obj2) {
        this.f5101d = i8;
        this.f5103f = obj;
        this.f5102e = i;
        this.f5104g = obj2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        u uVar;
        u uVar2;
        int i;
        switch (this.f5101d) {
            case 0:
                t1 t1Var = (t1) this.f5103f;
                o.d0 d0Var = (o.d0) this.f5104g;
                u uVar3 = (u) obj;
                int i8 = t1Var.f5122e;
                int i9 = this.f5102e;
                if (i8 == i9 && q6.i.a(d0Var, t1Var.f5123f) && (uVar3 instanceof y)) {
                    long[] jArr = d0Var.f5434a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr[i10];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((255 & j7) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        Object obj2 = d0Var.f5435b[i14];
                                        boolean z3 = d0Var.f5436c[i14] != i9;
                                        if (z3) {
                                            i = i11;
                                            y yVar = (y) uVar3;
                                            o.j0 j0Var = yVar.f5169j;
                                            h0.a.T(j0Var, obj2, t1Var);
                                            uVar2 = uVar3;
                                            if (obj2 instanceof e0) {
                                                e0 e0Var = (e0) obj2;
                                                if (!j0Var.c(e0Var)) {
                                                    h0.a.U(yVar.f5172m, e0Var);
                                                }
                                                o.j0 j0Var2 = t1Var.f5124g;
                                                if (j0Var2 != null) {
                                                    j0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            uVar2 = uVar3;
                                            i = i11;
                                        }
                                        if (z3) {
                                            d0Var.g(i14);
                                        }
                                    } else {
                                        uVar2 = uVar3;
                                        i = i11;
                                    }
                                    j7 >>= i;
                                    i13++;
                                    i11 = i;
                                    uVar3 = uVar2;
                                }
                                uVar = uVar3;
                                if (i12 != i11) {
                                }
                            } else {
                                uVar = uVar3;
                            }
                            if (i10 != length) {
                                i10++;
                                uVar3 = uVar;
                            }
                        }
                    }
                }
                break;
            default:
                t.s0 s0Var = (t.s0) this.f5103f;
                u1.l0 l0Var = (u1.l0) this.f5104g;
                u1.k0 k0Var = (u1.k0) obj;
                int g3 = s0Var.f6854r.f6867a.g();
                if (g3 < 0) {
                    g3 = 0;
                }
                int i15 = this.f5102e;
                if (g3 > i15) {
                    g3 = i15;
                }
                int i16 = -g3;
                boolean z7 = s0Var.f6855s;
                int i17 = z7 ? 0 : i16;
                if (!z7) {
                    i16 = 0;
                }
                k0Var.f7227d = true;
                u1.k0.m(k0Var, l0Var, i17, i16);
                k0Var.f7227d = false;
                break;
        }
        return c6.m.f1757a;
    }
}
