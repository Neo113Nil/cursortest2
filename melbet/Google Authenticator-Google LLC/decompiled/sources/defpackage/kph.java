package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kph implements Collection, j$.util.Collection {
    private final Object[] a;

    public kph(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return a.f();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return a.g();
    }

    @Override // java.util.Collection
    public final void clear() {
        a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    return true;
                }
            }
        } else {
            for (Object obj3 : objArr) {
                if (ksp.b(obj, obj3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
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

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ksf(this.a, 0);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return a.f();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return a.g();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return a.g();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.a;
        if (ksp.b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        copyOf.getClass();
        return copyOf;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return ksk.b(this, objArr);
    }
}
