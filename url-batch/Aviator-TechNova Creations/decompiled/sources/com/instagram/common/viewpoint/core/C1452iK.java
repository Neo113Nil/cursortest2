package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.iK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1452iK implements InterfaceC0730Re {
    public final /* synthetic */ C7B A00;
    public final /* synthetic */ boolean A01;

    public C1452iK(C7B c7b, boolean z) {
        this.A00 = c7b;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACM() {
        C1159dL c1159dL;
        AtomicBoolean atomicBoolean;
        InterfaceC0606Mh interfaceC0606Mh;
        C1159dL c1159dL2;
        AbstractC0612Mo abstractC0612Mo;
        c1159dL = this.A00.A04;
        if (!U7.A1o(c1159dL) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC0606Mh = this.A00.A01;
            interfaceC0606Mh.AF4(this.A00);
            return;
        }
        C7B c7b = this.A00;
        c1159dL2 = this.A00.A04;
        abstractC0612Mo = this.A00.A03;
        c7b.A06 = AbstractC1071bu.A01(c1159dL2, (AnonymousClass73) abstractC0612Mo, 0, new C1453iL(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0730Re
    public final void ACN() {
        InterfaceC0606Mh interfaceC0606Mh;
        interfaceC0606Mh = this.A00.A01;
        interfaceC0606Mh.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
