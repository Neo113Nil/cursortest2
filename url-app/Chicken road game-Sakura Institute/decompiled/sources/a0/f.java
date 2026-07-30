package a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f57g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f58h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f59i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, boolean z8, boolean z9) {
        super(1);
        this.f57g = oVar;
        this.f58h = z8;
        this.f59i = z9;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        y1.i iVar = (y1.i) obj;
        long a3 = this.f57g.a();
        iVar.m(g0.f72c, new f0(this.f58h ? w.z.f9468g : w.z.f9469h, a3, this.f59i ? 1 : 3, u3.r.h(a3)));
        return d6.z.f2639a;
    }
}
