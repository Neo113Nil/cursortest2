package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Z3 implements InterfaceC02534x {
    public final /* synthetic */ AbstractC02334c A00;

    public Z3(AbstractC02334c abstractC02334c) {
        this.A00 = abstractC02334c;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02534x
    public final View A6H(int i) {
        return this.A00.A0t(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02534x
    public final int A6J(View view) {
        return this.A00.A0j(view) + ((C02344d) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02534x
    public final int A6K(View view) {
        return this.A00.A0o(view) - ((C02344d) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02534x
    public final int A7S() {
        return this.A00.A0X() - this.A00.A0d();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02534x
    public final int A7T() {
        return this.A00.A0g();
    }
}
