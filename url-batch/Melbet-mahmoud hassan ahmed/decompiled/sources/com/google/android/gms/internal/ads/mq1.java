package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mq1 implements kv3<kq1> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Executor> f8684a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<l31> f8685b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ji1> f8686c;

    public mq1(yv3<Executor> yv3Var, yv3<l31> yv3Var2, yv3<ji1> yv3Var3) {
        this.f8684a = yv3Var;
        this.f8685b = yv3Var2;
        this.f8686c = yv3Var3;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new kq1(this.f8684a.a(), this.f8685b.a(), this.f8686c.a());
    }
}
