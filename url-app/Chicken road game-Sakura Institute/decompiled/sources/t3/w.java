package t3;

import A.AbstractC0017m;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import z3.C1447e;

/* loaded from: classes.dex */
public final class w extends C1447e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f10862m;

    public w(x xVar) {
        this.f10862m = xVar;
    }

    @Override // z3.C1447e
    public final void j() {
        this.f10862m.e(EnumC1211b.CANCEL);
        p pVar = this.f10862m.f10864b;
        synchronized (pVar) {
            long j4 = pVar.f10827t;
            long j5 = pVar.f10826s;
            if (j4 < j5) {
                return;
            }
            pVar.f10826s = j5 + 1;
            pVar.f10828u = System.nanoTime() + 1000000000;
            Unit unit = Unit.f7487a;
            pVar.f10821n.c(new p3.b(AbstractC0017m.n(new StringBuilder(), pVar.f10816i, " ping"), pVar, 2), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
