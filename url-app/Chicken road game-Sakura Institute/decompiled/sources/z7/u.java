package z7;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends f8.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f10230m;

    public u(v vVar) {
        this.f10230m = vVar;
    }

    @Override // f8.e
    public final void j() {
        this.f10230m.e(9);
        n nVar = this.f10230m.f10232b;
        synchronized (nVar) {
            long j8 = nVar.f10194s;
            long j9 = nVar.f10193r;
            if (j8 < j9) {
                return;
            }
            nVar.f10193r = j9 + 1;
            nVar.f10195t = System.nanoTime() + 1000000000;
            nVar.f10188m.c(new v7.b(a0.m.m(new StringBuilder(), nVar.f10183h, " ping"), nVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
