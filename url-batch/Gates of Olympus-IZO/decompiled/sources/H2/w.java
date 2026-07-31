package H2;

import N2.C0149e;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class w extends C0149e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f2034m;

    public w(x xVar) {
        this.f2034m = xVar;
    }

    @Override // N2.C0149e
    public final void j() {
        this.f2034m.e(9);
        p pVar = this.f2034m.f2036b;
        synchronized (pVar) {
            long j3 = pVar.f1996q;
            long j4 = pVar.p;
            if (j3 < j4) {
                return;
            }
            pVar.p = j4 + 1;
            pVar.f1997r = System.nanoTime() + 1000000000;
            pVar.f1991k.c(new D2.b(pVar.f1986f + " ping", pVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
