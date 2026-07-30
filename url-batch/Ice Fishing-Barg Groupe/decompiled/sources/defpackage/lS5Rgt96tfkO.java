package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class lS5Rgt96tfkO {
    public static final byte[] PxuCJdSBwIXG;
    public static final long[] lS5Rgt96tfkO;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(pj.PxuCJdSBwIXG);
        bytes.getClass();
        PxuCJdSBwIXG = bytes;
        lS5Rgt96tfkO = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final boolean PxuCJdSBwIXG(z12 z12Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = z12Var.TSizfFm2Yiuu;
        byte[] bArr2 = z12Var.PxuCJdSBwIXG;
        while (i2 < i3) {
            if (i == i4) {
                z12Var = z12Var.a92UlCVFR9N8;
                z12Var.getClass();
                byte[] bArr3 = z12Var.PxuCJdSBwIXG;
                bArr2 = bArr3;
                i = z12Var.lS5Rgt96tfkO;
                i4 = z12Var.TSizfFm2Yiuu;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String lS5Rgt96tfkO(long j, yf yfVar) {
        if (j > 0) {
            long j2 = j - 1;
            if (yfVar.cpQdD2nAriOS(j2) == 13) {
                String ZbWwgt3aGe7A = yfVar.ZbWwgt3aGe7A(j2, pj.PxuCJdSBwIXG);
                yfVar.skip(2L);
                return ZbWwgt3aGe7A;
            }
        }
        String ZbWwgt3aGe7A2 = yfVar.ZbWwgt3aGe7A(j, pj.PxuCJdSBwIXG);
        yfVar.skip(1L);
        return ZbWwgt3aGe7A2;
    }
}
