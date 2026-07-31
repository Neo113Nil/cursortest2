package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes.dex */
final class z83<E> extends p73<E> {

    /* renamed from: m, reason: collision with root package name */
    private static final Object[] f15027m;

    /* renamed from: n, reason: collision with root package name */
    static final z83<Object> f15028n;

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f15029h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f15030i;

    /* renamed from: j, reason: collision with root package name */
    final transient Object[] f15031j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f15032k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f15033l;

    static {
        Object[] objArr = new Object[0];
        f15027m = objArr;
        f15028n = new z83<>(objArr, 0, objArr, 0, 0);
    }

    z83(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f15029h = objArr;
        this.f15030i = i7;
        this.f15031j = objArr2;
        this.f15032k = i8;
        this.f15033l = i9;
    }

    @Override // com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f15031j;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b7 = w63.b(obj);
        while (true) {
            int i7 = b7 & this.f15032k;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b7 = i7 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.p73, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15030i;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        System.arraycopy(this.f15029h, 0, objArr, i7, this.f15033l);
        return i7 + this.f15033l;
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int j() {
        return this.f15033l;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.p73, com.google.android.gms.internal.ads.z63
    /* renamed from: m */
    public final h93<E> iterator() {
        return l().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.z63
    final Object[] o() {
        return this.f15029h;
    }

    @Override // com.google.android.gms.internal.ads.p73
    final e73<E> q() {
        return e73.s(this.f15029h, this.f15033l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f15033l;
    }

    @Override // com.google.android.gms.internal.ads.p73
    final boolean w() {
        return true;
    }
}
