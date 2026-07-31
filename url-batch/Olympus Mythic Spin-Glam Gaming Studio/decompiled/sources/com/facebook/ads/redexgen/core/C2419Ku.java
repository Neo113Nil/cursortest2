package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2419Ku implements YI {
    public final /* synthetic */ C2893bR A00;

    public C2419Ku(C2893bR c2893bR) {
        this.A00 = c2893bR;
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AFx() {
        boolean z;
        ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr;
        z = this.A00.A09;
        if (!z) {
            return;
        }
        viewOnClickListenerC2416Kr = this.A00.A08;
        viewOnClickListenerC2416Kr.performClick();
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
