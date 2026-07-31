package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class sn3 implements pd3 {

    /* renamed from: a, reason: collision with root package name */
    private final xg3 f11893a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11894b;

    public sn3(xg3 xg3Var, int i7) {
        this.f11893a = xg3Var;
        this.f11894b = i7;
        if (i7 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        xg3Var.a(new byte[0], i7);
    }

    @Override // com.google.android.gms.internal.ads.pd3
    public final byte[] a(byte[] bArr) {
        return this.f11893a.a(bArr, this.f11894b);
    }
}
