package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7E extends AbstractC1403hU {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ AbstractC1436iA A01;
    public final /* synthetic */ AnonymousClass73 A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7E(C7B c7b, boolean z, boolean z2, AnonymousClass73 anonymousClass73, AbstractC1436iA abstractC1436iA) {
        super(z);
        this.A00 = c7b;
        this.A03 = z2;
        this.A02 = anonymousClass73;
        this.A01 = abstractC1436iA;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403hU
    public final void A00() {
        InterfaceC0600Mh interfaceC0600Mh;
        interfaceC0600Mh = this.A00.A01;
        interfaceC0600Mh.AF7(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1403hU
    public final void A01(boolean z) {
        C1153dL c1153dL;
        EnumC0823Vb enumC0823Vb;
        AtomicBoolean atomicBoolean;
        InterfaceC0600Mh interfaceC0600Mh;
        C1153dL c1153dL2;
        C1153dL c1153dL3;
        c1153dL = this.A00.A04;
        if (!U7.A1o(c1153dL) || !this.A03) {
            enumC0823Vb = this.A00.A05;
            if (enumC0823Vb == EnumC0823Vb.A0I) {
                c1153dL2 = this.A00.A04;
                c1153dL2.A0F().ADn();
            }
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC0600Mh = this.A00.A01;
            interfaceC0600Mh.AF4(this.A01);
            return;
        }
        C7B c7b = this.A00;
        c1153dL3 = this.A00.A04;
        c7b.A06 = AbstractC1065bu.A01(c1153dL3, this.A02, 0, new C1445iJ(this));
    }
}
