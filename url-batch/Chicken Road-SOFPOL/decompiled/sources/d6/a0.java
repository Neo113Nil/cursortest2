package d6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 extends e {

    /* renamed from: d, reason: collision with root package name */
    public final List f2309d;

    public a0(List list) {
        q6.i.e(list, "delegate");
        this.f2309d = list;
    }

    @Override // d6.a
    public final int a() {
        return this.f2309d.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= s6.a.t(this)) {
            return this.f2309d.get(s6.a.t(this) - i);
        }
        StringBuilder l3 = a0.q.l("Element index ", i, " must be in range [");
        l3.append(new v6.d(0, s6.a.t(this), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // d6.e, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new z(this, 0);
    }

    @Override // d6.e, java.util.List
    public final ListIterator listIterator() {
        return new z(this, 0);
    }

    @Override // d6.e, java.util.List
    public final ListIterator listIterator(int i) {
        return new z(this, i);
    }
}
