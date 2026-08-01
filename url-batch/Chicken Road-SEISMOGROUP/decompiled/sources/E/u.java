package E;

/* loaded from: classes.dex */
public final class u implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B.e f188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f189c;

    public u(v vVar, io.flutter.embedding.engine.renderer.h hVar, B.e eVar) {
        this.f189c = vVar;
        this.f187a = hVar;
        this.f188b = eVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        C0011l c0011l;
        this.f187a.c(this);
        this.f188b.run();
        v vVar = this.f189c;
        if ((vVar.f193d instanceof C0011l) || (c0011l = vVar.f192c) == null) {
            return;
        }
        c0011l.d();
        C0011l c0011l2 = vVar.f192c;
        if (c0011l2 != null) {
            c0011l2.f167a.close();
            vVar.removeView(vVar.f192c);
            vVar.f192c = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
