package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ln2 implements kv3<kn2> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f8026a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f8027b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<bw0> f8028c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<ep2<h41, m41>> f8029d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<in2> f8030e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<is2> f8031f;

    public ln2(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<bw0> yv3Var3, yv3<ep2<h41, m41>> yv3Var4, yv3<in2> yv3Var5, yv3<is2> yv3Var6) {
        this.f8026a = yv3Var;
        this.f8027b = yv3Var2;
        this.f8028c = yv3Var3;
        this.f8029d = yv3Var4;
        this.f8030e = yv3Var5;
        this.f8031f = yv3Var6;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new kn2(this.f8026a.a(), this.f8027b.a(), this.f8028c.a(), ((hp2) this.f8029d).a(), this.f8030e.a(), new is2());
    }
}
