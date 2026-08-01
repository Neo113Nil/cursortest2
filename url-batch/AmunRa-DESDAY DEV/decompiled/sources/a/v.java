package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1128b;

    public v(x xVar, A a2) {
        Z0.d.e(a2, "onBackPressedCallback");
        this.f1128b = xVar;
        this.f1127a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1128b;
        R0.f fVar = xVar.f1134b;
        A a2 = this.f1127a;
        fVar.remove(a2);
        if (Z0.d.a(xVar.f1135c, a2)) {
            a2.getClass();
            xVar.f1135c = null;
        }
        a2.f831b.remove(this);
        w wVar = a2.f832c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f832c = null;
    }
}
