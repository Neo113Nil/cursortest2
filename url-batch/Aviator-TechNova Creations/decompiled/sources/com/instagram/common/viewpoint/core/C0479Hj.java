package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Hj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0479Hj implements InterfaceC0943Zo {
    public final /* synthetic */ AnonymousClass50 A00;

    public C0479Hj(AnonymousClass50 anonymousClass50) {
        this.A00 = anonymousClass50;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
    public final void ADT(C0942Zn c0942Zn) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c0942Zn.A00() != null);
        this.A00.A07();
    }
}
