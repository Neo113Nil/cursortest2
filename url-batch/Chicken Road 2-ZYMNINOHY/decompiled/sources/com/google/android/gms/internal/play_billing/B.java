package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class B extends AbstractC0346t {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5800c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5801d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5802e;

    public B(Object[] objArr, int i4, int i5) {
        this.f5800c = objArr;
        this.f5801d = i4;
        this.f5802e = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        U.i.G(i4, this.f5802e);
        Object obj = this.f5800c[i4 + i4 + this.f5801d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5802e;
    }
}
