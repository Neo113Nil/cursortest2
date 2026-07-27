package w2;

/* loaded from: classes.dex */
public final class x implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f12220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f12221b;

    public x(z zVar, Runnable runnable) {
        this.f12221b = zVar;
        this.f12220a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        this.f12220a.run();
        io.flutter.embedding.engine.renderer.i iVar = this.f12221b.f12223b;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
