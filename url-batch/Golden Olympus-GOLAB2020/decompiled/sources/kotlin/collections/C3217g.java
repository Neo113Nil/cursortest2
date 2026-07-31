package kotlin.collections;

import i2.InterfaceC2471a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3237c;
import kotlin.jvm.internal.AbstractC3244j;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kotlin.collections.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3217g implements Collection, InterfaceC2471a {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f41089b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41090c;

    public C3217g(Object[] values, boolean z4) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f41089b = values;
        this.f41090c = z4;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int b() {
        return this.f41089b.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C3223m.A(this.f41089b, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f41089b.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC3237c.a(this.f41089b);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return AbstractC3244j.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C3226p.copyToArrayOfAny(this.f41089b, this.f41090c);
    }
}
