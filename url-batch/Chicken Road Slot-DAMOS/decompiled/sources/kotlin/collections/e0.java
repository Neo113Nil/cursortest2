package kotlin.collections;

import java.util.List;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e0 extends d0 {
    public static final int o(int i3, List list) {
        if (i3 >= 0 && i3 <= list.size() - 1) {
            return (list.size() - 1) - i3;
        }
        StringBuilder i10 = n0.l.i(i3, "Element index ", " must be in range [");
        i10.append(new IntRange(0, list.size() - 1, 1));
        i10.append("].");
        throw new IndexOutOfBoundsException(i10.toString());
    }

    public static final int p(int i3, List list) {
        if (i3 >= 0 && i3 <= list.size()) {
            return list.size() - i3;
        }
        StringBuilder i10 = n0.l.i(i3, "Position index ", " must be in range [");
        i10.append(new IntRange(0, list.size(), 1));
        i10.append("].");
        throw new IndexOutOfBoundsException(i10.toString());
    }
}
