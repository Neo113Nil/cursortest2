package a;

import Y.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1210b;

    public v(x xVar, A a2) {
        d1.d.e(a2, "onBackPressedCallback");
        this.f1210b = xVar;
        this.f1209a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1210b;
        S0.e eVar = xVar.f1216b;
        A a2 = this.f1209a;
        eVar.remove(a2);
        if (d1.d.a(xVar.f1217c, a2)) {
            a2.getClass();
            xVar.f1217c = null;
        }
        a2.f920b.remove(this);
        w wVar = a2.f921c;
        if (wVar != null) {
            wVar.b();
        }
        a2.f921c = null;
    }
}
