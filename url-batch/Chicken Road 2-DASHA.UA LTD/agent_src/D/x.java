package D;

/* loaded from: classes.dex */
public final class x implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.h f116b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f117c;

    public x(y yVar, io.flutter.embedding.engine.renderer.h hVar, F.h hVar2) {
        this.f117c = yVar;
        this.f115a = hVar;
        this.f116b = hVar2;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        C0012m c0012m;
        this.f115a.c(this);
        this.f116b.run();
        y yVar = this.f117c;
        if ((yVar.f125f instanceof C0012m) || (c0012m = yVar.f124e) == null) {
            return;
        }
        c0012m.d();
        C0012m c0012m2 = yVar.f124e;
        if (c0012m2 != null) {
            c0012m2.f89a.close();
            yVar.removeView(yVar.f124e);
            yVar.f124e = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
    }
}
