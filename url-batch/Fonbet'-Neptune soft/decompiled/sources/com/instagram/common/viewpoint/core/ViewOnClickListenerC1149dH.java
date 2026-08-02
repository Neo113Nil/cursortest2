package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1149dH implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0387Eb A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 51, 57, 62, 60, 47, 57, 46};
    }

    public ViewOnClickListenerC1149dH(C0387Eb c0387Eb) {
        this.A00 = c0387Eb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        KE ke;
        KE ke2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            ke = this.A00.A02;
            if (ke != null) {
                ke2 = this.A00.A02;
                ke2.A0E(A00(0, 8, 103));
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
