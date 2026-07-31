package D;

/* loaded from: classes.dex */
public final class Q implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f51a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f52b;

    public Q(T t2, Runnable runnable) {
        this.f52b = t2;
        this.f51a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        this.f51a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f52b.f56b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
