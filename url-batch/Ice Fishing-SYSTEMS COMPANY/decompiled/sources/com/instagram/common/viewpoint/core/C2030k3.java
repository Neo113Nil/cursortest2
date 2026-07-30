package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.k3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2030k3 extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C2029k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2030k3(C2029k2 c2029k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c2029k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1784fp c1784fp;
        C1784fp c1784fp2;
        C1784fp c1784fp3;
        this.A00.A00.A0A();
        c1784fp = this.A00.A00.A0B;
        if (c1784fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c1784fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1784fp2);
            c1784fp3 = this.A00.A00.A0B;
            c1784fp3.A0U();
        }
    }
}
