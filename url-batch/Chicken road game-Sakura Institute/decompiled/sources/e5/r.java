package e5;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements z5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a0.s f2794c = new a0.s(14);

    /* renamed from: d, reason: collision with root package name */
    public static final g f2795d = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public z5.a f2796a;

    /* renamed from: b, reason: collision with root package name */
    public volatile z5.b f2797b;

    public r(a0.s sVar, z5.b bVar) {
        this.f2796a = sVar;
        this.f2797b = bVar;
    }

    public final void a(z5.a aVar) {
        z5.b bVar;
        z5.b bVar2;
        z5.b bVar3 = this.f2797b;
        g gVar = f2795d;
        if (bVar3 != gVar) {
            aVar.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f2797b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f2796a = new b6.d(this.f2796a, 2, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.a(bVar);
        }
    }

    @Override // z5.b
    public final Object get() {
        return this.f2797b.get();
    }
}
