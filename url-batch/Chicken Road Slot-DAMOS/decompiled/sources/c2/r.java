package c2;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1652a;

    /* renamed from: b, reason: collision with root package name */
    public int f1653b;

    public r() {
        this.f1652a = new int[10];
    }

    public int a(int i3) {
        int i10 = this.f1653b - 1;
        return i10 >= 0 ? this.f1652a[i10] : i3;
    }

    public int b() {
        int[] iArr = this.f1652a;
        int i3 = this.f1653b - 1;
        this.f1653b = i3;
        return iArr[i3];
    }

    public void c(int i3) {
        int[] iArr = this.f1652a;
        if (this.f1653b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1652a = iArr;
        }
        int i10 = this.f1653b;
        this.f1653b = i10 + 1;
        iArr[i10] = i3;
    }

    public void d(int i3, int i10, int i11) {
        int i12 = this.f1653b;
        int[] iArr = this.f1652a;
        int i13 = i12 + 3;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1652a = iArr;
        }
        iArr[i12] = i3 + i11;
        iArr[i12 + 1] = i10 + i11;
        iArr[i12 + 2] = i11;
        this.f1653b = i13;
    }

    public void e(int i3, int i10, int i11, int i12) {
        int i13 = this.f1653b;
        int[] iArr = this.f1652a;
        int i14 = i13 + 4;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f1652a = iArr;
        }
        iArr[i13] = i3;
        iArr[i13 + 1] = i10;
        iArr[i13 + 2] = i11;
        iArr[i13 + 3] = i12;
        this.f1653b = i14;
    }

    public void f(int i3, int i10) {
        if (i3 < i10) {
            int i11 = i3 - 3;
            for (int i12 = i3; i12 < i10; i12 += 3) {
                int[] iArr = this.f1652a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i3, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i3, int i10) {
        int[] iArr = this.f1652a;
        int i11 = iArr[i3];
        iArr[i3] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i3 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i3 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public r(int i3) {
        this.f1652a = new int[i3];
    }
}
