package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class z0 implements Iterator, g6.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Short.valueOf(nextShort());
    }

    public abstract short nextShort();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Short next() {
        return Short.valueOf(nextShort());
    }
}
