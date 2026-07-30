package com.instagram.common.viewpoint.core;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.c9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1086c9 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C4Z A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.DC4, Ascii.ETB, Ascii.ETB, Ascii.CAN, 39, Ascii.DC4, Ascii.FS, Ascii.US, 38};
    }

    public ViewOnClickListenerC1086c9(C4Z c4z) {
        this.A00 = c4z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C1034bJ c1034bJ;
        InterfaceC1106cT interfaceC1106cT;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                c1034bJ = this.A00.A0H;
                c1034bJ.A02(A00(0, 9, 103));
                interfaceC1106cT = this.A00.A0Z;
                interfaceC1106cT.ABr();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
