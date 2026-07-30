package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624c {
    public C0624c(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i2, int i5, int i7) {
        if (i2 >= 0 && i5 <= i7) {
            if (i2 > i5) {
                throw new IllegalArgumentException(C4.p.j("startIndex: ", " > endIndex: ", i2, i5));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: " + i5 + ", size: " + i7);
    }

    public static void b(int i2, int i5) {
        if (i2 < 0 || i2 >= i5) {
            throw new IndexOutOfBoundsException(C4.p.j("index: ", ", size: ", i2, i5));
        }
    }

    public static void c(int i2, int i5) {
        if (i2 < 0 || i2 > i5) {
            throw new IndexOutOfBoundsException(C4.p.j("index: ", ", size: ", i2, i5));
        }
    }

    public static void d(int i2, int i5, int i7) {
        if (i2 >= 0 && i5 <= i7) {
            if (i2 > i5) {
                throw new IllegalArgumentException(C4.p.j("fromIndex: ", " > toIndex: ", i2, i5));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i5 + ", size: " + i7);
    }

    public static int e(int i2, int i5) {
        int i7 = i2 + (i2 >> 1);
        if (i7 - i5 < 0) {
            i7 = i5;
        }
        return i7 - 2147483639 > 0 ? i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i7;
    }
}
