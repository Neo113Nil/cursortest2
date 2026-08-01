package kotlin.collections;

import java.util.Collection;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class z extends y {
    public static int j(Iterable iterable, int i3) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}
