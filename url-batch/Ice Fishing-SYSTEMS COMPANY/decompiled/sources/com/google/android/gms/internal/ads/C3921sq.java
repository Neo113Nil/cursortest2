package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3921sq implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34310a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f34311b;

    /* renamed from: c, reason: collision with root package name */
    public final C2860Xh f34312c;

    /* renamed from: d, reason: collision with root package name */
    public final C3700ok f34313d;

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f34314e;

    /* renamed from: f, reason: collision with root package name */
    public final C4117wN f34315f;

    /* renamed from: g, reason: collision with root package name */
    public final C4009uN f34316g;

    /* renamed from: h, reason: collision with root package name */
    public final C4009uN f34317h;
    public final C4009uN i;

    /* renamed from: j, reason: collision with root package name */
    public final C4009uN f34318j;

    public /* synthetic */ C3921sq(C4009uN c4009uN, C2860Xh c2860Xh, C3700ok c3700ok, C4009uN c4009uN2, C4117wN c4117wN, C4009uN c4009uN3, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6, int i) {
        this.f34310a = i;
        this.f34311b = c4009uN;
        this.f34312c = c2860Xh;
        this.f34313d = c3700ok;
        this.f34314e = c4009uN2;
        this.f34315f = c4117wN;
        this.f34316g = c4009uN3;
        this.f34317h = c4009uN4;
        this.i = c4009uN5;
        this.f34318j = c4009uN6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f34310a) {
            case 0:
                C3375ii c3375ii = (C3375ii) this.f34315f.f34977a;
                return new C3867rq(c3375ii, (Executor) this.f34314e.d(), (C2628Jn) this.f34316g.d(), this.f34313d.a(), this.f34312c.b(), new C3153ec(), (BinderC2949aq) this.f34317h.d(), (C3002bo) this.i.d(), (C3165eo) this.f34318j.d());
            case 1:
                return new C2648Kq((Context) this.f34311b.d(), this.f34312c.b(), this.f34313d.a(), (Executor) this.f34314e.d(), (C3644ni) this.f34315f.f34977a, (C2628Jn) this.f34316g.d(), new C3153ec(), (BinderC2949aq) this.f34317h.d(), (C3002bo) this.i.d(), (C3165eo) this.f34318j.d());
            default:
                return new C2648Kq((Context) this.f34311b.d(), this.f34312c.b(), this.f34313d.a(), (Executor) this.f34314e.d(), (C3806qi) this.f34315f.f34977a, (C2628Jn) this.f34316g.d(), new C3153ec(), (BinderC2949aq) this.f34317h.d(), (C3002bo) this.i.d(), (C3165eo) this.f34318j.d());
        }
    }

    public C3921sq(C4117wN c4117wN, C4009uN c4009uN, C4009uN c4009uN2, C4009uN c4009uN3, C3700ok c3700ok, C2860Xh c2860Xh, C4009uN c4009uN4, C4009uN c4009uN5, C4009uN c4009uN6) {
        this.f34310a = 0;
        this.f34315f = c4117wN;
        this.f34311b = c4009uN;
        this.f34314e = c4009uN2;
        this.f34316g = c4009uN3;
        this.f34313d = c3700ok;
        this.f34312c = c2860Xh;
        this.f34317h = c4009uN4;
        this.i = c4009uN5;
        this.f34318j = c4009uN6;
    }
}
