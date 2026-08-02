package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344s extends AbstractC0346t {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f6001c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f6002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0346t f6003e;

    public C0344s(AbstractC0346t abstractC0346t, int i4, int i5) {
        this.f6003e = abstractC0346t;
        this.f6001c = i4;
        this.f6002d = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int c() {
        return this.f6003e.d() + this.f6001c + this.f6002d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final int d() {
        return this.f6003e.d() + this.f6001c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0341q
    public final Object[] g() {
        return this.f6003e.g();
    }

    @Override // java.util.List
    public final Object get(int i4) {
        U.i.G(i4, this.f6002d);
        return this.f6003e.get(i4 + this.f6001c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0346t, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final AbstractC0346t subList(int i4, int i5) {
        U.i.L(i4, i5, this.f6002d);
        int i6 = this.f6001c;
        return this.f6003e.subList(i4 + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6002d;
    }
}
