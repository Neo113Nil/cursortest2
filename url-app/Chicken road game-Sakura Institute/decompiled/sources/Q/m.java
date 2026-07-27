package Q;

import z2.C1436t;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public int f3858a;

    /* renamed from: b, reason: collision with root package name */
    public int f3859b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3860c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3861d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3862e;

    public int a(int i2) {
        int i4 = this.f3858a + 1;
        int[] iArr = (int[]) this.f3860c;
        int length = iArr.length;
        if (i4 > length) {
            int i5 = length * 2;
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            C1436t.g(iArr, iArr2, 0, 0, 14);
            C1436t.g((int[]) this.f3861d, iArr3, 0, 0, 14);
            this.f3860c = iArr2;
            this.f3861d = iArr3;
        }
        int i6 = this.f3858a;
        this.f3858a = i6 + 1;
        int length2 = ((int[]) this.f3862e).length;
        if (this.f3859b >= length2) {
            int i7 = length2 * 2;
            int[] iArr4 = new int[i7];
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8 + 1;
                iArr4[i8] = i9;
                i8 = i9;
            }
            C1436t.g((int[]) this.f3862e, iArr4, 0, 0, 14);
            this.f3862e = iArr4;
        }
        int i10 = this.f3859b;
        int[] iArr5 = (int[]) this.f3862e;
        this.f3859b = iArr5[i10];
        int[] iArr6 = (int[]) this.f3860c;
        iArr6[i6] = i2;
        ((int[]) this.f3861d)[i6] = i10;
        iArr5[i10] = i6;
        int i11 = iArr6[i6];
        while (i6 > 0) {
            int i12 = ((i6 + 1) >> 1) - 1;
            if (iArr6[i12] <= i11) {
                break;
            }
            b(i12, i6);
            i6 = i12;
        }
        return i10;
    }

    public void b(int i2, int i4) {
        int[] iArr = (int[]) this.f3860c;
        int[] iArr2 = (int[]) this.f3861d;
        int[] iArr3 = (int[]) this.f3862e;
        int i5 = iArr[i2];
        iArr[i2] = iArr[i4];
        iArr[i4] = i5;
        int i6 = iArr2[i2];
        iArr2[i2] = iArr2[i4];
        iArr2[i4] = i6;
        iArr3[iArr2[i2]] = i2;
        iArr3[iArr2[i4]] = i4;
    }
}
