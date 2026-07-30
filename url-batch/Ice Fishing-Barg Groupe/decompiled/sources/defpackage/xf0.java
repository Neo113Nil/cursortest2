package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class xf0 {
    public final ArrayList PxuCJdSBwIXG;
    public int TSizfFm2Yiuu;
    public final ArrayList Y1f8riQaR6yg;
    public final qc2 a92UlCVFR9N8;
    public final c81 e9gEMXR7LXtO;
    public final int lS5Rgt96tfkO;

    public xf0(int i, ArrayList arrayList) {
        this.PxuCJdSBwIXG = arrayList;
        this.lS5Rgt96tfkO = i;
        if (i < 0) {
            gp1.PxuCJdSBwIXG("Invalid start index");
        }
        this.Y1f8riQaR6yg = new ArrayList();
        c81 c81Var = new c81();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            tu0 tu0Var = (tu0) this.PxuCJdSBwIXG.get(i3);
            int i4 = tu0Var.TSizfFm2Yiuu;
            int i5 = tu0Var.Y1f8riQaR6yg;
            c81Var.rtx2ld2ELZv4(i4, new ei0(i3, i2, i5));
            i2 += i5;
        }
        this.e9gEMXR7LXtO = c81Var;
        this.a92UlCVFR9N8 = new qc2(new wf0(this));
    }

    public final boolean PxuCJdSBwIXG(int i, int i2) {
        ei0 ei0Var;
        int i3;
        int i4;
        c81 c81Var = this.e9gEMXR7LXtO;
        ei0 ei0Var2 = (ei0) c81Var.lS5Rgt96tfkO(i);
        if (ei0Var2 == null) {
            return false;
        }
        int i5 = ei0Var2.lS5Rgt96tfkO;
        int i6 = i2 - ei0Var2.TSizfFm2Yiuu;
        ei0Var2.TSizfFm2Yiuu = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = c81Var.TSizfFm2Yiuu;
        long[] jArr = c81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (ei0Var = (ei0) objArr[(i7 << 3) + i9]).lS5Rgt96tfkO) >= i5 && ei0Var != ei0Var2 && (i4 = i3 + i6) >= 0) {
                        ei0Var.lS5Rgt96tfkO = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
