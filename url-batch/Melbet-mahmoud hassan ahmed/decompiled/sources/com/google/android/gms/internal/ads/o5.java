package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    private int f9509a = 2500;

    /* renamed from: b, reason: collision with root package name */
    private int f9510b;

    public final int a() {
        return this.f9510b;
    }

    public final int b() {
        return this.f9509a;
    }

    public final void c(k6 k6Var) {
        int i7 = this.f9510b + 1;
        this.f9510b = i7;
        int i8 = this.f9509a;
        this.f9509a = i8 + i8;
        if (i7 > 1) {
            throw k6Var;
        }
    }
}
