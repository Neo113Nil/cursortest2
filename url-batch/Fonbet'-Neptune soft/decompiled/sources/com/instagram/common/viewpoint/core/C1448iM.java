package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.iM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1448iM implements S7 {
    public final /* synthetic */ C7B A00;

    public C1448iM(C7B c7b) {
        this.A00 = c7b;
    }

    private void A00(boolean z) {
        InterfaceC0600Mh interfaceC0600Mh;
        AtomicBoolean atomicBoolean;
        InterfaceC0600Mh interfaceC0600Mh2;
        if (!z) {
            interfaceC0600Mh = this.A00.A01;
            interfaceC0600Mh.AF7(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC0600Mh2 = this.A00.A01;
            interfaceC0600Mh2.AF4(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACh() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.S7
    public final void ACq() {
        A00(true);
    }
}
