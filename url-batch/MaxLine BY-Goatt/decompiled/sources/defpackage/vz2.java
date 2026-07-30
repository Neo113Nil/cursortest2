package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vz2 implements Iterator, k71 {
    public Object[] m = uz2.e.d;
    public int n;
    public int o;

    public final void a(Object[] objArr, int i, int i2) {
        this.m = objArr;
        this.n = i;
        this.o = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.o < this.n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
