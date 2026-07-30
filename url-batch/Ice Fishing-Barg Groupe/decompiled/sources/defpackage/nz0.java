package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nz0 implements zy1, wy1 {
    public static final mz0 Companion = new mz0();
    public final wy1 OPXfSBeufaJ8;
    public final az1 rtx2ld2ELZv4;
    public final w81 wdg6QnbFHrFF;

    public nz0(zy1 zy1Var, Map map, wy1 wy1Var) {
        r3s1LDPKFs1S r3s1ldpkfs1s = new r3s1LDPKFs1S(17, zy1Var);
        t92 t92Var = bz1.PxuCJdSBwIXG;
        this.rtx2ld2ELZv4 = new az1(map, r3s1ldpkfs1s);
        this.OPXfSBeufaJ8 = wy1Var;
        w81 w81Var = d02.PxuCJdSBwIXG;
        this.wdg6QnbFHrFF = new w81();
    }

    @Override // defpackage.zy1
    public final m9 PxuCJdSBwIXG(String str, ae0 ae0Var) {
        return this.rtx2ld2ELZv4.PxuCJdSBwIXG(str, ae0Var);
    }

    @Override // defpackage.wy1
    public final void TSizfFm2Yiuu(Object obj) {
        this.OPXfSBeufaJ8.TSizfFm2Yiuu(obj);
    }

    @Override // defpackage.zy1
    public final boolean Y1f8riQaR6yg(Object obj) {
        return this.rtx2ld2ELZv4.Y1f8riQaR6yg(obj);
    }

    @Override // defpackage.zy1
    public final Object a92UlCVFR9N8(String str) {
        return this.rtx2ld2ELZv4.a92UlCVFR9N8(str);
    }

    @Override // defpackage.zy1
    public final Map e9gEMXR7LXtO() {
        w81 w81Var = this.wdg6QnbFHrFF;
        Object[] objArr = w81Var.lS5Rgt96tfkO;
        long[] jArr = w81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.OPXfSBeufaJ8.TSizfFm2Yiuu(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.rtx2ld2ELZv4.e9gEMXR7LXtO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L34;
     */
    @Override // defpackage.wy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void lS5Rgt96tfkO(Object obj, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-858296452);
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
            this.OPXfSBeufaJ8.lS5Rgt96tfkO(obj, onVar, tf0Var, i2 & 126);
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(this) | tf0Var.rtx2ld2ELZv4(obj);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new e9gEMXR7LXtO(17, this, obj);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            mm2.rtx2ld2ELZv4(obj, (le0) nLZGh9p8gVSu, tf0Var);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(this, obj, onVar, i, 7);
        }
    }
}
