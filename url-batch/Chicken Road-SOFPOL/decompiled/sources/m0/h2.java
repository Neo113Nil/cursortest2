package m0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class h2 {
    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i8) {
        int e8 = e(arrayList, i, i8);
        return e8 >= 0 ? e8 : -(e8 + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i8 = i * 5;
        return Integer.bitCount(iArr[i8 + 1] >> 28) + iArr[i8 + 4];
    }

    public static final void d(int i, int i8, int[] iArr) {
        if (i8 >= 0) {
        }
        int i9 = (i * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int i11 = ((a) arrayList.get(i10)).f4874a;
            if (i11 < 0) {
                i11 += i8;
            }
            int f6 = q6.i.f(i11, i);
            if (f6 < 0) {
                i9 = i10 + 1;
            } else {
                if (f6 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
