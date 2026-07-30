package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i9 implements g9 {
    @Override // defpackage.g9
    public final void m(xk0 xk0Var, int i, int[] iArr, vc0 vc0Var, int[] iArr2) {
        int i2 = 0;
        if (vc0Var == vc0.d) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i2 < length) {
                int i5 = iArr[i2];
                iArr2[i3] = i4;
                i4 += i5;
                i2++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            i6 += iArr[i2];
            i2++;
        }
        int i7 = i - i6;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i8 = iArr[length3];
            iArr2[length3] = i7;
            i7 += i8;
        }
    }

    public final String toString() {
        return "Arrangement#Start";
    }
}
