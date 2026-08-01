package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Eg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0464Eg extends AbstractC0858Ts<C1019a2> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public C0464Eg(C1019a2 c1019a2) {
        super(c1019a2);
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        YA ya;
        Handler handler;
        Runnable runnable;
        C1019a2 A07 = A07();
        if (A07 == null) {
            return;
        }
        ya = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C0645Lm.A02(ya)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}
