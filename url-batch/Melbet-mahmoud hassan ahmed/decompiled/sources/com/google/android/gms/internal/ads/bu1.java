package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class bu1 implements kv3<ar> {

    /* renamed from: a, reason: collision with root package name */
    private final yv3<Context> f3526a;

    /* renamed from: b, reason: collision with root package name */
    private final yv3<String> f3527b;

    /* renamed from: c, reason: collision with root package name */
    private final yv3<po0> f3528c;

    /* renamed from: d, reason: collision with root package name */
    private final yv3<jr> f3529d;

    /* renamed from: e, reason: collision with root package name */
    private final yv3<String> f3530e;

    public bu1(yv3<Context> yv3Var, yv3<String> yv3Var2, yv3<po0> yv3Var3, yv3<jr> yv3Var4, yv3<String> yv3Var5) {
        this.f3526a = yv3Var;
        this.f3527b = yv3Var2;
        this.f3528c = yv3Var3;
        this.f3529d = yv3Var4;
        this.f3530e = yv3Var5;
    }

    @Override // com.google.android.gms.internal.ads.yv3
    public final /* bridge */ /* synthetic */ Object a() {
        Context b7 = ((gw0) this.f3526a).b();
        final String a7 = ((xz1) this.f3527b).a();
        po0 b8 = ((rw0) this.f3528c).b();
        final jr a8 = this.f3529d.a();
        final String a9 = this.f3530e.a();
        ar arVar = new ar(new fr(b7));
        au F = bu.F();
        F.r(b8.f10302g);
        F.t(b8.f10303h);
        F.s(true != b8.f10304i ? 2 : 0);
        final bu o7 = F.o();
        arVar.b(new zq() { // from class: com.google.android.gms.internal.ads.au1
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                jr jrVar = jr.this;
                String str = a7;
                bu buVar = o7;
                String str2 = a9;
                kr y6 = psVar.r().y();
                y6.r(jrVar);
                psVar.v(y6);
                hs y7 = psVar.s().y();
                y7.r(str);
                y7.s(buVar);
                psVar.x(y7);
                psVar.y(str2);
            }
        });
        return arVar;
    }
}
