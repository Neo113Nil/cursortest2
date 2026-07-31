package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2342Hu {
    public final InterfaceC2325Hd A00;

    public abstract boolean A0B(C20254v c20254v) throws C3K;

    public abstract boolean A0C(C20254v c20254v, long j) throws C3K;

    public AbstractC2342Hu(InterfaceC2325Hd interfaceC2325Hd) {
        this.A00 = interfaceC2325Hd;
    }

    public final boolean A00(C20254v c20254v, long j) throws C3K {
        return A0B(c20254v) && A0C(c20254v, j);
    }
}
