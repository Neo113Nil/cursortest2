package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0663Op extends AbstractRunnableC0846Vt {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC0879Xc A01;

    public C0663Op(DialogInterfaceOnClickListenerC0879Xc dialogInterfaceOnClickListenerC0879Xc, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC0879Xc;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        InterfaceC1238ed interfaceC1238ed;
        InterfaceC1238ed interfaceC1238ed2;
        C1133cu c1133cu;
        Map<? extends String, ? extends String> A02;
        interfaceC1238ed = this.A01.A01.A02;
        if (interfaceC1238ed != null) {
            interfaceC1238ed2 = this.A01.A01.A02;
            c1133cu = this.A01.A01.A00;
            String A03 = VZ.A03(c1133cu);
            C1252er c1252er = new C1252er();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1238ed2.AGD(A03, c1252er.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
