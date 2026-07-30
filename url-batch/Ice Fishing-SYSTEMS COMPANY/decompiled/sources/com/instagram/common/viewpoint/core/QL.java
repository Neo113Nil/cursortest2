package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QL implements InterfaceC1364Xr {
    public int A00;
    public final InterfaceC1364Xr A01;
    public final InterfaceC1364Xr A02;

    public QL(InterfaceC1364Xr interfaceC1364Xr, int i, InterfaceC1364Xr interfaceC1364Xr2) {
        this.A01 = interfaceC1364Xr;
        this.A00 = i;
        this.A02 = interfaceC1364Xr2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1364Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1364Xr
    public final void flush() {
        this.A02.flush();
    }
}
