package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y41 implements kv3<w41> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<u61> f14537a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<Context> f14538b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<sr2> f14539c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<View> f14540d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<eu0> f14541e;

    /* renamed from: f, reason: collision with root package name */
    private final yv3<t61> f14542f;

    /* renamed from: g, reason: collision with root package name */
    private final yv3<cn1> f14543g;

    /* renamed from: h, reason: collision with root package name */
    private final yv3<ri1> f14544h;

    /* renamed from: i, reason: collision with root package name */
    private final yv3<mb2> f14545i;

    /* renamed from: j, reason: collision with root package name */
    private final yv3<Executor> f14546j;

    public y41(yv3<u61> yv3Var, yv3<Context> yv3Var2, yv3<sr2> yv3Var3, yv3<View> yv3Var4, yv3<eu0> yv3Var5, yv3<t61> yv3Var6, yv3<cn1> yv3Var7, yv3<ri1> yv3Var8, yv3<mb2> yv3Var9, yv3<Executor> yv3Var10) {
        this.f14537a = yv3Var;
        this.f14538b = yv3Var2;
        this.f14539c = yv3Var3;
        this.f14540d = yv3Var4;
        this.f14541e = yv3Var5;
        this.f14542f = yv3Var6;
        this.f14543g = yv3Var7;
        this.f14544h = yv3Var8;
        this.f14545i = yv3Var9;
        this.f14546j = yv3Var10;
    }

    public static w41 c(u61 u61Var, Context context, sr2 sr2Var, View view, eu0 eu0Var, t61 t61Var, cn1 cn1Var, ri1 ri1Var, ev3<mb2> ev3Var, Executor executor) {
        return new w41(u61Var, context, sr2Var, view, eu0Var, t61Var, cn1Var, ri1Var, ev3Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.yv3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final w41 a() {
        return new w41(((s81) this.f14537a).a(), this.f14538b.a(), ((e51) this.f14539c).b(), ((d51) this.f14540d).b(), ((p51) this.f14541e).b(), ((f51) this.f14542f).b(), ((bl1) this.f14543g).b(), this.f14544h.a(), jv3.b(this.f14545i), this.f14546j.a());
    }
}
