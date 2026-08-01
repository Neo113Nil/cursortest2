package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class oh implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final vg f2652d;

    /* renamed from: e, reason: collision with root package name */
    public int f2653e;

    /* renamed from: i, reason: collision with root package name */
    public int f2654i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ph f2655r;

    public /* synthetic */ oh(ph phVar, vg vgVar, int i3) {
        this.f2655r = phVar;
        this.f2652d = vgVar;
        int i10 = i3 & 31;
        this.f2653e = i10;
        this.f2654i = i3 >>> (i10 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2653e >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.f2653e;
        ph phVar = this.f2655r;
        oa oaVar = phVar.f2680b;
        int a9 = oaVar.a();
        Object cast = this.f2652d.f2899b.cast(i3 >= a9 ? phVar.f2681c.j(i3 - a9) : oaVar.j(i3));
        int i10 = this.f2654i;
        if (i10 == 0) {
            this.f2653e = -1;
            return cast;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + 1;
        this.f2654i >>>= numberOfTrailingZeros;
        this.f2653e += numberOfTrailingZeros;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
