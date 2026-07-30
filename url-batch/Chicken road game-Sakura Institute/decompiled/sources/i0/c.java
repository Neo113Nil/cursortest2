package i0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements ListIterator, s6.a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f4838f;

    /* renamed from: g, reason: collision with root package name */
    public int f4839g;

    public c(int i7, List list) {
        this.f4838f = list;
        this.f4839g = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f4838f.add(this.f4839g, obj);
        this.f4839g++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f4839g < this.f4838f.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f4839g > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i7 = this.f4839g;
        this.f4839g = i7 + 1;
        return this.f4838f.get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4839g;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i7 = this.f4839g - 1;
        this.f4839g = i7;
        return this.f4838f.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4839g - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7 = this.f4839g - 1;
        this.f4839g = i7;
        this.f4838f.remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f4838f.set(this.f4839g, obj);
    }
}
