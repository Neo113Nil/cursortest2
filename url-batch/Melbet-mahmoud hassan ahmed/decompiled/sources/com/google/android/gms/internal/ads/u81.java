package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class u81 implements kv3<y2.b> {

    /* renamed from: a, reason: collision with root package name */
    private final t81 f12689a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f12690b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ml0> f12691c;

    public u81(t81 t81Var, yv3<Context> yv3Var, yv3<ml0> yv3Var2) {
        this.f12689a = t81Var;
        this.f12690b = yv3Var;
        this.f12691c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        return new y2.b(this.f12690b.a(), this.f12691c.a(), null);
    }
}
