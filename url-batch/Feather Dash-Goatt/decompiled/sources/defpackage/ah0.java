package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ah0 extends tn1 {
    public final en0 b;

    public ah0() {
        en0 en0Var = r90.a;
        this.b = new en0();
    }

    @Override // defpackage.tn1
    public final void d() {
        en0 en0Var = this.b;
        int[] iArr = en0Var.b;
        Object[] objArr = en0Var.c;
        long[] jArr = en0Var.a;
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
                        mn0 mn0Var = (mn0) objArr[i4];
                        Object[] objArr2 = mn0Var.a;
                        int i6 = mn0Var.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            zg0 zg0Var = (zg0) objArr2[i7];
                            uf ufVar = zg0Var.d;
                            if (ufVar != null) {
                                ufVar.cancel();
                            }
                            zg0Var.d = null;
                            rj0 rj0Var = (rj0) zg0Var.a.e;
                            rj0Var.e = true;
                            rj0Var.d = false;
                            rj0Var.c();
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
