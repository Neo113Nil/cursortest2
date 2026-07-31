package u;

import b6.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public q6.o f6976h;
    public q6.o i;

    /* renamed from: j, reason: collision with root package name */
    public int f6977j;

    /* renamed from: k, reason: collision with root package name */
    public int f6978k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6979l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q6.p f6980m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.s f6981n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q6.s f6982o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f6983p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ i0 f6984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f6985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e1 f6986s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q6.p pVar, q6.s sVar, q6.s sVar2, float f6, i0 i0Var, float f8, e1 e1Var, g6.c cVar) {
        super(2, cVar);
        this.f6980m = pVar;
        this.f6981n = sVar;
        this.f6982o = sVar2;
        this.f6983p = f6;
        this.f6984q = i0Var;
        this.f6985r = f8;
        this.f6986s = e1Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        return ((f0) l((g6.c) obj2, (c1) obj)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        f0 f0Var = new f0(this.f6980m, this.f6981n, this.f6982o, this.f6983p, this.f6984q, this.f6985r, this.f6986s, cVar);
        f0Var.f6979l = obj;
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0173 -> B:7:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0184 -> B:9:0x006a). Please report as a decompilation issue!!! */
    @Override // i6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(Object obj) {
        c1 c1Var;
        q6.o oVar;
        q6.p pVar;
        q6.s sVar;
        c1 c1Var2;
        q6.o oVar2;
        int i;
        int i8;
        boolean z3;
        f0 f0Var = this;
        int i9 = f0Var.f6978k;
        q6.s sVar2 = f0Var.f6982o;
        q6.p pVar2 = f0Var.f6980m;
        int i10 = 2;
        int i11 = 1;
        q6.s sVar3 = f0Var.f6981n;
        h6.a aVar = h6.a.f3204d;
        if (i9 == 0) {
            s6.a.K(obj);
            c1Var = (c1) f0Var.f6979l;
            q6.o oVar3 = new q6.o();
            oVar3.f6201d = true;
            oVar = oVar3;
            z3 = oVar.f6201d;
            c6.m mVar = c6.m.f1757a;
            if (!z3) {
            }
        } else if (i9 == 1) {
            q6.o oVar4 = f0Var.i;
            q6.o oVar5 = f0Var.f6976h;
            c1 c1Var3 = (c1) f0Var.f6979l;
            s6.a.K(obj);
            i8 = 1;
            oVar4.f6201d = ((Boolean) obj).booleanValue();
            f0Var = this;
            sVar3 = sVar3;
            oVar = oVar5;
            aVar = aVar;
            i10 = 2;
            c1Var = c1Var3;
            i11 = i8;
            z3 = oVar.f6201d;
            c6.m mVar2 = c6.m.f1757a;
            if (!z3) {
            }
        } else if (i9 == 2) {
            i = f0Var.f6977j;
            oVar2 = f0Var.f6976h;
            c1Var2 = (c1) f0Var.f6979l;
            s6.a.K(obj);
            sVar = sVar2;
            pVar = pVar2;
            oVar = oVar2;
            if (oVar.f6201d) {
            }
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q6.o oVar6 = f0Var.i;
            q6.o oVar7 = f0Var.f6976h;
            c1Var2 = (c1) f0Var.f6979l;
            s6.a.K(obj);
            oVar = oVar6;
            int i12 = 2;
            i8 = 1;
            q6.s sVar4 = sVar3;
            q6.o oVar8 = oVar7;
            Object b8 = obj;
            h6.a aVar2 = aVar;
            oVar.f6201d = ((Boolean) b8).booleanValue();
            oVar = oVar8;
            sVar3 = sVar4;
            aVar = aVar2;
            c1Var = c1Var2;
            i10 = i12;
            i11 = i8;
            z3 = oVar.f6201d;
            c6.m mVar22 = c6.m.f1757a;
            if (!z3) {
                oVar.f6201d = false;
                float floatValue = pVar2.f6202d - ((Number) ((r.k) sVar3.f6205d).f6331e.getValue()).floatValue();
                boolean z7 = ((d0) sVar2.f6205d).f6951c;
                i0 i0Var = f0Var.f6984q;
                if (!z7) {
                    float abs = Math.abs(floatValue);
                    float f6 = f0Var.f6983p;
                    if (abs >= f6) {
                        float signum = Math.signum(floatValue) * f6;
                        i0Var.c(c1Var, signum);
                        r.k kVar = (r.k) sVar3.f6205d;
                        r.k g3 = r.d.g(kVar, ((Number) kVar.f6331e.getValue()).floatValue() + signum);
                        sVar3.f6205d = g3;
                        int B = s6.a.B(Math.abs(pVar2.f6202d - ((Number) g3.f6331e.getValue()).floatValue()) / f0Var.f6985r);
                        if (B > 100) {
                            B = 100;
                        }
                        r.k kVar2 = (r.k) sVar3.f6205d;
                        float f8 = pVar2.f6202d;
                        int i13 = B;
                        i0 i0Var2 = f0Var.f6984q;
                        q6.s sVar5 = sVar2;
                        q6.p pVar3 = pVar2;
                        t1 t1Var = new t1(i0Var2, sVar5, pVar3, f0Var.f6986s, oVar, 2);
                        oVar2 = oVar;
                        sVar = sVar5;
                        pVar = pVar3;
                        f0Var.f6979l = c1Var;
                        f0Var.f6976h = oVar2;
                        f0Var.i = null;
                        f0Var.f6977j = i13;
                        f0Var.f6978k = i10;
                        i0Var2.getClass();
                        q6.p pVar4 = new q6.p();
                        pVar4.f6202d = ((Number) kVar2.f6331e.getValue()).floatValue();
                        c1 c1Var4 = c1Var;
                        Object e8 = r.d.e(kVar2, new Float(f8), r.d.m(i13, i10, r.u.f6438b), new a0.d0(pVar4, i0Var2, c1Var4, t1Var, 5), f0Var);
                        if (e8 != aVar) {
                            e8 = mVar22;
                        }
                        if (e8 == aVar) {
                            return aVar;
                        }
                        i = i13;
                        c1Var2 = c1Var4;
                        oVar = oVar2;
                        if (oVar.f6201d) {
                            f0Var.f6979l = c1Var2;
                            f0Var.f6976h = oVar;
                            f0Var.i = oVar;
                            f0Var.f6978k = 3;
                            i12 = i10;
                            sVar4 = sVar3;
                            aVar2 = aVar;
                            i8 = 1;
                            sVar2 = sVar;
                            pVar2 = pVar;
                            b8 = i0.b(f0Var.f6984q, sVar2, pVar2, f0Var.f6986s, sVar4, 50 - i, f0Var);
                            if (b8 == aVar2) {
                                return aVar2;
                            }
                            oVar8 = oVar;
                            oVar.f6201d = ((Boolean) b8).booleanValue();
                            oVar = oVar8;
                            sVar3 = sVar4;
                            aVar = aVar2;
                            c1Var = c1Var2;
                            i10 = i12;
                            i11 = i8;
                            z3 = oVar.f6201d;
                            c6.m mVar222 = c6.m.f1757a;
                            if (!z3) {
                                return mVar222;
                            }
                        } else {
                            c1Var = c1Var2;
                            sVar2 = sVar;
                            pVar2 = pVar;
                            i11 = 1;
                            z3 = oVar.f6201d;
                            c6.m mVar2222 = c6.m.f1757a;
                            if (!z3) {
                            }
                        }
                    }
                }
                c1 c1Var5 = c1Var;
                int i14 = i10;
                i8 = i11;
                q6.s sVar6 = sVar3;
                h6.a aVar3 = aVar;
                i0Var.c(c1Var5, floatValue);
                f0Var.f6979l = c1Var5;
                f0Var.f6976h = oVar;
                f0Var.i = oVar;
                f0Var.f6978k = i8;
                Object b9 = i0.b(f0Var.f6984q, sVar2, pVar2, f0Var.f6986s, sVar6, 50L, f0Var);
                if (b9 == aVar3) {
                    return aVar3;
                }
                q6.o oVar9 = oVar;
                oVar.f6201d = ((Boolean) b9).booleanValue();
                f0Var = this;
                sVar3 = sVar6;
                oVar = oVar9;
                aVar = aVar3;
                i10 = i14;
                c1Var = c1Var5;
                i11 = i8;
                z3 = oVar.f6201d;
                c6.m mVar22222 = c6.m.f1757a;
                if (!z3) {
                }
            }
        }
    }
}
