package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class PJ implements InterfaceC4108wE {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f26899f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26900a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f26901b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f26902c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicKey f26903d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f26904e;

    public /* synthetic */ PJ(RSAPublicKey rSAPublicKey, EnumC3413jK enumC3413jK, byte[] bArr, byte[] bArr2) {
        if (JF.a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        AbstractC3137eE.f(enumC3413jK);
        AbstractC3137eE.i(rSAPublicKey.getModulus().bitLength());
        AbstractC3137eE.k(rSAPublicKey.getPublicExponent());
        this.f26903d = rSAPublicKey;
        this.f26904e = enumC3413jK;
        this.f26901b = bArr;
        this.f26902c = bArr2;
    }

    public static PJ b(C3736pJ c3736pJ) {
        Provider e6 = AbstractC2720Pd.e();
        if (e6 == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (XC.e(1)) {
            return new PJ(c3736pJ.f33377c.b(), c3736pJ.f33378d.b(), c3736pJ.f33376b.f32677a.equals(C3520lJ.f32562d) ? new byte[]{0} : new byte[0], e6);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4108wE
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f26900a) {
            case 0:
                byte[] bArr3 = this.f26901b;
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    throw new GeneralSecurityException("Invalid signature length: 64");
                }
                if (!IG.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                }
                Signature signature = Signature.getInstance("Ed25519", (Provider) this.f26904e);
                signature.initVerify(this.f26903d);
                signature.update(bArr2);
                signature.update(this.f26902c);
                try {
                    if (signature.verify(bArr, length, 64)) {
                        return;
                    }
                } catch (RuntimeException unused) {
                }
                throw new GeneralSecurityException("Signature check failed.");
            default:
                byte[] bArr4 = this.f26901b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else {
                    if (!IG.c(bArr4, bArr)) {
                        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
                    }
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) {
        byte[] e6;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f26903d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] i4 = AbstractC4161xD.i(bigInteger.modPow(publicExponent, modulus), bitLength);
        EnumC3413jK enumC3413jK = (EnumC3413jK) this.f26904e;
        AbstractC3137eE.f(enumC3413jK);
        MessageDigest messageDigest = (MessageDigest) C3253gK.f30984e.f30987a.d(YD.f(enumC3413jK));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f26902c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] digest = messageDigest.digest();
        int ordinal = enumC3413jK.ordinal();
        int i9 = 2;
        if (ordinal == 2) {
            e6 = AbstractC4161xD.e("3031300d060960864801650304020105000420");
        } else if (ordinal == 3) {
            e6 = AbstractC4161xD.e("3041300d060960864801650304020205000430");
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(enumC3413jK.toString()));
            }
            e6 = AbstractC4161xD.e("3051300d060960864801650304020305000440");
        }
        if (bitLength < e6.length + digest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[bitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i10 = 0;
        while (true) {
            i = i9 + 1;
            if (i10 >= (bitLength - r5) - 3) {
                break;
            }
            bArr4[i9] = -1;
            i10++;
            i9 = i;
        }
        bArr4[i9] = 0;
        int length = e6.length;
        System.arraycopy(e6, 0, bArr4, i, length);
        System.arraycopy(digest, 0, bArr4, i + length, digest.length);
        if (!MessageDigest.isEqual(i4, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    public PJ(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (XC.e(1)) {
            if (bArr.length == 32) {
                this.f26903d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(XC.f(f26899f, bArr)));
                this.f26901b = bArr2;
                this.f26902c = bArr3;
                this.f26904e = provider;
                return;
            }
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
