package c4;

import android.app.Application;

/* loaded from: classes.dex */
public final class h extends c1 {

    /* renamed from: b, reason: collision with root package name */
    private v1<Application> f1972b;

    /* renamed from: c, reason: collision with root package name */
    private v1<m> f1973c;

    /* renamed from: d, reason: collision with root package name */
    private v1<c> f1974d;

    /* renamed from: e, reason: collision with root package name */
    private v1<v> f1975e;

    /* renamed from: f, reason: collision with root package name */
    private v1<a0> f1976f;

    /* renamed from: g, reason: collision with root package name */
    private v1<b0> f1977g;

    /* renamed from: h, reason: collision with root package name */
    private v1<h2> f1978h;

    /* renamed from: i, reason: collision with root package name */
    private v1<y1> f1979i;

    /* renamed from: j, reason: collision with root package name */
    private v1<k> f1980j;

    /* renamed from: k, reason: collision with root package name */
    private v1<t2> f1981k;

    /* renamed from: l, reason: collision with root package name */
    private v1<j2> f1982l;

    /* renamed from: m, reason: collision with root package name */
    private v1<d2> f1983m;

    private h(Application application) {
        f fVar;
        q qVar;
        q qVar2;
        o oVar;
        q qVar3;
        s1 a7 = u1.a(application);
        this.f1972b = a7;
        this.f1973c = t1.a(new p(a7));
        fVar = e.f1952a;
        this.f1974d = t1.a(fVar);
        g gVar = new g(this);
        this.f1975e = gVar;
        this.f1976f = t1.a(new e0(gVar));
        x1 x1Var = new x1(this.f1972b);
        this.f1977g = x1Var;
        this.f1978h = new k2(this.f1972b, x1Var, this.f1973c);
        qVar = t.f2102a;
        this.f1979i = t1.a(new b2(qVar));
        v1<Application> v1Var = this.f1972b;
        v1<m> v1Var2 = this.f1973c;
        qVar2 = t.f2102a;
        n nVar = new n(v1Var, v1Var2, qVar2);
        this.f1980j = nVar;
        this.f1981k = new d(this.f1979i, nVar, this.f1973c);
        v1<Application> v1Var3 = this.f1972b;
        v1<c> v1Var4 = this.f1974d;
        oVar = r.f2091a;
        qVar3 = t.f2102a;
        p2 p2Var = new p2(v1Var3, v1Var4, oVar, qVar3, this.f1973c, this.f1976f, this.f1978h, this.f1981k, this.f1979i);
        this.f1982l = p2Var;
        this.f1983m = t1.a(new g2(this.f1973c, p2Var, this.f1976f));
    }

    /* synthetic */ h(Application application, g gVar) {
        this(application);
    }

    @Override // c4.c1
    public final d2 b() {
        return this.f1983m.zza();
    }

    @Override // c4.c1
    public final a0 c() {
        return this.f1976f.zza();
    }
}
