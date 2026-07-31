package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2267Ew {
    public InterfaceC2266Ev A00;
    public F6 A01;

    public abstract boolean A0Y();

    public abstract C2268Ex A0b(InterfaceC20977p[] interfaceC20977pArr, C3608nW c3608nW, C3626no c3626no, Timeline timeline) throws AD;

    public abstract void A0c(Object obj);

    public final F6 A00() {
        return (F6) AbstractC20023y.A02(this.A01);
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.AGD();
        }
    }

    public final void A02(InterfaceC2266Ev interfaceC2266Ev, F6 f6) {
        this.A00 = interfaceC2266Ev;
        this.A01 = f6;
    }
}
