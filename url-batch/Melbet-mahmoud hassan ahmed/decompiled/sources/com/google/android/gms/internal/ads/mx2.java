package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class mx2 implements xw2 {

    /* renamed from: a, reason: collision with root package name */
    private final ix2 f8797a;

    /* renamed from: b, reason: collision with root package name */
    private final gx2 f8798b;

    public mx2(ix2 ix2Var, gx2 gx2Var) {
        this.f8797a = ix2Var;
        this.f8798b = gx2Var;
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final void a(ww2 ww2Var) {
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final String b(ww2 ww2Var) {
        ix2 ix2Var = this.f8797a;
        Map<String, String> j7 = ww2Var.j();
        this.f8798b.a(j7);
        return ix2Var.a(j7);
    }
}
