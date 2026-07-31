package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z1 implements c {

    /* renamed from: d, reason: collision with root package name */
    public final o.w f5213d = new o.w();

    /* renamed from: e, reason: collision with root package name */
    public final o.e0 f5214e = new o.e0();

    /* renamed from: f, reason: collision with root package name */
    public final Object f5215f;

    public z1(Object obj) {
        this.f5215f = obj;
    }

    public final void a(w1.y1 y1Var, u0.i iVar) {
        Exception exc;
        o.w wVar = this.f5213d;
        int i = wVar.f5560b;
        o.e0 e0Var = new o.e0();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            o.e0 e0Var2 = this.f5214e;
            if (i8 >= i) {
                if (i9 != e0Var2.f5443b) {
                    t.c("Applier operation size mismatch");
                }
                e0Var2.c();
                wVar.f5560b = 0;
                y1Var.g();
                return;
            }
            int i10 = i8 + 1;
            try {
                try {
                    switch (wVar.b(i8)) {
                        case 0:
                            y1Var.n();
                            i8 = i10;
                        case 1:
                            int i11 = i9 + 1;
                            y1Var.d(e0Var2.e(i9));
                            i9 = i11;
                            i8 = i10;
                        case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                            int i12 = i8 + 2;
                            i8 += 3;
                            y1Var.j(wVar.b(i10), wVar.b(i12));
                        case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                            int i13 = i8 + 2;
                            try {
                                int i14 = i8 + 3;
                                try {
                                    i8 += 4;
                                    y1Var.h(wVar.b(i10), wVar.b(i13), wVar.b(i14));
                                } catch (Exception e8) {
                                    exc = e8;
                                    i8 = i14;
                                    break;
                                }
                            } catch (Exception e9) {
                                exc = e9;
                                i8 = i13;
                                break;
                            }
                        case a4.i.LONG_FIELD_NUMBER /* 4 */:
                            y1Var.a();
                            i8 = i10;
                        case 5:
                            i8 += 2;
                            int i15 = i9 + 1;
                            y1Var.b(wVar.b(i10), e0Var2.e(i9));
                            i9 = i15;
                        case 6:
                            i8 += 2;
                            try {
                                wVar.b(i10);
                                int i16 = i9 + 1;
                                i9 = i16;
                            } catch (Exception e10) {
                                exc = e10;
                                break;
                            }
                        case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i17 = i9 + 1;
                            Object e11 = e0Var2.e(i9);
                            q6.i.c(e11, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            q6.v.c(2, e11);
                            i9 += 2;
                            y1Var.c(e0Var2.e(i17), (p6.e) e11);
                            i8 = i10;
                        case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                            Object obj = y1Var.f7824f;
                            if (obj instanceof j) {
                                j jVar = (j) obj;
                                if (iVar.f7159f.j(jVar)) {
                                    jVar.b();
                                }
                            }
                            e0Var.a(obj);
                            y1Var.e();
                            i8 = i10;
                        default:
                            i8 = i10;
                    }
                } catch (Throwable th) {
                    y1Var.g();
                    throw th;
                }
            } catch (Exception e12) {
                exc = e12;
                i8 = i10;
            }
            exc = e10;
            throw new l(e0Var2, e0Var, wVar, i8, exc);
        }
    }

    @Override // m0.c
    public final void b(int i, Object obj) {
        o.w wVar = this.f5213d;
        wVar.a(5);
        wVar.a(i);
        this.f5214e.a(obj);
    }

    @Override // m0.c
    public final void c(Object obj, p6.e eVar) {
        this.f5213d.a(7);
        o.e0 e0Var = this.f5214e;
        e0Var.a(eVar);
        e0Var.a(obj);
    }

    @Override // m0.c
    public final void d(Object obj) {
        this.f5213d.a(1);
        this.f5214e.a(obj);
    }

    @Override // m0.c
    public final void e() {
        this.f5213d.a(8);
    }

    @Override // m0.c
    public final void f(int i, Object obj) {
        o.w wVar = this.f5213d;
        wVar.a(6);
        wVar.a(i);
        this.f5214e.a(obj);
    }

    @Override // m0.c
    public final void h(int i, int i8, int i9) {
        o.w wVar = this.f5213d;
        wVar.a(3);
        wVar.a(i);
        wVar.a(i8);
        wVar.a(i9);
    }

    @Override // m0.c
    public final Object i() {
        return this.f5215f;
    }

    @Override // m0.c
    public final void j(int i, int i8) {
        o.w wVar = this.f5213d;
        wVar.a(2);
        wVar.a(i);
        wVar.a(i8);
    }

    @Override // m0.c
    public final void n() {
        this.f5213d.a(0);
    }
}
