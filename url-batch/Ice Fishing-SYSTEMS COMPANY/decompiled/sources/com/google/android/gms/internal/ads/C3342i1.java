package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3342i1 extends V0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3015c1 f31306b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3288h1 f31307c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3342i1(C3288h1 c3288h1, InterfaceC3015c1 interfaceC3015c1, InterfaceC3015c1 interfaceC3015c12) {
        super(interfaceC3015c1);
        this.f31306b = interfaceC3015c12;
        Objects.requireNonNull(c3288h1);
        this.f31307c = c3288h1;
    }

    @Override // com.google.android.gms.internal.ads.V0, com.google.android.gms.internal.ads.InterfaceC3015c1
    public final C2961b1 c(long j9) {
        C2961b1 c4 = this.f31306b.c(j9);
        C3070d1 c3070d1 = c4.f29379a;
        long j10 = c3070d1.f29774a;
        long j11 = this.f31307c.f31133u;
        C3070d1 c3070d12 = new C3070d1(j10, c3070d1.f29775b + j11);
        C3070d1 c3070d13 = c4.f29380b;
        return new C2961b1(c3070d12, new C3070d1(c3070d13.f29774a, c3070d13.f29775b + j11));
    }
}
