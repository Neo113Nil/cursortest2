package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Jf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2378Jf implements InterfaceC2874b8 {
    public final WeakReference<AnonymousClass67> A00;

    public C2378Jf(AnonymousClass67 anonymousClass67) {
        this.A00 = new WeakReference<>(anonymousClass67);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2874b8
    public final void AE7(C2873b7 c2873b7) {
        AnonymousClass67 anonymousClass67 = this.A00.get();
        if (anonymousClass67 != null) {
            anonymousClass67.A06 = c2873b7.A00() != null;
            anonymousClass67.A02();
        }
    }
}
