package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2942aj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29265a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f29266b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f29267c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f29268d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f29269e;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f29270f;

    public /* synthetic */ C2942aj(C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, int i) {
        this.f29265a = i;
        this.f29266b = c4009uN;
        this.f29267c = c4009uN2;
        this.f29268d = c4009uN3;
        this.f29269e = c4009uN4;
        this.f29270f = c4009uN5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f29265a) {
            case 0:
                return new C2895Zi((C3045cd) this.f29266b.d(), (C2844Wi) this.f29267c.d(), (Executor) this.f29268d.d(), (C2827Vi) this.f29269e.d(), (S2.a) this.f29270f.d());
            default:
                return new C3219fn((Executor) this.f29266b.d(), (C2997bj) this.f29267c.d(), (C2490Bl) this.f29268d.d(), (C2657Li) this.f29269e.d(), (C3270gk) this.f29270f.d());
        }
    }
}
