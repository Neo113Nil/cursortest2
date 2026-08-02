package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class hbp extends AbstractCollection implements hic {
    private transient Set a;
    private transient Set b;

    public int a(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (!(collection instanceof hic)) {
            if (collection.isEmpty()) {
                return false;
            }
            return hnu.N(this, collection.iterator());
        }
        hic hicVar = (hic) collection;
        if (!(hicVar instanceof hbk)) {
            if (hicVar.isEmpty()) {
                return false;
            }
            for (hid hidVar : hicVar.j()) {
                a(hidVar.a, hidVar.a());
            }
            return true;
        }
        hbk hbkVar = (hbk) hicVar;
        if (hbkVar.isEmpty()) {
            return false;
        }
        for (int a = hbkVar.a.a(); a >= 0; a = hbkVar.a.e(a)) {
            a(hbkVar.a.h(a), hbkVar.a.c(a));
        }
        return true;
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.hic
    public final boolean contains(Object obj) {
        return b(obj) > 0;
    }

    public int d(Object obj, int i) {
        throw null;
    }

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return hnu.v(this, obj);
    }

    public abstract Iterator f();

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.hic
    public final Set i() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        hie hieVar = new hie(this);
        this.a = hieVar;
        return hieVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.hic
    public final Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        hif hifVar = new hif(this);
        this.b = hifVar;
        return hifVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.hic
    public final boolean remove(Object obj) {
        return d(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof hic) {
            collection = ((hic) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof hic) {
            collection = ((hic) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
