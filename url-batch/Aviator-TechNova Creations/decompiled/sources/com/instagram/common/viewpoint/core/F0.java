package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public class F0 implements R6 {
    public final /* synthetic */ R0 A00;
    public final /* synthetic */ C01383q A01;

    public F0(C01383q c01383q, R0 r0) {
        this.A01 = c01383q;
        this.A00 = r0;
    }

    @Override // com.instagram.common.viewpoint.core.R6
    public final boolean AAA() {
        boolean A0c;
        boolean A0d;
        if (!this.A01.A0b()) {
            A0c = this.A01.A0c();
            if (A0c) {
                return true;
            }
            A0d = this.A01.A0d();
            return A0d;
        }
        this.A01.A0a(this.A00);
        return true;
    }
}
