package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class do0 implements ListIterator, yb0 {
    public final List d;
    public int e;

    public do0(int i, List list) {
        this.d = list;
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.d.add(this.e, obj);
        this.e++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        this.e = i + 1;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e - 1;
        this.e = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e - 1;
        this.e = i;
        this.d.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.d.set(this.e, obj);
    }
}
