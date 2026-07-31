package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class og {

    /* renamed from: a, reason: collision with root package name */
    private int f9644a;

    public final void a(int i7) {
        this.f9644a |= Integer.MIN_VALUE;
    }

    public void b() {
        this.f9644a = 0;
    }

    public final void c(int i7) {
        this.f9644a = i7;
    }

    protected final boolean d(int i7) {
        return (this.f9644a & i7) == i7;
    }

    public final boolean e() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean f() {
        return d(4);
    }

    public final boolean g() {
        return d(1);
    }
}
