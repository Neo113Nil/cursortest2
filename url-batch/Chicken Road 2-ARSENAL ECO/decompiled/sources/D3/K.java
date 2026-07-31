package D3;

/* loaded from: classes.dex */
public final class K implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f399b;

    public K(N n7, Runnable runnable) {
        this.f399b = n7;
        this.f398a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        this.f398a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f399b.f403b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
