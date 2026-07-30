package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mc1 {
    public final LinkedHashSet OPXfSBeufaJ8;
    public final l92 PxuCJdSBwIXG = hq0.RAsUl2FVSrh6(oc1.PxuCJdSBwIXG);
    public int RAsUl2FVSrh6;
    public final cs1 TSizfFm2Yiuu;
    public final da Y1f8riQaR6yg;
    public jc1 a92UlCVFR9N8;
    public boolean cpQdD2nAriOS;
    public final LinkedHashSet dgRBjINgWbAK;
    public final da e9gEMXR7LXtO;
    public final l92 lS5Rgt96tfkO;
    public boolean r3s1LDPKFs1S;
    public lc1 rtx2ld2ELZv4;
    public final LinkedHashSet wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public mc1() {
        l92 RAsUl2FVSrh6 = hq0.RAsUl2FVSrh6(new kc1());
        this.lS5Rgt96tfkO = RAsUl2FVSrh6;
        this.TSizfFm2Yiuu = new cs1(RAsUl2FVSrh6);
        this.Y1f8riQaR6yg = new da();
        this.e9gEMXR7LXtO = new da();
        this.OPXfSBeufaJ8 = new LinkedHashSet();
        this.wdg6QnbFHrFF = new LinkedHashSet();
        this.dgRBjINgWbAK = new LinkedHashSet();
    }

    public final void PxuCJdSBwIXG(hc1 hc1Var, lc1 lc1Var, int i) {
        hc1Var.getClass();
        if (lc1Var.PxuCJdSBwIXG == null) {
            (i != 0 ? i != 1 ? this.OPXfSBeufaJ8 : this.wdg6QnbFHrFF : this.dgRBjINgWbAK).add(lc1Var);
            lc1Var.PxuCJdSBwIXG = hc1Var;
            ((kc1) this.TSizfFm2Yiuu.rtx2ld2ELZv4.getValue()).getClass();
            lc1Var.lS5Rgt96tfkO(i != 0 ? i != 1 ? this.r3s1LDPKFs1S : this.x50lh2ztY7Y5 : this.cpQdD2nAriOS);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(lc1Var);
        hc1 hc1Var2 = lc1Var.PxuCJdSBwIXG;
        sb.append("' is already added to dispatcher ");
        sb.append(hc1Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final jc1 TSizfFm2Yiuu(int i) {
        Object obj;
        Object obj2;
        da daVar = this.e9gEMXR7LXtO;
        da daVar2 = this.Y1f8riQaR6yg;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = daVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((jc1) obj).lS5Rgt96tfkO) {
                    break;
                }
            }
            jc1 jc1Var = (jc1) obj;
            if (jc1Var != null) {
                return jc1Var;
            }
            Iterator it2 = daVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((jc1) next).lS5Rgt96tfkO) {
                    obj3 = next;
                    break;
                }
            }
            return (jc1) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = daVar2.iterator();
            while (it3.hasNext()) {
                ((jc1) it3.next()).getClass();
            }
            Iterator it4 = daVar.iterator();
            while (it4.hasNext()) {
                ((jc1) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = daVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((jc1) obj2).lS5Rgt96tfkO) {
                break;
            }
        }
        jc1 jc1Var2 = (jc1) obj2;
        if (jc1Var2 != null) {
            return jc1Var2;
        }
        Iterator it6 = daVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((jc1) next2).lS5Rgt96tfkO) {
                obj3 = next2;
                break;
            }
        }
        return (jc1) obj3;
    }

    public final void lS5Rgt96tfkO() {
        boolean z;
        boolean z2;
        kc1 kc1Var;
        da daVar = this.Y1f8riQaR6yg;
        if (daVar == null || !daVar.isEmpty()) {
            Iterator it = daVar.iterator();
            while (it.hasNext()) {
                if (((jc1) it.next()).lS5Rgt96tfkO) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        da daVar2 = this.e9gEMXR7LXtO;
        if (daVar2 == null || !daVar2.isEmpty()) {
            Iterator it2 = daVar2.iterator();
            while (it2.hasNext()) {
                if (((jc1) it2.next()).lS5Rgt96tfkO) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.cpQdD2nAriOS != z;
        boolean z5 = this.x50lh2ztY7Y5 != z2;
        boolean z6 = this.r3s1LDPKFs1S != z3;
        LinkedHashSet linkedHashSet = this.dgRBjINgWbAK;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((lc1) it3.next()).lS5Rgt96tfkO(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.wdg6QnbFHrFF;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((lc1) it4.next()).lS5Rgt96tfkO(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.OPXfSBeufaJ8;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((lc1) it5.next()).lS5Rgt96tfkO(z3);
            }
        }
        this.cpQdD2nAriOS = z;
        this.x50lh2ztY7Y5 = z2;
        this.r3s1LDPKFs1S = z3;
        jc1 jc1Var = this.a92UlCVFR9N8;
        if (jc1Var == null) {
            jc1Var = TSizfFm2Yiuu(0);
        }
        jc1 jc1Var2 = this.a92UlCVFR9N8;
        if (jc1Var2 == null) {
            jc1Var2 = TSizfFm2Yiuu(0);
        }
        if (cs0.wdg6QnbFHrFF(jc1Var2, jc1Var)) {
            if (jc1Var2 == null) {
                kc1Var = new kc1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = daVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((jc1) it6.next()).lS5Rgt96tfkO;
                }
                Iterator<E> it7 = daVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((jc1) it7.next()).lS5Rgt96tfkO;
                }
                jh0 jh0Var = jc1Var2.PxuCJdSBwIXG;
                z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
                el.MBpAROcyNHKN(arrayList, BjEWd04qc7Mw);
                BjEWd04qc7Mw.add(jh0Var);
                el.MBpAROcyNHKN(p50.rtx2ld2ELZv4, BjEWd04qc7Mw);
                kc1Var = new kc1(arrayList.size(), fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw));
            }
            l92 l92Var = this.lS5Rgt96tfkO;
            if (cs0.wdg6QnbFHrFF((kc1) l92Var.getValue(), kc1Var)) {
                return;
            }
            l92Var.OPXfSBeufaJ8(null, kc1Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((lc1) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((lc1) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((lc1) it10.next()).getClass();
            }
        }
    }
}
