package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0506Il implements InterfaceC0943Zo {
    public final WeakReference<C5Q> A00;

    public C0506Il(C5Q c5q) {
        this.A00 = new WeakReference<>(c5q);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
    public final void ADT(C0942Zn c0942Zn) {
        C5Q c5q = this.A00.get();
        if (c5q != null) {
            c5q.A06 = c0942Zn.A00() != null;
            c5q.A02();
        }
    }
}
