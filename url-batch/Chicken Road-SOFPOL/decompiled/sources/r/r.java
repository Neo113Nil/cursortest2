package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r implements g {

    /* renamed from: a, reason: collision with root package name */
    public final c5.x f6402a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f6403b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6404c;

    /* renamed from: d, reason: collision with root package name */
    public final p f6405d;

    /* renamed from: e, reason: collision with root package name */
    public final p f6406e;

    /* renamed from: f, reason: collision with root package name */
    public final p f6407f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6408g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6409h;

    public r(s sVar, r1 r1Var, Object obj, p pVar) {
        c5.x xVar = new c5.x(sVar.f6415a);
        this.f6402a = xVar;
        this.f6403b = r1Var;
        this.f6404c = obj;
        p pVar2 = (p) r1Var.f6413a.i(obj);
        this.f6405d = pVar2;
        this.f6406e = d.f(pVar);
        p6.c cVar = r1Var.f6414b;
        if (((p) xVar.f1740g) == null) {
            xVar.f1740g = pVar2.c();
        }
        p pVar3 = (p) xVar.f1740g;
        if (pVar3 == null) {
            q6.i.j("targetVector");
            throw null;
        }
        int b8 = pVar3.b();
        int i = 0;
        while (i < b8) {
            p pVar4 = (p) xVar.f1740g;
            if (pVar4 == null) {
                q6.i.j("targetVector");
                throw null;
            }
            b1.b bVar = (b1.b) xVar.f1737d;
            float a8 = pVar2.a(i);
            float a9 = pVar.a(i);
            double b9 = ((c4.e) bVar.f1050e).b(a9);
            double d8 = q.q0.f5895a;
            int i8 = i;
            pVar4.e(i8, (Math.signum(a9) * ((float) (Math.exp((d8 / (d8 - 1.0d)) * b9) * r13.f1624a * r13.f1625b))) + a8);
            i = i8 + 1;
        }
        p pVar5 = (p) xVar.f1740g;
        if (pVar5 == null) {
            q6.i.j("targetVector");
            throw null;
        }
        this.f6408g = cVar.i(pVar5);
        c5.x xVar2 = this.f6402a;
        p pVar6 = this.f6405d;
        if (((p) xVar2.f1739f) == null) {
            xVar2.f1739f = pVar6.c();
        }
        p pVar7 = (p) xVar2.f1739f;
        if (pVar7 == null) {
            q6.i.j("velocityVector");
            throw null;
        }
        int b10 = pVar7.b();
        long j7 = 0;
        for (int i9 = 0; i9 < b10; i9++) {
            b1.b bVar2 = (b1.b) xVar2.f1737d;
            pVar6.getClass();
            j7 = Math.max(j7, ((long) (Math.exp(((c4.e) bVar2.f1050e).b(pVar.a(i9)) / (q.q0.f5895a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f6409h = j7;
        p f6 = d.f(this.f6402a.j(j7, this.f6405d, pVar));
        this.f6407f = f6;
        int b11 = f6.b();
        for (int i10 = 0; i10 < b11; i10++) {
            p pVar8 = this.f6407f;
            float a10 = pVar8.a(i10);
            this.f6402a.getClass();
            this.f6402a.getClass();
            pVar8.e(i10, r2.o.s(a10, -0.0f, 0.0f));
        }
    }

    @Override // r.g
    public final boolean a() {
        return false;
    }

    @Override // r.g
    public final Object b(long j7) {
        if (g(j7)) {
            return this.f6408g;
        }
        p6.c cVar = this.f6403b.f6414b;
        c5.x xVar = this.f6402a;
        p pVar = (p) xVar.f1738e;
        p pVar2 = this.f6405d;
        if (pVar == null) {
            xVar.f1738e = pVar2.c();
        }
        p pVar3 = (p) xVar.f1738e;
        if (pVar3 == null) {
            q6.i.j("valueVector");
            throw null;
        }
        int b8 = pVar3.b();
        for (int i = 0; i < b8; i++) {
            p pVar4 = (p) xVar.f1738e;
            if (pVar4 == null) {
                q6.i.j("valueVector");
                throw null;
            }
            b1.b bVar = (b1.b) xVar.f1737d;
            float a8 = pVar2.a(i);
            long j8 = j7 / 1000000;
            q.p0 a9 = ((c4.e) bVar.f1050e).a(this.f6406e.a(i));
            long j9 = a9.f5892c;
            pVar4.e(i, (Math.signum(a9.f5890a) * a9.f5891b * q.b.a(j9 > 0 ? j8 / j9 : 1.0f).f5795a) + a8);
        }
        p pVar5 = (p) xVar.f1738e;
        if (pVar5 != null) {
            return cVar.i(pVar5);
        }
        q6.i.j("valueVector");
        throw null;
    }

    @Override // r.g
    public final long c() {
        return this.f6409h;
    }

    @Override // r.g
    public final r1 d() {
        return this.f6403b;
    }

    @Override // r.g
    public final Object e() {
        return this.f6408g;
    }

    @Override // r.g
    public final p f(long j7) {
        if (g(j7)) {
            return this.f6407f;
        }
        return this.f6402a.j(j7, this.f6405d, this.f6406e);
    }
}
