package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nu2 implements l01 {
    public final /* synthetic */ x6 OPXfSBeufaJ8;
    public final /* synthetic */ zt1 dgRBjINgWbAK;
    public final /* synthetic */ at rtx2ld2ELZv4;
    public final /* synthetic */ ht1 wdg6QnbFHrFF;

    public nu2(at atVar, x6 x6Var, ht1 ht1Var, zt1 zt1Var) {
        this.rtx2ld2ELZv4 = atVar;
        this.OPXfSBeufaJ8 = x6Var;
        this.wdg6QnbFHrFF = ht1Var;
        this.dgRBjINgWbAK = zt1Var;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        boolean z;
        zh zhVar = null;
        switch (mu2.PxuCJdSBwIXG[e01Var.ordinal()]) {
            case 1:
                fx1.KUoIVIumpKat(this.rtx2ld2ELZv4, null, new e4(this.dgRBjINgWbAK, this.wdg6QnbFHrFF, o01Var, this, null, 15), 1);
                return;
            case 2:
                x6 x6Var = this.OPXfSBeufaJ8;
                if (x6Var != null) {
                    jv jvVar = (jv) x6Var.wdg6QnbFHrFF;
                    synchronized (jvVar.lS5Rgt96tfkO) {
                        try {
                            synchronized (jvVar.lS5Rgt96tfkO) {
                                z = jvVar.PxuCJdSBwIXG;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) jvVar.TSizfFm2Yiuu;
                                jvVar.TSizfFm2Yiuu = (ArrayList) jvVar.Y1f8riQaR6yg;
                                jvVar.Y1f8riQaR6yg = arrayList;
                                jvVar.PxuCJdSBwIXG = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((bt) arrayList.get(i)).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                ht1 ht1Var = this.wdg6QnbFHrFF;
                synchronized (ht1Var.TSizfFm2Yiuu) {
                    if (ht1Var.EcgxDIVH5in8) {
                        ht1Var.EcgxDIVH5in8 = false;
                        zhVar = ht1Var.pnx5pC0XzaCw();
                    }
                }
                if (zhVar != null) {
                    ((bi) zhVar).RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                    return;
                }
                return;
            case 3:
                ht1 ht1Var2 = this.wdg6QnbFHrFF;
                synchronized (ht1Var2.TSizfFm2Yiuu) {
                    ht1Var2.EcgxDIVH5in8 = true;
                }
                return;
            case 4:
                this.wdg6QnbFHrFF.ZbWwgt3aGe7A();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                u9.gPXPFXrUH4XX();
                return;
        }
    }
}
