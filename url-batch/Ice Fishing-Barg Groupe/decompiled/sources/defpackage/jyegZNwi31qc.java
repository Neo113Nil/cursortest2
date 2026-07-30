package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class jyegZNwi31qc implements ListIterator, fu0 {
    public int OPXfSBeufaJ8;
    public int rtx2ld2ELZv4;

    public jyegZNwi31qc(int i, int i2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.rtx2ld2ELZv4 < this.OPXfSBeufaJ8;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.rtx2ld2ELZv4 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.rtx2ld2ELZv4;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.rtx2ld2ELZv4 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
