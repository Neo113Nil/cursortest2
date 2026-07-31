package D3;

import H1.RunnableC0139m;

/* loaded from: classes.dex */
public final class s implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC0139m f462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f463c;

    public s(t tVar, io.flutter.embedding.engine.renderer.h hVar, RunnableC0139m runnableC0139m) {
        this.f463c = tVar;
        this.f461a = hVar;
        this.f462b = runnableC0139m;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        C0122j c0122j;
        this.f461a.c(this);
        this.f462b.run();
        t tVar = this.f463c;
        if ((tVar.f475j instanceof C0122j) || (c0122j = tVar.f474i) == null) {
            return;
        }
        c0122j.a();
        C0122j c0122j2 = tVar.f474i;
        if (c0122j2 != null) {
            c0122j2.f437f.close();
            tVar.removeView(tVar.f474i);
            tVar.f474i = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
