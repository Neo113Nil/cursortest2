package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1364Xr {
    public int A00;
    public final InterfaceC1364Xr A01;

    public QI(InterfaceC1364Xr interfaceC1364Xr, int i) {
        this.A01 = interfaceC1364Xr;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1364Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1364Xr
    public final void flush() {
        this.A01.flush();
    }
}
