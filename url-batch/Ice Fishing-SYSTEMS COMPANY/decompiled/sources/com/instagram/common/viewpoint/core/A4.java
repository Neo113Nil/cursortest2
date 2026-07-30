package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC06103l {
    public final C07669y A00;
    public final C2277oJ A01;
    public final InterfaceC06093k[] A02;

    public A4(InterfaceC06093k... interfaceC06093kArr) {
        this(interfaceC06093kArr, new C07669y(), new C2277oJ());
    }

    public A4(InterfaceC06093k[] interfaceC06093kArr, C07669y c07669y, C2277oJ c2277oJ) {
        this.A02 = new InterfaceC06093k[interfaceC06093kArr.length + 2];
        System.arraycopy(interfaceC06093kArr, 0, this.A02, 0, interfaceC06093kArr.length);
        this.A00 = c07669y;
        this.A01 = c2277oJ;
        this.A02[interfaceC06093kArr.length] = c07669y;
        this.A02[interfaceC06093kArr.length + 1] = c2277oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103l
    public final C2378px A4F(C2378px c2378px) {
        this.A01.A02(c2378px.A01);
        this.A01.A01(c2378px.A00);
        return c2378px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103l
    public final boolean A4G(boolean z8) {
        this.A00.A0D(z8);
        return z8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103l
    public final InterfaceC06093k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103l
    public final long A8U(long j9) {
        return this.A01.A00(j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC06103l
    public final long A98() {
        return this.A00.A0C();
    }
}
