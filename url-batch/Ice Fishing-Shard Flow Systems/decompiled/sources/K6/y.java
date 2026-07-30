package K6;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class y extends T6.d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z f1608n;

    public y(z zVar) {
        this.f1608n = zVar;
    }

    @Override // T6.d
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // T6.d
    public final void k() {
        this.f1608n.f(EnumC0131b.f1496p);
        r rVar = this.f1608n.f1610e;
        synchronized (rVar) {
            long j = rVar.f1575v;
            long j7 = rVar.f1574u;
            if (j < j7) {
                return;
            }
            rVar.f1574u = j7 + 1;
            rVar.f1576w = System.nanoTime() + 1000000000;
            Unit unit = Unit.f6114a;
            G6.c.c(rVar.f1569p, r4.f.f(new StringBuilder(), rVar.f1564i, " ping"), new D6.o(3, rVar));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
