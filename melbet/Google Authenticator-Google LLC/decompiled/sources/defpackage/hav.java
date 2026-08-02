package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hav extends hhn {
    final /* synthetic */ hbg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hav(hbg hbgVar, Map map) {
        super(map);
        this.a = hbgVar;
    }

    @Override // defpackage.hhn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        hnu.M(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.hhn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new hau(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.hhn, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.a.b -= size;
        return size > 0;
    }
}
