package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC19893l {
    public final C21459y A00;
    public final C3656oJ A01;
    public final InterfaceC19883k[] A02;

    public A4(InterfaceC19883k... interfaceC19883kArr) {
        this(interfaceC19883kArr, new C21459y(), new C3656oJ());
    }

    public A4(InterfaceC19883k[] interfaceC19883kArr, C21459y c21459y, C3656oJ c3656oJ) {
        this.A02 = new InterfaceC19883k[interfaceC19883kArr.length + 2];
        System.arraycopy(interfaceC19883kArr, 0, this.A02, 0, interfaceC19883kArr.length);
        this.A00 = c21459y;
        this.A01 = c3656oJ;
        this.A02[interfaceC19883kArr.length] = c21459y;
        this.A02[interfaceC19883kArr.length + 1] = c3656oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19893l
    public final C3757px A4F(C3757px c3757px) {
        this.A01.A02(c3757px.A01);
        this.A01.A01(c3757px.A00);
        return c3757px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19893l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19893l
    public final InterfaceC19883k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19893l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC19893l
    public final long A98() {
        return this.A00.A0C();
    }
}
