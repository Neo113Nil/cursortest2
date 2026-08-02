package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.play_billing.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354x extends AbstractC0346t {

    /* renamed from: e, reason: collision with root package name */
    public static final C0354x f6026e = new C0354x(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f6027c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f6028d;

    public C0354x(int i4, Object[] objArr) {
        this.f6027c = objArr;
        this.f6028d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0346t, com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f6027c;
        int i4 = this.f6028d;
        System.arraycopy(objArr2, 0, objArr, 0, i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int c() {
        return this.f6028d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final boolean f() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final Object[] g() {
        return this.f6027c;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        U.i.G(i4, this.f6028d);
        Object obj = this.f6027c[i4];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6028d;
    }
}
