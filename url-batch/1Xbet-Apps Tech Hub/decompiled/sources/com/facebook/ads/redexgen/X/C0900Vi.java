package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* renamed from: com.facebook.ads.redexgen.X.Vi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0900Vi implements FK {
    public InterfaceC0402Bd A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final InterfaceC0511Gb A06;
    public int A01 = -1;
    public int A00 = 1048576;

    public C0900Vi(InterfaceC0511Gb interfaceC0511Gb) {
        this.A06 = interfaceC0511Gb;
    }

    public final C0900Vi A00(String str) {
        HI.A04(!this.A05);
        this.A04 = str;
        return this;
    }

    public final BS A01(Uri uri) {
        this.A05 = true;
        if (this.A02 == null) {
            this.A02 = new X3();
        }
        return new BS(uri, this.A06, this.A02, this.A01, this.A04, this.A00, this.A03);
    }
}
