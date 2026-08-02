package E1;

/* loaded from: classes.dex */
public final class J implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f323b;

    public J(L l3, Runnable runnable) {
        this.f323b = l3;
        this.f322a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        this.f322a.run();
        io.flutter.embedding.engine.renderer.j jVar = this.f323b.f325b;
        if (jVar != null) {
            jVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
