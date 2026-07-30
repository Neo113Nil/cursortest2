package defpackage;

import java.io.InterruptedIOException;
import java.util.TimeZone;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sl0 implements y52 {
    public final yf OPXfSBeufaJ8 = new yf();
    public final /* synthetic */ vl0 dgRBjINgWbAK;
    public final boolean rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public sl0(vl0 vl0Var, boolean z) {
        this.dgRBjINgWbAK = vl0Var;
        this.rtx2ld2ELZv4 = z;
    }

    @Override // defpackage.y52
    public final yj2 TSizfFm2Yiuu() {
        return this.dgRBjINgWbAK.XL4ISE6Oc65B;
    }

    @Override // defpackage.y52
    public final void VhhvGxCb8gfr(long j, yf yfVar) {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        yf yfVar2 = this.OPXfSBeufaJ8;
        yfVar2.VhhvGxCb8gfr(j, yfVar);
        while (yfVar2.OPXfSBeufaJ8 >= 16384) {
            lS5Rgt96tfkO(false);
        }
    }

    @Override // defpackage.y52, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vl0 vl0Var = this.dgRBjINgWbAK;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (vl0Var) {
            if (this.wdg6QnbFHrFF) {
                return;
            }
            boolean z = vl0Var.a92UlCVFR9N8() == null;
            vl0 vl0Var2 = this.dgRBjINgWbAK;
            if (!vl0Var2.gPXPFXrUH4XX.rtx2ld2ELZv4) {
                if (this.OPXfSBeufaJ8.OPXfSBeufaJ8 > 0) {
                    while (this.OPXfSBeufaJ8.OPXfSBeufaJ8 > 0) {
                        lS5Rgt96tfkO(true);
                    }
                } else if (z) {
                    vl0Var2.OPXfSBeufaJ8.XL4ISE6Oc65B(vl0Var2.rtx2ld2ELZv4, true, null, 0L);
                }
            }
            vl0 vl0Var3 = this.dgRBjINgWbAK;
            synchronized (vl0Var3) {
                this.wdg6QnbFHrFF = true;
                vl0Var3.notifyAll();
            }
            this.dgRBjINgWbAK.OPXfSBeufaJ8.flush();
            this.dgRBjINgWbAK.PxuCJdSBwIXG();
        }
    }

    @Override // defpackage.y52, java.io.Flushable
    public final void flush() {
        vl0 vl0Var = this.dgRBjINgWbAK;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        synchronized (vl0Var) {
            vl0Var.lS5Rgt96tfkO();
        }
        while (this.OPXfSBeufaJ8.OPXfSBeufaJ8 > 0) {
            lS5Rgt96tfkO(false);
            this.dgRBjINgWbAK.OPXfSBeufaJ8.flush();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void lS5Rgt96tfkO(boolean z) {
        long min;
        boolean z2;
        vl0 vl0Var = this.dgRBjINgWbAK;
        synchronized (vl0Var) {
            vl0Var.XL4ISE6Oc65B.wdg6QnbFHrFF();
            while (vl0Var.dgRBjINgWbAK >= vl0Var.x50lh2ztY7Y5 && !this.rtx2ld2ELZv4 && !this.wdg6QnbFHrFF && vl0Var.a92UlCVFR9N8() == null) {
                try {
                    try {
                        vl0Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    vl0Var.XL4ISE6Oc65B.r3s1LDPKFs1S();
                    throw th;
                }
            }
            vl0Var.XL4ISE6Oc65B.r3s1LDPKFs1S();
            vl0Var.lS5Rgt96tfkO();
            min = Math.min(vl0Var.x50lh2ztY7Y5 - vl0Var.dgRBjINgWbAK, this.OPXfSBeufaJ8.OPXfSBeufaJ8);
            vl0Var.dgRBjINgWbAK += min;
            z2 = z && min == this.OPXfSBeufaJ8.OPXfSBeufaJ8;
        }
        this.dgRBjINgWbAK.XL4ISE6Oc65B.wdg6QnbFHrFF();
        try {
            vl0 vl0Var2 = this.dgRBjINgWbAK;
            vl0Var2.OPXfSBeufaJ8.XL4ISE6Oc65B(vl0Var2.rtx2ld2ELZv4, z2, this.OPXfSBeufaJ8, min);
        } finally {
            this.dgRBjINgWbAK.XL4ISE6Oc65B.r3s1LDPKFs1S();
        }
    }
}
