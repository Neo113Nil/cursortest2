package M2;

import G0.C0054d;
import w2.AbstractActivityC1515c;

/* renamed from: M2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0098b implements D2.b, E2.a {

    /* renamed from: a, reason: collision with root package name */
    public M f1857a;

    @Override // E2.a
    public final void onAttachedToActivity(E2.b bVar) {
        M0.e eVar = (M0.e) bVar;
        ((AbstractActivityC1515c) eVar.f1788h).getIntent().putExtra("PROXY_PACKAGE", "io.flutter.plugins.inapppurchase");
        this.f1857a.f1850c = (AbstractActivityC1515c) eVar.f1788h;
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a aVar) {
        H2.f fVar = aVar.f435c;
        M m6 = new M(aVar.f433a, new B1.g(23, fVar), new W1.e());
        this.f1857a = m6;
        M.d(fVar, m6);
    }

    @Override // E2.a
    public final void onDetachedFromActivity() {
        M m6 = this.f1857a;
        m6.f1850c = null;
        C0054d c0054d = m6.f1848a;
        if (c0054d != null) {
            c0054d.a();
            m6.f1848a = null;
        }
    }

    @Override // E2.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1857a.f1850c = null;
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a aVar) {
        M.d(aVar.f435c, null);
        this.f1857a = null;
    }

    @Override // E2.a
    public final void onReattachedToActivityForConfigChanges(E2.b bVar) {
        onAttachedToActivity(bVar);
    }
}
