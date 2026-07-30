package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class M0 implements InterfaceC3448k1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f26277a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void b(long j9, int i, int i4, int i9, C3394j1 c3394j1) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final int c(JN jn, int i, boolean z8) {
        int z9 = jn.z(this.f26277a, 0, Math.min(4096, i));
        if (z9 != -1) {
            return z9;
        }
        if (z8) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void e(TP tp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3448k1
    public final void f(Lr lr, int i, int i4) {
        lr.G(i);
    }
}
