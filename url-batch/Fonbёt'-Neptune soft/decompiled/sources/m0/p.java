package m0;

import D0.RunnableC0043c;

/* loaded from: classes.dex */
public final class p implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.l f3178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC0043c f3179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f3180c;

    public p(q qVar, io.flutter.embedding.engine.renderer.l lVar, RunnableC0043c runnableC0043c) {
        this.f3180c = qVar;
        this.f3178a = lVar;
        this.f3179b = runnableC0043c;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        j jVar;
        this.f3178a.f2537a.removeIsDisplayingFlutterUiListener(this);
        this.f3179b.run();
        q qVar = this.f3180c;
        if ((qVar.f3186h instanceof j) || (jVar = qVar.f3185g) == null) {
            return;
        }
        jVar.c();
        j jVar2 = qVar.f3185g;
        if (jVar2 != null) {
            jVar2.f3162e.close();
            qVar.removeView(qVar.f3185g);
            qVar.f3185g = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }
}
