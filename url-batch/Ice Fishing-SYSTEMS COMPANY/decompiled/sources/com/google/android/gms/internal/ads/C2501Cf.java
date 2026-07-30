package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Cf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501Cf implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24237a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f24238b;

    /* renamed from: c, reason: collision with root package name */
    public final C4117wN f24239c;

    public /* synthetic */ C2501Cf(C4009uN c4009uN, C4117wN c4117wN, int i) {
        this.f24237a = i;
        this.f24238b = c4009uN;
        this.f24239c = c4117wN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f24237a) {
            case 0:
                return new C2881Yl(18, (S2.a) this.f24239c.f34977a, (C2467Af) this.f24238b.d());
            case 1:
                return new C2832Vn((C2914a9) this.f24238b.d(), (Ct) this.f24239c.f34977a);
            case 2:
                return new C3650no((C3596mo) this.f24238b.d(), (C3214fi) this.f24239c.f34977a);
            case 3:
                Context context = (Context) this.f24238b.d();
                C3375ii c3375ii = (C3375ii) this.f24239c.f34977a;
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C4083vq(context, c3375ii, c3157eg, 0);
            case 4:
                return new C4191xq(0, (Context) this.f24238b.d(), (C3375ii) this.f24239c.f34977a);
            case 5:
                return new C2529Dq((Context) this.f24238b.d(), (C3482ki) this.f24239c.f34977a);
            case 6:
                return new C4191xq(1, (Context) this.f24238b.d(), (C3644ni) this.f24239c.f34977a);
            case 7:
                return new C4191xq(2, (Context) this.f24238b.d(), (C3806qi) this.f24239c.f34977a);
            default:
                return AbstractC3035cL.q((Context) this.f24239c.f34977a, (Dw) this.f24238b.d());
        }
    }

    public /* synthetic */ C2501Cf(C4117wN c4117wN, C4009uN c4009uN, int i) {
        this.f24237a = i;
        this.f24239c = c4117wN;
        this.f24238b = c4009uN;
    }
}
