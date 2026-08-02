package U1;

import E1.AbstractActivityC0029e;
import n0.C1143e;

/* renamed from: U1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0081b implements L1.b, M1.a {

    /* renamed from: a, reason: collision with root package name */
    public I f1497a;

    @Override // M1.a
    public final void onAttachedToActivity(M1.b bVar) {
        F1.c cVar = (F1.c) bVar;
        ((AbstractActivityC0029e) cVar.f486a).getIntent().putExtra("PROXY_PACKAGE", "io.flutter.plugins.inapppurchase");
        this.f1497a.f1493c = (AbstractActivityC0029e) cVar.f486a;
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a aVar) {
        P1.f fVar = aVar.f888b;
        I i3 = new I(aVar.f887a, new C0.e(25, fVar), new C0080a(1));
        this.f1497a = i3;
        I.d(fVar, i3);
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        I i3 = this.f1497a;
        i3.f1493c = null;
        C1143e c1143e = i3.f1491a;
        if (c1143e != null) {
            c1143e.a();
            i3.f1491a = null;
        }
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1497a.f1493c = null;
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a aVar) {
        I.d(aVar.f888b, null);
        this.f1497a = null;
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b bVar) {
        onAttachedToActivity(bVar);
    }
}
