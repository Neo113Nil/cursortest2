package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Lr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0590Lr implements InterfaceC0970aH {
    public final /* synthetic */ C0575Lc A00;

    public C0590Lr(C0575Lc c0575Lc) {
        this.A00 = c0575Lc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0970aH
    public final void ACI() {
        boolean A0V;
        A0V = this.A00.A0V();
        if (A0V) {
            this.A00.A0L();
            this.A00.A0a.setToolbarActionMessage("");
            this.A00.A0a.setToolbarActionMode(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0970aH
    public final void AE7() {
        C0856Wd c0856Wd;
        this.A00.A0F = false;
        c0856Wd = this.A00.A0O;
        c0856Wd.A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0970aH
    public final void AE8() {
        C0856Wd c0856Wd;
        this.A00.A0F = true;
        c0856Wd = this.A00.A0O;
        c0856Wd.A06();
    }
}
