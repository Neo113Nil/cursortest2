package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class D implements Iterator, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f41041b;

    /* renamed from: c, reason: collision with root package name */
    private int f41042c;

    public D(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f41041b = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IndexedValue next() {
        int i4 = this.f41042c;
        this.f41042c = i4 + 1;
        if (i4 < 0) {
            C3227q.throwIndexOverflow();
        }
        return new IndexedValue(i4, this.f41041b.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f41041b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
