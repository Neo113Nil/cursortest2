package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class i12 implements kv3<h12> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Map<String, yv3<j12>>> f6486a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f6487b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<rd1> f6488c;

    public i12(yv3<Map<String, yv3<j12>>> yv3Var, yv3<dc3> yv3Var2, yv3<rd1> yv3Var3) {
        this.f6486a = yv3Var;
        this.f6487b = yv3Var2;
        this.f6488c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h12 a() {
        Map d7 = ((rv3) this.f6486a).d();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new h12(d7, dc3Var, ((sd1) this.f6488c).a());
    }
}
