package a;

import Y.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1240b;

    public v(x xVar, A a2) {
        g1.d.e(a2, "onBackPressedCallback");
        this.f1240b = xVar;
        this.f1239a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1240b;
        V0.e eVar = xVar.f1246b;
        A a2 = this.f1239a;
        eVar.remove(a2);
        if (g1.d.a(xVar.f1247c, a2)) {
            a2.getClass();
            xVar.f1247c = null;
        }
        a2.f947b.remove(this);
        w wVar = a2.f948c;
        if (wVar != null) {
            wVar.b();
        }
        a2.f948c = null;
    }
}
