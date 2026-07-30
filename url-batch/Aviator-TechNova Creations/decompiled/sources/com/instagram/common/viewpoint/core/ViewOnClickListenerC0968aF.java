package com.instagram.common.viewpoint.core;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0968aF implements View.OnClickListener {
    public final /* synthetic */ C0971aI A00;

    public ViewOnClickListenerC0968aF(C0971aI c0971aI) {
        this.A00 = c0971aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0970aH interfaceC0970aH;
        AbstractC0889Xm abstractC0889Xm;
        List list;
        E1 e1;
        E1 e12;
        E1 e13;
        AbstractC0889Xm abstractC0889Xm2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0970aH = this.A00.A05;
            interfaceC0970aH.AE7();
            abstractC0889Xm = this.A00.A00;
            if (abstractC0889Xm != null) {
                abstractC0889Xm2 = this.A00.A00;
                XP.A0J(abstractC0889Xm2);
            }
            list = this.A00.A07;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                XP.A0L((View) it.next(), 0);
            }
            XP.A0H(this.A00);
            e1 = this.A00.A06;
            if (e1 == null) {
                return;
            }
            e12 = this.A00.A06;
            XP.A0L(e12, 0);
            e13 = this.A00.A06;
            e13.A0h(EnumC1175db.A02, 14);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
