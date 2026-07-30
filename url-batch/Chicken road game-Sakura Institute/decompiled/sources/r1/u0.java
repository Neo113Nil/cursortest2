package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public s0.n f7904a;

    /* renamed from: b, reason: collision with root package name */
    public int f7905b;

    /* renamed from: c, reason: collision with root package name */
    public i0.d f7906c;

    /* renamed from: d, reason: collision with root package name */
    public i0.d f7907d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7908e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.t f7909f;

    public u0(g0.t tVar, s0.n nVar, int i7, i0.d dVar, i0.d dVar2, boolean z8) {
        this.f7909f = tVar;
        this.f7904a = nVar;
        this.f7905b = i7;
        this.f7906c = dVar;
        this.f7907d = dVar2;
        this.f7908e = z8;
    }

    public final boolean a(int i7, int i8) {
        i0.d dVar = this.f7906c;
        int i9 = this.f7905b;
        s0.m mVar = (s0.m) dVar.f4840f[i7 + i9];
        s0.m mVar2 = (s0.m) this.f7907d.f4840f[i9 + i8];
        v0 v0Var = w0.f7910a;
        return r6.k.a(mVar, mVar2) || mVar.getClass() == mVar2.getClass();
    }
}
