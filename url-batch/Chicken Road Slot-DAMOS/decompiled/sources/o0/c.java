package o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import wd.i;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements List, xd.c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7312d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7313e;

    /* renamed from: i, reason: collision with root package name */
    public int f7314i;

    public c(List list, int i3, int i10) {
        this.f7312d = list;
        this.f7313e = i3;
        this.f7314i = i10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i3, Object obj) {
        this.f7312d.add(i3 + this.f7313e, obj);
        this.f7314i++;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        this.f7312d.addAll(i3 + this.f7313e, collection);
        int size = collection.size();
        this.f7314i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i3 = this.f7314i - 1;
        int i10 = this.f7313e;
        if (i10 <= i3) {
            while (true) {
                this.f7312d.remove(i3);
                if (i3 == i10) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        this.f7314i = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i3 = this.f7314i;
        for (int i10 = this.f7313e; i10 < i3; i10++) {
            if (Intrinsics.a(this.f7312d.get(i10), obj)) {
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
    public final Object get(int i3) {
        f.a(i3, this);
        return this.f7312d.get(i3 + this.f7313e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i3 = this.f7314i;
        int i10 = this.f7313e;
        for (int i11 = i10; i11 < i3; i11++) {
            if (Intrinsics.a(this.f7312d.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f7314i == this.f7313e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i3 = this.f7314i - 1;
        int i10 = this.f7313e;
        if (i10 > i3) {
            return -1;
        }
        while (!Intrinsics.a(this.f7312d.get(i3), obj)) {
            if (i3 == i10) {
                return -1;
            }
            i3--;
        }
        return i3 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i3 = this.f7314i;
        for (int i10 = this.f7313e; i10 < i3; i10++) {
            ?? r22 = this.f7312d;
            if (Intrinsics.a(r22.get(i10), obj)) {
                r22.remove(i10);
                this.f7314i--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i3 = this.f7314i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i3 != this.f7314i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i3 = this.f7314i;
        int i10 = i3 - 1;
        int i11 = this.f7313e;
        if (i11 <= i10) {
            while (true) {
                ?? r32 = this.f7312d;
                if (!collection.contains(r32.get(i10))) {
                    r32.remove(i10);
                    this.f7314i--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        return i3 != this.f7314i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        f.a(i3, this);
        return this.f7312d.set(i3 + this.f7313e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f7314i - this.f7313e;
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        f.b(this, i3, i10);
        return new c(this, i3, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return i.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return i.b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        return new d(i3, this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i3 = this.f7314i;
        this.f7314i = i3 + 1;
        this.f7312d.add(i3, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f7312d.addAll(this.f7314i, collection);
        int size = collection.size();
        this.f7314i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i3) {
        f.a(i3, this);
        this.f7314i--;
        return this.f7312d.remove(i3 + this.f7313e);
    }
}
