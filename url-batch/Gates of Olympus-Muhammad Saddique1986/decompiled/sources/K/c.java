package K;

import g2.InterfaceC0439a;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class c implements ListIterator, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f3212d;

    /* renamed from: e, reason: collision with root package name */
    public int f3213e;

    public c(int i3, List list) {
        this.f3212d = list;
        this.f3213e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f3212d.add(this.f3213e, obj);
        this.f3213e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3213e < this.f3212d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3213e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i3 = this.f3213e;
        this.f3213e = i3 + 1;
        return this.f3212d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3213e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i3 = this.f3213e - 1;
        this.f3213e = i3;
        return this.f3212d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3213e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3 = this.f3213e - 1;
        this.f3213e = i3;
        this.f3212d.remove(i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f3212d.set(this.f3213e, obj);
    }
}
