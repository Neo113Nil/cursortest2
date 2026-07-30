package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class id3 implements Iterator {
    public final Iterator m;

    public id3(jd3 jd3Var) {
        this.m = jd3Var.m.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
