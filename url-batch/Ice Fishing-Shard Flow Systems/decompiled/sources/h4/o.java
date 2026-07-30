package h4;

/* loaded from: classes.dex */
public final class o implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.j f5229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.k f5230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f5231c;

    public o(p pVar, io.flutter.embedding.engine.renderer.j jVar, A.k kVar) {
        this.f5231c = pVar;
        this.f5229a = jVar;
        this.f5230b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        i iVar;
        this.f5229a.g(this);
        this.f5230b.run();
        p pVar = this.f5231c;
        if ((pVar.f5246m instanceof i) || (iVar = pVar.f5245l) == null) {
            return;
        }
        iVar.a();
        i iVar2 = pVar.f5245l;
        if (iVar2 != null) {
            iVar2.f5209d.close();
            pVar.removeView(pVar.f5245l);
            pVar.f5245l = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
