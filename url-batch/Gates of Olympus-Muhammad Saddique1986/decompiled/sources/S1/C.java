package S1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k2.C0572d;

/* loaded from: classes.dex */
public final class C extends AbstractC0225d {

    /* renamed from: d, reason: collision with root package name */
    public final List f4306d;

    public C(List list) {
        this.f4306d = list;
    }

    @Override // S1.AbstractC0222a
    public final int b() {
        return this.f4306d.size();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        if (i3 >= 0 && i3 <= m.z0(this)) {
            return this.f4306d.get(m.z0(this) - i3);
        }
        StringBuilder k3 = A.k.k(i3, "Element index ", " must be in range [");
        k3.append(new C0572d(0, m.z0(this), 1));
        k3.append("].");
        throw new IndexOutOfBoundsException(k3.toString());
    }

    @Override // S1.AbstractC0225d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new S.B(this, 0);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final ListIterator listIterator() {
        return new S.B(this, 0);
    }

    @Override // S1.AbstractC0225d, java.util.List
    public final ListIterator listIterator(int i3) {
        return new S.B(this, i3);
    }
}
