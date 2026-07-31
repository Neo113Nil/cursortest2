package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class t83<E> extends e73<E> {

    /* renamed from: j, reason: collision with root package name */
    static final e73<Object> f12140j = new t83(new Object[0], 0);

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f12141h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f12142i;

    t83(Object[] objArr, int i7) {
        this.f12141h = objArr;
        this.f12142i = i7;
    }

    @Override // java.util.List
    public final E get(int i7) {
        q43.a(i7, this.f12142i, "index");
        E e7 = (E) this.f12141h[i7];
        e7.getClass();
        return e7;
    }

    @Override // com.google.android.gms.internal.ads.e73, com.google.android.gms.internal.ads.z63
    final int i(Object[] objArr, int i7) {
        System.arraycopy(this.f12141h, 0, objArr, i7, this.f12142i);
        return i7 + this.f12142i;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int j() {
        return this.f12142i;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final boolean n() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z63
    final Object[] o() {
        return this.f12141h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12142i;
    }
}
