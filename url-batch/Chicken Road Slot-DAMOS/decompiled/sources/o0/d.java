package o0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d implements ListIterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public final Object f7315d;

    /* renamed from: e, reason: collision with root package name */
    public int f7316e;

    public d(int i3, List list) {
        this.f7315d = list;
        this.f7316e = i3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f7315d.add(this.f7316e, obj);
        this.f7316e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f7316e < this.f7315d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7316e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i3 = this.f7316e;
        this.f7316e = i3 + 1;
        return this.f7315d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7316e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i3 = this.f7316e - 1;
        this.f7316e = i3;
        return this.f7315d.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7316e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i3 = this.f7316e - 1;
        this.f7316e = i3;
        this.f7315d.remove(i3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f7315d.set(this.f7316e, obj);
    }
}
