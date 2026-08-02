package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public abstract class Z9 {
    public static ImageView A00(final C1153dL c1153dL, final C0796Ua c0796Ua, final AbstractC1428hy abstractC1428hy, final InterfaceC0884Xn interfaceC0884Xn, final Z5 z5, Handler handler, Z6 z6) {
        c1153dL.A0F().AAv(z5.name().toLowerCase(Locale.US));
        return abstractC1428hy.A2F() ? new Z4(c1153dL, handler, z6, abstractC1428hy.A1y(), new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z9.A04(C1153dL.this, c0796Ua, interfaceC0884Xn, z5, r4.A25(), abstractC1428hy.A23());
            }
        }) : new ZA(c1153dL, new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Z9.A04(C1153dL.this, c0796Ua, interfaceC0884Xn, z5, r4.A25(), abstractC1428hy.A23());
            }
        });
    }

    public static ImageView A01(C1153dL c1153dL, C0796Ua c0796Ua, AbstractC1428hy abstractC1428hy, Z5 z5, InterfaceC0884Xn interfaceC0884Xn, Handler handler) {
        return A00(c1153dL, c0796Ua, abstractC1428hy, interfaceC0884Xn, z5, handler, Z6.A03);
    }

    public static void A04(C1153dL c1153dL, C0796Ua c0796Ua, InterfaceC0884Xn interfaceC0884Xn, Z5 z5, String str, N9 n9) {
        if (c0796Ua != null) {
            c0796Ua.A04(UZ.A0A, null);
        }
        c1153dL.A0F().AAu(z5.name().toLowerCase(Locale.US));
        if (O3.A00(c1153dL.A02()).A0O(c1153dL.A02(), true)) {
            interfaceC0884Xn.AAf(str, n9);
        } else {
            if (TextUtils.isEmpty(n9.A00())) {
                return;
            }
            WN.A0O(new WN(), c1153dL, WQ.A00(n9.A00()), str);
        }
    }
}
