package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class y44 implements i74 {

    /* renamed from: a, reason: collision with root package name */
    public final i74 f14547a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14548b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z44 f14549c;

    public y44(z44 z44Var, i74 i74Var) {
        this.f14549c = z44Var;
        this.f14547a = i74Var;
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int a(long j7) {
        if (this.f14549c.p()) {
            return -3;
        }
        return this.f14547a.a(j7);
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final boolean b() {
        return !this.f14549c.p() && this.f14547a.b();
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final int c(cx3 cx3Var, z51 z51Var, int i7) {
        if (this.f14549c.p()) {
            return -3;
        }
        if (this.f14548b) {
            z51Var.c(4);
            return -4;
        }
        int c7 = this.f14547a.c(cx3Var, z51Var, i7);
        if (c7 == -5) {
            c0 c0Var = cx3Var.f3980a;
            Objects.requireNonNull(c0Var);
            int i8 = c0Var.B;
            if (i8 == 0) {
                if (c0Var.C != 0) {
                    i8 = 0;
                }
                return -5;
            }
            int i9 = this.f14549c.f14950j == Long.MIN_VALUE ? c0Var.C : 0;
            bf4 b7 = c0Var.b();
            b7.c(i8);
            b7.d(i9);
            cx3Var.f3980a = b7.y();
            return -5;
        }
        z44 z44Var = this.f14549c;
        long j7 = z44Var.f14950j;
        if (j7 == Long.MIN_VALUE || ((c7 != -4 || z51Var.f14954e < j7) && !(c7 == -3 && z44Var.a() == Long.MIN_VALUE && !z51Var.f14953d))) {
            return c7;
        }
        z51Var.b();
        z51Var.c(4);
        this.f14548b = true;
        return -4;
    }

    public final void d() {
        this.f14548b = false;
    }

    @Override // com.google.android.gms.internal.ads.i74
    public final void g() {
        this.f14547a.g();
    }
}
