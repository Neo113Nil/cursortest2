package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z91 {
    public boolean OPXfSBeufaJ8;
    public final x91 PxuCJdSBwIXG;
    public final Bundle RAsUl2FVSrh6;
    public final Bundle TSizfFm2Yiuu;
    public f01 Y1f8riQaR6yg;
    public final String a92UlCVFR9N8;
    public final qc2 cpQdD2nAriOS;
    public f01 dgRBjINgWbAK;
    public final na1 e9gEMXR7LXtO;
    public final za1 lS5Rgt96tfkO;
    public final nz1 rtx2ld2ELZv4;
    public final s01 wdg6QnbFHrFF;
    public final rz1 x50lh2ztY7Y5;

    public z91(x91 x91Var) {
        this.PxuCJdSBwIXG = x91Var;
        this.lS5Rgt96tfkO = x91Var.OPXfSBeufaJ8;
        this.TSizfFm2Yiuu = x91Var.wdg6QnbFHrFF;
        this.Y1f8riQaR6yg = x91Var.dgRBjINgWbAK;
        this.e9gEMXR7LXtO = x91Var.x50lh2ztY7Y5;
        this.a92UlCVFR9N8 = x91Var.cpQdD2nAriOS;
        this.RAsUl2FVSrh6 = x91Var.r3s1LDPKFs1S;
        nz1.Companion.getClass();
        this.rtx2ld2ELZv4 = mz1.PxuCJdSBwIXG(x91Var);
        qc2 qc2Var = new qc2(new j21(4));
        this.wdg6QnbFHrFF = new s01(x91Var, true);
        this.dgRBjINgWbAK = f01.OPXfSBeufaJ8;
        this.x50lh2ztY7Y5 = (rz1) qc2Var.getValue();
        this.cpQdD2nAriOS = new qc2(new j21(5));
    }

    public final Bundle PxuCJdSBwIXG() {
        Bundle bundle = this.TSizfFm2Yiuu;
        if (bundle == null) {
            return null;
        }
        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        ZbWwgt3aGe7A.putAll(bundle);
        return ZbWwgt3aGe7A;
    }

    public final void lS5Rgt96tfkO() {
        if (!this.OPXfSBeufaJ8) {
            nz1 nz1Var = this.rtx2ld2ELZv4;
            nz1Var.PxuCJdSBwIXG();
            this.OPXfSBeufaJ8 = true;
            if (this.e9gEMXR7LXtO != null) {
                mm2.J54yh1s3n4Aq(this.PxuCJdSBwIXG);
            }
            nz1Var.lS5Rgt96tfkO(this.RAsUl2FVSrh6);
        }
        int ordinal = this.Y1f8riQaR6yg.ordinal();
        int ordinal2 = this.dgRBjINgWbAK.ordinal();
        s01 s01Var = this.wdg6QnbFHrFF;
        if (ordinal < ordinal2) {
            f01 f01Var = this.Y1f8riQaR6yg;
            s01Var.getClass();
            f01Var.getClass();
            s01Var.TSizfFm2Yiuu("setCurrentState");
            s01Var.e9gEMXR7LXtO(f01Var);
            return;
        }
        f01 f01Var2 = this.dgRBjINgWbAK;
        s01Var.getClass();
        f01Var2.getClass();
        s01Var.TSizfFm2Yiuu("setCurrentState");
        s01Var.e9gEMXR7LXtO(f01Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bu1.PxuCJdSBwIXG(x91.class).TSizfFm2Yiuu());
        sb.append("(" + this.a92UlCVFR9N8 + ')');
        sb.append(" destination=");
        sb.append(this.lS5Rgt96tfkO);
        return sb.toString();
    }
}
