package c0;

/* loaded from: classes.dex */
public final class q implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f1733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k f1734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1735c;

    public q(r rVar, io.flutter.embedding.engine.renderer.h hVar, androidx.lifecycle.k kVar) {
        this.f1735c = rVar;
        this.f1733a = hVar;
        this.f1734b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        C0108j c0108j;
        this.f1733a.c(this);
        this.f1734b.run();
        r rVar = this.f1735c;
        if ((rVar.f1746i instanceof C0108j) || (c0108j = rVar.f1745h) == null) {
            return;
        }
        c0108j.d();
        C0108j c0108j2 = rVar.f1745h;
        if (c0108j2 != null) {
            c0108j2.f1713e.close();
            rVar.removeView(rVar.f1745h);
            rVar.f1745h = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
