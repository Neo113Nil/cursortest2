package e6;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class y extends n6.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f4152n;

    public y(z zVar) {
        this.f4152n = zVar;
    }

    @Override // n6.d
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // n6.d
    public final void k() {
        this.f4152n.g(EnumC0356b.f4043m);
        r rVar = this.f4152n.f4154g;
        synchronized (rVar) {
            long j4 = rVar.f4117s;
            long j7 = rVar.f4116r;
            if (j4 < j7) {
                return;
            }
            rVar.f4116r = j7 + 1;
            rVar.f4118t = System.nanoTime() + 1000000000;
            a6.c.c(rVar.f4111m, N.p.b(new StringBuilder(), rVar.f4106h, " ping"), new X5.l(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
