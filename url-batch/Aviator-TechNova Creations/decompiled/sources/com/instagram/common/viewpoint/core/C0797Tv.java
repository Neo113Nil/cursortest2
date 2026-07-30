package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0797Tv implements InterfaceC0943Zo {
    public final /* synthetic */ TD A00;

    public C0797Tv(TD td) {
        this.A00 = td;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
    public final void ADT(C0942Zn c0942Zn) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC0812Uk interfaceC0812Uk;
        InterfaceC0812Uk interfaceC0812Uk2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(c0942Zn.A00() != null);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC0812Uk = this.A00.A02;
            if (interfaceC0812Uk != null) {
                interfaceC0812Uk2 = this.A00.A02;
                interfaceC0812Uk2.AEW(c0942Zn.A00() != null);
            }
        }
    }
}
