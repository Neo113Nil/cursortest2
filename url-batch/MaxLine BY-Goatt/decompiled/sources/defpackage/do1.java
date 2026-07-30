package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class do1 implements ListIterator, k71 {
    public final List m;
    public int n;

    public do1(int i, List list) {
        this.m = list;
        this.n = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.m.add(this.n, obj);
        this.n++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.n < this.m.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.n > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.n;
        this.n = i + 1;
        return this.m.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.n - 1;
        this.n = i;
        return this.m.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.n - 1;
        this.n = i;
        this.m.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.m.set(this.n, obj);
    }
}
