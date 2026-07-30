package l8;

import java.io.IOException;
import java.net.SocketTimeoutException;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class y extends u8.c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f39210n;

    public y(z zVar) {
        this.f39210n = zVar;
    }

    @Override // u8.c
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // u8.c
    public final void k() {
        this.f39210n.f(EnumC4710b.f39096A);
        r rVar = this.f39210n.f39218u;
        synchronized (rVar) {
            long j9 = rVar.f39164G;
            long j10 = rVar.f39163F;
            if (j9 < j10) {
                return;
            }
            rVar.f39163F = j10 + 1;
            rVar.f39165H = System.nanoTime() + 1000000000;
            h8.c.c(rVar.f39158A, AbstractC5051n.g(new StringBuilder(), rVar.f39177v, " ping"), new Y5.l(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
