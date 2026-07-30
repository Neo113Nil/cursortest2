package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f1 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r6.v f5482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5483h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f5484i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f5485j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f5486k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q6.c f5488m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(r6.v vVar, Object obj, g gVar, q qVar, l lVar, float f9, q6.c cVar) {
        super(1);
        this.f5482g = vVar;
        this.f5483h = obj;
        this.f5484i = gVar;
        this.f5485j = qVar;
        this.f5486k = lVar;
        this.f5487l = f9;
        this.f5488m = cVar;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        long longValue = ((Number) obj).longValue();
        g gVar = this.f5484i;
        j jVar = new j(this.f5483h, gVar.d(), this.f5485j, longValue, gVar.e(), longValue, new e1(this.f5486k, 0));
        e.h(jVar, longValue, this.f5487l, this.f5484i, this.f5486k, this.f5488m);
        this.f5482g.f7968f = jVar;
        return d6.z.f2639a;
    }
}
