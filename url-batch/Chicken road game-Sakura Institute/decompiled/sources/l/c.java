package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f5417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, h6.d dVar2) {
        super(1, dVar2);
        this.f5417g = dVar;
        this.f5418h = obj;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new c(this.f5417g, this.f5418h, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        c cVar = (c) create((h6.d) obj);
        d6.z zVar = d6.z.f2639a;
        cVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        d6.a.e(obj);
        d dVar = this.f5417g;
        d.b(dVar);
        Object a3 = d.a(dVar, this.f5418h);
        dVar.f5427c.f5563g.setValue(a3);
        dVar.f5429e.setValue(a3);
        return d6.z.f2639a;
    }
}
