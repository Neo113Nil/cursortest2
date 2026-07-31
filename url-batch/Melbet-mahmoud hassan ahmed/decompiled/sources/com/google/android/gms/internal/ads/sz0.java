package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class sz0 {

    /* renamed from: a, reason: collision with root package name */
    private int f12013a;

    public final void a(int i7) {
        this.f12013a |= Integer.MIN_VALUE;
    }

    public void b() {
        this.f12013a = 0;
    }

    public final void c(int i7) {
        this.f12013a = i7;
    }

    protected final boolean d(int i7) {
        return (this.f12013a & i7) == i7;
    }

    public final boolean e() {
        return d(268435456);
    }

    public final boolean f() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean g() {
        return d(4);
    }

    public final boolean h() {
        return d(1);
    }
}
