package defpackage;

import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hrs extends hdc {
    final Collection a;
    final Set b;

    public hrs(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // defpackage.hdc
    protected final Collection a() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean contains(Object obj) {
        return c(obj);
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hdc, defpackage.hdk
    protected final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.hdc, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new hrr(this.b.iterator());
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean remove(Object obj) {
        Iterator it = iterator();
        while (it.hasNext()) {
            if (Objects.equals(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return hnu.P(iterator(), collection);
    }

    @Override // defpackage.hdc, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hdc, java.util.Collection
    public final Object[] toArray() {
        return d();
    }

    @Override // defpackage.hdc, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hnu.r(this, objArr);
    }
}
