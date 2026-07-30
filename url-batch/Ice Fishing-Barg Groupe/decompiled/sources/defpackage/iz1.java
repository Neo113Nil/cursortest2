package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class iz1 implements lz1 {
    public final cr1 PxuCJdSBwIXG;
    public Bundle TSizfFm2Yiuu;
    public final qc2 Y1f8riQaR6yg;
    public boolean lS5Rgt96tfkO;

    public iz1(cr1 cr1Var, pr2 pr2Var) {
        cr1Var.getClass();
        this.PxuCJdSBwIXG = cr1Var;
        this.Y1f8riQaR6yg = new qc2(new uy1(2, pr2Var));
    }

    @Override // defpackage.lz1
    public final Bundle PxuCJdSBwIXG() {
        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        Bundle bundle = this.TSizfFm2Yiuu;
        if (bundle != null) {
            ZbWwgt3aGe7A.putAll(bundle);
        }
        for (Map.Entry entry : ((jz1) this.Y1f8riQaR6yg.getValue()).lS5Rgt96tfkO.entrySet()) {
            String str = (String) entry.getKey();
            Bundle PxuCJdSBwIXG = ((zm) ((ez1) entry.getValue()).lS5Rgt96tfkO.a92UlCVFR9N8).PxuCJdSBwIXG();
            if (!PxuCJdSBwIXG.isEmpty()) {
                str.getClass();
                ZbWwgt3aGe7A.putBundle(str, PxuCJdSBwIXG);
            }
        }
        this.lS5Rgt96tfkO = false;
        return ZbWwgt3aGe7A;
    }

    public final void lS5Rgt96tfkO() {
        if (this.lS5Rgt96tfkO) {
            return;
        }
        Bundle RAsUl2FVSrh6 = this.PxuCJdSBwIXG.RAsUl2FVSrh6("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
        Bundle bundle = this.TSizfFm2Yiuu;
        if (bundle != null) {
            ZbWwgt3aGe7A.putAll(bundle);
        }
        if (RAsUl2FVSrh6 != null) {
            ZbWwgt3aGe7A.putAll(RAsUl2FVSrh6);
        }
        this.TSizfFm2Yiuu = ZbWwgt3aGe7A;
        this.lS5Rgt96tfkO = true;
    }
}
