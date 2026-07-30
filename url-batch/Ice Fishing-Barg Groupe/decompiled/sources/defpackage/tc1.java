package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class tc1 {
    public fa1 PxuCJdSBwIXG;
    public boolean lS5Rgt96tfkO;

    public abstract za1 PxuCJdSBwIXG();

    public void Y1f8riQaR6yg(List list, xb1 xb1Var) {
        c80 c80Var = new c80(new fy(new hd2(new fl(0, list), new r3s1LDPKFs1S(23, this, xb1Var), 1), new vz1(15), 1));
        while (c80Var.hasNext()) {
            lS5Rgt96tfkO().a92UlCVFR9N8((x91) c80Var.next());
        }
    }

    public boolean a92UlCVFR9N8() {
        return true;
    }

    public void e9gEMXR7LXtO(x91 x91Var, boolean z) {
        List list = (List) lS5Rgt96tfkO().e9gEMXR7LXtO.rtx2ld2ELZv4.getValue();
        if (!list.contains(x91Var)) {
            rc1.wdg6QnbFHrFF("popBackStack was called with ", x91Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        x91 x91Var2 = null;
        while (a92UlCVFR9N8()) {
            x91Var2 = (x91) listIterator.previous();
            if (cs0.wdg6QnbFHrFF(x91Var2, x91Var)) {
                break;
            }
        }
        if (x91Var2 != null) {
            lS5Rgt96tfkO().Y1f8riQaR6yg(x91Var2, z);
        }
    }

    public final fa1 lS5Rgt96tfkO() {
        fa1 fa1Var = this.PxuCJdSBwIXG;
        if (fa1Var != null) {
            return fa1Var;
        }
        u9.rtx2ld2ELZv4("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public za1 TSizfFm2Yiuu(za1 za1Var) {
        return za1Var;
    }
}
