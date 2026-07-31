package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v52 implements kv3<u52> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<v31> f13131a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f13132b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Executor> f13133c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<et1> f13134d;

    public v52(yv3<v31> yv3Var, yv3<Context> yv3Var2, yv3<Executor> yv3Var3, yv3<et1> yv3Var4) {
        this.f13131a = yv3Var;
        this.f13132b = yv3Var2;
        this.f13133c = yv3Var3;
        this.f13134d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new u52(this.f13131a.a(), this.f13132b.a(), this.f13133c.a(), this.f13134d.a());
    }
}
