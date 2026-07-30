package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1105cS implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0442Fy A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{126, 115, 119, 114, 115, 100};
    }

    public ViewOnClickListenerC1105cS(C0442Fy c0442Fy) {
        this.A00 = c0442Fy;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0486Hr abstractC0486Hr;
        AbstractC0486Hr abstractC0486Hr2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            abstractC0486Hr = this.A00.A04;
            if (abstractC0486Hr != null) {
                abstractC0486Hr2 = this.A00.A04;
                abstractC0486Hr2.A1A(A00(0, 6, 84));
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
