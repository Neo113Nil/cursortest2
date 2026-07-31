package K;

import a2.InterfaceC0184a;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2638d;

    /* renamed from: e, reason: collision with root package name */
    public int f2639e;

    public c(int i3, List list) {
        this.f2638d = list;
        this.f2639e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f2638d.add(this.f2639e, obj);
        this.f2639e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2639e < this.f2638d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2639e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i3 = this.f2639e;
        this.f2639e = i3 + 1;
        return this.f2638d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2639e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i3 = this.f2639e - 1;
        this.f2639e = i3;
        return this.f2638d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2639e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3 = this.f2639e - 1;
        this.f2639e = i3;
        this.f2638d.remove(i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f2638d.set(this.f2639e, obj);
    }
}
