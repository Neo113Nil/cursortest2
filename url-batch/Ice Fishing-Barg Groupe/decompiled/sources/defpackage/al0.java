package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class al0 implements ae0 {
    public final /* synthetic */ long OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ Object wdg6QnbFHrFF;

    public /* synthetic */ al0(Object obj, long j, int i) {
        this.rtx2ld2ELZv4 = i;
        this.wdg6QnbFHrFF = obj;
        this.OPXfSBeufaJ8 = j;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        boolean z;
        fs2 fs2Var;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                ll0 ll0Var = (ll0) this.wdg6QnbFHrFF;
                long j = this.OPXfSBeufaJ8;
                synchronized (ll0Var) {
                    long j2 = ll0Var.EcgxDIVH5in8;
                    long j3 = ll0Var.RfyTYNmI9Srp;
                    if (j2 < j3) {
                        z = true;
                    } else {
                        ll0Var.RfyTYNmI9Srp = j3 + 1;
                        z = false;
                    }
                }
                if (z) {
                    o60 o60Var = o60.wdg6QnbFHrFF;
                    ll0Var.lS5Rgt96tfkO(o60Var, o60Var, null);
                    j = -1;
                } else {
                    try {
                        ll0Var.rZjpSjn4zoMv.XL4ISE6Oc65B(1, 0, false);
                    } catch (IOException e) {
                        o60 o60Var2 = o60.wdg6QnbFHrFF;
                        ll0Var.lS5Rgt96tfkO(o60Var2, o60Var2, e);
                    }
                }
                return Long.valueOf(j);
            default:
                vs1 vs1Var = (vs1) this.wdg6QnbFHrFF;
                long j4 = this.OPXfSBeufaJ8;
                synchronized (vs1Var) {
                    try {
                        if (!vs1Var.S9EYkSpbGuxq && (fs2Var = vs1Var.dgRBjINgWbAK) != null) {
                            int i = vs1Var.S2OOm9zPNm0h ? vs1Var.VhhvGxCb8gfr : -1;
                            vs1Var.VhhvGxCb8gfr++;
                            vs1Var.S2OOm9zPNm0h = true;
                            if (i != -1) {
                                vs1.TSizfFm2Yiuu(vs1Var, new SocketTimeoutException("sent ping but didn't receive pong within " + vs1Var.TSizfFm2Yiuu + "ms (after " + (i - 1) + " successful ping/pongs)"), 2);
                            } else {
                                try {
                                    ah ahVar = ah.dgRBjINgWbAK;
                                    ahVar.getClass();
                                    fs2Var.lS5Rgt96tfkO(9, ahVar);
                                } catch (IOException e2) {
                                    vs1.TSizfFm2Yiuu(vs1Var, e2, 2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j4);
        }
    }
}
