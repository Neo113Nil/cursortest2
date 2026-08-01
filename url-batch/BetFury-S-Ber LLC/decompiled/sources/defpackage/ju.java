package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ju extends q7 {
    public final /* synthetic */ ku m;

    public ju(ku kuVar) {
        this.m = kuVar;
    }

    @Override // defpackage.q7
    public final void j() {
        this.m.e(kn.CANCEL);
        du duVar = this.m.b;
        synchronized (duVar) {
            long j = duVar.s;
            long j2 = duVar.r;
            if (j < j2) {
                return;
            }
            duVar.r = j2 + 1;
            duVar.t = System.nanoTime() + 1000000000;
            duVar.m.c(new au(0, duVar, r7.d(new StringBuilder(), duVar.h, " ping")), 0L);
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
