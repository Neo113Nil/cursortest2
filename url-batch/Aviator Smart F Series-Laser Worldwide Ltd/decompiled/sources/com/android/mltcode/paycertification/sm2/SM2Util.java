package com.android.mltcode.paycertification.sm2;

import androidx.annotation.Keep;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.v;
import org.bouncycastle.crypto.c;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.crypto.params.m;
import org.bouncycastle.crypto.signers.d;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.math.ec.custom.gm.a;
import org.bouncycastle.math.ec.i;
import x.f;
import x.j;

@Keep
/* loaded from: classes.dex */
public class SM2Util extends f {
    public static final a CURVE;
    public static final int CURVE_LEN;
    public static final org.bouncycastle.crypto.params.f DOMAIN_PARAMS;
    public static final i G_POINT;
    public static final EllipticCurve JDK_CURVE;
    public static final ECParameterSpec JDK_EC_SPEC;
    public static final ECPoint JDK_G_POINT;
    public static final BigInteger SM2_ECC_A;
    public static final BigInteger SM2_ECC_B;
    public static final BigInteger SM2_ECC_GX;
    public static final BigInteger SM2_ECC_GY;
    public static final BigInteger SM2_ECC_H;
    public static final BigInteger SM2_ECC_N;
    public static final BigInteger SM2_ECC_P;
    public static final int SM3_DIGEST_LENGTH = 32;

    static {
        a aVar = new a();
        CURVE = aVar;
        BigInteger q8 = aVar.getQ();
        SM2_ECC_P = q8;
        BigInteger bigInteger = aVar.getA().toBigInteger();
        SM2_ECC_A = bigInteger;
        BigInteger bigInteger2 = aVar.getB().toBigInteger();
        SM2_ECC_B = bigInteger2;
        BigInteger order = aVar.getOrder();
        SM2_ECC_N = order;
        BigInteger cofactor = aVar.getCofactor();
        SM2_ECC_H = cofactor;
        BigInteger bigInteger3 = new BigInteger("32C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7", 16);
        SM2_ECC_GX = bigInteger3;
        BigInteger bigInteger4 = new BigInteger("BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0", 16);
        SM2_ECC_GY = bigInteger4;
        i createPoint = aVar.createPoint(bigInteger3, bigInteger4);
        G_POINT = createPoint;
        org.bouncycastle.crypto.params.f fVar = new org.bouncycastle.crypto.params.f(aVar, createPoint, order, cofactor);
        DOMAIN_PARAMS = fVar;
        CURVE_LEN = BCECUtil.getCurveLength(fVar);
        EllipticCurve ellipticCurve = new EllipticCurve(new ECFieldFp(q8), bigInteger, bigInteger2);
        JDK_CURVE = ellipticCurve;
        ECPoint eCPoint = new ECPoint(createPoint.getAffineXCoord().toBigInteger(), createPoint.getAffineYCoord().toBigInteger());
        JDK_G_POINT = eCPoint;
        JDK_EC_SPEC = new ECParameterSpec(ellipticCurve, eCPoint, order, cofactor.intValue());
    }

    public static byte[] decodeDERSM2Cipher(byte[] bArr) {
        return decodeDERSM2Cipher(SM2Engine.Mode.C1C3C2, bArr);
    }

    public static byte[] decodeDERSM2Sign(byte[] bArr) {
        v vVar = v.getInstance(bArr);
        byte[] byteArray = ((l) vVar.getObjectAt(0)).getValue().toByteArray();
        byte[] byteArray2 = ((l) vVar.getObjectAt(1)).getValue().toByteArray();
        byte[] fixToCurveLengthBytes = fixToCurveLengthBytes(byteArray);
        byte[] fixToCurveLengthBytes2 = fixToCurveLengthBytes(byteArray2);
        byte[] bArr2 = new byte[fixToCurveLengthBytes.length + fixToCurveLengthBytes2.length];
        System.arraycopy(fixToCurveLengthBytes, 0, bArr2, 0, fixToCurveLengthBytes.length);
        System.arraycopy(fixToCurveLengthBytes2, 0, bArr2, fixToCurveLengthBytes.length, fixToCurveLengthBytes2.length);
        return bArr2;
    }

