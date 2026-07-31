package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8221a = new c(1);

    /* renamed from: b, reason: collision with root package name */
    public static final c f8222b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f8223c = new g();

    /* renamed from: d, reason: collision with root package name */
    public static final b f8224d = new b(0);

    /* renamed from: e, reason: collision with root package name */
    public static final b f8225e;

    static {
        new b(3);
        f8225e = new b(2);
        new b(1);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float f6 = (i - i9) / 2;
        if (!z3) {
            int length = iArr.length;
            int i11 = 0;
            while (i8 < length) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f6);
                f6 += i12;
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
            iArr2[length2] = Math.round(f6);
            f6 += i13;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z3) {
        int i = 0;
        if (!z3) {
            int length = iArr.length;
            int i8 = 0;
            int i9 = 0;
            while (i < length) {
                int i10 = iArr[i];
                iArr2[i8] = i9;
                i9 += i10;
                i++;
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
            iArr2[length2] = i;
            i += i11;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        int i11 = i - i9;
        if (!z3) {
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

    public static void d(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i9) / iArr.length;
        float f6 = length / 2;
        if (!z3) {
            int length2 = iArr.length;
            int i11 = 0;
            while (i8 < length2) {
                int i12 = iArr[i8];
                iArr2[i11] = Math.round(f6);
                f6 += i12 + length;
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
            iArr2[length3] = Math.round(f6);
            f6 += i13 + length;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z3) {
        if (iArr.length == 0) {
            return;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float max = (i - i9) / Math.max(iArr.length - 1, 1);
        float f6 = (z3 && iArr.length == 1) ? max : 0.0f;
        if (z3) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                iArr2[length] = Math.round(f6);
                f6 += i11 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i12 = 0;
        while (i8 < length2) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f6);
            f6 += i13 + max;
            i8++;
            i12++;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 : iArr) {
            i9 += i10;
        }
        float length = (i - i9) / (iArr.length + 1);
        if (z3) {
            float f6 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i11 = iArr[length2];
                iArr2[length2] = Math.round(f6);
                f6 += i11 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f8 = length;
        int i12 = 0;
        while (i8 < length3) {
            int i13 = iArr[i8];
            iArr2[i12] = Math.round(f8);
            f8 += i13 + length;
            i8++;
            i12++;
        }
    }

    public static f g(float f6) {
        return new f(f6, new g2.v(14));
    }
}
