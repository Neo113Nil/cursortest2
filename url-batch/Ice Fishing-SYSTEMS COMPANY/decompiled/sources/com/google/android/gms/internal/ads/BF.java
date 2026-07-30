package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class BF implements InterfaceC3569mE {

    /* renamed from: a, reason: collision with root package name */
    public final C3948tG f24011a;

    @Override // com.google.android.gms.internal.ads.InterfaceC3569mE
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f24011a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((AF) it.next()).f23844a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
