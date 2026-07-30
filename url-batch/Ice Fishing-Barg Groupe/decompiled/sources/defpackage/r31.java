package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r31 implements hy {
    public long OPXfSBeufaJ8;
    public final /* synthetic */ u31 dgRBjINgWbAK;
    public boolean rtx2ld2ELZv4;
    public long wdg6QnbFHrFF;

    public r31(u31 u31Var) {
        this.dgRBjINgWbAK = u31Var;
        wq0.Companion.getClass();
        this.OPXfSBeufaJ8 = 9223372034707292159L;
        ir0.Companion.getClass();
        this.wdg6QnbFHrFF = 0L;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [byte[], java.io.Serializable] */
    public final void PxuCJdSBwIXG(ey1 ey1Var, float f) {
        u31 u31Var = this.dgRBjINgWbAK;
        cb1 cb1Var = u31Var.EcgxDIVH5in8;
        if (cb1Var == null) {
            cb1Var = new cb1();
            u31Var.EcgxDIVH5in8 = cb1Var;
        }
        int hnJvRxDXo0hm = na.hnJvRxDXo0hm((ey1[]) cb1Var.TSizfFm2Yiuu, ey1Var);
        if (hnJvRxDXo0hm >= 0) {
            float[] fArr = (float[]) cb1Var.Y1f8riQaR6yg;
            if (fArr[hnJvRxDXo0hm] != f) {
                fArr[hnJvRxDXo0hm] = f;
                ((byte[]) cb1Var.e9gEMXR7LXtO)[hnJvRxDXo0hm] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) cb1Var.e9gEMXR7LXtO;
                if (bArr[hnJvRxDXo0hm] == 2) {
                    bArr[hnJvRxDXo0hm] = 0;
                    return;
                }
                return;
            }
        }
        int i = cb1Var.lS5Rgt96tfkO;
        ey1[] ey1VarArr = (ey1[]) cb1Var.TSizfFm2Yiuu;
        if (i == ey1VarArr.length) {
            int i2 = i * 2;
            cb1Var.TSizfFm2Yiuu = (ey1[]) Arrays.copyOf(ey1VarArr, i2);
            cb1Var.Y1f8riQaR6yg = Arrays.copyOf((float[]) cb1Var.Y1f8riQaR6yg, i2);
            cb1Var.e9gEMXR7LXtO = Arrays.copyOf((byte[]) cb1Var.e9gEMXR7LXtO, i2);
        }
        ((ey1[]) cb1Var.TSizfFm2Yiuu)[i] = ey1Var;
        ((byte[]) cb1Var.e9gEMXR7LXtO)[i] = 3;
        ((float[]) cb1Var.Y1f8riQaR6yg)[i] = f;
        cb1Var.lS5Rgt96tfkO++;
    }

    @Override // defpackage.hy
    public final float lS5Rgt96tfkO() {
        return this.dgRBjINgWbAK.lS5Rgt96tfkO();
    }

    @Override // defpackage.hy
    public final float r3s1LDPKFs1S() {
        return this.dgRBjINgWbAK.r3s1LDPKFs1S();
    }
}
