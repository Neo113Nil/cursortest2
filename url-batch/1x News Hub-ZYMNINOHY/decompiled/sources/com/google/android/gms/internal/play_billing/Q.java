package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Q extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final Q f2774e = new Q(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f2775c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2776d;

    public Q(int i3, Object[] objArr) {
        this.f2775c = objArr;
        this.f2776d = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.C, com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f2775c;
        int i3 = this.f2776d;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int c() {
        return this.f2776d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0273x
    public final Object[] g() {
        return this.f2775c;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0216d1.g(i3, this.f2776d);
        Object obj = this.f2775c[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2776d;
    }
}
