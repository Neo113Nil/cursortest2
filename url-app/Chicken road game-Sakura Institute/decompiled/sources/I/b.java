package I;

import M2.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import u3.l;

/* loaded from: classes.dex */
public final class b implements List, N2.c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3325d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3326e;

    /* renamed from: i, reason: collision with root package name */
    public int f3327i;

    public b(List list, int i2, int i4) {
        this.f3325d = list;
        this.f3326e = i2;
        this.f3327i = i4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i2 = this.f3327i;
        this.f3327i = i2 + 1;
        this.f3325d.add(i2, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        this.f3325d.addAll(i2 + this.f3326e, collection);
        this.f3327i = collection.size() + this.f3327i;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i2 = this.f3327i - 1;
        int i4 = this.f3326e;
        if (i4 <= i2) {
            while (true) {
                this.f3325d.remove(i2);
                if (i2 == i4) {
                    break;
                } else {
                    i2--;
                }
            }
        }
        this.f3327i = i4;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i2 = this.f3327i;
        for (int i4 = this.f3326e; i4 < i2; i4++) {
            if (Intrinsics.a(this.f3325d.get(i4), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i2) {
        l.O(i2, this);
        return this.f3325d.get(i2 + this.f3326e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i2 = this.f3327i;
        int i4 = this.f3326e;
        for (int i5 = i4; i5 < i2; i5++) {
            if (Intrinsics.a(this.f3325d.get(i5), obj)) {
                return i5 - i4;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3327i == this.f3326e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i2 = this.f3327i - 1;
        int i4 = this.f3326e;
        if (i4 > i2) {
            return -1;
        }
        while (!Intrinsics.a(this.f3325d.get(i2), obj)) {
            if (i2 == i4) {
                return -1;
            }
            i2--;
        }
        return i2 - i4;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i2 = this.f3327i;
        for (int i4 = this.f3326e; i4 < i2; i4++) {
            ?? r2 = this.f3325d;
            if (Intrinsics.a(r2.get(i4), obj)) {
                r2.remove(i4);
                this.f3327i--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i2 = this.f3327i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i2 != this.f3327i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i2 = this.f3327i;
        int i4 = i2 - 1;
        int i5 = this.f3326e;
        if (i5 <= i4) {
            while (true) {
                ?? r32 = this.f3325d;
                if (!collection.contains(r32.get(i4))) {
                    r32.remove(i4);
                    this.f3327i--;
                }
                if (i4 == i5) {
                    break;
                }
                i4--;
            }
        }
        return i2 != this.f3327i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        l.O(i2, this);
        return this.f3325d.set(i2 + this.f3326e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3327i - this.f3326e;
    }

    @Override // java.util.List
    public final List subList(int i2, int i4) {
        l.P(this, i2, i4);
        return new b(this, i2, i4);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return o.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i2, Object obj) {
        this.f3325d.add(i2 + this.f3326e, obj);
        this.f3327i++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        return new c(i2, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return o.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f3325d.addAll(this.f3327i, collection);
        this.f3327i = collection.size() + this.f3327i;
        return collection.size() > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i2) {
        l.O(i2, this);
        this.f3327i--;
        return this.f3325d.remove(i2 + this.f3326e);
    }
}
