package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class d5 extends e5 {

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f4069g;

    public d5(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f4069g = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f4069g;
    }
}
