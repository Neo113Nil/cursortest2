package com.facebook.ads.redexgen.X;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class NX {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.29] */
    public static AnonymousClass29 A00(final C0710Nz c0710Nz, final UJ uj, final String str, final C03579j c03579j) {
        final boolean z = true;
        return new C9G(c0710Nz, uj, z, str, c03579j) { // from class: com.facebook.ads.redexgen.X.29
            public T3 A00;
            public PC A01;
            public final InterfaceC0565If A02 = this.A0I.A05().A01().A09();
            public final UJ A03;
            public final C03579j A04;
            public final String A05;
            public static final int A07 = (int) (C0627Ku.A02 * (-4.0f));
            public static final int A06 = (int) (C0627Ku.A02 * 6.0f);

            {
                this.A03 = uj;
                this.A05 = str;
                this.A04 = c03579j;
                uj.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0825Sk
            public void setupNativeCtaExtension(PC pc) {
                C1R A0x;
                this.A01 = pc;
                int A0M = IP.A0M(this.A0I.A05());
                C1M A01 = this.A03.A0z().A0u().A01();
                YA A05 = this.A0I.A05();
                String A0K = this.A03.A0z().A0K();
                InterfaceC0565If interfaceC0565If = this.A02;
                InterfaceC0652Lt dummyListener = N9.getDummyListener();
                C0764Qb A0c = this.A04.A0c();
                LN A19 = this.A03.A19();
                if (this.A03.A0z() == null) {
                    A0x = null;
                } else {
                    A0x = this.A03.A0z().A0x();
                }
                T3 t3 = new T3(A05, A0K, A01, interfaceC0565If, dummyListener, A0c, A19, A0x);
                this.A00 = t3;
                t3.setCta(pc.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0M == 1) {
                    layoutParams.addRule(12);
                    LV.A0P(this.A00, A06, 5, A01.A09(false));
                    ((C9G) this).A06.addView(this.A00, layoutParams);
                } else {
                    if (A0M != 2) {
                        return;
                    }
                    layoutParams.addRule(3, ((C9G) this).A06.getId());
                    int extensionVariant = A07;
                    layoutParams.setMargins(0, extensionVariant, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C9G) this).A06.bringToFront();
                }
            }
        };
    }

    public static C9G A01(C0710Nz c0710Nz, String str, S0 s0) {
        return new C9G(c0710Nz, true, str, s0);
    }
}
