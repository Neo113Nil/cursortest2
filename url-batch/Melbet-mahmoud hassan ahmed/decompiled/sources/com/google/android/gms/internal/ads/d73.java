package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class d73 extends e73 {

    /* renamed from: h, reason: collision with root package name */
    final transient int f4102h;

    /* renamed from: i, reason: collision with root package name */
    final transient int f4103i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ e73 f4104j;

    d73(e73 e73Var, int i7, int i8) {
        this.f4104j = e73Var;
        this.f4102h = i7;
        this.f4103i = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        q43.a(i7, this.f4103i, "index");
        return this.f4104j.get(i7 + this.f4102h);
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int j() {
        return this.f4104j.k() + this.f4102h + this.f4103i;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int k() {
        return this.f4104j.k() + this.f4102h;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final Object[] o() {
        return this.f4104j.o();
    }

    @Override // com.google.android.gms.internal.ads.e73
    /* renamed from: p */
    public final e73 subList(int i7, int i8) {
        q43.f(i7, i8, this.f4103i);
        e73 e73Var = this.f4104j;
        int i9 = this.f4102h;
        return e73Var.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4103i;
    }

    @Override // com.google.android.gms.internal.ads.e73, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
