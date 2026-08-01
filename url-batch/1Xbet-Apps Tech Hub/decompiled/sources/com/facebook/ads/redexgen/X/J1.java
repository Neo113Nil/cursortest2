package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class J1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UL A00;

    public J1(UL ul) {
        this.A00 = ul;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map<String, String> A01;
        if (this.A00.A01.A0a != null) {
            C1060ah c1060ah = this.A00.A01.A0a;
            A01 = this.A00.A01();
            c1060ah.A0P(A01);
        }
    }
}
