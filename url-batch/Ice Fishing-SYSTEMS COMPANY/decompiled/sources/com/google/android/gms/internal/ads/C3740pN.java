package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.pN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3740pN implements Iterator {

    /* renamed from: n, reason: collision with root package name */
    public int f33383n = 0;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3794qN f33384u;

    public C3740pN(C3794qN c3794qN) {
        this.f33384u = c3794qN;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f33383n;
        C3794qN c3794qN = this.f33384u;
        return i < c3794qN.f33711n.size() || c3794qN.f33712u.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f33383n;
        C3794qN c3794qN = this.f33384u;
        ArrayList arrayList = c3794qN.f33711n;
        if (i >= arrayList.size()) {
            arrayList.add(c3794qN.f33712u.next());
            return next();
        }
        int i4 = this.f33383n;
        this.f33383n = i4 + 1;
        return arrayList.get(i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
