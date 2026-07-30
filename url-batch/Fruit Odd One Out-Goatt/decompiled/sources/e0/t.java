package e0;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class t implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f208a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.k f209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f210c;

    public t(u uVar, io.flutter.embedding.engine.renderer.h hVar, androidx.lifecycle.k kVar) {
        this.f210c = uVar;
        this.f208a = hVar;
        this.f209b = kVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        k kVar;
        this.f208a.c(this);
        this.f209b.run();
        u uVar = this.f210c;
        if ((uVar.f215e instanceof k) || (kVar = uVar.f214d) == null) {
            return;
        }
        kVar.c();
        k kVar2 = uVar.f214d;
        if (kVar2 != null) {
            kVar2.f168a.close();
            uVar.removeView(uVar.f214d);
            uVar.f214d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
