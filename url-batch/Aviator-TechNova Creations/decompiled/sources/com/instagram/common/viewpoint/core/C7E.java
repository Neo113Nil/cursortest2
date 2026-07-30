package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7E extends AbstractC1409hU {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ AbstractC1442iA A01;
    public final /* synthetic */ AnonymousClass73 A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7E(C7B c7b, boolean z, boolean z2, AnonymousClass73 anonymousClass73, AbstractC1442iA abstractC1442iA) {
        super(z);
        this.A00 = c7b;
        this.A03 = z2;
        this.A02 = anonymousClass73;
        this.A01 = abstractC1442iA;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1409hU
    public final void A00() {
        InterfaceC0606Mh interfaceC0606Mh;
        interfaceC0606Mh = this.A00.A01;
        interfaceC0606Mh.AF7(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1409hU
    public final void A01(boolean z) {
        C1159dL c1159dL;
        EnumC0829Vb enumC0829Vb;
        AtomicBoolean atomicBoolean;
        InterfaceC0606Mh interfaceC0606Mh;
        C1159dL c1159dL2;
        C1159dL c1159dL3;
        c1159dL = this.A00.A04;
        if (!U7.A1o(c1159dL) || !this.A03) {
            enumC0829Vb = this.A00.A05;
            if (enumC0829Vb == EnumC0829Vb.A0I) {
                c1159dL2 = this.A00.A04;
                c1159dL2.A0F().ADn();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC0606Mh = this.A00.A01;
            interfaceC0606Mh.AF4(this.A01);
            return;
        }
        C7B c7b = this.A00;
        c1159dL3 = this.A00.A04;
        c7b.A06 = AbstractC1071bu.A01(c1159dL3, this.A02, 0, new C1451iJ(this));
    }
}
