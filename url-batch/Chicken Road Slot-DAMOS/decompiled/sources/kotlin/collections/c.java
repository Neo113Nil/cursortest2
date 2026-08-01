package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    public c(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i3, int i10) {
        if (i3 < 0 || i3 >= i10) {
            a2.r.e(i3, i10, ", size: ", "index: ");
        }
    }

    public static void b(int i3, int i10) {
        if (i3 < 0 || i3 > i10) {
            a2.r.e(i3, i10, ", size: ", "index: ");
        }
    }

    public static void c(int i3, int i10, int i11) {
        if (i3 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i10 + ", size: " + i11);
        }
        if (i3 <= i10) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i10);
    }

    public static int d(int i3, int i10) {
        int i11 = i3 + (i3 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        return i11 - 2147483639 > 0 ? i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i11;
    }
}
