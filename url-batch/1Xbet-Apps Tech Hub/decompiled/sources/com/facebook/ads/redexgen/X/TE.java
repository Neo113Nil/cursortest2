package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class TE extends AbstractC0763Qa {
    public final /* synthetic */ TA A00;

    public TE(TA ta) {
        this.A00 = ta;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.A07() == false) goto L6;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        boolean z;
        LN ln;
        WeakReference weakReference;
        WeakReference weakReference2;
        LN ln2;
        z = this.A00.A05;
        if (!z) {
            ln2 = this.A00.A01;
        }
        ln = this.A00.A01;
        ln.A05();
        weakReference = this.A00.A0A;
        if (weakReference.get() != null) {
            weakReference2 = this.A00.A0A;
            ((NE) weakReference2.get()).ABZ();
        }
    }
}
