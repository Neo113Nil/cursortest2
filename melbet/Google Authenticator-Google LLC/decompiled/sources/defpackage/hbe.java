package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class hbe extends hbc implements List {
    final /* synthetic */ hbg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbe(hbg hbgVar, Object obj, List list, hbc hbcVar) {
        super(hbgVar, obj, list, hbcVar);
        this.f = hbgVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.f.b++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (addAll) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return addAll;
    }

    final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new hbd(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = d().remove(i);
        hbg hbgVar = this.f;
        hbgVar.b--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = d().subList(i, i2);
        hbc hbcVar = this.c;
        if (hbcVar == null) {
            hbcVar = this;
        }
        return this.f.h(this.a, subList, hbcVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new hbd(this, i);
    }
}
