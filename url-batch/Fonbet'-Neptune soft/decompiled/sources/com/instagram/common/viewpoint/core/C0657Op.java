package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Op, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0657Op extends AbstractRunnableC0840Vt {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC0873Xc A01;

    public C0657Op(DialogInterfaceOnClickListenerC0873Xc dialogInterfaceOnClickListenerC0873Xc, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC0873Xc;
        this.A00 = dialogInterface;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        InterfaceC1232ed interfaceC1232ed;
        InterfaceC1232ed interfaceC1232ed2;
        C1127cu c1127cu;
        Map<? extends String, ? extends String> A02;
        interfaceC1232ed = this.A01.A01.A02;
        if (interfaceC1232ed != null) {
            interfaceC1232ed2 = this.A01.A01.A02;
            c1127cu = this.A01.A01.A00;
            String A03 = VZ.A03(c1127cu);
            C1246er c1246er = new C1246er();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1232ed2.AGD(A03, c1246er.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
