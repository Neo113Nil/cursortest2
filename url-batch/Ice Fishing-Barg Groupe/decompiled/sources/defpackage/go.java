package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@sc1("composable")
/* loaded from: classes.dex */
public final class go extends tc1 {
    public static final eo Companion = new eo();
    public final mj1 TSizfFm2Yiuu = sj0.tmVwIGCQF4zR(Boolean.FALSE);

    @Override // defpackage.tc1
    public final za1 PxuCJdSBwIXG() {
        return new fo(this, sn.PxuCJdSBwIXG);
    }

    public final void RAsUl2FVSrh6(x91 x91Var) {
        fa1 lS5Rgt96tfkO = lS5Rgt96tfkO();
        x91Var.getClass();
        l92 l92Var = lS5Rgt96tfkO.TSizfFm2Yiuu;
        l92Var.OPXfSBeufaJ8(null, r42.Pf0ThKz3j5YS((Set) l92Var.getValue(), x91Var));
        la1 la1Var = lS5Rgt96tfkO.rtx2ld2ELZv4.lS5Rgt96tfkO;
        la1Var.getClass();
        if (la1Var.a92UlCVFR9N8.contains(x91Var)) {
            x91Var.PxuCJdSBwIXG(f01.dgRBjINgWbAK);
        } else {
            u9.rtx2ld2ELZv4("Cannot transition entry that is not in the back stack");
        }
    }

    @Override // defpackage.tc1
    public final void Y1f8riQaR6yg(List list, xb1 xb1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x91 x91Var = (x91) it.next();
            fa1 lS5Rgt96tfkO = lS5Rgt96tfkO();
            cs1 cs1Var = lS5Rgt96tfkO.e9gEMXR7LXtO;
            x91Var.getClass();
            l92 l92Var = lS5Rgt96tfkO.TSizfFm2Yiuu;
            Iterable iterable = (Iterable) l92Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((x91) it2.next()) == x91Var) {
                        Iterable iterable2 = (Iterable) cs1Var.rtx2ld2ELZv4.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((x91) it3.next()) == x91Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            x91 x91Var2 = (x91) zk.BUo4iHFctTZi((List) cs1Var.rtx2ld2ELZv4.getValue());
            if (x91Var2 != null) {
                l92Var.OPXfSBeufaJ8(null, r42.Pf0ThKz3j5YS((Set) l92Var.getValue(), x91Var2));
            }
            l92Var.OPXfSBeufaJ8(null, r42.Pf0ThKz3j5YS((Set) l92Var.getValue(), x91Var));
            lS5Rgt96tfkO.a92UlCVFR9N8(x91Var);
        }
        this.TSizfFm2Yiuu.setValue(Boolean.FALSE);
    }

    @Override // defpackage.tc1
    public final void e9gEMXR7LXtO(x91 x91Var, boolean z) {
        lS5Rgt96tfkO().e9gEMXR7LXtO(x91Var, z);
        this.TSizfFm2Yiuu.setValue(Boolean.TRUE);
    }
}
