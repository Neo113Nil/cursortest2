package E1;

/* loaded from: classes.dex */
public final class s implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.j f380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0.n f381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f382c;

    public s(t tVar, io.flutter.embedding.engine.renderer.j jVar, B0.n nVar) {
        this.f382c = tVar;
        this.f380a = jVar;
        this.f381b = nVar;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        C0034j c0034j;
        this.f380a.g(this);
        this.f381b.run();
        t tVar = this.f382c;
        if ((tVar.f389e instanceof C0034j) || (c0034j = tVar.f388d) == null) {
            return;
        }
        c0034j.a();
        C0034j c0034j2 = tVar.f388d;
        if (c0034j2 != null) {
            c0034j2.f357a.close();
            tVar.removeView(tVar.f388d);
            tVar.f388d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
