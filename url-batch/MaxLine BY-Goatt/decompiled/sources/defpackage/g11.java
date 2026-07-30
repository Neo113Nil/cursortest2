package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g11 extends g23 implements ListIterator {
    public final int m;
    public int n;
    public final k11 o;

    public g11(k11 k11Var, int i) {
        int size = k11Var.size();
        zm3.n(i, size);
        this.m = size;
        this.n = i;
        this.o = k11Var;
    }

    public final Object a(int i) {
        return this.o.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            b71.f();
            return null;
        }
        int i = this.n;
        this.n = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            b71.f();
            return null;
        }
        int i = this.n - 1;
        this.n = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
