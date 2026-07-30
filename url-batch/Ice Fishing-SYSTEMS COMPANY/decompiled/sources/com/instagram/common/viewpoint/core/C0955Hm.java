package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0955Hm extends AbstractRunnableC1326Wc {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass55 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, c.f16476c, 76};
    }

    public C0955Hm(AnonymousClass55 anonymousClass55, C4A c4a) {
        this.A00 = anonymousClass55;
        this.A01 = c4a;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C0876Ek c0876Ek;
        C0876Ek c0876Ek2;
        c0876Ek = this.A00.A0b;
        if (c0876Ek.getState() == EnumC1781fm.A02) {
            c0876Ek2 = this.A00.A0b;
            if (c0876Ek2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0s(A00(0, 22, 104));
            }
        }
    }
}
