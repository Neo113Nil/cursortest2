package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1092b;

    public v(x xVar, A a2) {
        X0.d.e(a2, "onBackPressedCallback");
        this.f1092b = xVar;
        this.f1091a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1092b;
        Q0.f fVar = xVar.f1098b;
        A a2 = this.f1091a;
        fVar.remove(a2);
        if (X0.d.a(xVar.f1099c, a2)) {
            a2.getClass();
            xVar.f1099c = null;
        }
        a2.f788b.remove(this);
        w wVar = a2.f789c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f789c = null;
    }
}
