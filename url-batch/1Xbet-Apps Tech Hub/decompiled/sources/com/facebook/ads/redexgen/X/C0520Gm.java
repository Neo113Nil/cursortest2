package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Gm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0520Gm extends IOException {
    public final int A00;
    public final C0516Gg A01;

    public C0520Gm(IOException iOException, C0516Gg c0516Gg, int i) {
        super(iOException);
        this.A01 = c0516Gg;
        this.A00 = i;
    }

    public C0520Gm(String str, C0516Gg c0516Gg, int i) {
        super(str);
        this.A01 = c0516Gg;
        this.A00 = i;
    }

    public C0520Gm(String str, IOException iOException, C0516Gg c0516Gg, int i) {
        super(str, iOException);
        this.A01 = c0516Gg;
        this.A00 = i;
    }
}
