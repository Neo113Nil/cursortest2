package g6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: d, reason: collision with root package name */
    public final g f3042d;

    public a(g gVar) {
        this.f3042d = gVar;
    }

    @Override // g6.h
    public final /* bridge */ h c(h hVar) {
        return a.a.v(this, hVar);
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.f
    public final g getKey() {
        return this.f3042d;
    }

    @Override // g6.h
    public /* bridge */ f l(g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // g6.h
    public /* bridge */ h v(g gVar) {
        return a.a.s(this, gVar);
    }
}
