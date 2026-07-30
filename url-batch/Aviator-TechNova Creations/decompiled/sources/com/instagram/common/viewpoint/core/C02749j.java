package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.9j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02749j implements InterfaceC01704w {
    public C5H A02;
    public InterfaceC1502jB<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C5C A07 = new C5C();
    public int A00 = 8000;
    public int A01 = 8000;

    public final C02749j A00(C5H c5h) {
        this.A02 = c5h;
        return this;
    }

    public final C02749j A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01704w
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass18 A5A() {
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            anonymousClass18.A3v(this.A02);
        }
        return anonymousClass18;
    }
}
