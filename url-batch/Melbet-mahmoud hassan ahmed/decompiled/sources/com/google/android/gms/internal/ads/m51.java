package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class m51 implements kv3<xl0> {

    /* renamed from: a, reason: collision with root package name */
    private final b51 f8415a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f8416b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<ks2> f8417c;

    public m51(b51 b51Var, yv3<Context> yv3Var, yv3<ks2> yv3Var2) {
        this.f8415a = b51Var;
        this.f8416b = yv3Var;
        this.f8417c = yv3Var2;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xl0 a() {
        return new xl0(((nt2) this.f8416b).b(), ((ma1) this.f8417c).b().f7620f);
    }
}
