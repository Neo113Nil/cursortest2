package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d62 implements kv3<c62> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<r51> f4092a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f4093b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f4094c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<et1> f4095d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<ks2> f4096e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<e43<rr2, a3.x>> f4097f;

    public d62(yv3<r51> yv3Var, yv3<Context> yv3Var2, yv3<Executor> yv3Var3, yv3<et1> yv3Var4, yv3<ks2> yv3Var5, yv3<e43<rr2, a3.x>> yv3Var6) {
        this.f4092a = yv3Var;
        this.f4093b = yv3Var2;
        this.f4094c = yv3Var3;
        this.f4095d = yv3Var4;
        this.f4096e = yv3Var5;
        this.f4097f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c62 a() {
        return new c62(this.f4092a.a(), this.f4093b.a(), this.f4094c.a(), this.f4095d.a(), ((ma1) this.f4096e).b(), this.f4097f.a());
    }
}
