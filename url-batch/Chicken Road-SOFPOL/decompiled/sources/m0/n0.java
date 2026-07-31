package m0;

import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f5020a;

    /* renamed from: b, reason: collision with root package name */
    public int f5021b;

    public n0() {
        this.f5020a = new int[10];
    }

    public int a(int i) {
        int i8 = this.f5021b - 1;
        return i8 >= 0 ? this.f5020a[i8] : i;
    }

    public int b() {
        int[] iArr = this.f5020a;
        int i = this.f5021b - 1;
        this.f5021b = i;
        return iArr[i];
    }

    public void c(int i) {
        int[] iArr = this.f5020a;
        if (this.f5021b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            q6.i.d(iArr, "copyOf(...)");
            this.f5020a = iArr;
        }
        int i8 = this.f5021b;
        this.f5021b = i8 + 1;
        iArr[i8] = i;
    }

    public void d(int i, int i8, int i9) {
        int i10 = this.f5021b;
        int[] iArr = this.f5020a;
        int i11 = i10 + 3;
        if (i11 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            q6.i.d(iArr, "copyOf(...)");
            this.f5020a = iArr;
        }
        iArr[i10] = i + i9;
        iArr[i10 + 1] = i8 + i9;
        iArr[i10 + 2] = i9;
        this.f5021b = i11;
    }

    public void e(int i, int i8, int i9, int i10) {
        int i11 = this.f5021b;
        int[] iArr = this.f5020a;
        int i12 = i11 + 4;
        if (i12 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            q6.i.d(iArr, "copyOf(...)");
            this.f5020a = iArr;
        }
        iArr[i11] = i;
        iArr[i11 + 1] = i8;
        iArr[i11 + 2] = i9;
        iArr[i11 + 3] = i10;
        this.f5021b = i12;
    }

    public void f(int i, int i8) {
        if (i < i8) {
            int i9 = i - 3;
            for (int i10 = i; i10 < i8; i10 += 3) {
                int[] iArr = this.f5020a;
                int i11 = iArr[i10];
                int i12 = iArr[i8];
                if (i11 < i12 || (i11 == i12 && iArr[i10 + 1] <= iArr[i8 + 1])) {
                    i9 += 3;
                    g(i9, i10);
                }
            }
            g(i9 + 3, i8);
            f(i, i9);
            f(i9 + 6, i8);
        }
    }

    public void g(int i, int i8) {
        int[] iArr = this.f5020a;
        int i9 = iArr[i];
        iArr[i] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i + 1;
        int i11 = i8 + 1;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i + 2;
        int i14 = i8 + 2;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
    }

    public n0(int i) {
        this.f5020a = new int[i];
    }
}
