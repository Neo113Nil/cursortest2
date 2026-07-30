package U6;

import T6.t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2738a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c7) {
        if ('0' <= c7 && c7 < ':') {
            return c7 - '0';
        }
        if ('a' <= c7 && c7 < 'g') {
            return c7 - 'W';
        }
        if ('A' <= c7 && c7 < 'G') {
            return c7 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c7);
    }

    public static final int b(t tVar, int i2) {
        int i5;
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        int[] iArr = tVar.f2654n;
        int i7 = i2 + 1;
        int length = tVar.f2653m.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i8 = length - 1;
        int i9 = 0;
        while (true) {
            if (i9 <= i8) {
                i5 = (i9 + i8) >>> 1;
                int i10 = iArr[i5];
                if (i10 >= i7) {
                    if (i10 <= i7) {
                        break;
                    }
                    i8 = i5 - 1;
                } else {
                    i9 = i5 + 1;
                }
            } else {
                i5 = (-i9) - 1;
                break;
            }
        }
        return i5 >= 0 ? i5 : ~i5;
    }
}
