package b0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final t f842a = new t(1);

    /* renamed from: b, reason: collision with root package name */
    public static final e f843b = new e();

    /* renamed from: c, reason: collision with root package name */
    public static final b f844c = new b(0);

    static {
        new b(3);
        new b(2);
        new b(1);
    }

    public static void a(int i3, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float f3 = (i3 - i11) / 2;
        if (!z10) {
            int length = iArr.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f3);
                f3 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = iArr[length2];
            iArr2[length2] = Math.round(f3);
            f3 += i15;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        int i3 = 0;
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i3 < length) {
                int i12 = iArr[i3];
                iArr2[i10] = i11;
                i11 += i12;
                i3++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i13 = iArr[length2];
            iArr2[length2] = i3;
            i3 += i13;
        }
    }

    public static void c(int i3, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int i13 = i3 - i11;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = iArr[i10];
                iArr2[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = iArr[length2];
            iArr2[length2] = i13;
            i13 += i16;
        }
    }

    public static void d(int i3, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = iArr.length == 0 ? 0.0f : (i3 - i11) / iArr.length;
        float f3 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f3);
                f3 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i15 = iArr[length3];
            iArr2[length3] = Math.round(f3);
            f3 += i15 + length;
        }
    }

    public static void e(int i3, int[] iArr, int[] iArr2, boolean z10) {
        if (iArr.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float max = (i3 - i11) / Math.max(iArr.length - 1, 1);
        float f3 = (z10 && iArr.length == 1) ? max : 0.0f;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i13 = iArr[length];
                iArr2[length] = Math.round(f3);
                f3 += i13 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f3);
            f3 += i15 + max;
            i10++;
            i14++;
        }
    }

    public static void f(int i3, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = (i3 - i11) / (iArr.length + 1);
        if (z10) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i13 = iArr[length2];
                iArr2[length2] = Math.round(f3);
                f3 += i13 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = iArr[i10];
            iArr2[i14] = Math.round(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public static d g(float f3) {
        return new d(f3, new a2.r(2));
    }
}
