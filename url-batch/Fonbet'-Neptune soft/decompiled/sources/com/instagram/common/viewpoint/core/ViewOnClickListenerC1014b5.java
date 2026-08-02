package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1014b5 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ JU A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{90, 69, 72, 73, 67};
    }

    public ViewOnClickListenerC1014b5(JU ju) {
        this.A00 = ju;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C1028bJ c1028bJ;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0Q;
            if (!z) {
                c1028bJ = this.A00.A0O;
                c1028bJ.A02(A00(0, 5, 116));
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
