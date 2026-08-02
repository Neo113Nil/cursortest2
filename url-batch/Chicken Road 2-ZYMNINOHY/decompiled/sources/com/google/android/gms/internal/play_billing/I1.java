package com.google.android.gms.internal.play_billing;

import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class I1 extends G1 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J1 f5857h;

    public I1(J1 j12) {
        this.f5857h = j12;
    }

    @Override // com.google.android.gms.internal.play_billing.G1
    public final String b() {
        H1 h1 = (H1) this.f5857h.f5864a.get();
        return h1 == null ? "Completer object has been garbage collected, future will fail soon" : AbstractC1514c.a("tag=[", String.valueOf(h1.f5851a), "]");
    }
}