    public static byte[] decrypt(BCECPrivateKey bCECPrivateKey, byte[] bArr) {
        return decrypt(SM2Engine.Mode.C1C3C2, BCECUtil.convertPrivateKeyToParameters(bCECPrivateKey), bArr);
    }

    public static byte[] encodeSM2CipherToDER(byte[] bArr) {
        return encodeSM2CipherToDER(SM2Engine.Mode.C1C3C2, BCECUtil.getCurveLength(DOMAIN_PARAMS), 32, bArr);
    }

    public static byte[] encodeSM2SignToDER(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, extractBytes(bArr, 0, 32));
        BigInteger bigInteger2 = new BigInteger(1, extractBytes(bArr, 32, 32));
        g gVar = new g();
        gVar.add(new l(bigInteger));
        gVar.add(new l(bigInteger2));
        return new g1(gVar).getEncoded("DER");
    }

    public static byte[] encrypt(BCECPublicKey bCECPublicKey, byte[] bArr) {
        return encrypt(SM2Engine.Mode.C1C3C2, BCECUtil.convertPublicKeyToParameters(bCECPublicKey), bArr);
    }

    private static byte[] extractBytes(byte[] bArr, int i8, int i9) {
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return bArr2;
    }

    private static byte[] fixToCurveLengthBytes(byte[] bArr) {
        int length = bArr.length;
        int i8 = CURVE_LEN;
        if (length == i8) {
            return bArr;
        }
        byte[] bArr2 = new byte[i8];
        if (bArr.length > i8) {
            System.arraycopy(bArr, bArr.length - i8, bArr2, 0, i8);
        } else {
            System.arraycopy(bArr, 0, bArr2, i8 - bArr.length, bArr.length);
        }
        return bArr2;
    }

    public static KeyPair generateKeyPair() {
        return BCECUtil.generateKeyPair(DOMAIN_PARAMS, new SecureRandom());
    }

    public static org.bouncycastle.crypto.a generateKeyPairParameter() {
        return BCECUtil.generateKeyPairParameter(DOMAIN_PARAMS, new SecureRandom());
    }

    public static byte[] getRawPrivateKey(BCECPrivateKey bCECPrivateKey) {
        return fixToCurveLengthBytes(bCECPrivateKey.getD().toByteArray());
    }

    public static byte[] getRawPublicKey(BCECPublicKey bCECPublicKey) {
        byte[] encoded = bCECPublicKey.getQ().getEncoded(false);
        int i8 = CURVE_LEN * 2;
        byte[] bArr = new byte[i8];
        System.arraycopy(encoded, 1, bArr, 0, i8);
        return bArr;
    }

    public static j parseSM2Cipher(byte[] bArr) {
        return parseSM2Cipher(SM2Engine.Mode.C1C3C2, BCECUtil.getCurveLength(DOMAIN_PARAMS), 32, bArr);
    }

    public static byte[] sign(BCECPrivateKey bCECPrivateKey, byte[] bArr) {
        return sign(BCECUtil.convertPrivateKeyToParameters(bCECPrivateKey), (byte[]) null, bArr);
    }

    public static boolean verify(BCECPublicKey bCECPublicKey, byte[] bArr, byte[] bArr2) {
        return verify(BCECUtil.convertPublicKeyToParameters(bCECPublicKey), (byte[]) null, bArr, bArr2);
    }

    public static byte[] decodeDERSM2Cipher(SM2Engine.Mode mode, byte[] bArr) {
        byte[] octets;
        byte[] bArr2;
        v vVar = v.getInstance(bArr);
        byte[] byteArray = ((l) vVar.getObjectAt(0)).getValue().toByteArray();
        byte[] byteArray2 = ((l) vVar.getObjectAt(1)).getValue().toByteArray();
        byte[] fixToCurveLengthBytes = fixToCurveLengthBytes(byteArray);
        byte[] fixToCurveLengthBytes2 = fixToCurveLengthBytes(byteArray2);
        SM2Engine.Mode mode2 = SM2Engine.Mode.C1C2C3;
        if (mode == mode2) {
            octets = ((c1) vVar.getObjectAt(2)).getOctets();
            bArr2 = ((c1) vVar.getObjectAt(3)).getOctets();
        } else {
            if (mode != SM2Engine.Mode.C1C3C2) {
                throw new Exception("Unsupported mode:" + mode);
            }
            byte[] octets2 = ((c1) vVar.getObjectAt(2)).getOctets();
            octets = ((c1) vVar.getObjectAt(3)).getOctets();
            bArr2 = octets2;
        }
        byte[] bArr3 = new byte[fixToCurveLengthBytes.length + 1 + fixToCurveLengthBytes2.length + octets.length + bArr2.length];
        bArr3[0] = 4;
        System.arraycopy(fixToCurveLengthBytes, 0, bArr3, 1, fixToCurveLengthBytes.length);
        int length = fixToCurveLengthBytes.length + 1;
        System.arraycopy(fixToCurveLengthBytes2, 0, bArr3, length, fixToCurveLengthBytes2.length);
        int length2 = length + fixToCurveLengthBytes2.length;
        if (mode == mode2) {
            System.arraycopy(octets, 0, bArr3, length2, octets.length);
            System.arraycopy(bArr2, 0, bArr3, length2 + octets.length, bArr2.length);
        } else if (mode == SM2Engine.Mode.C1C3C2) {
            System.arraycopy(bArr2, 0, bArr3, length2, bArr2.length);
            System.arraycopy(octets, 0, bArr3, length2 + bArr2.length, octets.length);
        }
        return bArr3;
    }

    public static byte[] getRawPrivateKey(BigInteger bigInteger) {
        return fixToCurveLengthBytes(bigInteger.toByteArray());
    }

    public static byte[] decrypt(SM2Engine.Mode mode, BCECPrivateKey bCECPrivateKey, byte[] bArr) {
        return decrypt(mode, BCECUtil.convertPrivateKeyToParameters(bCECPrivateKey), bArr);
    }

    public static byte[] encodeSM2CipherToDER(SM2Engine.Mode mode, byte[] bArr) {
        return encodeSM2CipherToDER(mode, BCECUtil.getCurveLength(DOMAIN_PARAMS), 32, bArr);
    }

    public static byte[] encrypt(SM2Engine.Mode mode, BCECPublicKey bCECPublicKey, byte[] bArr) {
        return encrypt(mode, BCECUtil.convertPublicKeyToParameters(bCECPublicKey), bArr);
    }

    public static j parseSM2Cipher(SM2Engine.Mode mode, byte[] bArr) {
        return parseSM2Cipher(mode, BCECUtil.getCurveLength(DOMAIN_PARAMS), 32, bArr);
    }

    public static byte[] sign(org.bouncycastle.crypto.params.j jVar, byte[] bArr) {
        return sign(jVar, (byte[]) null, bArr);
    }

    public static boolean verify(k kVar, byte[] bArr, byte[] bArr2) {
        return verify(kVar, (byte[]) null, bArr, bArr2);
    }

    public static byte[] getRawPublicKey(i iVar) {
        byte[] encoded = iVar.getEncoded(false);
        int i8 = CURVE_LEN * 2;
        byte[] bArr = new byte[i8];
        System.arraycopy(encoded, 1, bArr, 0, i8);
        return bArr;
    }

    public static byte[] sign(BCECPrivateKey bCECPrivateKey, byte[] bArr, byte[] bArr2) {
        return sign(BCECUtil.convertPrivateKeyToParameters(bCECPrivateKey), bArr, bArr2);
    }

    public static boolean verify(BCECPublicKey bCECPublicKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return verify(BCECUtil.convertPublicKeyToParameters(bCECPublicKey), bArr, bArr2, bArr3);
    }

    public static byte[] decrypt(org.bouncycastle.crypto.params.j jVar, byte[] bArr) {
        return decrypt(SM2Engine.Mode.C1C3C2, jVar, bArr);
    }

    public static byte[] encodeSM2CipherToDER(int i8, int i9, byte[] bArr) {
        return encodeSM2CipherToDER(SM2Engine.Mode.C1C3C2, i8, i9, bArr);
    }

    public static byte[] encrypt(k kVar, byte[] bArr) {
        return encrypt(SM2Engine.Mode.C1C3C2, kVar, bArr);
    }

    public static j parseSM2Cipher(int i8, int i9, byte[] bArr) {
        return parseSM2Cipher(SM2Engine.Mode.C1C3C2, i8, i9, bArr);
    }

    public static byte[] decrypt(SM2Engine.Mode mode, org.bouncycastle.crypto.params.j jVar, byte[] bArr) {
        SM2Engine sM2Engine = new SM2Engine(mode);
        sM2Engine.init(false, jVar);
        return sM2Engine.processBlock(bArr, 0, bArr.length);
    }

    public static byte[] encodeSM2CipherToDER(SM2Engine.Mode mode, int i8, int i9, byte[] bArr) {
        byte[] bArr2 = new byte[i8];
        byte[] bArr3 = new byte[i8];
        int length = (((bArr.length - i8) - i8) - 1) - i9;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[i9];
        System.arraycopy(bArr, 1, bArr2, 0, i8);
        int i10 = i8 + 1;
        System.arraycopy(bArr, i10, bArr3, 0, i8);
        int i11 = i10 + i8;
        SM2Engine.Mode mode2 = SM2Engine.Mode.C1C2C3;
        if (mode == mode2) {
            System.arraycopy(bArr, i11, bArr4, 0, length);
            System.arraycopy(bArr, i11 + length, bArr5, 0, i9);
        } else if (mode == SM2Engine.Mode.C1C3C2) {
            System.arraycopy(bArr, i11, bArr5, 0, i9);
            System.arraycopy(bArr, i11 + i9, bArr4, 0, length);
        } else {
            throw new Exception("Unsupported mode:" + mode);
        }
        org.bouncycastle.asn1.f[] fVarArr = new org.bouncycastle.asn1.f[4];
        fVarArr[0] = new l(new BigInteger(1, bArr2));
        fVarArr[1] = new l(new BigInteger(1, bArr3));
        if (mode == mode2) {
            fVarArr[2] = new c1(bArr4);
            fVarArr[3] = new c1(bArr5);
        } else if (mode == SM2Engine.Mode.C1C3C2) {
            fVarArr[2] = new c1(bArr5);
            fVarArr[3] = new c1(bArr4);
        }
        return new g1(fVarArr).getEncoded("DER");
    }

    public static byte[] encrypt(SM2Engine.Mode mode, k kVar, byte[] bArr) {
        SM2Engine sM2Engine = new SM2Engine(mode);
        sM2Engine.init(true, new m(kVar, new SecureRandom()));
        return sM2Engine.processBlock(bArr, 0, bArr.length);
    }

    public static j parseSM2Cipher(SM2Engine.Mode mode, int i8, int i9, byte[] bArr) {
        int i10 = (i8 * 2) + 1;
        byte[] bArr2 = new byte[i10];
        int length = (bArr.length - i10) - i9;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[i9];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        if (mode == SM2Engine.Mode.C1C2C3) {
            System.arraycopy(bArr, i10, bArr3, 0, length);
            System.arraycopy(bArr, i10 + length, bArr4, 0, i9);
        } else if (mode == SM2Engine.Mode.C1C3C2) {
            System.arraycopy(bArr, i10, bArr4, 0, i9);
            System.arraycopy(bArr, i10 + i9, bArr3, 0, length);
        } else {
            throw new Exception("Unsupported mode:" + mode);
        }
        j jVar = new j();
        jVar.a(bArr2);
        jVar.b(bArr3);
        jVar.c(bArr4);
        jVar.d(bArr);
        return jVar;
    }

    public static byte[] sign(org.bouncycastle.crypto.params.j jVar, byte[] bArr, byte[] bArr2) {
        d dVar = new d();
        c mVar = new m(jVar, new SecureRandom());
        if (bArr != null) {
            mVar = new org.bouncycastle.crypto.params.l(mVar, bArr);
        }
        dVar.init(true, mVar);
        dVar.update(bArr2, 0, bArr2.length);
        return dVar.generateSignature();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.bouncycastle.crypto.params.l] */
    public static boolean verify(k kVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        d dVar = new d();
        if (bArr != null) {
            kVar = new org.bouncycastle.crypto.params.l(kVar, bArr);
        }
        dVar.init(false, kVar);
        dVar.update(bArr2, 0, bArr2.length);
        return dVar.verifySignature(bArr3);
    }
}
