package A;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f10a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static char[] f11b = new char[24];

    private static int a(int i4, int i5, boolean z4, int i6) {
        if (i4 > 99 || (z4 && i6 >= 3)) {
            return i5 + 3;
        }
        if (i4 > 9 || (z4 && i6 >= 2)) {
            return i5 + 2;
        }
        if (z4 || i4 > 0) {
            return i5 + 1;
        }
        return 0;
    }

    public static void b(long j4, long j5, PrintWriter printWriter) {
        if (j4 == 0) {
            printWriter.print("--");
        } else {
            d(j4 - j5, printWriter, 0);
        }
    }

    public static void c(long j4, PrintWriter printWriter) {
        d(j4, printWriter, 0);
    }

    public static void d(long j4, PrintWriter printWriter, int i4) {
        synchronized (f10a) {
            printWriter.print(new String(f11b, 0, e(j4, i4)));
        }
    }

    private static int e(long j4, int i4) {
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5 = j4;
        if (f11b.length < i4) {
            f11b = new char[i4];
        }
        char[] cArr = f11b;
        if (j5 == 0) {
            int i9 = i4 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j5 > 0) {
            c4 = '+';
        } else {
            j5 = -j5;
            c4 = '-';
        }
        int i10 = (int) (j5 % 1000);
        int floor = (int) Math.floor(j5 / 1000);
        if (floor > 86400) {
            i5 = floor / 86400;
            floor -= 86400 * i5;
        } else {
            i5 = 0;
        }
        if (floor > 3600) {
            i6 = floor / 3600;
            floor -= i6 * 3600;
        } else {
            i6 = 0;
        }
        if (floor > 60) {
            int i11 = floor / 60;
            floor -= i11 * 60;
            i7 = i11;
        } else {
            i7 = 0;
        }
        if (i4 != 0) {
            int a4 = a(i5, 1, false, 0);
            int a5 = a4 + a(i6, 1, a4 > 0, 2);
            int a6 = a5 + a(i7, 1, a5 > 0, 2);
            int a7 = a6 + a(floor, 1, a6 > 0, 2);
            i8 = 0;
            for (int a8 = a7 + a(i10, 2, true, a7 > 0 ? 3 : 0) + 1; a8 < i4; a8++) {
                cArr[i8] = ' ';
                i8++;
            }
        } else {
            i8 = 0;
        }
        cArr[i8] = c4;
        int i12 = i8 + 1;
        boolean z4 = i4 != 0;
        int f4 = f(cArr, i5, 'd', i12, false, 0);
        int f5 = f(cArr, i6, 'h', f4, f4 != i12, z4 ? 2 : 0);
        int f6 = f(cArr, i7, 'm', f5, f5 != i12, z4 ? 2 : 0);
        int f7 = f(cArr, floor, 's', f6, f6 != i12, z4 ? 2 : 0);
        int f8 = f(cArr, i10, 'm', f7, true, (!z4 || f7 == i12) ? 0 : 3);
        cArr[f8] = 's';
        return f8 + 1;
    }

    private static int f(char[] cArr, int i4, char c4, int i5, boolean z4, int i6) {
        int i7;
        if (!z4 && i4 <= 0) {
            return i5;
        }
        if ((!z4 || i6 < 3) && i4 <= 99) {
            i7 = i5;
        } else {
            int i8 = i4 / 100;
            cArr[i5] = (char) (i8 + 48);
            i7 = i5 + 1;
            i4 -= i8 * 100;
        }
        if ((z4 && i6 >= 2) || i4 > 9 || i5 != i7) {
            int i9 = i4 / 10;
            cArr[i7] = (char) (i9 + 48);
            i7++;
            i4 -= i9 * 10;
        }
        cArr[i7] = (char) (i4 + 48);
        cArr[i7 + 1] = c4;
        return i7 + 2;
    }
}
