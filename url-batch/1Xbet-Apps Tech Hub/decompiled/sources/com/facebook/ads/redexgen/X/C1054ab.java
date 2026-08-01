package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1054ab implements InterfaceC01681n {
    public final /* synthetic */ FA A00;

    public C1054ab(FA fa) {
        this.A00 = fa;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01681n
    public final void ACM(AdError adError) {
        AnonymousClass15 anonymousClass15;
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACq(this.A00, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC01681n
    public final void ACN() {
        AtomicBoolean atomicBoolean;
        AnonymousClass15 anonymousClass15;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        anonymousClass15 = this.A00.A01;
        anonymousClass15.ACn(this.A00);
    }
}
