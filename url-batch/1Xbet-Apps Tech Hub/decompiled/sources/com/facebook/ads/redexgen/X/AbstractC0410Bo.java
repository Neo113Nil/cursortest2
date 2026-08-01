package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Bo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0410Bo {
    public final InterfaceC0409Bm A00;

    public abstract void A0B(C0541Hh c0541Hh, long j) throws C03519d;

    public abstract boolean A0C(C0541Hh c0541Hh) throws C03519d;

    public AbstractC0410Bo(InterfaceC0409Bm interfaceC0409Bm) {
        this.A00 = interfaceC0409Bm;
    }

    public final void A00(C0541Hh c0541Hh, long j) throws C03519d {
        if (A0C(c0541Hh)) {
            A0B(c0541Hh, j);
        }
    }
}
