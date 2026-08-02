package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class U extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient W f2790c;

    /* renamed from: d, reason: collision with root package name */
    public final transient V f2791d;

    public U(W w3, V v) {
        this.f2790c = w3;
        this.f2791d = v;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int b(Object[] objArr) {
        return this.f2791d.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2790c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0273x
    public final C e() {
        return this.f2791d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2791d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2790c.f;
    }
}
