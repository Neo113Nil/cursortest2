package I;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2725a;

    /* renamed from: b, reason: collision with root package name */
    public int f2726b;

    public N() {
        this.f2725a = new int[10];
    }

    public int a() {
        int[] iArr = this.f2725a;
        int i3 = this.f2726b - 1;
        this.f2726b = i3;
        return iArr[i3];
    }

    public void b(int i3) {
        int i4 = this.f2726b;
        int[] iArr = this.f2725a;
        if (i4 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f2725a = copyOf;
        }
        int[] iArr2 = this.f2725a;
        int i5 = this.f2726b;
        this.f2726b = i5 + 1;
        iArr2[i5] = i3;
    }

    public void c(int i3, int i4, int i5) {
        int i6 = this.f2726b;
        int i7 = i6 + 3;
        int[] iArr = this.f2725a;
        if (i7 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f2725a = copyOf;
        }
        int[] iArr2 = this.f2725a;
        iArr2[i6] = i3 + i5;
        iArr2[i6 + 1] = i4 + i5;
        iArr2[i6 + 2] = i5;
        this.f2726b = i7;
    }

    public void d(int i3, int i4, int i5, int i6) {
        int i7 = this.f2726b;
        int i8 = i7 + 4;
        int[] iArr = this.f2725a;
        if (i8 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            f2.j.e(copyOf, "copyOf(this, newSize)");
            this.f2725a = copyOf;
        }
        int[] iArr2 = this.f2725a;
        iArr2[i7] = i3;
        iArr2[i7 + 1] = i4;
        iArr2[i7 + 2] = i5;
        iArr2[i7 + 3] = i6;
        this.f2726b = i8;
    }

    public void e(int i3, int i4) {
        if (i3 < i4) {
            int i5 = i3 - 3;
            for (int i6 = i3; i6 < i4; i6 += 3) {
                int[] iArr = this.f2725a;
                int i7 = iArr[i6];
                int i8 = iArr[i4];
                if (i7 < i8 || (i7 == i8 && iArr[i6 + 1] <= iArr[i4 + 1])) {
                    i5 += 3;
                    f(i5, i6);
                }
            }
            f(i5 + 3, i4);
            e(i3, i5);
            e(i5 + 6, i4);
        }
    }

    public void f(int i3, int i4) {
        int[] iArr = this.f2725a;
        int i5 = iArr[i3];
        iArr[i3] = iArr[i4];
        iArr[i4] = i5;
        int i6 = i3 + 1;
        int i7 = i4 + 1;
        int i8 = iArr[i6];
        iArr[i6] = iArr[i7];
        iArr[i7] = i8;
        int i9 = i3 + 2;
        int i10 = i4 + 2;
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
    }

    public N(int i3) {
        this.f2725a = new int[i3];
    }
}
