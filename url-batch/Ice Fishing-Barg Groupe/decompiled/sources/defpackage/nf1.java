package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nf1 implements OnBackAnimationCallback {
    public final /* synthetic */ mf1 PxuCJdSBwIXG;

    public nf1(mf1 mf1Var) {
        this.PxuCJdSBwIXG = mf1Var;
    }

    public final void onBackCancelled() {
        mf1 mf1Var = this.PxuCJdSBwIXG;
        hc1 hc1Var = mf1Var.PxuCJdSBwIXG;
        if (hc1Var == null) {
            u9.rtx2ld2ELZv4("This input is not added to any dispatcher.");
            return;
        }
        if (!mf1Var.lS5Rgt96tfkO) {
            hc1Var.Y1f8riQaR6yg(mf1Var, null);
        }
        mc1 mc1Var = hc1Var.lS5Rgt96tfkO;
        mc1Var.getClass();
        if (mf1Var.equals(mc1Var.rtx2ld2ELZv4) && -1 == mc1Var.RAsUl2FVSrh6) {
            jc1 jc1Var = mc1Var.a92UlCVFR9N8;
            if (jc1Var == null) {
                jc1Var = mc1Var.TSizfFm2Yiuu(-1);
            }
            mc1Var.a92UlCVFR9N8 = null;
            mc1Var.RAsUl2FVSrh6 = 0;
            mc1Var.rtx2ld2ELZv4 = null;
            if (jc1Var != null) {
                jc1Var.PxuCJdSBwIXG();
            }
            l92 l92Var = mc1Var.PxuCJdSBwIXG;
            l92Var.getClass();
            l92Var.OPXfSBeufaJ8(null, oc1.PxuCJdSBwIXG);
        }
        mf1Var.lS5Rgt96tfkO = false;
    }

    public final void onBackInvoked() {
        this.PxuCJdSBwIXG.PxuCJdSBwIXG();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        fc1 TSizfFm2Yiuu = th0.TSizfFm2Yiuu(backEvent);
        mf1 mf1Var = this.PxuCJdSBwIXG;
        hc1 hc1Var = mf1Var.PxuCJdSBwIXG;
        if (hc1Var == null) {
            u9.rtx2ld2ELZv4("This input is not added to any dispatcher.");
            return;
        }
        if (mf1Var.lS5Rgt96tfkO) {
            mc1 mc1Var = hc1Var.lS5Rgt96tfkO;
            mc1Var.getClass();
            if (mf1Var.equals(mc1Var.rtx2ld2ELZv4) && -1 == mc1Var.RAsUl2FVSrh6) {
                jc1 jc1Var = mc1Var.a92UlCVFR9N8;
                if (jc1Var == null) {
                    jc1Var = mc1Var.TSizfFm2Yiuu(-1);
                }
                if (jc1Var != null) {
                    jc1Var.TSizfFm2Yiuu(TSizfFm2Yiuu);
                }
                l92 l92Var = mc1Var.PxuCJdSBwIXG;
                pc1 pc1Var = new pc1(TSizfFm2Yiuu);
                l92Var.getClass();
                l92Var.OPXfSBeufaJ8(null, pc1Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        fc1 TSizfFm2Yiuu = th0.TSizfFm2Yiuu(backEvent);
        mf1 mf1Var = this.PxuCJdSBwIXG;
        hc1 hc1Var = mf1Var.PxuCJdSBwIXG;
        if (hc1Var == null) {
            u9.rtx2ld2ELZv4("This input is not added to any dispatcher.");
        } else {
            if (mf1Var.lS5Rgt96tfkO) {
                return;
            }
            hc1Var.Y1f8riQaR6yg(mf1Var, TSizfFm2Yiuu);
            mf1Var.lS5Rgt96tfkO = true;
        }
    }
}
