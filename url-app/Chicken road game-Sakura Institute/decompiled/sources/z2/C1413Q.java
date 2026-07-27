package z2;

import A.AbstractC0017m;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* renamed from: z2.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413Q extends AbstractC1420d {

    /* renamed from: e, reason: collision with root package name */
    public final List f11935e;

    public C1413Q(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f11935e = delegate;
    }

    @Override // z2.AbstractC1418b
    public final int e() {
        return this.f11935e.size();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        if (i2 >= 0 && i2 <= C1441y.d(this)) {
            return this.f11935e.get(C1441y.d(this) - i2);
        }
        StringBuilder o4 = AbstractC0017m.o(i2, "Element index ", " must be in range [");
        o4.append(new IntRange(0, C1441y.d(this), 1));
        o4.append("].");
        throw new IndexOutOfBoundsException(o4.toString());
    }

    @Override // z2.AbstractC1420d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new Q.G(this, 0);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final ListIterator listIterator() {
        return new Q.G(this, 0);
    }

    @Override // z2.AbstractC1420d, java.util.List
    public final ListIterator listIterator(int i2) {
        return new Q.G(this, i2);
    }
}
