package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.a f18e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f21h;

    public /* synthetic */ b0(String str, String str2, b6.i iVar, p6.a aVar, int i) {
        this.f19f = str;
        this.f20g = str2;
        this.f21h = iVar;
        this.f18e = aVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f17d) {
            case 0:
                ((Integer) obj2).getClass();
                int w7 = m0.b.w(1);
                g0.a(this.f18e, (y0.m) this.f19f, (n0) this.f20g, (z.j) this.f21h, (m0.s) obj, w7);
                break;
            default:
                ((Integer) obj2).getClass();
                int w8 = m0.b.w(439);
                b6.k.g((String) this.f19f, (String) this.f20g, (b6.i) this.f21h, this.f18e, (m0.s) obj, w8);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ b0(p6.a aVar, y0.m mVar, n0 n0Var, z.j jVar, int i) {
        this.f18e = aVar;
        this.f19f = mVar;
        this.f20g = n0Var;
        this.f21h = jVar;
    }
}
