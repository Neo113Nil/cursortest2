package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1146d7 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C1149dA A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, Ascii.SI, 5, 2, 0, 19, 5, Ascii.DC2};
    }

    public ViewOnClickListenerC1146d7(C1149dA c1149dA) {
        this.A00 = c1149dA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        KE ke;
        KE ke2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            ke = this.A00.A0g;
            if (ke == null) {
                return;
            }
            ke2 = this.A00.A0g;
            ke2.A0E(A00(0, 8, 44));
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
