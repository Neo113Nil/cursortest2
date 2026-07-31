package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class n54 extends ei0 {

    /* renamed from: c, reason: collision with root package name */
    private final zo f8942c;

    public n54(zo zoVar) {
        this.f8942c = zoVar;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int a(Object obj) {
        return obj == m54.f8425f ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final pf0 d(int i7, pf0 pf0Var, boolean z6) {
        pf0Var.j(z6 ? 0 : null, z6 ? m54.f8425f : null, 0, -9223372036854775807L, 0L, y51.f14553c, true);
        return pf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final hh0 e(int i7, hh0 hh0Var, long j7) {
        hh0Var.a(hh0.f6244o, this.f8942c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        hh0Var.f6257j = true;
        return hh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final Object f(int i7) {
        return m54.f8425f;
    }
}
