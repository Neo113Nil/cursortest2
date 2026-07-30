package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.ads.hC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3299hC extends BC implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31216u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractList f31217v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3299hC(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f31216u = i;
        this.f31217v = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.BC
    public final Object a(Object obj) {
        switch (this.f31216u) {
            case 0:
                return ((C3353iC) this.f31217v).f31325u.apply(obj);
            default:
                return ((C3405jC) this.f31217v).f32093u.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f24008n).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f24008n).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f24008n).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f24008n).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
