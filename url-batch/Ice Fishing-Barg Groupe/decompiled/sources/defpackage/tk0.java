package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class tk0 implements o82 {
    public final ed0 OPXfSBeufaJ8;
    public final /* synthetic */ yk0 dgRBjINgWbAK;
    public final gm0 rtx2ld2ELZv4;
    public boolean wdg6QnbFHrFF;

    public tk0(yk0 yk0Var, gm0 gm0Var) {
        gm0Var.getClass();
        this.dgRBjINgWbAK = yk0Var;
        this.rtx2ld2ELZv4 = gm0Var;
        yj2 TSizfFm2Yiuu = ((es1) yk0Var.TSizfFm2Yiuu.wdg6QnbFHrFF).rtx2ld2ELZv4.TSizfFm2Yiuu();
        TSizfFm2Yiuu.getClass();
        ed0 ed0Var = new ed0();
        ed0Var.e9gEMXR7LXtO = TSizfFm2Yiuu;
        this.OPXfSBeufaJ8 = ed0Var;
    }

    @Override // defpackage.o82
    public long RAsUl2FVSrh6(long j, yf yfVar) {
        yk0 yk0Var = this.dgRBjINgWbAK;
        yfVar.getClass();
        try {
            return ((es1) yk0Var.TSizfFm2Yiuu.wdg6QnbFHrFF).RAsUl2FVSrh6(j, yfVar);
        } catch (IOException e) {
            yk0Var.lS5Rgt96tfkO.rtx2ld2ELZv4();
            this.lS5Rgt96tfkO(yk0.a92UlCVFR9N8);
            throw e;
        }
    }

    @Override // defpackage.o82
    public final yj2 TSizfFm2Yiuu() {
        return this.OPXfSBeufaJ8;
    }

    public final void lS5Rgt96tfkO(hj0 hj0Var) {
        if1 if1Var;
        jx1 jx1Var;
        hj0Var.getClass();
        yk0 yk0Var = this.dgRBjINgWbAK;
        int i = yk0Var.Y1f8riQaR6yg;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + yk0Var.Y1f8riQaR6yg);
        }
        ed0 ed0Var = this.OPXfSBeufaJ8;
        yj2 yj2Var = ed0Var.e9gEMXR7LXtO;
        ed0Var.e9gEMXR7LXtO = yj2.Y1f8riQaR6yg;
        yj2Var.PxuCJdSBwIXG();
        yj2Var.lS5Rgt96tfkO();
        yk0Var.Y1f8riQaR6yg = 6;
        if (hj0Var.size() <= 0 || (if1Var = yk0Var.PxuCJdSBwIXG) == null || (jx1Var = if1Var.wdg6QnbFHrFF) == null) {
            return;
        }
        yl0.lS5Rgt96tfkO(jx1Var, this.rtx2ld2ELZv4, hj0Var);
    }
}
