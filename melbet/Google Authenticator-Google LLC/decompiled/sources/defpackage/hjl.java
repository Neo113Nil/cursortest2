package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hjl extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return hnu.n(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
