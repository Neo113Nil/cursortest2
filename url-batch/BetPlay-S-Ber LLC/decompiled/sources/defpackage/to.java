package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class to extends l7 {
    public final /* synthetic */ uo m;

    public to(uo uoVar) {
        this.m = uoVar;
    }

    @Override // defpackage.l7
    public final void j() {
        this.m.e(9);
        no noVar = this.m.b;
        synchronized (noVar) {
            long j = noVar.s;
            long j2 = noVar.r;
            if (j < j2) {
                return;
            }
            noVar.r = j2 + 1;
            noVar.t = System.nanoTime() + 1000000000;
            noVar.m.c(new lo(0, noVar, noVar.h + " ping"), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
