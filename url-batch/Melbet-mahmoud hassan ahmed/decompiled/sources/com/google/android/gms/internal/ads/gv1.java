package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class gv1 implements kv3<fv1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ar> f5777a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Map<gw2, ev1>> f5778b;

    public gv1(yv3<ar> yv3Var, yv3<Map<gw2, ev1>> yv3Var2) {
        this.f5777a = yv3Var;
        this.f5778b = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fv1 a() {
        return new fv1(this.f5777a.a(), ((ov3) this.f5778b).a());
    }
}
