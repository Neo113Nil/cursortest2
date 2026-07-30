package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ef {
    public final f91 PxuCJdSBwIXG;

    public ef(int i) {
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = new f91(new rx0[16]);
                break;
            default:
                this.PxuCJdSBwIXG = new f91(new cs[16]);
                break;
        }
    }

    public void PxuCJdSBwIXG(CancellationException cancellationException) {
        f91 f91Var = this.PxuCJdSBwIXG;
        int i = f91Var.wdg6QnbFHrFF;
        zh[] zhVarArr = new zh[i];
        for (int i2 = 0; i2 < i; i2++) {
            zhVarArr[i2] = ((cs) f91Var.rtx2ld2ELZv4[i2]).lS5Rgt96tfkO;
        }
        for (int i3 = 0; i3 < i; i3++) {
            zhVarArr[i3].QrzZRwfaDlRX(cancellationException);
        }
        if (f91Var.wdg6QnbFHrFF == 0) {
            return;
        }
        hp0.TSizfFm2Yiuu("uncancelled requests present");
    }

    public void lS5Rgt96tfkO() {
        f91 f91Var = this.PxuCJdSBwIXG;
        br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, f91Var.wdg6QnbFHrFF);
        int i = nLZGh9p8gVSu.rtx2ld2ELZv4;
        int i2 = nLZGh9p8gVSu.OPXfSBeufaJ8;
        if (i <= i2) {
            while (true) {
                ((cs) f91Var.rtx2ld2ELZv4[i]).lS5Rgt96tfkO.RAsUl2FVSrh6(no2.PxuCJdSBwIXG);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        f91Var.RAsUl2FVSrh6();
    }
}
