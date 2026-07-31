package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC20495t A02;
    public InterfaceC3449kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C20445o A07 = new C20445o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC20495t interfaceC20495t) {
        this.A02 = interfaceC20495t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C19401k A5I() {
        C19401k c19401k = new C19401k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c19401k.A43(this.A02);
        }
        return c19401k;
    }
}
