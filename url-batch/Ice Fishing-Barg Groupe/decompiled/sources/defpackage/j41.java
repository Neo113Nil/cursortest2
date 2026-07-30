package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class j41 implements zv1 {
    public boolean OPXfSBeufaJ8;
    public boolean wdg6QnbFHrFF;
    public boolean rtx2ld2ELZv4 = true;
    public final v81 dgRBjINgWbAK = new v81();

    public final void PxuCJdSBwIXG() {
        v81 v81Var = this.dgRBjINgWbAK;
        Object[] objArr = v81Var.TSizfFm2Yiuu;
        long[] jArr = v81Var.PxuCJdSBwIXG;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof p81) {
                                p81 p81Var = (p81) obj;
                                Object[] objArr2 = p81Var.PxuCJdSBwIXG;
                                int i4 = p81Var.lS5Rgt96tfkO;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        v81Var.PxuCJdSBwIXG();
    }
}
