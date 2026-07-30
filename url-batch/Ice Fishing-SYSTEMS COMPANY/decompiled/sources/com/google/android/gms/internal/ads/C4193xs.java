package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4193xs implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35263a;

    /* renamed from: b, reason: collision with root package name */
    public final C4229ya f35264b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f35265c;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f35266d;

    public /* synthetic */ C4193xs(C4229ya c4229ya, C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f35263a = i;
        this.f35264b = c4229ya;
        this.f35265c = c4009uN;
        this.f35266d = c4009uN2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f35263a) {
            case 0:
                Wr b9 = this.f35264b.b();
                S2.a aVar = (S2.a) this.f35265c.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C3869rs(b9, 2147483647L, aVar, c3157eg, (C3165eo) this.f35266d.d());
            default:
                Rs b10 = this.f35264b.b();
                Rs rs = (C3869rs) this.f35265c.d();
                if (true == ((List) this.f35266d.d()).contains("29")) {
                    b10 = rs;
                }
                AbstractC3137eE.h(b10);
                return b10;
        }
    }
}
