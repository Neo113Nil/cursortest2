package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hhk extends hjl {
    public abstract Map a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object z = hnu.z(a(), key);
            if (Objects.equals(z, entry.getValue())) {
                return z != null || a().containsKey(key);
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // defpackage.hjl, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return hnu.n(this, collection);
        } catch (UnsupportedOperationException unused) {
            return hnu.o(this, collection.iterator());
        }
    }

    @Override // defpackage.hjl, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet j = hnu.j(collection.size());
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    j.add(((Map.Entry) obj).getKey());
                }
            }
            return this.a().keySet().retainAll(j);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
