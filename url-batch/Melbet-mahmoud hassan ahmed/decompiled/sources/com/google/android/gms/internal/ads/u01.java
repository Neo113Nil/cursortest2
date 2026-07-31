package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u01 implements kv3<oo0> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<pc0> f12531a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<String> f12532b;

    public u01(yv3<pc0> yv3Var, yv3<String> yv3Var2) {
        this.f12531a = yv3Var;
        this.f12532b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* synthetic */ Object a() {
        rc0 rc0Var = new rc0();
        String a7 = this.f12532b.a();
        return c30.f3707a.e().booleanValue() ? new qc0(rc0Var, a7) : new oo0(a7);
    }
}
