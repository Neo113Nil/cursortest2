package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1045bU implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0513Is A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{7, -6, -11, -10, 0};
    }

    public ViewOnClickListenerC1045bU(C0513Is c0513Is) {
        this.A00 = c0513Is;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0997ai c0997ai;
        C0997ai c0997ai2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0m(A00(0, 5, 93));
            c0997ai = this.A00.A0c;
            if (c0997ai.A0E() != null) {
                c0997ai2 = this.A00.A0c;
                c0997ai2.A0E().ABr();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
