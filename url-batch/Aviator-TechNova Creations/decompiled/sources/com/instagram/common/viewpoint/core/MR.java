package com.instagram.common.viewpoint.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class MR {
    public static byte[] A04;
    public boolean A00;

    @Nullable
    public final MS A01;
    public final C1159dL A02;
    public final C1232eX A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, Ascii.SUB, 40, 40, Ascii.RS, 36, 35, -43, 33, 36, Ascii.FS, Ascii.FS, Ascii.SUB, Ascii.EM};
    }

    public abstract void A08(Map<String, String> map);

    public MR(C1159dL c1159dL, MS ms, C1232eX c1232eX) {
        this.A02 = c1159dL;
        this.A01 = ms;
        this.A03 = c1232eX;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C0944Zp().A03(this.A03).A05();
        A08(extraData);
        this.A00 = true;
        WX.A04(this.A02, A00(0, 17, 60));
        MS ms = this.A01;
    }
}
