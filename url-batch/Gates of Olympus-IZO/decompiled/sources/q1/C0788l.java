package q1;

/* renamed from: q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788l extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.p f6920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z1.p f6921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0775D f6922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f6923h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M1.j f6924i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0788l(Z1.p pVar, Z1.p pVar2, C0775D c0775d, boolean z3, M1.j jVar) {
        super(1);
        this.f6920e = pVar;
        this.f6921f = pVar2;
        this.f6922g = c0775d;
        this.f6923h = z3;
        this.f6924i = jVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        C0784h c0784h = (C0784h) obj;
        Z1.i.f(c0784h, "entry");
        this.f6920e.f3476d = true;
        this.f6921f.f3476d = true;
        this.f6922g.n(c0784h, this.f6923h, this.f6924i);
        return L1.z.f2729a;
    }
}
