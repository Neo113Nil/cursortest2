package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2379Jg extends AbstractC2931c3 {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, Byte.MAX_VALUE, 106, 98, 103, 120};
    }

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC2379Jg(C2935c7 c2935c7, boolean z) {
        super(c2935c7, z);
        if (C2668Up.A17(c2935c7.A06())) {
            if (c2935c7.A0B() != null) {
                c2935c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (C2668Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2931c3
    public ViewOnClickListenerC2416Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC2881bF abstractC2881bF) {
        if (C2668Up.A17(this.A07.A06()) && abstractC2881bF != null) {
            abstractC2881bF.setOnClickListener(AbstractC2922bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C3056e5 c3056e5) {
    }
}
