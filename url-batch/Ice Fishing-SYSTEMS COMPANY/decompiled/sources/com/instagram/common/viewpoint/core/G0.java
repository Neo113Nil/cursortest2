package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class G0 implements InterfaceC1602cr {
    public final /* synthetic */ C0915Fy A00;

    public G0(C0915Fy c0915Fy) {
        this.A00 = c0915Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1602cr
    public final void AGM(int i) {
        boolean A0H;
        this.A00.A0C(i, true);
        A0H = this.A00.A0H();
        if (A0H) {
            this.A00.A07();
        } else {
            this.A00.A09(i);
        }
    }
}
