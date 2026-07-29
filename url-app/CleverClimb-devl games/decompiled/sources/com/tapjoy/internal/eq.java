package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class eq extends AbstractList implements Serializable, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    List f8013a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8014b;

    eq(List list) {
        this.f8014b = list;
        this.f8013a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f8013a.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8013a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        if (this.f8013a == this.f8014b) {
            this.f8013a = new ArrayList(this.f8014b);
        }
        return this.f8013a.set(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        if (this.f8013a == this.f8014b) {
            this.f8013a = new ArrayList(this.f8014b);
        }
        this.f8013a.add(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        if (this.f8013a == this.f8014b) {
            this.f8013a = new ArrayList(this.f8014b);
        }
        return this.f8013a.remove(i);
    }
}
