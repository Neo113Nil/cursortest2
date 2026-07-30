package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v9 implements x9 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ v9(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.x9
    public final void rtx2ld2ELZv4(hy hyVar, int i, int[] iArr, cw0 cw0Var, int[] iArr2) {
        int i2 = 0;
        switch (this.rtx2ld2ELZv4) {
            case 0:
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
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int length2 = iArr.length;
                int i8 = i - i6;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            default:
                if (cw0Var == cw0.rtx2ld2ELZv4) {
                    int length3 = iArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i2 < length3) {
                        int i13 = iArr[i2];
                        iArr2[i11] = i12;
                        i12 += i13;
                        i2++;
                        i11++;
                    }
                    break;
                } else {
                    int length4 = iArr.length;
                    int i14 = 0;
                    while (i2 < length4) {
                        i14 += iArr[i2];
                        i2++;
                    }
                    int i15 = i - i14;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (-1 >= length5) {
                            break;
                        } else {
                            int i16 = iArr[length5];
                            iArr2[length5] = i15;
                            i15 += i16;
                        }
                    }
                }
        }
    }

    public final String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            default:
                return "Arrangement#Start";
        }
    }
}
