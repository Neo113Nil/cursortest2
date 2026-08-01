package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1153b;

    public v(x xVar, A a2) {
        b1.d.e(a2, "onBackPressedCallback");
        this.f1153b = xVar;
        this.f1152a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1153b;
        T0.f fVar = xVar.f1159b;
        A a2 = this.f1152a;
        fVar.remove(a2);
        if (b1.d.a(xVar.f1160c, a2)) {
            a2.getClass();
            xVar.f1160c = null;
        }
        a2.f860b.remove(this);
        w wVar = a2.f861c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f861c = null;
    }
}
