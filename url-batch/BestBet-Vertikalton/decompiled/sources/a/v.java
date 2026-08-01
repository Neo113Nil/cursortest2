package a;

import Y.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1614b;

    public v(x xVar, A a2) {
        k1.e.e(a2, "onBackPressedCallback");
        this.f1614b = xVar;
        this.f1613a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1614b;
        Y0.h hVar = xVar.f1617b;
        A a2 = this.f1613a;
        hVar.remove(a2);
        if (k1.e.a(xVar.f1618c, a2)) {
            a2.getClass();
            xVar.f1618c = null;
        }
        a2.f1280b.remove(this);
        w wVar = a2.f1281c;
        if (wVar != null) {
            wVar.c();
        }
        a2.f1281c = null;
    }
}
