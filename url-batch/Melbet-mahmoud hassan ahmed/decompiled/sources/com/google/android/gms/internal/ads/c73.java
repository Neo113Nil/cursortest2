package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class c73<E> extends e53<E> {

    /* renamed from: h, reason: collision with root package name */
    private final e73<E> f3756h;

    c73(e73<E> e73Var, int i7) {
        super(e73Var.size(), i7);
        this.f3756h = e73Var;
    }

    @Override // com.google.android.gms.internal.ads.e53
    protected final E a(int i7) {
        return this.f3756h.get(i7);
    }
}
