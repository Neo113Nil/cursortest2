package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public y0.l f7825a;

    /* renamed from: b, reason: collision with root package name */
    public int f7826b;

    /* renamed from: c, reason: collision with root package name */
    public o0.e f7827c;

    /* renamed from: d, reason: collision with root package name */
    public o0.e f7828d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f7830f;

    public z0(b1 b1Var, y0.l lVar, int i, o0.e eVar, o0.e eVar2, boolean z3) {
        this.f7830f = b1Var;
        this.f7825a = lVar;
        this.f7826b = i;
        this.f7827c = eVar;
        this.f7828d = eVar2;
        this.f7829e = z3;
    }

    public final boolean a(int i, int i8) {
        o0.e eVar = this.f7827c;
        int i9 = this.f7826b;
        y0.k kVar = (y0.k) eVar.f5578d[i + i9];
        y0.k kVar2 = (y0.k) this.f7828d.f5578d[i9 + i8];
        return q6.i.a(kVar, kVar2) || kVar.getClass() == kVar2.getClass();
    }
}
