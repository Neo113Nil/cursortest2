package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hds extends AbstractSet {
    final hdt b;

    public hds(hdt hdtVar) {
        this.b = hdtVar;
    }

    public abstract Object a(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hdr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.c;
    }
}
