package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class VJ implements InterfaceC4108wE {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f28232g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f28233h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f28234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28235b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f28236c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f28237d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f28238e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f28239f;

    public VJ(RSAPublicKey rSAPublicKey, CJ cj, CJ cj2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!XC.e(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!cj.equals(cj2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        AbstractC3137eE.i(rSAPublicKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPublicKey.getPublicExponent());
        this.f28234a = rSAPublicKey;
        this.f28235b = b(cj);
        this.f28236c = c(cj, cj2, i);
        this.f28237d = bArr;
        this.f28238e = bArr2;
        this.f28239f = provider;
    }

    public static String b(CJ cj) {
        if (cj == CJ.f24160b) {
            return "SHA256withRSA/PSS";
        }
        if (cj == CJ.f24161c) {
            return "SHA384withRSA/PSS";
        }
        if (cj == CJ.f24162d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(cj)));
    }

    public static PSSParameterSpec c(CJ cj, CJ cj2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        CJ cj3 = CJ.f24160b;
        CJ cj4 = CJ.f24162d;
        CJ cj5 = CJ.f24161c;
        if (cj == cj3) {
            str = "SHA-256";
        } else if (cj == cj5) {
            str = "SHA-384";
        } else {
            if (cj != cj4) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(cj)));
            }
            str = "SHA-512";
        }
        if (cj2 == cj3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (cj2 == cj5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (cj2 != cj4) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(cj2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if ((!java.util.Objects.equals(java.lang.System.getProperty("java.vendor"), "The Android Project") ? null : java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT)).intValue() <= 23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VJ d(GJ gj) {
        Provider e6;
        int i = IG.f25546a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            e6 = null;
        }
        e6 = AbstractC2720Pd.e();
        Provider provider = e6;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = gj.f25136c;
        EJ ej = gj.f25135b;
        return new VJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ej.f24695b)), ej.f24697d, ej.f24698e, ej.f24699f, gj.f25137d.b(), ej.f24696c.equals(DJ.f24414d) ? f28233h : f28232g, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f28237d;
        if (!IG.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f28235b, this.f28239f);
        signature.initVerify(this.f28234a);
        signature.setParameter(this.f28236c);
        signature.update(bArr2);
        byte[] bArr4 = this.f28238e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
