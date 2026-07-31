package N2;

import T2.C0230e;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class w extends C0230e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f3691m;

    public w(x xVar) {
        this.f3691m = xVar;
    }

    @Override // T2.C0230e
    public final void j() {
        this.f3691m.e(9);
        p pVar = this.f3691m.f3693b;
        synchronized (pVar) {
            long j3 = pVar.f3653q;
            long j4 = pVar.f3652p;
            if (j3 < j4) {
                return;
            }
            pVar.f3652p = j4 + 1;
            pVar.f3654r = System.nanoTime() + 1000000000;
            pVar.f3647k.c(new J2.b(pVar.f3642f + " ping", pVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
