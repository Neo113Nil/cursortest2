package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v01 extends dr2 {
    public final c81 lS5Rgt96tfkO;

    public v01() {
        c81 c81Var = uq0.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = new c81();
    }

    @Override // defpackage.dr2
    public final void Y1f8riQaR6yg() {
        c81 c81Var = this.lS5Rgt96tfkO;
        int[] iArr = c81Var.lS5Rgt96tfkO;
        Object[] objArr = c81Var.TSizfFm2Yiuu;
        long[] jArr = c81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        p81 p81Var = (p81) objArr[i4];
                        Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                        int i6 = p81Var.lS5Rgt96tfkO;
                        for (int i7 = 0; i7 < i6; i7++) {
                            u01 u01Var = (u01) objArr2[i7];
                            di diVar = u01Var.Y1f8riQaR6yg;
                            if (diVar != null) {
                                diVar.cancel();
                            }
                            u01Var.Y1f8riQaR6yg = null;
                            j41 j41Var = (j41) u01Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
                            j41Var.OPXfSBeufaJ8 = true;
                            j41Var.rtx2ld2ELZv4 = false;
                            j41Var.PxuCJdSBwIXG();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
