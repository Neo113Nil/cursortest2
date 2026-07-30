package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class TJ implements InterfaceC4108wE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f27730f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27731g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f27732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27733b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f27734c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f27735d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f27736e;

    public TJ(RSAPublicKey rSAPublicKey, C4005uJ c4005uJ, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        AbstractC3137eE.i(rSAPublicKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPublicKey.getPublicExponent());
        this.f27732a = rSAPublicKey;
        this.f27733b = b(c4005uJ);
        this.f27734c = bArr;
        this.f27735d = bArr2;
        this.f27736e = provider;
    }

    public static String b(C4005uJ c4005uJ) {
        if (c4005uJ == C4005uJ.f34578b) {
            return "SHA256withRSA";
        }
        if (c4005uJ == C4005uJ.f34579c) {
            return "SHA384withRSA";
        }
        if (c4005uJ == C4005uJ.f34580d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static TJ c(C4221yJ c4221yJ, Provider provider) {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = c4221yJ.f35338c;
        C4113wJ c4113wJ = c4221yJ.f35337b;
        return new TJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c4113wJ.f34971b)), c4113wJ.f34973d, c4221yJ.f35339d.b(), c4113wJ.f34972c.equals(C4059vJ.f34750d) ? f27731g : f27730f, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f27734c;
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f27733b, this.f27736e);
        signature.initVerify(this.f27732a);
        signature.update(bArr2);
        byte[] bArr4 = this.f27735d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
