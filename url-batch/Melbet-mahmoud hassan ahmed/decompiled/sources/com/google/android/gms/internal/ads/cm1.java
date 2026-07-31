package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class cm1 implements kv3<l31> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<un> f3864a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Executor> f3865b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<Context> f3866c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<v3.d> f3867d;

    public cm1(yv3<un> yv3Var, yv3<Executor> yv3Var2, yv3<Context> yv3Var3, yv3<v3.d> yv3Var4) {
        this.f3864a = yv3Var;
        this.f3865b = yv3Var2;
        this.f3866c = yv3Var3;
        this.f3867d = yv3Var4;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        un a7 = this.f3864a.a();
        Executor a8 = this.f3865b.a();
        Context a9 = this.f3866c.a();
        return new l31(a8, new x21(a9, a7), this.f3867d.a());
    }
}
