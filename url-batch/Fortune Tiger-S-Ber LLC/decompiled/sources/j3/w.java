package j3;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w extends p3.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f2478m;

    public w(x xVar) {
        this.f2478m = xVar;
    }

    @Override // p3.e
    public final void j() {
        this.f2478m.e(9);
        p pVar = this.f2478m.f2480b;
        synchronized (pVar) {
            long j4 = pVar.f2453s;
            long j5 = pVar.f2452r;
            if (j4 < j5) {
                return;
            }
            pVar.f2452r = j5 + 1;
            pVar.f2454t = System.nanoTime() + 1000000000;
            pVar.f2447m.c(new f3.b(pVar.h + " ping", pVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
