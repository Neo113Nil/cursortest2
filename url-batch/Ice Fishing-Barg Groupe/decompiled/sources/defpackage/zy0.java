package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class zy0 {
    public final jz0 PxuCJdSBwIXG;
    public final qx0 TSizfFm2Yiuu;
    public final x3 Y1f8riQaR6yg;
    public final yy0 lS5Rgt96tfkO;

    public zy0(jz0 jz0Var, yy0 yy0Var, qx0 qx0Var, x3 x3Var) {
        this.PxuCJdSBwIXG = jz0Var;
        this.lS5Rgt96tfkO = yy0Var;
        this.TSizfFm2Yiuu = qx0Var;
        this.Y1f8riQaR6yg = x3Var;
    }

    public final void PxuCJdSBwIXG(int i, Object obj, hp hpVar, int i2) {
        int i3;
        Object obj2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-462424778);
        int i4 = (tf0Var.Y1f8riQaR6yg(i) ? 4 : 2) | i2 | (tf0Var.rtx2ld2ELZv4(obj) ? 32 : 16) | (tf0Var.a92UlCVFR9N8(this) ? 256 : 128);
        if (tf0Var.Pf0ThKz3j5YS(i4 & 1, (i4 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            i3 = i;
            obj2 = obj;
            ng0.lS5Rgt96tfkO(obj2, i3, this.PxuCJdSBwIXG.XL4ISE6Oc65B, bs0.kpCQ9veP6n3I(-824725566, new t2(this, i), tf0Var), tf0Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new dy0(this, i3, obj2, i2);
        }
    }

    public final int TSizfFm2Yiuu() {
        yy0 yy0Var = this.lS5Rgt96tfkO;
        yy0Var.getClass();
        return yy0Var.PxuCJdSBwIXG.PxuCJdSBwIXG;
    }

    public final Object Y1f8riQaR6yg(int i) {
        Object OPXfSBeufaJ8;
        x3 x3Var = this.Y1f8riQaR6yg;
        Object[] objArr = (Object[]) x3Var.TSizfFm2Yiuu;
        int i2 = i - x3Var.PxuCJdSBwIXG;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        if (obj != null) {
            return obj;
        }
        yy0 yy0Var = this.lS5Rgt96tfkO;
        yy0Var.getClass();
        ur0 PxuCJdSBwIXG = yy0Var.PxuCJdSBwIXG.PxuCJdSBwIXG(i);
        int i3 = i - PxuCJdSBwIXG.PxuCJdSBwIXG;
        le0 le0Var = (le0) PxuCJdSBwIXG.lS5Rgt96tfkO.OPXfSBeufaJ8;
        return (le0Var == null || (OPXfSBeufaJ8 = le0Var.OPXfSBeufaJ8(Integer.valueOf(i3))) == null) ? new sw(i) : OPXfSBeufaJ8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy0)) {
            return false;
        }
        return cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, ((zy0) obj).lS5Rgt96tfkO);
    }

    public final int hashCode() {
        return this.lS5Rgt96tfkO.hashCode();
    }

    public final Object lS5Rgt96tfkO(int i) {
        yy0 yy0Var = this.lS5Rgt96tfkO;
        yy0Var.getClass();
        int i2 = yy0Var.PxuCJdSBwIXG.PxuCJdSBwIXG(i).PxuCJdSBwIXG;
        return null;
    }
}
