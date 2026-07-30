package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.pj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3753pj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33475a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f33476b;

    /* renamed from: c, reason: collision with root package name */
    public final C2860Xh f33477c;

    /* renamed from: d, reason: collision with root package name */
    public final C2675Mj f33478d;

    /* renamed from: e, reason: collision with root package name */
    public final C3700ok f33479e;

    public C3753pj(C2518Df c2518Df, C4009uN c4009uN, C2860Xh c2860Xh, C2675Mj c2675Mj, C3700ok c3700ok) {
        this.f33476b = c4009uN;
        this.f33477c = c2860Xh;
        this.f33478d = c2675Mj;
        this.f33479e = c3700ok;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33475a) {
            case 0:
                return new C2473Al(new C3591mj((Context) this.f33476b.d(), this.f33477c.b(), this.f33478d.a(), this.f33479e.a(), 0), AbstractC3212fg.f30745h);
            default:
                return new C2473Al(new C3591mj((Context) this.f33476b.d(), this.f33477c.b(), this.f33478d.a(), this.f33479e.a(), 1), AbstractC3212fg.f30745h);
        }
    }

    public C3753pj(C4009uN c4009uN, C2860Xh c2860Xh, C2675Mj c2675Mj, C3700ok c3700ok) {
        this.f33476b = c4009uN;
        this.f33477c = c2860Xh;
        this.f33478d = c2675Mj;
        this.f33479e = c3700ok;
    }
}
