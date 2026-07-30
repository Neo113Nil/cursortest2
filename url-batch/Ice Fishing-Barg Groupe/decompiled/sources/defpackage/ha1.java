package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class ha1 implements l01 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ ha1(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        int i = this.rtx2ld2ELZv4;
        int i2 = 0;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                la1 la1Var = (la1) obj;
                la1Var.BRwzKIf41E4i = e01Var.PxuCJdSBwIXG();
                if (la1Var.TSizfFm2Yiuu != null) {
                    ArrayList j = zk.j(la1Var.a92UlCVFR9N8);
                    int size = j.size();
                    while (i2 < size) {
                        Object obj2 = j.get(i2);
                        i2++;
                        x91 x91Var = (x91) obj2;
                        x91Var.getClass();
                        z91 z91Var = x91Var.QrzZRwfaDlRX;
                        z91Var.getClass();
                        z91Var.PxuCJdSBwIXG.dgRBjINgWbAK = e01Var.PxuCJdSBwIXG();
                        z91Var.Y1f8riQaR6yg = e01Var.PxuCJdSBwIXG();
                        z91Var.lS5Rgt96tfkO();
                    }
                    break;
                }
                break;
            default:
                pz1 pz1Var = (pz1) obj;
                if (e01Var != e01.ON_START) {
                    if (e01Var == e01.ON_STOP) {
                        pz1Var.rtx2ld2ELZv4 = false;
                        break;
                    }
                } else {
                    pz1Var.rtx2ld2ELZv4 = true;
                    break;
                }
                break;
        }
    }
}
