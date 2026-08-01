package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1035aI implements C6I {
    public static String[] A05 = {"udExhBBZigXHD765", "VCbgsgLtwNII3DWSf3Df", "sJ3cSki5Ts1gkpIy0", "hudoenMQ7OfQJqKUwYviTAHkC5956B", "3GiDDKpH2PPu7", "VAV0OzmNbR17K1ZAu", "eIBPlY8UdwZIA15YBWaPzTw3Re1i6Niv", "w6ShnqqW6c5InpRu2fdQvGfdyx0XiT7r"};
    public final /* synthetic */ AbstractC1045aS A00;
    public final /* synthetic */ InterfaceC01591e A01;
    public final /* synthetic */ C01601f A02;
    public final /* synthetic */ YA A03;
    public final /* synthetic */ boolean A04;

    public C1035aI(C01601f c01601f, YA ya, boolean z, AbstractC1045aS abstractC1045aS, InterfaceC01591e interfaceC01591e) {
        this.A02 = c01601f;
        this.A03 = ya;
        this.A04 = z;
        this.A00 = abstractC1045aS;
        this.A01 = interfaceC01591e;
    }

    private void A00(boolean z) {
        ArrayList arrayList;
        if (z) {
            YA ya = this.A03;
            String[] strArr = A05;
            if (strArr[7].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[5] = "ua1Hqbcww3qJrVJ6O";
            strArr2[2] = "2U70GzBDbPON7gkn8";
            if (IP.A1P(ya) && this.A04) {
                arrayList = this.A02.A02;
                arrayList.add(C0719Oi.A01(this.A03, this.A00, 1, new C1036aJ(this)));
                return;
            } else {
                this.A01.AAQ();
                return;
            }
        }
        this.A01.AAP(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAn() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.C6I
    public final void AAw() {
        A00(true);
    }
}
