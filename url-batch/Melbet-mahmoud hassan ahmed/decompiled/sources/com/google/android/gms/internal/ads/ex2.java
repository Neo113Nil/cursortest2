package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class ex2 implements xw2 {

    /* renamed from: a, reason: collision with root package name */
    private final ix2 f4803a;

    /* renamed from: b, reason: collision with root package name */
    private final gx2 f4804b;

    /* renamed from: c, reason: collision with root package name */
    private final uw2 f4805c;

    public ex2(uw2 uw2Var, ix2 ix2Var, gx2 gx2Var, byte[] bArr) {
        this.f4805c = uw2Var;
        this.f4803a = ix2Var;
        this.f4804b = gx2Var;
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final void a(ww2 ww2Var) {
        this.f4805c.b(b(ww2Var));
    }

    @Override // com.google.android.gms.internal.ads.xw2
    public final String b(ww2 ww2Var) {
        ix2 ix2Var = this.f4803a;
        Map<String, String> j7 = ww2Var.j();
        this.f4804b.a(j7);
        return ix2Var.a(j7);
    }
}
