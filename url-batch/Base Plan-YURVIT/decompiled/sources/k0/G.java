package k0;

/* loaded from: classes.dex */
public final class G implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f2654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2655b;

    public G(I i2, Runnable runnable) {
        this.f2655b = i2;
        this.f2654a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        this.f2654a.run();
        io.flutter.embedding.engine.renderer.i iVar = this.f2655b.f2659b;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
