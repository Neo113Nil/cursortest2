package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class TY implements InterfaceC0650Lr {
    public final /* synthetic */ TU A00;

    public TY(TU tu) {
        this.A00 = tu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650Lr
    public final void AAr() {
        boolean A0Z;
        boolean z;
        C0573In c0573In;
        InterfaceC0652Lt interfaceC0652Lt;
        MM mm;
        AtomicBoolean atomicBoolean;
        boolean A0Y;
        AtomicBoolean atomicBoolean2;
        C0691Ng c0691Ng;
        A0Z = this.A00.A0Z();
        if (A0Z) {
            atomicBoolean2 = this.A00.A0T;
            if (!atomicBoolean2.get()) {
                c0691Ng = this.A00.A0R;
                c0691Ng.A07(this.A00);
                return;
            }
        }
        z = this.A00.A0V;
        if (z) {
            atomicBoolean = this.A00.A0T;
            if (!atomicBoolean.get()) {
                A0Y = this.A00.A0Y();
                if (A0Y) {
                    this.A00.A0Y.setToolbarActionMode(0);
                    this.A00.A0M();
                    return;
                }
            }
        }
        c0573In = this.A00.A0L;
        c0573In.A04(EnumC0572Im.A07, null);
        interfaceC0652Lt = this.A00.A0O;
        mm = this.A00.A0P;
        interfaceC0652Lt.A3z(mm.A6n());
    }
}
