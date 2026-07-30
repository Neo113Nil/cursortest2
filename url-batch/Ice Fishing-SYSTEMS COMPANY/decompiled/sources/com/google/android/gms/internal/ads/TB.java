package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class TB extends UB {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f27722v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f27723w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ UB f27724x;

    public TB(UB ub, int i, int i4) {
        Objects.requireNonNull(ub);
        this.f27724x = ub;
        this.f27722v = i;
        this.f27723w = i4;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final Object[] c() {
        return this.f27724x.c();
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int d() {
        return this.f27724x.d() + this.f27722v;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int e() {
        return this.f27724x.d() + this.f27722v + this.f27723w;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PA.a0(i, this.f27723w);
        return this.f27724x.get(i + this.f27722v);
    }

    @Override // com.google.android.gms.internal.ads.UB, java.util.List
    /* renamed from: i */
    public final UB subList(int i, int i4) {
        PA.c0(i, i4, this.f27723w);
        int i9 = this.f27722v;
        return this.f27724x.subList(i + i9, i4 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27723w;
    }
}
