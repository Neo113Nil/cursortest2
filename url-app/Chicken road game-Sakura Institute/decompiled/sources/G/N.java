package G;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2723a;

    /* renamed from: b, reason: collision with root package name */
    public int f2724b;

    public N() {
        this.f2723a = new int[10];
    }

    public int a() {
        int[] iArr = this.f2723a;
        int i2 = this.f2724b - 1;
        this.f2724b = i2;
        return iArr[i2];
    }

    public void b(int i2) {
        int i4 = this.f2724b;
        int[] iArr = this.f2723a;
        if (i4 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f2723a = copyOf;
        }
        int[] iArr2 = this.f2723a;
        int i5 = this.f2724b;
        this.f2724b = i5 + 1;
        iArr2[i5] = i2;
    }

    public void c(int i2, int i4, int i5) {
        int i6 = this.f2724b;
        int i7 = i6 + 3;
        int[] iArr = this.f2723a;
        if (i7 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f2723a = copyOf;
        }
        int[] iArr2 = this.f2723a;
        iArr2[i6] = i2 + i5;
        iArr2[i6 + 1] = i4 + i5;
        iArr2[i6 + 2] = i5;
        this.f2724b = i7;
    }

    public void d(int i2, int i4, int i5, int i6) {
        int i7 = this.f2724b;
        int i8 = i7 + 4;
        int[] iArr = this.f2723a;
        if (i8 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f2723a = copyOf;
        }
        int[] iArr2 = this.f2723a;
        iArr2[i7] = i2;
        iArr2[i7 + 1] = i4;
        iArr2[i7 + 2] = i5;
        iArr2[i7 + 3] = i6;
        this.f2724b = i8;
    }

    public void e(int i2, int i4) {
        if (i2 < i4) {
            int i5 = i2 - 3;
            for (int i6 = i2; i6 < i4; i6 += 3) {
                int[] iArr = this.f2723a;
                int i7 = iArr[i6];
                int i8 = iArr[i4];
                if (i7 < i8 || (i7 == i8 && iArr[i6 + 1] <= iArr[i4 + 1])) {
                    i5 += 3;
                    f(i5, i6);
                }
            }
            f(i5 + 3, i4);
            e(i2, i5);
            e(i5 + 6, i4);
        }
    }

    public void f(int i2, int i4) {
        int[] iArr = this.f2723a;
        int i5 = iArr[i2];
        iArr[i2] = iArr[i4];
        iArr[i4] = i5;
        int i6 = i2 + 1;
        int i7 = i4 + 1;
        int i8 = iArr[i6];
        iArr[i6] = iArr[i7];
        iArr[i7] = i8;
        int i9 = i2 + 2;
        int i10 = i4 + 2;
        int i11 = iArr[i9];
        iArr[i9] = iArr[i10];
        iArr[i10] = i11;
    }

    public N(int i2) {
        this.f2723a = new int[i2];
    }
}
