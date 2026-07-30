package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class y implements Iterator, g6.a {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Double next() {
        return Double.valueOf(nextDouble());
    }
}
