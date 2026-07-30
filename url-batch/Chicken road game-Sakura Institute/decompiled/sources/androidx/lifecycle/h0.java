package androidx.lifecycle;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 implements t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6.v f982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c7.x f983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f984i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c7.h f985j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k7.c f986k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.a0 f987l;

    public h0(n nVar, r6.v vVar, c7.x xVar, n nVar2, c7.h hVar, k7.c cVar, a0.a0 a0Var) {
        this.f981f = nVar;
        this.f982g = vVar;
        this.f983h = xVar;
        this.f984i = nVar2;
        this.f985j = hVar;
        this.f986k = cVar;
        this.f987l = a0Var;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        n nVar2 = this.f981f;
        r6.v vVar2 = this.f982g;
        if (nVar == nVar2) {
            vVar2.f7968f = c7.a0.p(this.f983h, null, null, new g0(this.f986k, this.f987l, (h6.d) null), 3);
            return;
        }
        if (nVar == this.f984i) {
            c7.x0 x0Var = (c7.x0) vVar2.f7968f;
            if (x0Var != null) {
                x0Var.c(null);
            }
            vVar2.f7968f = null;
        }
        if (nVar == n.ON_DESTROY) {
            this.f985j.resumeWith(d6.z.f2639a);
        }
    }
}
