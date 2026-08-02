package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.iK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1446iK implements InterfaceC0724Re {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ boolean A01;

    public C1446iK(C7B c7b, boolean z) {
        this.A00 = c7b;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACM() {
        C1153dL c1153dL;
        AtomicBoolean atomicBoolean;
        InterfaceC0600Mh interfaceC0600Mh;
        C1153dL c1153dL2;
        AbstractC0606Mo abstractC0606Mo;
        c1153dL = this.A00.A04;
        if (!U7.A1o(c1153dL) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC0600Mh = this.A00.A01;
            interfaceC0600Mh.AF4(this.A00);
            return;
        }
        C7B c7b = this.A00;
        c1153dL2 = this.A00.A04;
        abstractC0606Mo = this.A00.A03;
        c7b.A06 = AbstractC1065bu.A01(c1153dL2, (AnonymousClass73) abstractC0606Mo, 0, new C1447iL(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACN() {
        InterfaceC0600Mh interfaceC0600Mh;
        interfaceC0600Mh = this.A00.A01;
        interfaceC0600Mh.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
