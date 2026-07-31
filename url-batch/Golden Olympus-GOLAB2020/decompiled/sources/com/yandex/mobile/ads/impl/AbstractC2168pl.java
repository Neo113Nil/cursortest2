package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.pl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2168pl {

    /* renamed from: b, reason: collision with root package name */
    private int f30482b;

    public final void b(int i4) {
        this.f30482b = i4 | this.f30482b;
    }

    public final void c() {
        this.f30482b &= Integer.MAX_VALUE;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return c(4);
    }

    public final boolean g() {
        return c(1);
    }

    public void b() {
        this.f30482b = 0;
    }

    protected final boolean c(int i4) {
        return (this.f30482b & i4) == i4;
    }

    public final void d(int i4) {
        this.f30482b = i4;
    }
}
