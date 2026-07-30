package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class I extends J {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f35692v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f35693w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f35694x;

    public I(J j9, int i, int i4) {
        Objects.requireNonNull(j9);
        this.f35694x = j9;
        this.f35692v = i;
        this.f35693w = i4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int c() {
        return this.f35694x.d() + this.f35692v + this.f35693w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final int d() {
        return this.f35694x.d() + this.f35692v;
    }

    @Override // com.google.android.gms.internal.consent_sdk.G
    public final Object[] e() {
        return this.f35694x.e();
    }

    @Override // com.google.android.gms.internal.consent_sdk.J, java.util.List
    /* renamed from: f */
    public final J subList(int i, int i4) {
        E.f(i, i4, this.f35693w);
        int i9 = this.f35692v;
        return this.f35694x.subList(i + i9, i4 + i9);
    }

    @Override // java.util.List
    public final Object get(int i) {
        E.b(i, this.f35693w);
        return this.f35694x.get(i + this.f35692v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35693w;
    }
}
