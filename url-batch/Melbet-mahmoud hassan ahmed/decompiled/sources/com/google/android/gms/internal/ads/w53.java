package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
class w53 extends u53 implements List {

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ x53 f13723k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w53(x53 x53Var, Object obj, List list, u53 u53Var) {
        super(x53Var, obj, list, u53Var);
        this.f13723k = x53Var;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        a();
        boolean isEmpty = this.f12645g.isEmpty();
        ((List) this.f12645g).add(i7, obj);
        x53 x53Var = this.f13723k;
        i8 = x53Var.f14043j;
        x53Var.f14043j = i8 + 1;
        if (isEmpty) {
            i();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        int i8;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f12645g).addAll(i7, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.f12645g.size();
        x53 x53Var = this.f13723k;
        i8 = x53Var.f14043j;
        x53Var.f14043j = i8 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        i();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        a();
        return ((List) this.f12645g).get(i7);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        return ((List) this.f12645g).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        return ((List) this.f12645g).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        a();
        return new v53(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        a();
        return new v53(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        int i8;
        a();
        Object remove = ((List) this.f12645g).remove(i7);
        x53 x53Var = this.f13723k;
        i8 = x53Var.f14043j;
        x53Var.f14043j = i8 - 1;
        j();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        a();
        return ((List) this.f12645g).set(i7, obj);
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        a();
        x53 x53Var = this.f13723k;
        Object obj = this.f12644f;
        List subList = ((List) this.f12645g).subList(i7, i8);
        u53 u53Var = this.f12646h;
        if (u53Var == null) {
            u53Var = this;
        }
        return x53Var.n(obj, subList, u53Var);
    }
}
