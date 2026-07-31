package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class u0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f12528a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12529b;

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f12530c;

    public u0(p0 p0Var, c0 c0Var) {
        dr2 dr2Var = p0Var.f9963b;
        this.f12530c = dr2Var;
        dr2Var.f(12);
        int v6 = dr2Var.v();
        if ("audio/raw".equals(c0Var.f3660l)) {
            int S = n13.S(c0Var.A, c0Var.f3673y);
            if (v6 == 0 || v6 % S != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(S);
                sb.append(", stsz sample size: ");
                sb.append(v6);
                Log.w("AtomParsers", sb.toString());
                v6 = S;
            }
        }
        this.f12528a = v6 == 0 ? -1 : v6;
        this.f12529b = dr2Var.v();
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int a() {
        return this.f12529b;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int c() {
        int i7 = this.f12528a;
        return i7 == -1 ? this.f12530c.v() : i7;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final int zza() {
        return this.f12528a;
    }
}
