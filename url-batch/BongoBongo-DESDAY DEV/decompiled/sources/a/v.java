package a;

import Z.A;

/* loaded from: classes.dex */
public final class v implements InterfaceC0058c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1286b;

    public v(x xVar, A a2) {
        h1.d.e(a2, "onBackPressedCallback");
        this.f1286b = xVar;
        this.f1285a = a2;
    }

    @Override // a.InterfaceC0058c
    public final void cancel() {
        x xVar = this.f1286b;
        W0.e eVar = xVar.f1292b;
        A a2 = this.f1285a;
        eVar.remove(a2);
        if (h1.d.a(xVar.f1293c, a2)) {
            a2.getClass();
            xVar.f1293c = null;
        }
        a2.f990b.remove(this);
        w wVar = a2.f991c;
        if (wVar != null) {
            wVar.b();
        }
        a2.f991c = null;
    }
}
