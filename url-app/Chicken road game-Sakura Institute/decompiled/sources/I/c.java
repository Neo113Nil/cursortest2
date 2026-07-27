package I;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3328d;

    /* renamed from: e, reason: collision with root package name */
    public int f3329e;

    public c(int i2, List list) {
        this.f3328d = list;
        this.f3329e = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f3328d.add(this.f3329e, obj);
        this.f3329e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3329e < this.f3328d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3329e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i2 = this.f3329e;
        this.f3329e = i2 + 1;
        return this.f3328d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3329e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i2 = this.f3329e - 1;
        this.f3329e = i2;
        return this.f3328d.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3329e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i2 = this.f3329e - 1;
        this.f3329e = i2;
        this.f3328d.remove(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f3328d.set(this.f3329e, obj);
    }
}
