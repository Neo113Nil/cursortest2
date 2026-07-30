package com.android.mltcode.paycertification.sm2;

import androidx.annotation.Keep;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import k7.e;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.g1;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.x9.c;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.h;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.d;
import t6.b;
import v6.a;

@Keep
/* loaded from: classes.dex */
public class BCECUtil {
    private static final String ALGO_NAME_EC = "EC";
    private static final String PEM_STRING_ECPRIVATEKEY = "EC PRIVATE KEY";
    private static final String PEM_STRING_PUBLIC = "PUBLIC KEY";

    public static k buildECPublicKeyByPrivateKey(j jVar) {
        f parameters = jVar.getParameters();
        return new k(new org.bouncycastle.math.ec.k().multiply(parameters.getG(), jVar.getD()), parameters);
    }

    public static byte[] convertECPrivateKeyPEMToPKCS8(String str) {
        return convertPEMToEncodedData(str);
    }

    public static String convertECPrivateKeyPKCS8ToPEM(byte[] bArr) {
        return convertEncodedDataToPEM(PEM_STRING_ECPRIVATEKEY, bArr);
    }

    public static byte[] convertECPrivateKeySEC1ToPKCS8(byte[] bArr) {
        c domainParametersFromName = getDomainParametersFromName(SM2Util.JDK_EC_SPEC, false);
        c1 c1Var = new c1(bArr);
        g gVar = new g();
        gVar.add(new l(0L));
        gVar.add(new a(org.bouncycastle.asn1.x9.k.id_ecPublicKey, domainParametersFromName));
        gVar.add(c1Var);
        return new g1(gVar).getEncoded("DER");
    }

    public static byte[] convertECPrivateKeyToPKCS8(j jVar, k kVar) {
        f parameters = jVar.getParameters();
        d dVar = new d(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH());
        return new BCECPrivateKey(ALGO_NAME_EC, jVar, kVar != null ? new BCECPublicKey(ALGO_NAME_EC, kVar, dVar, BouncyCastleProvider.CONFIGURATION) : null, dVar, BouncyCastleProvider.CONFIGURATION).getEncoded();
    }

    public static byte[] convertECPrivateKeyToSEC1(j jVar, k kVar) {
        return b.getInstance(convertECPrivateKeyToPKCS8(jVar, kVar)).parsePrivateKey().toASN1Primitive().getEncoded();
    }

    public static byte[] convertECPublicKeyPEMToX509(String str) {
        return convertPEMToEncodedData(str);
    }

    public static byte[] convertECPublicKeyToX509(k kVar) {
        f parameters = kVar.getParameters();
        return new BCECPublicKey(ALGO_NAME_EC, kVar, new d(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH()), BouncyCastleProvider.CONFIGURATION).getEncoded();
    }

    public static String convertECPublicKeyX509ToPEM(byte[] bArr) {
        return convertEncodedDataToPEM(PEM_STRING_PUBLIC, bArr);
    }

