package G;

import I.C0143d;
import I.C0156j0;
import I.W;
import r.X;

/* loaded from: classes.dex */
public final class l implements X {

    /* renamed from: a, reason: collision with root package name */
    public final C0156j0 f2006a;

    public l(X x3) {
        this.f2006a = C0143d.K(x3, W.f2783i);
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        return ((X) this.f2006a.getValue()).a(bVar, kVar);
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        return ((X) this.f2006a.getValue()).b(bVar);
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        return ((X) this.f2006a.getValue()).c(bVar, kVar);
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        return ((X) this.f2006a.getValue()).d(bVar);
    }
}
