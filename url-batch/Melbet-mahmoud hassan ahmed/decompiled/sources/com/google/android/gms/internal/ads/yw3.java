package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yw3 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f14838a;

    /* renamed from: b, reason: collision with root package name */
    public rx3 f14839b;

    /* renamed from: c, reason: collision with root package name */
    public int f14840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14841d;

    /* renamed from: e, reason: collision with root package name */
    public int f14842e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14843f;

    /* renamed from: g, reason: collision with root package name */
    public int f14844g;

    public yw3(rx3 rx3Var) {
        this.f14839b = rx3Var;
    }

    public final void a(int i7) {
        this.f14838a = 1 == ((this.f14838a ? 1 : 0) | i7);
        this.f14840c += i7;
    }

    public final void b(int i7) {
        this.f14838a = true;
        this.f14843f = true;
        this.f14844g = i7;
    }

    public final void c(rx3 rx3Var) {
        this.f14838a |= this.f14839b != rx3Var;
        this.f14839b = rx3Var;
    }

    public final void d(int i7) {
        if (this.f14841d && this.f14842e != 5) {
            wu1.d(i7 == 5);
            return;
        }
        this.f14838a = true;
        this.f14841d = true;
        this.f14842e = i7;
    }
}
