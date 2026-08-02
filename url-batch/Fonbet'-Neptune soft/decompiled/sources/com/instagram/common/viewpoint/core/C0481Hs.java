package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0481Hs extends AbstractC1225eW {
    public static byte[] A01;
    public final /* synthetic */ AbstractC0480Hr A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C0481Hs(AbstractC0480Hr abstractC0480Hr) {
        this.A00 = abstractC0480Hr;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1225eW
    public final void A03() {
        int i;
        boolean z;
        boolean z2;
        if (!this.A00.A0A.A07()) {
            this.A00.A0A.A05();
            if (!TextUtils.isEmpty(this.A00.A06.A25())) {
                Map<String, String> A05 = new C0938Zp().A03(this.A00.A0D).A02(this.A00.A0A).A04(this.A00.A06.A0u()).A05();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 96));
                i = this.A00.A02;
                A05.put(A00(0, 16, 42), append.append(i).toString());
                this.A00.A08.AB5(this.A00.A06.A25(), A05);
                W2.A00(this.A00.A07).A0E(this.A00.A0C.A8d(), this.A00.A06.A25());
                N3.A07(this.A00.A06.A21(), this.A00.A07);
                this.A00.A07.A0F().A3D();
                z = this.A00.A04;
                if (!z) {
                    AbstractC0640Nw.A02(this.A00.A06.A0t(), X0.A00(this.A00.A06.A0v()));
                }
                z2 = this.A00.A05;
                if (!z2) {
                    this.A00.A0B.A4b(this.A00.A0C.A88());
                }
            }
        }
    }
}
