package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class f02 implements kv3<e02> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<ScheduledExecutorService> f4928a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<dc3> f4929b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<w02> f4930c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<m22> f4931d;

    public f02(yv3<ScheduledExecutorService> yv3Var, yv3<dc3> yv3Var2, yv3<w02> yv3Var3, yv3<m22> yv3Var4) {
        this.f4928a = yv3Var;
        this.f4929b = yv3Var2;
        this.f4930c = yv3Var3;
        this.f4931d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e02 a() {
        ScheduledExecutorService a7 = this.f4928a.a();
        dc3 dc3Var = wo0.f13894a;
        sv3.b(dc3Var);
        return new e02(a7, dc3Var, ((x02) this.f4930c).a(), jv3.b(this.f4931d));
    }
}
