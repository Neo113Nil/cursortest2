package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class j72 {
    public static final i72 Companion = new i72();
    public q72 PxuCJdSBwIXG;
    public boolean TSizfFm2Yiuu;
    public int Y1f8riQaR6yg;
    public long lS5Rgt96tfkO;

    public j72(long j, q72 q72Var) {
        int i;
        int numberOfTrailingZeros;
        this.PxuCJdSBwIXG = q72Var;
        this.lS5Rgt96tfkO = j;
        vz1 vz1Var = s72.PxuCJdSBwIXG;
        if (j != 0) {
            q72 Y1f8riQaR6yg = Y1f8riQaR6yg();
            long j2 = Y1f8riQaR6yg.wdg6QnbFHrFF;
            long[] jArr = Y1f8riQaR6yg.dgRBjINgWbAK;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = Y1f8riQaR6yg.OPXfSBeufaJ8;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = Y1f8riQaR6yg.rtx2ld2ELZv4;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (s72.TSizfFm2Yiuu) {
                i = s72.a92UlCVFR9N8.PxuCJdSBwIXG(j);
            }
        } else {
            i = -1;
        }
        this.Y1f8riQaR6yg = i;
    }

    public static void BRwzKIf41E4i(j72 j72Var) {
        s72.lS5Rgt96tfkO.aF05bpZJlKEP(j72Var);
    }

    public void EcgxDIVH5in8(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract le0 OPXfSBeufaJ8();

    public final void PxuCJdSBwIXG() {
        synchronized (s72.TSizfFm2Yiuu) {
            lS5Rgt96tfkO();
            gPXPFXrUH4XX();
        }
    }

    public final void QrzZRwfaDlRX() {
        int i = this.Y1f8riQaR6yg;
        if (i >= 0) {
            s72.EcgxDIVH5in8(i);
            this.Y1f8riQaR6yg = -1;
        }
    }

    public long RAsUl2FVSrh6() {
        return this.lS5Rgt96tfkO;
    }

    public void RfyTYNmI9Srp(long j) {
        this.lS5Rgt96tfkO = j;
    }

    public abstract j72 S9EYkSpbGuxq(le0 le0Var);

    public abstract void TSizfFm2Yiuu();

    public void XL4ISE6Oc65B(q72 q72Var) {
        this.PxuCJdSBwIXG = q72Var;
    }

    public q72 Y1f8riQaR6yg() {
        return this.PxuCJdSBwIXG;
    }

    public abstract boolean a92UlCVFR9N8();

    public abstract void cpQdD2nAriOS();

    public abstract void dgRBjINgWbAK();

    public abstract le0 e9gEMXR7LXtO();

    public void gPXPFXrUH4XX() {
        QrzZRwfaDlRX();
    }

    public void lS5Rgt96tfkO() {
        s72.Y1f8riQaR6yg = s72.Y1f8riQaR6yg.lS5Rgt96tfkO(RAsUl2FVSrh6());
    }

    public abstract void r3s1LDPKFs1S(p92 p92Var);

    public int rtx2ld2ELZv4() {
        return 0;
    }

    public final j72 wdg6QnbFHrFF() {
        m9 m9Var = s72.lS5Rgt96tfkO;
        j72 j72Var = (j72) m9Var.QrzZRwfaDlRX();
        m9Var.aF05bpZJlKEP(this);
        return j72Var;
    }

    public abstract void x50lh2ztY7Y5();
}
