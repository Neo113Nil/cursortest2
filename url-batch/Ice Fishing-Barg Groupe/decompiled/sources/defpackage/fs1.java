package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fs1 implements Runnable {
    public volatile AtomicInteger OPXfSBeufaJ8 = new AtomicInteger(0);
    public final cr1 rtx2ld2ELZv4;
    public final /* synthetic */ js1 wdg6QnbFHrFF;

    public fs1(js1 js1Var, cr1 cr1Var) {
        this.wdg6QnbFHrFF = js1Var;
        this.rtx2ld2ELZv4 = cr1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var;
        String concat = "OkHttp ".concat(((gm0) this.wdg6QnbFHrFF.OPXfSBeufaJ8.lS5Rgt96tfkO).a92UlCVFR9N8());
        js1 js1Var = this.wdg6QnbFHrFF;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            js1Var.x50lh2ztY7Y5.wdg6QnbFHrFF();
            boolean z = false;
            try {
                try {
                    try {
                        this.rtx2ld2ELZv4.OPXfSBeufaJ8(js1Var, js1Var.a92UlCVFR9N8());
                        e0Var = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            km1.Companion.getClass();
                            km1.PxuCJdSBwIXG.OPXfSBeufaJ8("Callback failure for ".concat(js1.PxuCJdSBwIXG(js1Var)), 4, e);
                        } else {
                            vs1.TSizfFm2Yiuu((vs1) this.rtx2ld2ELZv4.OPXfSBeufaJ8, e, 6);
                        }
                        e0Var = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                        e0Var.getClass();
                        e0.VhhvGxCb8gfr(e0Var, null, this, 3);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        js1Var.Y1f8riQaR6yg();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            vs1.TSizfFm2Yiuu((vs1) this.rtx2ld2ELZv4.OPXfSBeufaJ8, iOException, 6);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        e0Var = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                        e0Var.getClass();
                        e0.VhhvGxCb8gfr(e0Var, null, this, 3);
                    }
                } catch (Throwable th2) {
                    e0 e0Var2 = js1Var.rtx2ld2ELZv4.PxuCJdSBwIXG;
                    e0Var2.getClass();
                    e0.VhhvGxCb8gfr(e0Var2, null, this, 3);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            e0Var.getClass();
            e0.VhhvGxCb8gfr(e0Var, null, this, 3);
        } finally {
            currentThread.setName(name);
        }
    }
}
