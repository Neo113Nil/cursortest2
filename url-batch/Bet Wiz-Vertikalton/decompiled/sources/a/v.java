package a;

import X.A;

/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a, reason: collision with root package name */
    public final A f1196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f1197b;

    public v(x xVar, A a2) {
        e1.d.e(a2, "onBackPressedCallback");
        this.f1197b = xVar;
        this.f1196a = a2;
    }

    @Override // a.c
    public final void cancel() {
        x xVar = this.f1197b;
        W0.f fVar = xVar.f1203b;
        A a2 = this.f1196a;
        fVar.remove(a2);
        if (e1.d.a(xVar.f1204c, a2)) {
            a2.getClass();
            xVar.f1204c = null;
        }
        a2.f900b.remove(this);
        w wVar = a2.f901c;
        if (wVar != null) {
            wVar.a();
        }
        a2.f901c = null;
    }
}
