package b8;

import java.util.ListIterator;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ListIterator f1436e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f1437i;

    public n(o oVar, ListIterator listIterator) {
        this.f1437i = oVar;
        this.f1436e = listIterator;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f1436e;
        listIterator.add(obj);
        listIterator.previous();
        this.f1435d = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1436e.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1436e.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.f1436e;
        if (listIterator.hasPrevious()) {
            this.f1435d = true;
            return listIterator.previous();
        }
        i0.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1437i.b(this.f1436e.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.f1436e;
        if (listIterator.hasNext()) {
            this.f1435d = true;
            return listIterator.next();
        }
        i0.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        i7.a.F("no calls to next() since the last call to remove()", this.f1435d);
        this.f1436e.remove();
        this.f1435d = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (!this.f1435d) {
            throw new IllegalStateException();
        }
        this.f1436e.set(obj);
    }
}
