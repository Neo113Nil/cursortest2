package M1;

import H2.AbstractC0080b;
import e2.C0380d;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class D extends AbstractC0143d {

    /* renamed from: d, reason: collision with root package name */
    public final List f2789d;

    public D(List list) {
        this.f2789d = list;
    }

    @Override // M1.AbstractC0140a
    public final int b() {
        return this.f2789d.size();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        if (i3 >= 0 && i3 <= m.b0(this)) {
            return this.f2789d.get(m.b0(this) - i3);
        }
        StringBuilder l3 = AbstractC0080b.l("Element index ", i3, " must be in range [");
        l3.append(new C0380d(0, m.b0(this), 1));
        l3.append("].");
        throw new IndexOutOfBoundsException(l3.toString());
    }

    @Override // M1.AbstractC0143d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C(this, 0);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final ListIterator listIterator() {
        return new C(this, 0);
    }

    @Override // M1.AbstractC0143d, java.util.List
    public final ListIterator listIterator(int i3) {
        return new C(this, i3);
    }
}
