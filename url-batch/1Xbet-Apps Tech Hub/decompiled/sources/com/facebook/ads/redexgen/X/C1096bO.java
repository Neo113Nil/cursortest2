package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1096bO {
    public final C1107bZ A00;
    public final C1105bX A01;

    public C1096bO(AbstractC1112be abstractC1112be, C1105bX c1105bX, C1107bZ c1107bZ) {
        this.A00 = c1107bZ;
        this.A01 = c1105bX;
        abstractC1112be.A02(new C0484Fa(c1105bX));
    }

    public static C1096bO A00(AbstractC1112be abstractC1112be, InterfaceC1116bi interfaceC1116bi, InterfaceC0506Fw interfaceC0506Fw) {
        C1107bZ c1107bZ = new C1107bZ();
        C1105bX viewpointScanner = new C1105bX(interfaceC1116bi, new G2(), interfaceC0506Fw, c1107bZ, new Handler(Looper.getMainLooper()));
        return new C1096bO(abstractC1112be, viewpointScanner, c1107bZ);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C1114bg c1114bg) {
        this.A00.A02(view, c1114bg);
    }

    public final void A03(InterfaceC1111bd interfaceC1111bd) {
        this.A01.A09(interfaceC1111bd);
    }

    public final void A04(InterfaceC1109bb interfaceC1109bb) {
        this.A01.A0A(interfaceC1109bb);
    }
}
