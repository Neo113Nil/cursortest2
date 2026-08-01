package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1093b;

    public v(x xVar, A a2) {
        X0.d.e(a2, "onBackPressedCallback");
        this.f1093b = xVar;
        this.f1092a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1093b;
        Q0.f fVar = xVar.f1099b;
        A a2 = this.f1092a;
        fVar.remove(a2);
        if (X0.d.a(xVar.f1100c, a2)) {
            a2.getClass();
            xVar.f1100c = null;
        }
        a2.f789b.remove(this);
        w wVar = a2.f790c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f790c = null;
    }
}
