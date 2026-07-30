package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class K0 implements InterfaceC0943Zo {
    public final WeakReference<C01815h> A00;

    public K0(C01815h c01815h) {
        this.A00 = new WeakReference<>(c01815h);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
    public final void ADT(C0942Zn c0942Zn) {
        C01815h c01815h = this.A00.get();
        if (c01815h != null) {
            c01815h.A04 = c0942Zn.A00() != null;
            c01815h.A02();
        }
    }
}
