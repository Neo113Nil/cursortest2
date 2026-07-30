package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C3I extends DG {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ D9 A00;

    public C3I(D9 d9) {
        this.A00 = d9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0782Tf
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(DH dh) {
        E1 e1;
        boolean z;
        Handler handler;
        boolean A0G;
        boolean z2;
        Handler handler2;
        int i;
        e1 = this.A00.A01;
        if (e1 == null) {
            return;
        }
        z = this.A00.A05;
        if (!z && dh.A00().getAction() == 0) {
            D9 d9 = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = d9.A07;
            handler.removeCallbacksAndMessages(null);
            A0G = this.A00.A0G(EnumC1200e1.A04);
            if (A0G) {
                this.A00.A03();
                D9 d92 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    d92.A06(true, false);
                } else {
                    d92.A06(true, false);
                }
            }
            z2 = this.A00.A04;
            if (!z2) {
                return;
            }
            handler2 = this.A00.A07;
            DA da = new DA(this);
            i = this.A00.A00;
            handler2.postDelayed(da, i);
        }
    }
}
