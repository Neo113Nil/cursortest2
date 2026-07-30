package c0;

/* loaded from: classes.dex */
public final class I implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f1676b;

    public I(K k2, Runnable runnable) {
        this.f1676b = k2;
        this.f1675a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        this.f1675a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f1676b.f1680b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
