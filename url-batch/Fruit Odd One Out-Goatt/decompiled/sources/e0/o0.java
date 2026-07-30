package e0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o0 implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f195b;

    public o0(q0 q0Var, Runnable runnable) {
        this.f195b = q0Var;
        this.f194a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        this.f194a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f195b.f201b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
