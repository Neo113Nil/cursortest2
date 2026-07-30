package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0567Ku extends AbstractC1231eW {
    public final /* synthetic */ C0555Ki A00;

    public C0567Ku(C0555Ki c0555Ki) {
        this.A00 = c0555Ki;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.A07() == false) goto L6;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1231eW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        boolean z;
        XH xh;
        WeakReference weakReference;
        WeakReference weakReference2;
        XH xh2;
        z = this.A00.A05;
        if (!z) {
            xh2 = this.A00.A01;
        }
        xh = this.A00.A01;
        xh.A05();
        weakReference = this.A00.A0A;
        if (weakReference.get() != null) {
            weakReference2 = this.A00.A0A;
            ((InterfaceC0936Zh) weakReference2.get()).ADW();
        }
    }
}
