package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public y0 f6609a;

    /* renamed from: b, reason: collision with root package name */
    public m.w0 f6610b;

    /* renamed from: c, reason: collision with root package name */
    public k f6611c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f6612d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6613e;

    /* renamed from: f, reason: collision with root package name */
    public b1.b f6614f;

    /* renamed from: g, reason: collision with root package name */
    public int f6615g = 1;

    /* renamed from: h, reason: collision with root package name */
    public n0 f6616h = androidx.compose.foundation.gestures.a.f613a;

    /* renamed from: i, reason: collision with root package name */
    public final d1 f6617i = new d1(this);

    /* renamed from: j, reason: collision with root package name */
    public final c1.a f6618j = new c1.a(22, this);

    public f1(y0 y0Var, m.w0 w0Var, k kVar, j0 j0Var, boolean z8, b1.b bVar) {
        this.f6609a = y0Var;
        this.f6610b = w0Var;
        this.f6611c = kVar;
        this.f6612d = j0Var;
        this.f6613e = z8;
        this.f6614f = bVar;
    }

    public static final long a(f1 f1Var, n0 n0Var, long j8, int i7) {
        k1.e eVar = (k1.e) f1Var.f6614f.f1230g;
        k1.e eVar2 = null;
        k1.e eVar3 = (eVar == null || !eVar.f8116r) ? null : (k1.e) r1.f.k(eVar);
        long E0 = eVar3 != null ? eVar3.E0(j8, i7) : 0L;
        long g9 = y0.c.g(j8, E0);
        long d8 = f1Var.d(f1Var.g(n0Var.a(f1Var.f(f1Var.d(y0.c.a(g9, 0.0f, f1Var.f6612d == j0.f6658g ? 1 : 2))))));
        long g10 = y0.c.g(g9, d8);
        k1.e eVar4 = (k1.e) f1Var.f6614f.f1230g;
        if (eVar4 != null && eVar4.f8116r) {
            eVar2 = (k1.e) r1.f.k(eVar4);
        }
        k1.e eVar5 = eVar2;
        return y0.c.h(y0.c.h(E0, d8), eVar5 != null ? eVar5.C0(d8, g10, i7) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j8, j6.c cVar) {
        a1 a1Var;
        int i7;
        r6.u uVar;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i8 = a1Var.f6563i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                a1Var.f6563i = i8 - Integer.MIN_VALUE;
                Object obj = a1Var.f6561g;
                i7 = a1Var.f6563i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    r6.u uVar2 = new r6.u();
                    uVar2.f7967f = j8;
                    q6.e c1Var = new c1(this, uVar2, j8, null);
                    a1Var.f6560f = uVar2;
                    a1Var.f6563i = 1;
                    Object e9 = e(m.p0.f6228f, c1Var, a1Var);
                    Object obj2 = i6.a.f4956f;
                    if (e9 == obj2) {
                        return obj2;
                    }
                    uVar = uVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = a1Var.f6560f;
                    d6.a.e(obj);
                }
                return new m2.o(uVar.f7967f);
            }
        }
        a1Var = new a1(this, cVar);
        Object obj3 = a1Var.f6561g;
        i7 = a1Var.f6563i;
        if (i7 != 0) {
        }
        return new m2.o(uVar.f7967f);
    }

    public final float c(float f9) {
        return this.f6613e ? f9 * (-1) : f9;
    }

    public final long d(long j8) {
        return this.f6613e ? y0.c.i(j8, -1.0f) : j8;
    }

    public final Object e(m.p0 p0Var, q6.e eVar, j6.c cVar) {
        Object b9 = this.f6609a.b(p0Var, new a0.a0(this, eVar, (h6.d) null), cVar);
        return b9 == i6.a.f4956f ? b9 : d6.z.f2639a;
    }

    public final float f(long j8) {
        return this.f6612d == j0.f6658g ? y0.c.d(j8) : y0.c.e(j8);
    }

    public final long g(float f9) {
        if (f9 == 0.0f) {
            return 0L;
        }
        return this.f6612d == j0.f6658g ? u3.r.a(f9, 0.0f) : u3.r.a(0.0f, f9);
    }
}
