package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s62 implements kv3<r62> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f11677a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f11678b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<gk1> f11679c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<qr2> f11680d;

    public s62(yv3<Context> yv3Var, yv3<Executor> yv3Var2, yv3<gk1> yv3Var3, yv3<qr2> yv3Var4) {
        this.f11677a = yv3Var;
        this.f11678b = yv3Var2;
        this.f11679c = yv3Var3;
        this.f11680d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new r62(this.f11677a.a(), this.f11678b.a(), this.f11679c.a(), this.f11680d.a());
    }
}
