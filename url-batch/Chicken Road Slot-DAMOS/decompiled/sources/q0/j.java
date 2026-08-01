package q0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j {
    public static final int a(ArrayList arrayList, int i3, int i10) {
        int e2 = e(arrayList, i3, i10);
        return e2 >= 0 ? e2 : -(e2 + 1);
    }

    public static final int b(int[] iArr, int i3) {
        int i10 = i3 * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void c(int i3, int i10, int[] iArr) {
        if (i10 >= 0) {
        }
        int i11 = (i3 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final h d(h hVar) {
        if (!(hVar instanceof h)) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        n0.m.b("Inconsistent composition");
        throw new hd.d();
    }

    public static final int e(ArrayList arrayList, int i3, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((b) arrayList.get(i12)).f7722a;
            if (i13 < 0) {
                i13 += i10;
            }
            int b10 = Intrinsics.b(i13, i3);
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
