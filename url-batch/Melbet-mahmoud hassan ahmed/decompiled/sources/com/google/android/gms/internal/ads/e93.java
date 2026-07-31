package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
final class e93<E> extends p73<E> {

    /* renamed from: h, reason: collision with root package name */
    final transient E f4531h;

    e93(E e7) {
        Objects.requireNonNull(e7);
        this.f4531h = e7;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f4531h.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.p73, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4531h.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        objArr[i7] = this.f4531h;
        return i7 + 1;
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return new q73(this.f4531h);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    public final e73<E> l() {
        return e73.x(this.f4531h);
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<E> iterator() {
        return new q73(this.f4531h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f4531h.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
