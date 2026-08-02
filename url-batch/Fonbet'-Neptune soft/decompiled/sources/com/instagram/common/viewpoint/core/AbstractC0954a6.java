package com.instagram.common.viewpoint.core;

import android.widget.RelativeLayout;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.a6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0954a6 {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0g] */
    public static C00460g A00(final C0991ai c0991ai, final C0696Qc c0696Qc, final String str, final C01865s c01865s) {
        final boolean z = true;
        return new C01755h(c0991ai, c0696Qc, z, str, c01865s) { // from class: com.facebook.ads.redexgen.X.0g
            public KE A00;
            public C1120cn A01;
            public final US A02 = this.A0I.A06().A02().A0A();
            public final C0696Qc A03;
            public final C01865s A04;
            public final String A05;
            public static String[] A06 = {"q", "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", "V", "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC0856Wl.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC0856Wl.A02 * 6.0f);

            {
                this.A03 = c0696Qc;
                this.A05 = str;
                this.A04 = c01865s;
                this.A03.A1L(this);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0506Ir
            public void setupNativeCtaExtension(C1120cn c1120cn) {
                N3 A21;
                this.A01 = c1120cn;
                int A0Q = U7.A0Q(this.A0I.A06());
                C0616My A01 = this.A03.A10().A1z().A01();
                C1153dL A062 = this.A0I.A06();
                String A0r = this.A03.A10().A0r();
                US us = this.A02;
                InterfaceC0884Xn dummyListener = C0925Zc.getDummyListener();
                C1226eX A0b = this.A04.A0b();
                XH A1A = this.A03.A1A();
                if (this.A03.A10() == null) {
                    A21 = null;
                } else {
                    A21 = this.A03.A10().A21();
                }
                this.A00 = new KE(A062, A0r, A01, us, dummyListener, A0b, A1A, A21);
                this.A00.setCta(c1120cn.A03().A0J(), this.A05, new HashMap());
                this.A03.A1L(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    XP.A0N(this.A00, A07, 5, A01.A0A(false));
                    ((C01755h) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (A0Q == 2) {
                    layoutParams.addRule(3, ((C01755h) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C01755h) this).A06.bringToFront();
                }
            }
        };
    }
}
