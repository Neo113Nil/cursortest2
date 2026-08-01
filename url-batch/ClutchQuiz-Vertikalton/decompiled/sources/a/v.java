package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements InterfaceC0056c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1234b;

    public v(x xVar, A a2) {
        g1.f.e(a2, "onBackPressedCallback");
        this.f1234b = xVar;
        this.f1233a = a2;
    }

    @Override // a.InterfaceC0056c
    public final void cancel() {
        x xVar = this.f1234b;
        V0.c cVar = xVar.f1237b;
        A a2 = this.f1233a;
        cVar.remove(a2);
        if (g1.f.a(xVar.f1238c, a2)) {
            a2.getClass();
            xVar.f1238c = null;
        }
        a2.f925b.remove(this);
        w wVar = a2.f926c;
        if (wVar != null) {
            wVar.c();
        }
        a2.f926c = null;
    }
}
