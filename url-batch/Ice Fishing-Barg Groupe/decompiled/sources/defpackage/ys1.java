package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ys1 {
    public static void PxuCJdSBwIXG(e72 e72Var, List list, zp zpVar) {
        Object obj;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int TSizfFm2Yiuu = e72Var.TSizfFm2Yiuu((nf0) list.get(i));
            int amuv7NJvPxHu = e72Var.amuv7NJvPxHu(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(TSizfFm2Yiuu));
            if (amuv7NJvPxHu < e72Var.RAsUl2FVSrh6(e72Var.lS5Rgt96tfkO, e72Var.XL4ISE6Oc65B(TSizfFm2Yiuu + 1))) {
                obj = e72Var.TSizfFm2Yiuu[e72Var.rtx2ld2ELZv4(amuv7NJvPxHu)];
            } else {
                hp.Companion.getClass();
                obj = fp.lS5Rgt96tfkO;
            }
            zs1 zs1Var = obj instanceof zs1 ? (zs1) obj : null;
            if (zs1Var != null) {
                zs1Var.PxuCJdSBwIXG = zpVar;
            }
        }
    }
}
