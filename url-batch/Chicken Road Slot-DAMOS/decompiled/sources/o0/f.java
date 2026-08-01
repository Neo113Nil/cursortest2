package o0;

import java.util.List;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {
    public static final void a(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            c(i3, size);
        }
    }

    public static final void b(List list, int i3, int i10) {
        if (i3 > i10) {
            f(i3, i10);
        }
        if (i3 < 0) {
            d(i3);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i3, int i10) {
        throw new IndexOutOfBoundsException("Index " + i3 + " is out of bounds. The list has " + i10 + " elements.");
    }

    private static final void d(int i3) {
        throw new IndexOutOfBoundsException(l.f(i3, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i3, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i3, int i10) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i10 + ").");
    }
}
