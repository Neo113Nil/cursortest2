package k5;

import j5.t;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10725a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final int b(t tVar, int i2) {
        int i3;
        i.e(tVar, "<this>");
        int i6 = i2 + 1;
        int length = tVar.f10531e.length;
        int[] iArr = tVar.f10532f;
        i.e(iArr, "<this>");
        int i7 = length - 1;
        int i8 = 0;
        while (true) {
            if (i8 <= i7) {
                i3 = (i8 + i7) >>> 1;
                int i9 = iArr[i3];
                if (i9 >= i6) {
                    if (i9 <= i6) {
                        break;
                    }
                    i7 = i3 - 1;
                } else {
                    i8 = i3 + 1;
                }
            } else {
                i3 = (-i8) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }
}
