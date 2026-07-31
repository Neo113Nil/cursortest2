package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3868h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.c f3869j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f3870k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v.h f3872m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3873n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(r.c cVar, float f6, boolean z3, Object obj, v.h hVar, g6.c cVar2, int i) {
        super(2, cVar2);
        this.f3868h = i;
        this.f3869j = cVar;
        this.f3870k = f6;
        this.f3871l = z3;
        this.f3873n = obj;
        this.f3872m = hVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f3868h) {
        }
        return ((r) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f3868h) {
            case 0:
                return new r(this.f3869j, this.f3870k, this.f3871l, (s) this.f3873n, this.f3872m, cVar, 0);
            default:
                return new r(this.f3869j, this.f3870k, this.f3871l, (x) this.f3873n, this.f3872m, cVar, 1);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f3868h) {
            case 0:
                s sVar = (s) this.f3873n;
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    r.c cVar = this.f3869j;
                    float f6 = ((r2.f) cVar.f6237e.getValue()).f6520d;
                    float f8 = this.f3870k;
                    if (!r2.f.a(f6, f8)) {
                        boolean z3 = this.f3871l;
                        h6.a aVar = h6.a.f3204d;
                        if (z3) {
                            float f9 = ((r2.f) cVar.f6237e.getValue()).f6520d;
                            v.h lVar = r2.f.a(f9, sVar.f3882b) ? new v.l(0L) : r2.f.a(f9, sVar.f3884d) ? new v.f() : r2.f.a(f9, sVar.f3883c) ? new v.d() : null;
                            this.i = 2;
                            if (k0.e.a(cVar, f8, lVar, this.f3872m, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            r2.f fVar = new r2.f(f8);
                            this.i = 1;
                            if (cVar.e(fVar, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                x xVar = (x) this.f3873n;
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    r.c cVar2 = this.f3869j;
                    float f10 = ((r2.f) cVar2.f6237e.getValue()).f6520d;
                    float f11 = this.f3870k;
                    if (!r2.f.a(f10, f11)) {
                        boolean z7 = this.f3871l;
                        h6.a aVar2 = h6.a.f3204d;
                        if (z7) {
                            float f12 = ((r2.f) cVar2.f6237e.getValue()).f6520d;
                            v.h lVar2 = r2.f.a(f12, xVar.f3937b) ? new v.l(0L) : r2.f.a(f12, xVar.f3939d) ? new v.f() : r2.f.a(f12, xVar.f3938c) ? new v.d() : r2.f.a(f12, xVar.f3940e) ? new v.b() : null;
                            this.i = 2;
                            if (k0.e.a(cVar2, f11, lVar2, this.f3872m, this) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            r2.f fVar2 = new r2.f(f11);
                            this.i = 1;
                            if (cVar2.e(fVar2, this) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                } else {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
        }
    }
}
