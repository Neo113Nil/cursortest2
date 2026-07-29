package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1090b;

    public v(x xVar, A a2) {
        X0.e.e(a2, "onBackPressedCallback");
        this.f1090b = xVar;
        this.f1089a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1090b;
        Q0.b bVar = xVar.f1096b;
        A a2 = this.f1089a;
        bVar.remove(a2);
        if (X0.e.a(xVar.f1097c, a2)) {
            a2.getClass();
            xVar.f1097c = null;
        }
        a2.f783b.remove(this);
        w wVar = a2.f784c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f784c = null;
    }
}
