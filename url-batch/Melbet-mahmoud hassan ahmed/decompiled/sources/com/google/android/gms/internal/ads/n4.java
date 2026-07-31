package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class n4 {

    /* renamed from: a, reason: collision with root package name */
    private final List<c0> f8930a;

    /* renamed from: b, reason: collision with root package name */
    private final td4[] f8931b;

    public n4(List<c0> list) {
        this.f8930a = list;
        this.f8931b = new td4[list.size()];
    }

    public final void a(long j7, dr2 dr2Var) {
        if (dr2Var.i() < 9) {
            return;
        }
        int m7 = dr2Var.m();
        int m8 = dr2Var.m();
        int s7 = dr2Var.s();
        if (m7 == 434 && m8 == 1195456820 && s7 == 3) {
            gc4.b(j7, dr2Var, this.f8931b);
        }
    }

    public final void b(rc4 rc4Var, k4 k4Var) {
        for (int i7 = 0; i7 < this.f8931b.length; i7++) {
            k4Var.c();
            td4 r7 = rc4Var.r(k4Var.a(), 3);
            c0 c0Var = this.f8930a.get(i7);
            String str = c0Var.f3660l;
            boolean z6 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z6 = false;
            }
            String valueOf = String.valueOf(str);
            wu1.e(z6, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            bf4 bf4Var = new bf4();
            bf4Var.h(k4Var.b());
            bf4Var.s(str);
            bf4Var.u(c0Var.f3652d);
            bf4Var.k(c0Var.f3651c);
            bf4Var.c0(c0Var.D);
            bf4Var.i(c0Var.f3662n);
            r7.b(bf4Var.y());
            this.f8931b[i7] = r7;
        }
    }
}
