package b;

import Z.A;

/* loaded from: classes.dex */
public final class u implements InterfaceC0090c {

    /* renamed from: a, reason: collision with root package name */
    public final A f2211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f2212b;

    public u(w wVar, A a2) {
        j1.h.e(a2, "onBackPressedCallback");
        this.f2212b = wVar;
        this.f2211a = a2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i1.a, j1.g] */
    @Override // b.InterfaceC0090c
    public final void cancel() {
        w wVar = this.f2212b;
        X0.i iVar = wVar.f2214b;
        A a2 = this.f2211a;
        iVar.remove(a2);
        if (j1.h.a(wVar.f2215c, a2)) {
            a2.getClass();
            wVar.f2215c = null;
        }
        a2.f1421b.remove(this);
        ?? r02 = a2.f1422c;
        if (r02 != 0) {
            r02.c();
        }
        a2.f1422c = null;
    }
}
