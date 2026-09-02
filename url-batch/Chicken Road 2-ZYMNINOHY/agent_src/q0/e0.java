package q0;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f14996a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14997b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f14998c;

    public e0() {
        this(new Random());
    }

    public final e0 a(int i4) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int i5 = 0;
        while (true) {
            iArr = this.f14997b;
            random = this.f14996a;
            if (i5 >= i4) {
                break;
            }
            iArr2[i5] = random.nextInt(iArr.length + 1);
            int i6 = i5 + 1;
            int nextInt = random.nextInt(i6);
            iArr3[i5] = iArr3[nextInt];
            iArr3[nextInt] = i5;
            i5 = i6;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i4];
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < iArr.length + i4; i9++) {
            if (i7 >= i4 || i8 != iArr2[i7]) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                iArr4[i9] = i11;
                if (i11 >= 0) {
                    iArr4[i9] = i11 + i4;
                }
                i8 = i10;
            } else {
                iArr4[i9] = iArr3[i7];
                i7++;
            }
        }
        return new e0(iArr4, new Random(random.nextLong()));
    }

    public e0(int[] iArr, Random random) {
        this.f14997b = iArr;
        this.f14996a = random;
        this.f14998c = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f14998c[iArr[i4]] = i4;
        }
    }

    public e0(Random random) {
        this(new int[0], random);
    }
}
