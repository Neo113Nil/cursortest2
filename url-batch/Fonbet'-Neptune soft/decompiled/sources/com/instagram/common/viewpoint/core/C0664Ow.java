package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0664Ow implements X5 {
    public static byte[] A03;
    public int A00;
    public String A01;
    public final X5 A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-93, -93, -107, -104};
    }

    public C0664Ow(X5 x5) {
        this.A02 = x5;
    }

    private void A01() {
        if (this.A01 != null) {
            this.A02.AGO(this.A01 + A00(0, 4, 67) + this.A00);
            this.A01 = null;
            this.A00 = 0;
        }
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void AGO(String str) {
        boolean A0A;
        String A04;
        A0A = X7.A0A(str);
        if (A0A) {
            A01();
            this.A02.AGO(str);
            return;
        }
        A04 = X7.A04(str);
        String filtered = this.A01;
        if (A04.equals(filtered)) {
            this.A00++;
            return;
        }
        A01();
        this.A01 = A04;
        this.A00 = 1;
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void flush() {
        A01();
        this.A02.flush();
    }
}
