package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v2 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final List<h4> f13073a;

    /* renamed from: b, reason: collision with root package name */
    private final td4[] f13074b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13075c;

    /* renamed from: d, reason: collision with root package name */
    private int f13076d;

    /* renamed from: e, reason: collision with root package name */
    private int f13077e;

    /* renamed from: f, reason: collision with root package name */
    private long f13078f = -9223372036854775807L;

    public v2(List<h4> list) {
        this.f13073a = list;
        this.f13074b = new td4[list.size()];
    }

    private final boolean f(dr2 dr2Var, int i7) {
        if (dr2Var.i() == 0) {
            return false;
        }
        if (dr2Var.s() != i7) {
            this.f13075c = false;
        }
        this.f13076d--;
        return this.f13075c;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(dr2 dr2Var) {
        if (this.f13075c) {
            if (this.f13076d != 2 || f(dr2Var, 32)) {
                if (this.f13076d != 1 || f(dr2Var, 0)) {
                    int k7 = dr2Var.k();
                    int i7 = dr2Var.i();
                    for (td4 td4Var : this.f13074b) {
                        dr2Var.f(k7);
                        td4Var.e(dr2Var, i7);
                    }
                    this.f13077e += i7;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f13075c = false;
        this.f13078f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
        if (this.f13075c) {
            if (this.f13078f != -9223372036854775807L) {
                for (td4 td4Var : this.f13074b) {
                    td4Var.a(this.f13078f, 1, this.f13077e, 0, null);
                }
            }
            this.f13075c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        for (int i7 = 0; i7 < this.f13074b.length; i7++) {
            h4 h4Var = this.f13073a.get(i7);
            k4Var.c();
            td4 r7 = rc4Var.r(k4Var.a(), 3);
            bf4 bf4Var = new bf4();
            bf4Var.h(k4Var.b());
            bf4Var.s("application/dvbsubs");
            bf4Var.i(Collections.singletonList(h4Var.f6066b));
            bf4Var.k(h4Var.f6065a);
            r7.b(bf4Var.y());
            this.f13074b[i7] = r7;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if ((i7 & 4) == 0) {
            return;
        }
        this.f13075c = true;
        if (j7 != -9223372036854775807L) {
            this.f13078f = j7;
        }
        this.f13077e = 0;
        this.f13076d = 2;
    }
}
