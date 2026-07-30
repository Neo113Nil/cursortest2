package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hc1 {
    public static final gc1 Companion = new gc1();
    public final rf1 PxuCJdSBwIXG;
    public final LinkedHashSet TSizfFm2Yiuu;
    public final LinkedHashSet Y1f8riQaR6yg;
    public final mc1 lS5Rgt96tfkO = new mc1();

    public hc1(rf1 rf1Var) {
        this.PxuCJdSBwIXG = rf1Var;
        new LinkedHashSet();
        this.TSizfFm2Yiuu = new LinkedHashSet();
        this.Y1f8riQaR6yg = new LinkedHashSet();
    }

    public static void PxuCJdSBwIXG(hc1 hc1Var, jc1 jc1Var) {
        hc1Var.getClass();
        jc1Var.getClass();
        if (hc1Var.TSizfFm2Yiuu.add(jc1Var)) {
            mc1 mc1Var = hc1Var.lS5Rgt96tfkO;
            mc1Var.getClass();
            if (jc1Var.TSizfFm2Yiuu != null) {
                rc1.OPXfSBeufaJ8("Handler '", jc1Var, "' is already registered with a dispatcher");
                return;
            }
            mc1Var.e9gEMXR7LXtO.addFirst(jc1Var);
            jc1Var.TSizfFm2Yiuu = hc1Var;
            mc1Var.lS5Rgt96tfkO();
        }
    }

    public final void TSizfFm2Yiuu(mf1 mf1Var, int i) {
        if (i != 1 && i != 0) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("Unsupported priority value: ", i));
        } else if (this.Y1f8riQaR6yg.add(mf1Var)) {
            this.lS5Rgt96tfkO.PxuCJdSBwIXG(this, mf1Var, i);
        }
    }

    public final void Y1f8riQaR6yg(lc1 lc1Var, fc1 fc1Var) {
        mc1 mc1Var = this.lS5Rgt96tfkO;
        mc1Var.getClass();
        if (mc1Var.RAsUl2FVSrh6 != 0) {
            return;
        }
        jc1 TSizfFm2Yiuu = mc1Var.TSizfFm2Yiuu(-1);
        mc1Var.a92UlCVFR9N8 = TSizfFm2Yiuu;
        mc1Var.RAsUl2FVSrh6 = -1;
        mc1Var.rtx2ld2ELZv4 = lc1Var;
        if (fc1Var != null) {
            if (TSizfFm2Yiuu != null) {
                TSizfFm2Yiuu.Y1f8riQaR6yg(fc1Var);
            }
            l92 l92Var = mc1Var.PxuCJdSBwIXG;
            pc1 pc1Var = new pc1(fc1Var);
            l92Var.getClass();
            l92Var.OPXfSBeufaJ8(null, pc1Var);
        }
    }

    public final void lS5Rgt96tfkO(lc1 lc1Var) {
        if (this.Y1f8riQaR6yg.add(lc1Var)) {
            this.lS5Rgt96tfkO.PxuCJdSBwIXG(this, lc1Var, -1);
        }
    }
}
