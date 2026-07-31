package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f6226h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Object obj, g6.c cVar2) {
        super(1, cVar2);
        this.f6226h = cVar;
        this.i = obj;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        b bVar = new b(this.f6226h, this.i, (g6.c) obj);
        c6.m mVar = c6.m.f1757a;
        bVar.p(mVar);
        return mVar;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        s6.a.K(obj);
        c cVar = this.f6226h;
        c.b(cVar);
        Object a8 = c.a(cVar, this.i);
        cVar.f6235c.f6331e.setValue(a8);
        cVar.f6237e.setValue(a8);
        return c6.m.f1757a;
    }
}
