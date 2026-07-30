package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C1159dL c1159dL, final C0802Ua c0802Ua, final AbstractC1434hy abstractC1434hy, final InterfaceC0890Xn interfaceC0890Xn, final Z5 z5, Handler handler, Z6 z6) {
        c1159dL.A0F().AAv(z5.name().toLowerCase(Locale.US));
        return abstractC1434hy.A2F() ? new Z4(c1159dL, handler, z6, abstractC1434hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z9.A04(C1159dL.this, c0802Ua, interfaceC0890Xn, z5, r4.A25(), abstractC1434hy.A23());
            }
        }) : new ZA(c1159dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z9.A04(C1159dL.this, c0802Ua, interfaceC0890Xn, z5, r4.A25(), abstractC1434hy.A23());
            }
        });
    }

    public static ImageView A01(C1159dL c1159dL, C0802Ua c0802Ua, AbstractC1434hy abstractC1434hy, Z5 z5, InterfaceC0890Xn interfaceC0890Xn, Handler handler) {
        return A00(c1159dL, c0802Ua, abstractC1434hy, interfaceC0890Xn, z5, handler, Z6.A03);
    }

    public static void A04(C1159dL c1159dL, C0802Ua c0802Ua, InterfaceC0890Xn interfaceC0890Xn, Z5 z5, String str, N9 n9) {
        if (c0802Ua != null) {
            c0802Ua.A04(UZ.A0A, null);
        }
        c1159dL.A0F().AAu(z5.name().toLowerCase(Locale.US));
        if (O3.A00(c1159dL.A02()).A0O(c1159dL.A02(), true)) {
            interfaceC0890Xn.AAf(str, n9);
        } else {
            if (TextUtils.isEmpty(n9.A00())) {
                return;
            }
            WN.A0O(new WN(), c1159dL, WQ.A00(n9.A00()), str);
        }
    }
}
