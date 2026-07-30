package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1578cT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ KE A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-58, -63, -63, -66, -76, -77, -60};
    }

    public ViewOnClickListenerC1578cT(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        C1588cd c1588cd;
        if (WU.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0M;
            if (!z8) {
                c1588cd = this.A00.A0K;
                c1588cd.A02(A00(0, 7, 17));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
