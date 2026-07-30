package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y0 f7375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7376h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.n0 f7377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1.h0 f7379k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, int i7, p1.n0 n0Var, int i8, p1.h0 h0Var) {
        super(1);
        this.f7375g = y0Var;
        this.f7376h = i7;
        this.f7377i = n0Var;
        this.f7378j = i8;
        this.f7379k = h0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q6.e, r6.l] */
    @Override // q6.c
    public final Object f(Object obj) {
        ?? r02 = this.f7375g.f7381t;
        p1.n0 n0Var = this.f7377i;
        p1.m0.e((p1.m0) obj, n0Var, ((m2.h) r02.d(new m2.j(j1.c.G(this.f7376h - n0Var.f7063f, this.f7378j - n0Var.f7064g)), this.f7379k.getLayoutDirection())).f6315a);
        return d6.z.f2639a;
    }
}
