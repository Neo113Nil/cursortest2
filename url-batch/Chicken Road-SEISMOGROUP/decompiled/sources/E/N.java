package E;

/* loaded from: classes.dex */
public final class N implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f130b;

    public N(P p2, Runnable runnable) {
        this.f130b = p2;
        this.f129a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        this.f129a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f130b.f134b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
