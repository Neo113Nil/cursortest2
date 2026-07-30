package e6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 extends d {

    /* renamed from: f, reason: collision with root package name */
    public final List f2816f;

    public f0(List list) {
        this.f2816f = list;
    }

    @Override // e6.a
    public final int a() {
        return this.f2816f.size();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        if (i7 >= 0 && i7 <= m.W(this)) {
            return this.f2816f.get(m.W(this) - i7);
        }
        StringBuilder n8 = a0.m.n(i7, "Element index ", " must be in range [");
        n8.append(new w6.d(0, m.W(this), 1));
        n8.append("].");
        throw new IndexOutOfBoundsException(n8.toString());
    }

    @Override // e6.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new e0(this, 0);
    }

    @Override // e6.d, java.util.List
    public final ListIterator listIterator() {
        return new e0(this, 0);
    }

    @Override // e6.d, java.util.List
    public final ListIterator listIterator(int i7) {
        return new e0(this, i7);
    }
}
