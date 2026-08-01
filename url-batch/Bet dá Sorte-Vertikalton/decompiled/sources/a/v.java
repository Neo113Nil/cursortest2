package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1167b;

    public v(x xVar, A a2) {
        b1.d.e(a2, "onBackPressedCallback");
        this.f1167b = xVar;
        this.f1166a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1167b;
        T0.f fVar = xVar.f1173b;
        A a2 = this.f1166a;
        fVar.remove(a2);
        if (b1.d.a(xVar.f1174c, a2)) {
            a2.getClass();
            xVar.f1174c = null;
        }
        a2.f874b.remove(this);
        w wVar = a2.f875c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f875c = null;
    }
}
