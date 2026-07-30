package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class wi implements bf0 {
    public final int OPXfSBeufaJ8;
    public final hu rtx2ld2ELZv4;
    public final ag wdg6QnbFHrFF;

    public wi(hu huVar, int i, ag agVar) {
        this.rtx2ld2ELZv4 = huVar;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = agVar;
    }

    @Override // defpackage.v80
    public Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        Object XL4ISE6Oc65B = cs0.XL4ISE6Oc65B(new rtx2ld2ELZv4(w80Var, this, null, 3), btVar);
        return XL4ISE6Oc65B == su.rtx2ld2ELZv4 ? XL4ISE6Oc65B : no2.PxuCJdSBwIXG;
    }

    public ui RAsUl2FVSrh6(ru ruVar) {
        int i = this.OPXfSBeufaJ8;
        if (i == -3) {
            i = -2;
        }
        pe0 a92ulcvfr9n8 = new a92UlCVFR9N8(this, null, 9);
        qq1 qq1Var = new qq1(zv.nLZGh9p8gVSu(ruVar, this.rtx2ld2ELZv4), mm2.PxuCJdSBwIXG(i, 4, this.wdg6QnbFHrFF));
        qq1Var.uURZJOrwXbxn(uu.wdg6QnbFHrFF, qq1Var, a92ulcvfr9n8);
        return qq1Var;
    }

    public String TSizfFm2Yiuu() {
        return null;
    }

    public abstract Object Y1f8riQaR6yg(qq1 qq1Var, bt btVar);

    public v80 a92UlCVFR9N8() {
        return null;
    }

    public abstract wi e9gEMXR7LXtO(hu huVar, int i, ag agVar);

    @Override // defpackage.bf0
    public final v80 lS5Rgt96tfkO(hu huVar, int i, ag agVar) {
        hu huVar2 = this.rtx2ld2ELZv4;
        hu RfyTYNmI9Srp = huVar.RfyTYNmI9Srp(huVar2);
        ag agVar2 = ag.rtx2ld2ELZv4;
        ag agVar3 = this.wdg6QnbFHrFF;
        int i2 = this.OPXfSBeufaJ8;
        if (agVar == agVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            agVar = agVar3;
        }
        return (cs0.wdg6QnbFHrFF(RfyTYNmI9Srp, huVar2) && i == i2 && agVar == agVar3) ? this : e9gEMXR7LXtO(RfyTYNmI9Srp, i, agVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String TSizfFm2Yiuu = TSizfFm2Yiuu();
        if (TSizfFm2Yiuu != null) {
            arrayList.add(TSizfFm2Yiuu);
        }
        n50 n50Var = n50.rtx2ld2ELZv4;
        hu huVar = this.rtx2ld2ELZv4;
        if (huVar != n50Var) {
            arrayList.add("context=" + huVar);
        }
        int i = this.OPXfSBeufaJ8;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ag agVar = ag.rtx2ld2ELZv4;
        ag agVar2 = this.wdg6QnbFHrFF;
        if (agVar2 != agVar) {
            arrayList.add("onBufferOverflow=" + agVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return o0.QrzZRwfaDlRX(sb, zk.ctD2u3GUHhtA(arrayList, ", ", null, null, null, 62), ']');
    }
}
