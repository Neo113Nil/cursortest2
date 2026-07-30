package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7291a = new b(3);

    /* renamed from: b, reason: collision with root package name */
    public static final b f7292b = new b(2);

    /* renamed from: c, reason: collision with root package name */
    public static final d f7293c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f7294d = new d(0);

    /* renamed from: e, reason: collision with root package name */
    public static final e f7295e = new e(0);

    static {
        new e(3);
        new e(2);
        new e(1);
    }

    public static void a(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float f9 = (i7 - i9) / 2;
        if (!z8) {
            int length = iArr.length;
            int i11 = 0;
            while (i8 < length) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f9);
                f9 += i12;
                i8++;
                i11++;
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
            iArr2[length2] = Math.round(f9);
            f9 += i13;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z8) {
        int i7 = 0;
        if (!z8) {
            int length = iArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i7 < length) {
                int i10 = iArr[i7];
                iArr2[i8] = i9;
                i9 += i10;
                i7++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = iArr[length2];
            iArr2[length2] = i7;
            i7 += i11;
        }
    }

    public static void c(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        int i11 = i7 - i9;
        if (!z8) {
            int length = iArr.length;
            int i12 = 0;
            while (i8 < length) {
                int i13 = iArr[i8];
                iArr2[i12] = i11;
                i11 += i13;
                i8++;
                i12++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = iArr[length2];
            iArr2[length2] = i11;
            i11 += i14;
        }
    }

    public static void d(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = iArr.length == 0 ? 0.0f : (i7 - i9) / iArr.length;
        float f9 = length / 2;
        if (!z8) {
            int length2 = iArr.length;
            int i11 = 0;
            while (i8 < length2) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f9);
                f9 += i12 + length;
                i8++;
                i11++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i13 = iArr[length3];
            iArr2[length3] = Math.round(f9);
            f9 += i13 + length;
        }
    }

    public static void e(int i7, int[] iArr, int[] iArr2, boolean z8) {
        if (iArr.length == 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float max = (i7 - i9) / Math.max(iArr.length - 1, 1);
        float f9 = (z8 && iArr.length == 1) ? max : 0.0f;
        if (z8) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                iArr2[length] = Math.round(f9);
                f9 += i11 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i12 = 0;
        while (i8 < length2) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f9);
            f9 += i13 + max;
            i8++;
            i12++;
        }
    }

    public static void f(int i7, int[] iArr, int[] iArr2, boolean z8) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = (i7 - i9) / (iArr.length + 1);
        if (z8) {
            float f9 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i11 = iArr[length2];
                iArr2[length2] = Math.round(f9);
                f9 += i11 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i12 = 0;
        while (i8 < length3) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f10);
            f10 += i13 + length;
            i8++;
            i12++;
        }
    }
}
