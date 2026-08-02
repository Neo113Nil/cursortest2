package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class V extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2793c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2794d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f2795e;

    public V(Object[] objArr, int i3, int i4) {
        this.f2793c = objArr;
        this.f2794d = i3;
        this.f2795e = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0216d1.g(i3, this.f2795e);
        Object obj = this.f2793c[i3 + i3 + this.f2794d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2795e;
    }
}
