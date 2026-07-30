package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.a f75g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f76h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0.h f77i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0.m f78j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q6.a aVar, boolean z8, z0.h hVar, z0.m mVar) {
        super(1);
        this.f75g = aVar;
        this.f76h = z8;
        this.f77i = hVar;
        this.f78j = mVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        r1.f0 f0Var = (r1.f0) obj;
        f0Var.b();
        b1.c cVar = f0Var.f7767f;
        if (((Boolean) this.f75g.a()).booleanValue()) {
            boolean z8 = this.f76h;
            z0.m mVar = this.f78j;
            z0.h hVar = this.f77i;
            if (z8) {
                long Q = cVar.Q();
                b1.b bVar = cVar.f1234g;
                long p6 = bVar.p();
                bVar.k().o();
                try {
                    ((b6.c) bVar.f1230g).y(-1.0f, 1.0f, Q);
                    cVar.e(hVar, mVar);
                } finally {
                    m.s(bVar, p6);
                }
            } else {
                cVar.e(hVar, mVar);
            }
        }
        return d6.z.f2639a;
    }
}
