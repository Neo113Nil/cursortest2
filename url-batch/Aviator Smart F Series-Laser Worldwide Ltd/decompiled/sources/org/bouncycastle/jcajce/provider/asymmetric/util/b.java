package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.o;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class b {

    static class a implements PrivilegedAction {
        final /* synthetic */ AlgorithmParameterSpec val$paramSpec;

        a(AlgorithmParameterSpec algorithmParameterSpec) {
            this.val$paramSpec = algorithmParameterSpec;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return this.val$paramSpec.getClass().getMethod("getName", new Class[0]).invoke(this.val$paramSpec, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static int[] convertMidTerms(int[] iArr) {
        int i8;
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else {
            if (iArr.length != 3) {
                throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
            }
            int i9 = iArr[0];
            int i10 = iArr[1];
            if (i9 >= i10 || i9 >= (i8 = iArr[2])) {
                int i11 = iArr[2];
                if (i10 < i11) {
                    iArr2[0] = i10;
                    int i12 = iArr[0];
                    if (i12 < i11) {
                        iArr2[1] = i12;
                        iArr2[2] = i11;
                    } else {
                        iArr2[1] = i11;
                        iArr2[2] = i12;
                    }
                } else {
                    iArr2[0] = i11;
                    int i13 = iArr[0];
                    if (i13 < i10) {
                        iArr2[1] = i13;
                        iArr2[2] = iArr[1];
                    } else {
                        iArr2[1] = i10;
                        iArr2[2] = i13;
                    }
                }
            } else {
                iArr2[0] = i9;
                if (i10 < i8) {
                    iArr2[1] = i10;
                    iArr2[2] = i8;
                } else {
                    iArr2[1] = i8;
                    iArr2[2] = iArr[1];
                }
            }
        }
        return iArr2;
    }

    public static String generateKeyFingerprint(i iVar, org.bouncycastle.jce.spec.d dVar) {
        e curve = dVar.getCurve();
        return curve != null ? new org.bouncycastle.util.d(org.bouncycastle.util.a.concatenate(iVar.getEncoded(false), curve.getA().getEncoded(), curve.getB().getEncoded(), dVar.getG().getEncoded(false))).toString() : new org.bouncycastle.util.d(iVar.getEncoded(false)).toString();
    }

    public static org.bouncycastle.crypto.params.a generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            org.bouncycastle.jce.spec.d parameters = eCPrivateKey.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (!(eCPrivateKey.getParameters() instanceof org.bouncycastle.jce.spec.b)) {
                return new j(eCPrivateKey.getD(), new f(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
            }
            return new j(eCPrivateKey.getD(), new org.bouncycastle.crypto.params.i(org.bouncycastle.asn1.x9.a.getOID(((org.bouncycastle.jce.spec.b) eCPrivateKey.getParameters()).getName()), parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
        }
        if (privateKey instanceof java.security.interfaces.ECPrivateKey) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) privateKey;
            org.bouncycastle.jce.spec.d convertSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(eCPrivateKey2.getParams());
            return new j(eCPrivateKey2.getS(), new f(convertSpec.getCurve(), convertSpec.getG(), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC private key");
            }
            PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(t6.b.getInstance(encoded));
            if (privateKey2 instanceof java.security.interfaces.ECPrivateKey) {
                return generatePrivateKeyParameter(privateKey2);
            }
            throw new InvalidKeyException("can't identify EC private key.");
        } catch (Exception e8) {
            throw new InvalidKeyException("cannot identify EC private key: " + e8.toString());
        }
    }

    public static org.bouncycastle.crypto.params.a generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            org.bouncycastle.jce.spec.d parameters = eCPublicKey.getParameters();
            return new k(eCPublicKey.getQ(), new f(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()));
        }
        if (publicKey instanceof java.security.interfaces.ECPublicKey) {
            java.security.interfaces.ECPublicKey eCPublicKey2 = (java.security.interfaces.ECPublicKey) publicKey;
            org.bouncycastle.jce.spec.d convertSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(eCPublicKey2.getParams());
            return new k(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), new f(convertSpec.getCurve(), convertSpec.getG(), convertSpec.getN(), convertSpec.getH(), convertSpec.getSeed()));
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded == null) {
                throw new InvalidKeyException("no encoding for EC public key");
            }
            PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(v6.b.getInstance(encoded));
            if (publicKey2 instanceof java.security.interfaces.ECPublicKey) {
                return generatePublicKeyParameter(publicKey2);
            }
            throw new InvalidKeyException("cannot identify EC public key.");
        } catch (Exception e8) {
            throw new InvalidKeyException("cannot identify EC public key: " + e8.toString());
        }
    }

    public static String getCurveName(o oVar) {
        return org.bouncycastle.asn1.x9.a.getName(oVar);
    }

    public static f getDomainParameters(w6.b bVar, org.bouncycastle.asn1.x9.c cVar) {
        f fVar;
        if (cVar.isNamedCurve()) {
            o oVar = o.getInstance(cVar.getParameters());
            org.bouncycastle.asn1.x9.e namedCurveByOid = getNamedCurveByOid(oVar);
            if (namedCurveByOid == null) {
                namedCurveByOid = (org.bouncycastle.asn1.x9.e) bVar.getAdditionalECParameters().get(oVar);
            }
            return new org.bouncycastle.crypto.params.i(oVar, namedCurveByOid);
        }
        if (cVar.isImplicitlyCA()) {
            org.bouncycastle.jce.spec.d ecImplicitlyCa = bVar.getEcImplicitlyCa();
            fVar = new f(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
        } else {
            org.bouncycastle.asn1.x9.e eVar = org.bouncycastle.asn1.x9.e.getInstance(cVar.getParameters());
            fVar = new f(eVar.getCurve(), eVar.getG(), eVar.getN(), eVar.getH(), eVar.getSeed());
        }
        return fVar;
    }

    public static String getNameFrom(AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new a(algorithmParameterSpec));
    }

    public static org.bouncycastle.asn1.x9.e getNamedCurveByName(String str) {
        org.bouncycastle.asn1.x9.e byName = org.bouncycastle.crypto.ec.a.getByName(str);
        return byName == null ? org.bouncycastle.asn1.x9.a.getByName(str) : byName;
    }

    public static org.bouncycastle.asn1.x9.e getNamedCurveByOid(o oVar) {
        org.bouncycastle.asn1.x9.e byOID = org.bouncycastle.crypto.ec.a.getByOID(oVar);
        return byOID == null ? org.bouncycastle.asn1.x9.a.getByOID(oVar) : byOID;
    }

    public static o getNamedCurveOid(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        o oid = getOID(str);
        return oid != null ? oid : org.bouncycastle.asn1.x9.a.getOID(str);
    }

    private static o getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new o(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getOrderBitLength(w6.b bVar, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger != null) {
            return bigInteger.bitLength();
        }
        org.bouncycastle.jce.spec.d ecImplicitlyCa = bVar.getEcImplicitlyCa();
        return ecImplicitlyCa == null ? bigInteger2.bitLength() : ecImplicitlyCa.getN().bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, org.bouncycastle.jce.spec.d dVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        i normalize = new org.bouncycastle.math.ec.k().multiply(dVar.getG(), bigInteger).normalize();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(normalize, dVar));
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(normalize.getAffineXCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(normalize.getAffineYCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, i iVar, org.bouncycastle.jce.spec.d dVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(iVar, dVar));
        stringBuffer.append("]");
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(iVar.getAffineXCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(iVar.getAffineYCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }

    public static f getDomainParameters(w6.b bVar, org.bouncycastle.jce.spec.d dVar) {
        if (dVar instanceof org.bouncycastle.jce.spec.b) {
            org.bouncycastle.jce.spec.b bVar2 = (org.bouncycastle.jce.spec.b) dVar;
            return new org.bouncycastle.crypto.params.i(getNamedCurveOid(bVar2.getName()), bVar2.getCurve(), bVar2.getG(), bVar2.getN(), bVar2.getH(), bVar2.getSeed());
        }
        if (dVar != null) {
            return new f(dVar.getCurve(), dVar.getG(), dVar.getN(), dVar.getH(), dVar.getSeed());
        }
        org.bouncycastle.jce.spec.d ecImplicitlyCa = bVar.getEcImplicitlyCa();
        return new f(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
    }

    public static o getNamedCurveOid(org.bouncycastle.jce.spec.d dVar) {
        Enumeration names = org.bouncycastle.asn1.x9.a.getNames();
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            org.bouncycastle.asn1.x9.e byName = org.bouncycastle.asn1.x9.a.getByName(str);
            if (byName.getN().equals(dVar.getN()) && byName.getH().equals(dVar.getH()) && byName.getCurve().equals(dVar.getCurve()) && byName.getG().equals(dVar.getG())) {
                return org.bouncycastle.asn1.x9.a.getOID(str);
            }
        }
        return null;
    }
}
