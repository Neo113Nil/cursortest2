package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1095b;

    public v(x xVar, A a2) {
        X0.d.e(a2, "onBackPressedCallback");
        this.f1095b = xVar;
        this.f1094a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1095b;
        Q0.f fVar = xVar.f1101b;
        A a2 = this.f1094a;
        fVar.remove(a2);
        if (X0.d.a(xVar.f1102c, a2)) {
            a2.getClass();
            xVar.f1102c = null;
        }
        a2.f791b.remove(this);
        w wVar = a2.f792c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f792c = null;
    }
}
