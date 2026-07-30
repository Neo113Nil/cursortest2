package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ul0 extends xa {
    public final /* synthetic */ vl0 r3s1LDPKFs1S;

    public ul0(vl0 vl0Var) {
        this.r3s1LDPKFs1S = vl0Var;
    }

    @Override // defpackage.xa
    public final void cpQdD2nAriOS() {
        this.r3s1LDPKFs1S.e9gEMXR7LXtO(o60.r3s1LDPKFs1S);
        ll0 ll0Var = this.r3s1LDPKFs1S.OPXfSBeufaJ8;
        synchronized (ll0Var) {
            long j = ll0Var.VhhvGxCb8gfr;
            long j2 = ll0Var.S9EYkSpbGuxq;
            if (j < j2) {
                return;
            }
            ll0Var.S9EYkSpbGuxq = j2 + 1;
            ll0Var.S2OOm9zPNm0h = System.nanoTime() + 1000000000;
            zd2.lS5Rgt96tfkO(ll0Var.QrzZRwfaDlRX, o0.gPXPFXrUH4XX(new StringBuilder(), ll0Var.wdg6QnbFHrFF, " ping"), 0L, new o5(13, ll0Var), 6);
        }
    }

    public final void r3s1LDPKFs1S() {
        if (dgRBjINgWbAK()) {
            throw x50lh2ztY7Y5(null);
        }
    }

    @Override // defpackage.xa
    public final IOException x50lh2ztY7Y5(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }
}
