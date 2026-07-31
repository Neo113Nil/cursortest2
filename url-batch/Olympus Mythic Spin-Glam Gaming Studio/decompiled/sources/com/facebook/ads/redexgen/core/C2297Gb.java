package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2297Gb implements InterfaceC2874b8 {
    public final /* synthetic */ C20274x A00;

    public C2297Gb(C20274x c20274x) {
        this.A00 = c20274x;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2874b8
    public final void AE7(C2873b7 c2873b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c2873b7.A00() != null);
        this.A00.A06();
    }
}
