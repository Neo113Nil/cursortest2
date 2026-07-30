package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class YJ {

    /* renamed from: d, reason: collision with root package name */
    public static final H7.b f28816d = new H7.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f28817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28818b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28819c;

    public YJ(byte[] bArr, int i) {
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3137eE.c(bArr.length);
        this.f28817a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f28816d.get()).getBlockSize();
        this.f28819c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f28818b = i;
    }
}
