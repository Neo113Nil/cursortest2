package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class u53 extends AbstractCollection {

    /* renamed from: f, reason: collision with root package name */
    final Object f12644f;

    /* renamed from: g, reason: collision with root package name */
    Collection f12645g;

    /* renamed from: h, reason: collision with root package name */
    final u53 f12646h;

    /* renamed from: i, reason: collision with root package name */
    final Collection f12647i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ x53 f12648j;

    u53(x53 x53Var, Object obj, Collection collection, u53 u53Var) {
        this.f12648j = x53Var;
        this.f12644f = obj;
        this.f12645g = collection;
        this.f12646h = u53Var;
        this.f12647i = u53Var == null ? null : u53Var.f12645g;
    }

    final void a() {
        Map map;
        u53 u53Var = this.f12646h;
        if (u53Var != null) {
            u53Var.a();
            if (this.f12646h.f12645g != this.f12647i) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f12645g.isEmpty()) {
            map = this.f12648j.f14042i;
            Collection collection = (Collection) map.get(this.f12644f);
            if (collection != null) {
                this.f12645g = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i7;
        a();
        boolean isEmpty = this.f12645g.isEmpty();
        boolean add = this.f12645g.add(obj);
        if (add) {
            x53 x53Var = this.f12648j;
            i7 = x53Var.f14043j;
            x53Var.f14043j = i7 + 1;
            if (isEmpty) {
                i();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i7;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f12645g.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f12645g.size();
        x53 x53Var = this.f12648j;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        i();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i7;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f12645g.clear();
        x53 x53Var = this.f12648j;
        i7 = x53Var.f14043j;
        x53Var.f14043j = i7 - size;
        j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        a();
        return this.f12645g.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        a();
        return this.f12645g.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.f12645g.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        a();
        return this.f12645g.hashCode();
    }

    final void i() {
        Map map;
        u53 u53Var = this.f12646h;
        if (u53Var != null) {
            u53Var.i();
        } else {
            map = this.f12648j.f14042i;
            map.put(this.f12644f, this.f12645g);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a();
        return new t53(this);
    }

    final void j() {
        Map map;
        u53 u53Var = this.f12646h;
        if (u53Var != null) {
            u53Var.j();
        } else if (this.f12645g.isEmpty()) {
            map = this.f12648j.f14042i;
            map.remove(this.f12644f);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i7;
        a();
        boolean remove = this.f12645g.remove(obj);
        if (remove) {
            x53 x53Var = this.f12648j;
            i7 = x53Var.f14043j;
            x53Var.f14043j = i7 - 1;
            j();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i7;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f12645g.removeAll(collection);
        if (removeAll) {
            int size2 = this.f12645g.size();
            x53 x53Var = this.f12648j;
            i7 = x53Var.f14043j;
            x53Var.f14043j = i7 + (size2 - size);
            j();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i7;
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f12645g.retainAll(collection);
        if (retainAll) {
            int size2 = this.f12645g.size();
            x53 x53Var = this.f12648j;
            i7 = x53Var.f14043j;
            x53Var.f14043j = i7 + (size2 - size);
            j();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        a();
        return this.f12645g.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.f12645g.toString();
    }
}
