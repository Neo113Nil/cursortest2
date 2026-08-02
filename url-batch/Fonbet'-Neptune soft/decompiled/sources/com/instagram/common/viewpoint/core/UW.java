package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UW implements InterfaceC1165dX {
    public final /* synthetic */ TD A00;

    public UW(TD td) {
        this.A00 = td;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1165dX
    public final void AFj() {
        AtomicBoolean atomicBoolean;
        InterfaceC0806Uk interfaceC0806Uk;
        InterfaceC0806Uk interfaceC0806Uk2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0E;
        atomicBoolean.set(true);
        interfaceC0806Uk = this.A00.A02;
        if (interfaceC0806Uk != null) {
            interfaceC0806Uk2 = this.A00.A02;
            atomicBoolean2 = this.A00.A0D;
            interfaceC0806Uk2.AEW(atomicBoolean2.get());
        }
    }
}
