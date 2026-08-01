package kotlin.collections;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class l extends AbstractList implements List, xd.c {
    public abstract int b();

    public abstract Object c(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return c(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
