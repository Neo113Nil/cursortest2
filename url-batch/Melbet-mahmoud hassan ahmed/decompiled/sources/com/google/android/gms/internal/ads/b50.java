package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b50 {

    /* renamed from: a, reason: collision with root package name */
    private final w94 f3252a = new w94();

    public final b50 a(int i7) {
        this.f3252a.a(i7);
        return this;
    }

    public final b50 b(z60 z60Var) {
        yb4 yb4Var;
        w94 w94Var = this.f3252a;
        yb4Var = z60Var.f14973a;
        for (int i7 = 0; i7 < yb4Var.b(); i7++) {
            w94Var.a(yb4Var.a(i7));
        }
        return this;
    }

    public final b50 c(int... iArr) {
        w94 w94Var = this.f3252a;
        for (int i7 : iArr) {
            w94Var.a(i7);
        }
        return this;
    }

    public final b50 d(int i7, boolean z6) {
        w94 w94Var = this.f3252a;
        if (z6) {
            w94Var.a(i7);
        }
        return this;
    }

    public final z60 e() {
        return new z60(this.f3252a.b(), null);
    }
}
