package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0886Xj implements View.OnClickListener {
    public final /* synthetic */ N9 A00;
    public final /* synthetic */ C0802Ua A01;
    public final /* synthetic */ C0887Xk A02;
    public final /* synthetic */ InterfaceC0890Xn A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC0886Xj(C0887Xk c0887Xk, C0802Ua c0802Ua, InterfaceC0890Xn interfaceC0890Xn, String str, N9 n9) {
        this.A02 = c0887Xk;
        this.A01 = c0802Ua;
        this.A03 = interfaceC0890Xn;
        this.A04 = str;
        this.A00 = n9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O2 o2;
        C1159dL c1159dL;
        C1159dL c1159dL2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A04(UZ.A0A, null);
            o2 = this.A02.A02;
            c1159dL = this.A02.A03;
            if (o2.A0O(c1159dL.A02(), true)) {
                this.A03.AAf(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                WN wn = new WN();
                c1159dL2 = this.A02.A03;
                WN.A0O(wn, c1159dL2, WQ.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
