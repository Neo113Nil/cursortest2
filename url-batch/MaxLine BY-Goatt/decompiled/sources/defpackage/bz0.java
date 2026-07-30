package defpackage;

import java.net.SocketTimeoutException;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bz0 extends rj {
    public final /* synthetic */ cz0 m;

    public bz0(cz0 cz0Var) {
        this.m = cz0Var;
    }

    @Override // defpackage.rj
    public final void j() {
        this.m.e(9);
        vy0 vy0Var = this.m.b;
        synchronized (vy0Var) {
            long j = vy0Var.z;
            long j2 = vy0Var.y;
            if (j < j2) {
                return;
            }
            vy0Var.y = j2 + 1;
            vy0Var.A = System.nanoTime() + 1000000000;
            Unit unit = Unit.a;
            vy0Var.t.c(new ty0(q40.p(new StringBuilder(), vy0Var.o, " ping"), vy0Var, 0), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
