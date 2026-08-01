package G1;

import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class x extends M1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f442m;

    public x(y yVar) {
        this.f442m = yVar;
    }

    @Override // M1.e
    public final void j() {
        this.f442m.e(9);
        q qVar = this.f442m.f444b;
        synchronized (qVar) {
            long j = qVar.f405n;
            long j2 = qVar.f404m;
            if (j < j2) {
                return;
            }
            qVar.f404m = j2 + 1;
            qVar.f406o = System.nanoTime() + 1000000000;
            qVar.f401h.c(new C1.b(AbstractC0001b.g(new StringBuilder(), qVar.f397c, " ping"), qVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
