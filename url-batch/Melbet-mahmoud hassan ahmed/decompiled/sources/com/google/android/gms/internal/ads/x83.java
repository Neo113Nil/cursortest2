package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class x83 extends e73<Object> {

    /* renamed from: h, reason: collision with root package name */
    private final transient Object[] f14086h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f14087i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f14088j;

    x83(Object[] objArr, int i7, int i8) {
        this.f14086h = objArr;
        this.f14087i = i7;
        this.f14088j = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        q43.a(i7, this.f14088j, "index");
        Object obj = this.f14086h[i7 + i7 + this.f14087i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final boolean n() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14088j;
    }
}
