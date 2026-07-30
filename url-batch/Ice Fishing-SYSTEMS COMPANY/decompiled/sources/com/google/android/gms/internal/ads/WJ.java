package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class WJ implements InterfaceC4108wE {

    /* renamed from: a, reason: collision with root package name */
    public final C3948tG f28379a;

    public WJ(C3948tG c3948tG) {
        this.f28379a = c3948tG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f28379a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((XJ) it.next()).f28630a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
