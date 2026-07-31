package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2452Mb implements XN {
    public final /* synthetic */ MW A00;

    public C2452Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C2452Mb(MW mw, C2463Mm c2463Mm) {
        this(mw);
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z;
        C2490No c2490No;
        boolean z2;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z = this.A00.A0T;
            if (!z) {
                z2 = this.A00.A0D;
                if (z2) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c2490No = this.A00.A0H;
            if (c2490No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        C2490No c2490No;
        C2490No c2490No2;
        c2490No = this.A00.A0H;
        if (c2490No.A0A() > 0) {
            c2490No2 = this.A00.A0H;
            if (f == c2490No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
