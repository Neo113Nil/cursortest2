package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mg2 extends sc {
    public final ki2 OPXfSBeufaJ8;
    public final oh2 rtx2ld2ELZv4;

    public mg2(oh2 oh2Var, df1 df1Var, ki2 ki2Var, ti2 ti2Var) {
        super(oh2Var.PxuCJdSBwIXG, oh2Var.lS5Rgt96tfkO, ki2Var != null ? ki2Var.PxuCJdSBwIXG : null, df1Var, ti2Var);
        this.rtx2ld2ELZv4 = oh2Var;
        this.OPXfSBeufaJ8 = ki2Var;
    }

    public final List BRwzKIf41E4i(le0 le0Var) {
        if (!vi2.TSizfFm2Yiuu(this.a92UlCVFR9N8)) {
            return fx1.D0aTLcX6Uhyo(new mm("", 0), new q42(vi2.a92UlCVFR9N8(this.a92UlCVFR9N8), vi2.a92UlCVFR9N8(this.a92UlCVFR9N8)));
        }
        m40 m40Var = (m40) le0Var.OPXfSBeufaJ8(this);
        if (m40Var != null) {
            return fx1.jJwa0q7P5wHq(m40Var);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int XL4ISE6Oc65B(ki2 ki2Var, int i) {
        qt1 qt1Var;
        bw0 bw0Var = ki2Var.lS5Rgt96tfkO;
        ji2 ji2Var = ki2Var.PxuCJdSBwIXG;
        if (bw0Var != null) {
            bw0 bw0Var2 = ki2Var.TSizfFm2Yiuu;
            qt1Var = bw0Var2 != null ? bw0Var2.nLZGh9p8gVSu(bw0Var, true) : null;
        }
        qt1.Companion.getClass();
        qt1Var = qt1.e9gEMXR7LXtO;
        long j = this.rtx2ld2ELZv4.lS5Rgt96tfkO;
        ui2 ui2Var = vi2.Companion;
        df1 df1Var = this.Y1f8riQaR6yg;
        qt1 TSizfFm2Yiuu = ji2Var.TSizfFm2Yiuu(df1Var.lS5Rgt96tfkO((int) (j & 4294967295L)));
        float f = TSizfFm2Yiuu.PxuCJdSBwIXG;
        float intBitsToFloat = (Float.intBitsToFloat((int) (qt1Var.TSizfFm2Yiuu() & 4294967295L)) * i) + TSizfFm2Yiuu.lS5Rgt96tfkO;
        return df1Var.PxuCJdSBwIXG(ji2Var.lS5Rgt96tfkO.RAsUl2FVSrh6((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }
}
