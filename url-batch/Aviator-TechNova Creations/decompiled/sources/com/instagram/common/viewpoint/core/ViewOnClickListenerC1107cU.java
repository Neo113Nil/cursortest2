package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.cU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1107cU implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4H A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{39, 42, 46, 43, 42, Base64.padSymbol};
    }

    public ViewOnClickListenerC1107cU(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0993ae abstractC0993ae;
        AbstractC0993ae abstractC0993ae2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            abstractC0993ae = this.A00.A00;
            if (abstractC0993ae != null) {
                abstractC0993ae2 = this.A00.A00;
                abstractC0993ae2.A1A(A00(0, 6, 53));
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
