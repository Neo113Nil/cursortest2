package q;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1031j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1023b f9265a = new C1023b(3);

    /* renamed from: b, reason: collision with root package name */
    public static final C1023b f9266b = new C1023b(2);

    /* renamed from: c, reason: collision with root package name */
    public static final C1025d f9267c = new C1025d();

    /* renamed from: d, reason: collision with root package name */
    public static final C1026e f9268d = new C1026e(0);

    static {
        new C1026e(3);
        new C1026e(2);
        new C1026e(1);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z4) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float f4 = (i2 - i5) / 2;
        if (!z4) {
            int length = iArr.length;
            int i7 = 0;
            while (i4 < length) {
                int i8 = iArr[i4];
                iArr2[i7] = Math.round(f4);
                f4 += i8;
                i4++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = Math.round(f4);
            f4 += i9;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z4) {
        int i2 = 0;
        if (!z4) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i4] = i5;
                i5 += i6;
                i2++;
                i4++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = i2;
            i2 += i7;
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z4) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        int i7 = i2 - i5;
        if (!z4) {
            int length = iArr.length;
            int i8 = 0;
            while (i4 < length) {
                int i9 = iArr[i4];
                iArr2[i8] = i7;
                i7 += i9;
                i4++;
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
            int i10 = iArr[length2];
            iArr2[length2] = i7;
            i7 += i10;
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z4) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float length = iArr.length == 0 ? 0.0f : (i2 - i5) / iArr.length;
        float f4 = length / 2;
        if (!z4) {
            int length2 = iArr.length;
            int i7 = 0;
            while (i4 < length2) {
                int i8 = iArr[i4];
                iArr2[i7] = Math.round(f4);
                f4 += i8 + length;
                i4++;
                i7++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i9 = iArr[length3];
            iArr2[length3] = Math.round(f4);
            f4 += i9 + length;
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z4) {
        if (iArr.length == 0) {
            return;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        float max = (i2 - i5) / Math.max(iArr.length - 1, 1);
        float f4 = (z4 && iArr.length == 1) ? max : 0.0f;
        if (z4) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i7 = iArr[length];
                iArr2[length] = Math.round(f4);
                f4 += i7 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i8 = 0;
        while (i4 < length2) {
            int i9 = iArr[i4];
            iArr2[i8] = Math.round(f4);
            f4 += i9 + max;
            i4++;
            i8++;
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z4) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 : iArr) {
            i5 += i6;
        }
        float length = (i2 - i5) / (iArr.length + 1);
        if (z4) {
            float f4 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i7 = iArr[length2];
                iArr2[length2] = Math.round(f4);
                f4 += i7 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f5 = length;
        int i8 = 0;
        while (i4 < length3) {
            int i9 = iArr[i4];
            iArr2[i8] = Math.round(f5);
            f5 += i9 + length;
            i4++;
            i8++;
        }
    }
}
