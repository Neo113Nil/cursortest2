package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Y7 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ Y9 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{124, 120, 116, 114, 112};
    }

    public Y7(Y9 y9) {
        this.A00 = y9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Mn mn;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            mn = this.A00.A06;
            mn.getCTAButton().A0E(A00(0, 5, 121));
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
