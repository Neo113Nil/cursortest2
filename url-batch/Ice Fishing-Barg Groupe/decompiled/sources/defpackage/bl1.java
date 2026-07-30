package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bl1 {
    public final zp PxuCJdSBwIXG;
    public final Object RAsUl2FVSrh6;
    public final tf0 TSizfFm2Yiuu;
    public final pe0 Y1f8riQaR6yg;
    public final m9 a92UlCVFR9N8;
    public final ju1 dgRBjINgWbAK;
    public final boolean e9gEMXR7LXtO;
    public final up lS5Rgt96tfkO;
    public w81 wdg6QnbFHrFF;
    public final jt1 x50lh2ztY7Y5;
    public final AtomicReference rtx2ld2ELZv4 = new AtomicReference(dl1.wdg6QnbFHrFF);
    public long OPXfSBeufaJ8 = xi0.VhhvGxCb8gfr();

    public bl1(zp zpVar, up upVar, tf0 tf0Var, y81 y81Var, pe0 pe0Var, boolean z, m9 m9Var, Object obj) {
        this.PxuCJdSBwIXG = zpVar;
        this.lS5Rgt96tfkO = upVar;
        this.TSizfFm2Yiuu = tf0Var;
        this.Y1f8riQaR6yg = pe0Var;
        this.e9gEMXR7LXtO = z;
        this.a92UlCVFR9N8 = m9Var;
        this.RAsUl2FVSrh6 = obj;
        w81 w81Var = d02.PxuCJdSBwIXG;
        w81Var.getClass();
        this.wdg6QnbFHrFF = w81Var;
        ju1 ju1Var = new ju1();
        ju1Var.RAsUl2FVSrh6(y81Var, tf0Var.IAToe7bXGz4N());
        this.dgRBjINgWbAK = ju1Var;
        this.x50lh2ztY7Y5 = new jt1(m9Var.dgRBjINgWbAK);
    }

    public final void PxuCJdSBwIXG() {
        AtomicReference atomicReference = this.rtx2ld2ELZv4;
        try {
            switch (((dl1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    lS5Rgt96tfkO();
                    dl1 dl1Var = dl1.cpQdD2nAriOS;
                    dl1 dl1Var2 = dl1.r3s1LDPKFs1S;
                    while (!atomicReference.compareAndSet(dl1Var, dl1Var2)) {
                        if (atomicReference.get() != dl1Var) {
                            gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var + " to: " + dl1Var2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new tm();
            }
        } catch (Exception e) {
            atomicReference.set(dl1.rtx2ld2ELZv4);
            throw e;
        }
    }

    public final boolean TSizfFm2Yiuu() {
        return ((dl1) this.rtx2ld2ELZv4.get()).compareTo(dl1.cpQdD2nAriOS) >= 0;
    }

    public final void Y1f8riQaR6yg() {
        dl1 dl1Var;
        dl1 dl1Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.rtx2ld2ELZv4;
            dl1Var = dl1.dgRBjINgWbAK;
            dl1Var2 = dl1.cpQdD2nAriOS;
            if (atomicReference.compareAndSet(dl1Var, dl1Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != dl1Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var + " to: " + dl1Var2 + '.');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e9gEMXR7LXtO(q52 q52Var) {
        dl1 dl1Var = dl1.x50lh2ztY7Y5;
        AtomicReference atomicReference = this.rtx2ld2ELZv4;
        try {
            int ordinal = ((dl1) atomicReference.get()).ordinal();
            dl1 dl1Var2 = dl1.dgRBjINgWbAK;
            zp zpVar = this.PxuCJdSBwIXG;
            up upVar = this.lS5Rgt96tfkO;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    tf0 tf0Var = this.TSizfFm2Yiuu;
                    boolean z = this.e9gEMXR7LXtO;
                    if (z) {
                        tf0Var.IAToe7bXGz4N = 0;
                        tf0Var.pnx5pC0XzaCw = true;
                    }
                    try {
                        this.wdg6QnbFHrFF = upVar.lS5Rgt96tfkO(zpVar, q52Var, this.Y1f8riQaR6yg);
                        dl1 dl1Var3 = dl1.wdg6QnbFHrFF;
                        while (true) {
                            if (!atomicReference.compareAndSet(dl1Var3, dl1Var2)) {
                                if (atomicReference.get() != dl1Var3) {
                                    gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var3 + " to: " + dl1Var2 + '.');
                                }
                            }
                        }
                        if (this.wdg6QnbFHrFF.RAsUl2FVSrh6()) {
                            Y1f8riQaR6yg();
                        }
                        return TSizfFm2Yiuu();
                    } finally {
                        if (z) {
                            tf0Var.RfyTYNmI9Srp();
                        }
                    }
                case 3:
                    while (true) {
                        if (!atomicReference.compareAndSet(dl1Var2, dl1Var)) {
                            if (atomicReference.get() != dl1Var2) {
                                gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var2 + " to: " + dl1Var + '.');
                            }
                        }
                    }
                    long j = this.OPXfSBeufaJ8;
                    try {
                        this.OPXfSBeufaJ8 = xi0.VhhvGxCb8gfr();
                        this.wdg6QnbFHrFF = upVar.r3s1LDPKFs1S(zpVar, q52Var, this.wdg6QnbFHrFF);
                        this.OPXfSBeufaJ8 = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(dl1Var, dl1Var2)) {
                                if (atomicReference.get() != dl1Var) {
                                    gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var + " to: " + dl1Var2 + '.');
                                }
                            }
                        }
                        if (this.wdg6QnbFHrFF.RAsUl2FVSrh6()) {
                            Y1f8riQaR6yg();
                        }
                        return TSizfFm2Yiuu();
                    } catch (Throwable th) {
                        this.OPXfSBeufaJ8 = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(dl1Var, dl1Var2)) {
                                if (atomicReference.get() != dl1Var) {
                                    gp1.lS5Rgt96tfkO("Unexpected state change from: " + dl1Var + " to: " + dl1Var2 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    mp.lS5Rgt96tfkO("Recursive call to resume()");
                    throw new tm();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new tm();
            }
        } catch (Exception e) {
            atomicReference.set(dl1.rtx2ld2ELZv4);
            throw e;
        }
    }

    public final void lS5Rgt96tfkO() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.RAsUl2FVSrh6) {
                try {
                    this.x50lh2ztY7Y5.PxuCJdSBwIXG(this.a92UlCVFR9N8, this.dgRBjINgWbAK);
                    this.dgRBjINgWbAK.TSizfFm2Yiuu();
                    this.dgRBjINgWbAK.Y1f8riQaR6yg();
                } finally {
                    this.dgRBjINgWbAK.lS5Rgt96tfkO();
                    this.PxuCJdSBwIXG.ZbWwgt3aGe7A = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }
}
