package G;

import I.C0089d;
import I.C0102j0;
import I.X;
import M0.j;
import r.U;

/* loaded from: classes.dex */
public final class f implements U {

    /* renamed from: a, reason: collision with root package name */
    public final C0102j0 f1518a;

    public f(U u3) {
        this.f1518a = C0089d.J(u3, X.f2228i);
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        return ((U) this.f1518a.getValue()).a(bVar);
    }

    @Override // r.U
    public final int b(M0.b bVar, j jVar) {
        return ((U) this.f1518a.getValue()).b(bVar, jVar);
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        return ((U) this.f1518a.getValue()).c(bVar);
    }

    @Override // r.U
    public final int d(M0.b bVar, j jVar) {
        return ((U) this.f1518a.getValue()).d(bVar, jVar);
    }
}
