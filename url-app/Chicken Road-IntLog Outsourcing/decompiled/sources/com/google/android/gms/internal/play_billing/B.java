package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f5022c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f5024e;

    public B(C c2, int i2, int i3) {
        this.f5024e = c2;
        this.f5022c = i2;
        this.f5023d = i3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int c() {
        return this.f5024e.d() + this.f5022c + this.f5023d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final int d() {
        return this.f5024e.d() + this.f5022c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final Object[] g() {
        return this.f5024e.g();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        AbstractC0325d1.i(i2, this.f5023d);
        return this.f5024e.get(i2 + this.f5022c);
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    /* renamed from: i */
    public final C subList(int i2, int i3) {
        AbstractC0325d1.F(i2, i3, this.f5023d);
        int i6 = this.f5022c;
        return this.f5024e.subList(i2 + i6, i3 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5023d;
    }
}
