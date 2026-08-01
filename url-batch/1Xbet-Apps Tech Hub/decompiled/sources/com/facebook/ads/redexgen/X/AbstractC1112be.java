package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1112be {
    public InterfaceC1113bf A00;

    public final void A00() {
        InterfaceC1113bf interfaceC1113bf = this.A00;
        if (interfaceC1113bf != null) {
            interfaceC1113bf.onStart();
        }
    }

    public final void A01() {
        InterfaceC1113bf interfaceC1113bf = this.A00;
        if (interfaceC1113bf != null) {
            interfaceC1113bf.onStop();
        }
    }

    public final void A02(InterfaceC1113bf interfaceC1113bf) {
        this.A00 = interfaceC1113bf;
    }
}
