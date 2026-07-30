package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Oy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0672Oy implements X5 {
    public int A00;
    public final X5 A01;
    public final X5 A02;

    public C0672Oy(X5 x5, int i, X5 x52) {
        this.A01 = x5;
        this.A00 = i;
        this.A02 = x52;
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void AGO(String str) {
        if (this.A00 > 0) {
            this.A01.AGO(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AGO(str);
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void flush() {
        this.A02.flush();
    }
}
