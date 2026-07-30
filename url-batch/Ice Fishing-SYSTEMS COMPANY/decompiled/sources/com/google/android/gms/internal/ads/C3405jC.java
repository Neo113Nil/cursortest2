package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.jC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3405jC extends AbstractSequentialList implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractCollection f32092n;

    /* renamed from: u, reason: collision with root package name */
    public final XA f32093u;

    /* JADX WARN: Multi-variable type inference failed */
    public C3405jC(List list, XA xa) {
        list.getClass();
        this.f32092n = (AbstractCollection) list;
        this.f32093u = xa;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f32092n.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3299hC(this, this.f32092n.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        this.f32092n.subList(i, i4).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32092n.size();
    }
}
