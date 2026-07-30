package h4;

/* renamed from: h4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484E implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f5174b;

    public C0484E(G g7, Runnable runnable) {
        this.f5174b = g7;
        this.f5173a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        this.f5173a.run();
        io.flutter.embedding.engine.renderer.j jVar = this.f5174b.f5178b;
        if (jVar != null) {
            jVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
