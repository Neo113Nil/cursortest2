package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t0 extends f {

    /* renamed from: e, reason: collision with root package name */
    public final List f5585e;

    public t0(List list) {
        list.getClass();
        this.f5585e = list;
    }

    @Override // kotlin.collections.a
    public final int b() {
        return this.f5585e.size();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        return this.f5585e.get(e0.o(i3, this));
    }

    @Override // kotlin.collections.f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new b1.i0(this, 0);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator() {
        return new b1.i0(this, 0);
    }

    @Override // kotlin.collections.f, java.util.List
    public final ListIterator listIterator(int i3) {
        return new b1.i0(this, i3);
    }
}
