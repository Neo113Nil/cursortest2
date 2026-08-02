package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0917Yu implements View.OnClickListener {
    public static String[] A03 = {"qTn7FHoQ", "BapBypyKyXgi02nUaikHNoU7eY2sLlHG", "hAbogJy7", "1kKCdLvWKNxoPSiH", "Xjk6qTkQoY8vuVUP", "RHy2P55wnjv0LaFNgRpD8dXF", "4s2GzZI6q8xqZAbl0Skgz3P6Lr2GKXBU", "B9Ul8cdGX1dUct8fF9ORVNarLvr0UfHM"};
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C0904Yh A01;
    public final /* synthetic */ C0918Yv A02;

    public ViewOnClickListenerC0917Yu(C0918Yv c0918Yv, C0904Yh c0904Yh, O6 o6) {
        this.A02 = c0918Yv;
        this.A01 = c0904Yh;
        this.A00 = o6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0902Yf interfaceC0902Yf;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC0902Yf = this.A02.A02;
            interfaceC0902Yf.AEP(this.A00);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
            String[] strArr = A03;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[3] = "Wxfvm9MNAlg6MGh9";
            strArr2[4] = "9MWDJcBk5PnwUytH";
        }
    }
}
