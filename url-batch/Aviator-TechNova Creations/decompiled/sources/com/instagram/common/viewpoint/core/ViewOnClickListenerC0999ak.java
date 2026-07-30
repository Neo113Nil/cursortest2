package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.ak, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0999ak implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C01785e A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Utf8.REPLACEMENT_BYTE, 59, 55, 49, 51};
    }

    public ViewOnClickListenerC0999ak(C01785e c01785e) {
        this.A00 = c01785e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 54));
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
