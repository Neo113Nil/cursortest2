package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class yy1 implements wy1 {
    public static final xy1 Companion = new xy1();
    public static final cr1 x50lh2ztY7Y5 = new cr1(5, new jm(12, 0), new mq1(3));
    public final v81 OPXfSBeufaJ8;
    public final xw1 dgRBjINgWbAK;
    public final Map rtx2ld2ELZv4;
    public zy1 wdg6QnbFHrFF;

    public yy1(Map map) {
        this.rtx2ld2ELZv4 = map;
        long[] jArr = c02.PxuCJdSBwIXG;
        this.OPXfSBeufaJ8 = new v81();
        this.dgRBjINgWbAK = new xw1(1, this);
    }

    @Override // defpackage.wy1
    public final void TSizfFm2Yiuu(Object obj) {
        if (this.OPXfSBeufaJ8.dgRBjINgWbAK(obj) == null) {
            this.rtx2ld2ELZv4.remove(obj);
        }
    }

    @Override // defpackage.wy1
    public final void lS5Rgt96tfkO(Object obj, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(533563200);
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(this) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            tf0Var.bEKsvqmvPh2y(obj);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == jx1Var) {
                xw1 xw1Var = this.dgRBjINgWbAK;
                if (!((Boolean) xw1Var.OPXfSBeufaJ8(obj)).booleanValue()) {
                    rc1.OPXfSBeufaJ8("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.rtx2ld2ELZv4.get(obj);
                t92 t92Var = bz1.PxuCJdSBwIXG;
                cz1 cz1Var = new cz1(new az1(map, xw1Var));
                tf0Var.JTxCbbCwomzt(cz1Var);
                nLZGh9p8gVSu = cz1Var;
            }
            cz1 cz1Var2 = (cz1) nLZGh9p8gVSu;
            int i3 = 8;
            zv.TSizfFm2Yiuu(new ir1[]{bz1.PxuCJdSBwIXG.PxuCJdSBwIXG(cz1Var2), k21.PxuCJdSBwIXG.PxuCJdSBwIXG(cz1Var2)}, onVar, tf0Var, (i2 & 112) | 8);
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(this) | tf0Var.rtx2ld2ELZv4(obj) | tf0Var.rtx2ld2ELZv4(cz1Var2);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv4 || nLZGh9p8gVSu2 == jx1Var) {
                nLZGh9p8gVSu2 = new cd(this, obj, cz1Var2, i3);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            mm2.rtx2ld2ELZv4(no2.PxuCJdSBwIXG, (le0) nLZGh9p8gVSu2, tf0Var);
            if (tf0Var.pnx5pC0XzaCw && tf0Var.ozEBbv0hFTAB.OPXfSBeufaJ8 == tf0Var.IAToe7bXGz4N) {
                tf0Var.IAToe7bXGz4N = -1;
                tf0Var.pnx5pC0XzaCw = false;
            }
            tf0Var.gPXPFXrUH4XX(false);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(this, obj, onVar, i, 10);
        }
    }
}
