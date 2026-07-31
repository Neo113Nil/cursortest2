package k0;

/* loaded from: classes.dex */
public final class n implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.i f2710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k f2711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f2712c;

    public n(o oVar, io.flutter.embedding.engine.renderer.i iVar, androidx.lifecycle.k kVar) {
        this.f2712c = oVar;
        this.f2710a = iVar;
        this.f2711b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        C0191h c0191h;
        this.f2710a.c(this);
        this.f2711b.run();
        o oVar = this.f2712c;
        if ((oVar.f2724j instanceof C0191h) || (c0191h = oVar.f2723i) == null) {
            return;
        }
        c0191h.a();
        C0191h c0191h2 = oVar.f2723i;
        if (c0191h2 != null) {
            c0191h2.f2690e.close();
            oVar.removeView(oVar.f2723i);
            oVar.f2723i = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
