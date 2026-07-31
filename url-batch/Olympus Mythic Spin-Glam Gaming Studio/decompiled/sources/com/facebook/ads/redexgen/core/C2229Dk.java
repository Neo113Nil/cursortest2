package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2229Dk extends UN<C4A> {
    public final /* synthetic */ C2228Dj A00;

    public C2229Dk(C2228Dj c2228Dj) {
        this.A00 = c2228Dj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C4A c4a) {
        C2255Ek c2255Ek;
        C2255Ek c2255Ek2;
        C2255Ek c2255Ek3;
        String A02;
        c2255Ek = this.A00.A00;
        if (c2255Ek == null) {
            return;
        }
        C2228Dj c2228Dj = this.A00;
        C2228Dj c2228Dj2 = this.A00;
        c2255Ek2 = this.A00.A00;
        int duration = c2255Ek2.getDuration();
        c2255Ek3 = this.A00.A00;
        A02 = c2228Dj2.A02(duration - c2255Ek3.getCurrentPositionInMillis());
        c2228Dj.setText(A02);
    }

    @Override // com.facebook.ads.redexgen.core.UN
    public final Class<C4A> A01() {
        return C4A.class;
    }
}
