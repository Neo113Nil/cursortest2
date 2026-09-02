package o6;

import kotlin.jvm.internal.i;
import n6.t;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5625a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

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

    public static final int b(t tVar, int i7) {
        int i8;
        int[] iArr = tVar.f5561k;
        int i9 = i7 + 1;
        int length = tVar.f5560j.length;
        i.e(iArr, "<this>");
        int i10 = length - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= i10) {
                i8 = (i11 + i10) >>> 1;
                int i12 = iArr[i8];
                if (i12 >= i9) {
                    if (i12 <= i9) {
                        break;
                    }
                    i10 = i8 - 1;
                } else {
                    i11 = i8 + 1;
                }
            } else {
                i8 = (-i11) - 1;
                break;
            }
        }
        return i8 >= 0 ? i8 : ~i8;
    }
}
