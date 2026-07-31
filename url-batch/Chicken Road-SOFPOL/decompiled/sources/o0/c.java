package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import q6.h;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements List, r6.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5573d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5574e;

    /* renamed from: f, reason: collision with root package name */
    public int f5575f;

    public c(List list, int i, int i8) {
        this.f5573d = list;
        this.f5574e = i;
        this.f5575f = i8;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f5575f;
        this.f5575f = i + 1;
        this.f5573d.add(i, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f5573d.addAll(i + this.f5574e, collection);
        int size = collection.size();
        this.f5575f += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f5575f - 1;
        int i8 = this.f5574e;
        if (i8 <= i) {
            while (true) {
                this.f5573d.remove(i);
                if (i == i8) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f5575f = i8;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f5575f;
        for (int i8 = this.f5574e; i8 < i; i8++) {
            if (i.a(this.f5573d.get(i8), obj)) {
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
    public final Object get(int i) {
        f.a(i, this);
        return this.f5573d.get(i + this.f5574e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f5575f;
        int i8 = this.f5574e;
        for (int i9 = i8; i9 < i; i9++) {
            if (i.a(this.f5573d.get(i9), obj)) {
                return i9 - i8;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5575f == this.f5574e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f5575f - 1;
        int i8 = this.f5574e;
        if (i8 > i) {
            return -1;
        }
        while (!i.a(this.f5573d.get(i), obj)) {
            if (i == i8) {
                return -1;
            }
            i--;
        }
        return i - i8;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f5575f;
        for (int i8 = this.f5574e; i8 < i; i8++) {
            ?? r22 = this.f5573d;
            if (i.a(r22.get(i8), obj)) {
                r22.remove(i8);
                this.f5575f--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f5575f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f5575f;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f5575f;
        int i8 = i - 1;
        int i9 = this.f5574e;
        if (i9 <= i8) {
            while (true) {
                ?? r32 = this.f5573d;
                if (!collection.contains(r32.get(i8))) {
                    r32.remove(i8);
                    this.f5575f--;
                }
                if (i8 == i9) {
                    break;
                }
                i8--;
            }
        }
        return i != this.f5575f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f.a(i, this);
        return this.f5573d.set(i + this.f5574e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5575f - this.f5574e;
    }

    @Override // java.util.List
    public final List subList(int i, int i8) {
        f.b(this, i, i8);
        return new c(this, i, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return h.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f5573d.add(i + this.f5574e, obj);
        this.f5575f++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return h.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f5573d.addAll(this.f5575f, collection);
        int size = collection.size();
        this.f5575f += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        f.a(i, this);
        this.f5575f--;
        return this.f5573d.remove(i + this.f5574e);
    }
}