    private static String convertEncodedDataToPEM(String str, byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        e eVar = new e(new OutputStreamWriter(byteArrayOutputStream));
        try {
            eVar.writeObject(new k7.b(str, bArr));
            eVar.close();
            return new String(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            eVar.close();
            throw th;
        }
    }

    private static byte[] convertPEMToEncodedData(String str) {
        k7.d dVar = new k7.d(new InputStreamReader(new ByteArrayInputStream(str.getBytes())));
        try {
            return dVar.readPemObject().getContent();
        } finally {
            dVar.close();
        }
    }

    public static BCECPrivateKey convertPKCS8ToECPrivateKey(byte[] bArr) {
        return (BCECPrivateKey) KeyFactory.getInstance(ALGO_NAME_EC, BouncyCastleProvider.PROVIDER_NAME).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }

    public static j convertPrivateKeyToParameters(BCECPrivateKey bCECPrivateKey) {
        d parameters = bCECPrivateKey.getParameters();
        return new j(bCECPrivateKey.getD(), new f(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH()));
    }

    public static k convertPublicKeyToParameters(BCECPublicKey bCECPublicKey) {
        d parameters = bCECPublicKey.getParameters();
        return new k(bCECPublicKey.getQ(), new f(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH()));
    }

    public static BCECPrivateKey convertSEC1ToBCECPrivateKey(byte[] bArr) {
        return (BCECPrivateKey) KeyFactory.getInstance(ALGO_NAME_EC, BouncyCastleProvider.PROVIDER_NAME).generatePrivate(new PKCS8EncodedKeySpec(convertECPrivateKeySEC1ToPKCS8(bArr)));
    }

    public static j convertSEC1ToECPrivateKey(byte[] bArr) {
        return convertPrivateKeyToParameters(convertSEC1ToBCECPrivateKey(bArr));
    }

    public static BCECPublicKey convertX509ToECPublicKey(byte[] bArr) {
        return (BCECPublicKey) KeyFactory.getInstance(ALGO_NAME_EC, BouncyCastleProvider.PROVIDER_NAME).generatePublic(new X509EncodedKeySpec(bArr));
    }

    public static j createECPrivateKeyParameters(String str, f fVar) {
        return createECPrivateKeyParameters(org.bouncycastle.pqc.math.linearalgebra.b.fromHexString(str), fVar);
    }

    public static k createECPublicKeyParameters(BigInteger bigInteger, BigInteger bigInteger2, org.bouncycastle.math.ec.e eVar, f fVar) {
        return createECPublicKeyParameters(bigInteger.toByteArray(), bigInteger2.toByteArray(), eVar, fVar);
    }

    public static BCECPublicKey createPublicKeyFromSubjectPublicKeyInfo(v6.b bVar) {
        return convertX509ToECPublicKey(bVar.toASN1Primitive().getEncoded("DER"));
    }

    public static byte[] fixToCurveLengthBytes(int i8, byte[] bArr) {
        if (bArr.length == i8) {
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

    public static KeyPair generateKeyPair(f fVar, SecureRandom secureRandom) {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGO_NAME_EC, BouncyCastleProvider.PROVIDER_NAME);
        keyPairGenerator.initialize(new d(fVar.getCurve(), fVar.getG(), fVar.getN(), fVar.getH()), secureRandom);
        return keyPairGenerator.generateKeyPair();
    }

    public static org.bouncycastle.crypto.a generateKeyPairParameter(f fVar, SecureRandom secureRandom) {
        org.bouncycastle.crypto.params.g gVar = new org.bouncycastle.crypto.params.g(fVar, secureRandom);
        org.bouncycastle.crypto.generators.a aVar = new org.bouncycastle.crypto.generators.a();
        aVar.init(gVar);
        return aVar.generateKeyPair();
    }

    public static int getCurveLength(h hVar) {
        return getCurveLength(hVar.getParameters());
    }

    public static org.bouncycastle.asn1.x9.e getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec) {
        return getDomainParametersFromName(eCGenParameterSpec.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.bouncycastle.asn1.x9.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static org.bouncycastle.asn1.x9.e getDomainParametersFromName(String str) {
        try {
            str = (str.charAt(0) < '0' || str.charAt(0) > '2') ? str.indexOf(32) > 0 ? org.bouncycastle.jcajce.provider.asymmetric.util.b.getNamedCurveByName(str.substring(str.indexOf(32) + 1)) : org.bouncycastle.jcajce.provider.asymmetric.util.b.getNamedCurveByName(str) : org.bouncycastle.jcajce.provider.asymmetric.util.b.getNamedCurveByOid(new o(str));
            return str;
        } catch (IllegalArgumentException unused) {
            return org.bouncycastle.jcajce.provider.asymmetric.util.b.getNamedCurveByName(str);
        }
    }

    public static j createECPrivateKeyParameters(byte[] bArr, f fVar) {
        return createECPrivateKeyParameters(new BigInteger(1, bArr), fVar);
    }

    public static k createECPublicKeyParameters(String str, String str2, org.bouncycastle.math.ec.e eVar, f fVar) {
        return createECPublicKeyParameters(org.bouncycastle.pqc.math.linearalgebra.b.fromHexString(str), org.bouncycastle.pqc.math.linearalgebra.b.fromHexString(str2), eVar, fVar);
    }

    public static int getCurveLength(f fVar) {
        return (fVar.getCurve().getFieldSize() + 7) / 8;
    }

    public static j createECPrivateKeyParameters(BigInteger bigInteger, f fVar) {
        return new j(bigInteger, fVar);
    }

    public static k createECPublicKeyParameters(byte[] bArr, byte[] bArr2, org.bouncycastle.math.ec.e eVar, f fVar) {
        int curveLength = getCurveLength(fVar);
        byte[] fixToCurveLengthBytes = fixToCurveLengthBytes(curveLength, bArr);
        byte[] fixToCurveLengthBytes2 = fixToCurveLengthBytes(curveLength, bArr2);
        byte[] bArr3 = new byte[fixToCurveLengthBytes.length + 1 + fixToCurveLengthBytes2.length];
        bArr3[0] = 4;
        System.arraycopy(fixToCurveLengthBytes, 0, bArr3, 1, fixToCurveLengthBytes.length);
        System.arraycopy(fixToCurveLengthBytes2, 0, bArr3, fixToCurveLengthBytes.length + 1, fixToCurveLengthBytes2.length);
        return new k(eVar.decodePoint(bArr3), fVar);
    }

    public static c getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z7) {
        if (!(eCParameterSpec instanceof org.bouncycastle.jce.spec.c)) {
            if (eCParameterSpec == null) {
                return new c((m) a1.INSTANCE);
            }
            org.bouncycastle.math.ec.e convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(eCParameterSpec.getCurve());
            return new c(new org.bouncycastle.asn1.x9.e(convertCurve, new org.bouncycastle.asn1.x9.g(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z7), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        org.bouncycastle.jce.spec.c cVar = (org.bouncycastle.jce.spec.c) eCParameterSpec;
        o namedCurveOid = org.bouncycastle.jcajce.provider.asymmetric.util.b.getNamedCurveOid(cVar.getName());
        if (namedCurveOid == null) {
            namedCurveOid = new o(cVar.getName());
        }
        return new c(namedCurveOid);
    }
}
