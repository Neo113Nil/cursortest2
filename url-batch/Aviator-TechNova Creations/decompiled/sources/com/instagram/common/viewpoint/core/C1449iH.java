package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.iH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1449iH implements NP {
    public final /* synthetic */ C7B A00;

    public C1449iH(C7B c7b) {
        this.A00 = c7b;
    }

    @Override // com.instagram.common.viewpoint.core.NP
    public final void AEZ(AdError adError) {
        InterfaceC0606Mh interfaceC0606Mh;
        interfaceC0606Mh = this.A00.A01;
        interfaceC0606Mh.AF7(this.A00, adError);
    }

    @Override // com.instagram.common.viewpoint.core.NP
    public final void AEa() {
        AtomicBoolean atomicBoolean;
        InterfaceC0606Mh interfaceC0606Mh;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC0606Mh = this.A00.A01;
        interfaceC0606Mh.AF4(this.A00);
    }
}
