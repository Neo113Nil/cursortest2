package a;

import Z.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1295b;

    public v(x xVar, A a2) {
        g1.d.e(a2, "onBackPressedCallback");
        this.f1295b = xVar;
        this.f1294a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1295b;
        X0.h hVar = xVar.f1301b;
        A a2 = this.f1294a;
        hVar.remove(a2);
        if (g1.d.a(xVar.f1302c, a2)) {
            a2.getClass();
            xVar.f1302c = null;
        }
        a2.f1009b.remove(this);
        w wVar = a2.f1010c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f1010c = null;
    }
}
