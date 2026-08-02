package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hhz extends AbstractCollection {
    final /* synthetic */ hbo a;

    public hhz(hbo hboVar) {
        this.a = hboVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.r(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.s(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.d();
    }
}
