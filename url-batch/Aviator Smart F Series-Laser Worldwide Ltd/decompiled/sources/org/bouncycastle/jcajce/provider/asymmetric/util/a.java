package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.x9.e;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;
import org.bouncycastle.math.field.f;
import org.bouncycastle.math.field.g;

/* loaded from: classes5.dex */
public class a {
    private static Map customCurves = new HashMap();

    static {
        Enumeration names = org.bouncycastle.crypto.ec.a.getNames();
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            e byName = org.bouncycastle.asn1.x9.a.getByName(str);
            if (byName != null) {
                customCurves.put(byName.getCurve(), org.bouncycastle.crypto.ec.a.getByName(str).getCurve());
            }
        }
        org.bouncycastle.math.ec.e curve = org.bouncycastle.crypto.ec.a.getByName("Curve25519").getCurve();
        customCurves.put(new e.f(curve.getField().getCharacteristic(), curve.getA().toBigInteger(), curve.getB().toBigInteger(), curve.getOrder(), curve.getCofactor()), curve);
    }

    public static EllipticCurve convertCurve(org.bouncycastle.math.ec.e eVar, byte[] bArr) {
        return new EllipticCurve(convertField(eVar.getField()), eVar.getA().toBigInteger(), eVar.getB().toBigInteger(), null);
    }

    public static ECField convertField(org.bouncycastle.math.field.b bVar) {
        if (org.bouncycastle.math.ec.c.isFpField(bVar)) {
            return new ECFieldFp(bVar.getCharacteristic());
        }
        f minimalPolynomial = ((g) bVar).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.a.reverseInPlace(org.bouncycastle.util.a.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public static ECPoint convertPoint(i iVar) {
        i normalize = iVar.normalize();
        return new ECPoint(normalize.getAffineXCoord().toBigInteger(), normalize.getAffineYCoord().toBigInteger());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, org.bouncycastle.jce.spec.d dVar) {
        ECPoint convertPoint = convertPoint(dVar.getG());
        return dVar instanceof org.bouncycastle.jce.spec.b ? new org.bouncycastle.jce.spec.c(((org.bouncycastle.jce.spec.b) dVar).getName(), ellipticCurve, convertPoint, dVar.getN(), dVar.getH()) : new ECParameterSpec(ellipticCurve, convertPoint, dVar.getN(), dVar.getH().intValue());
    }

    public static ECParameterSpec convertToSpec(org.bouncycastle.asn1.x9.c cVar, org.bouncycastle.math.ec.e eVar) {
        ECParameterSpec cVar2;
        if (cVar.isNamedCurve()) {
            o oVar = (o) cVar.getParameters();
            org.bouncycastle.asn1.x9.e namedCurveByOid = b.getNamedCurveByOid(oVar);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (org.bouncycastle.asn1.x9.e) additionalECParameters.get(oVar);
                }
            }
            return new org.bouncycastle.jce.spec.c(b.getCurveName(oVar), convertCurve(eVar, namedCurveByOid.getSeed()), convertPoint(namedCurveByOid.getG()), namedCurveByOid.getN(), namedCurveByOid.getH());
        }
        if (cVar.isImplicitlyCA()) {
            return null;
        }
        v vVar = v.getInstance(cVar.getParameters());
        if (vVar.size() > 3) {
            org.bouncycastle.asn1.x9.e eVar2 = org.bouncycastle.asn1.x9.e.getInstance(vVar);
            EllipticCurve convertCurve = convertCurve(eVar, eVar2.getSeed());
            cVar2 = eVar2.getH() != null ? new ECParameterSpec(convertCurve, convertPoint(eVar2.getG()), eVar2.getN(), eVar2.getH().intValue()) : new ECParameterSpec(convertCurve, convertPoint(eVar2.getG()), eVar2.getN(), 1);
        } else {
            org.bouncycastle.asn1.cryptopro.c cVar3 = org.bouncycastle.asn1.cryptopro.c.getInstance(vVar);
            org.bouncycastle.jce.spec.b parameterSpec = z6.a.getParameterSpec(org.bouncycastle.asn1.cryptopro.b.getName(cVar3.getPublicKeyParamSet()));
            cVar2 = new org.bouncycastle.jce.spec.c(org.bouncycastle.asn1.cryptopro.b.getName(cVar3.getPublicKeyParamSet()), convertCurve(parameterSpec.getCurve(), parameterSpec.getSeed()), convertPoint(parameterSpec.getG()), parameterSpec.getN(), parameterSpec.getH());
        }
        return cVar2;
    }

    public static org.bouncycastle.math.ec.e getCurve(w6.b bVar, org.bouncycastle.asn1.x9.c cVar) {
        Set acceptableNamedCurves = bVar.getAcceptableNamedCurves();
        if (!cVar.isNamedCurve()) {
            if (cVar.isImplicitlyCA()) {
                return bVar.getEcImplicitlyCa().getCurve();
            }
            v vVar = v.getInstance(cVar.getParameters());
            if (acceptableNamedCurves.isEmpty()) {
                return (vVar.size() > 3 ? org.bouncycastle.asn1.x9.e.getInstance(vVar) : org.bouncycastle.asn1.cryptopro.b.getByOIDX9(o.getInstance(vVar.getObjectAt(0)))).getCurve();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        o oVar = o.getInstance(cVar.getParameters());
        if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(oVar)) {
            throw new IllegalStateException("named curve not acceptable");
        }
        org.bouncycastle.asn1.x9.e namedCurveByOid = b.getNamedCurveByOid(oVar);
        if (namedCurveByOid == null) {
            namedCurveByOid = (org.bouncycastle.asn1.x9.e) bVar.getAdditionalECParameters().get(oVar);
        }
        return namedCurveByOid.getCurve();
    }

    public static org.bouncycastle.crypto.params.f getDomainParameters(w6.b bVar, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec != null) {
            return b.getDomainParameters(bVar, convertSpec(eCParameterSpec));
        }
        org.bouncycastle.jce.spec.d ecImplicitlyCa = bVar.getEcImplicitlyCa();
        return new org.bouncycastle.crypto.params.f(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
    }

    public static org.bouncycastle.math.ec.e convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a8 = ellipticCurve.getA();
        BigInteger b8 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            e.f fVar = new e.f(((ECFieldFp) field).getP(), a8, b8);
            return customCurves.containsKey(fVar) ? (org.bouncycastle.math.ec.e) customCurves.get(fVar) : fVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m8 = eCFieldF2m.getM();
        int[] convertMidTerms = b.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new e.C0394e(m8, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a8, b8);
    }

    public static i convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static org.bouncycastle.jce.spec.d convertSpec(ECParameterSpec eCParameterSpec) {
        org.bouncycastle.math.ec.e convertCurve = convertCurve(eCParameterSpec.getCurve());
        i convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof org.bouncycastle.jce.spec.c ? new org.bouncycastle.jce.spec.b(((org.bouncycastle.jce.spec.c) eCParameterSpec).getName(), convertCurve, convertPoint, order, valueOf, seed) : new org.bouncycastle.jce.spec.d(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static ECParameterSpec convertToSpec(org.bouncycastle.asn1.x9.e eVar) {
        return new ECParameterSpec(convertCurve(eVar.getCurve(), null), convertPoint(eVar.getG()), eVar.getN(), eVar.getH().intValue());
    }

    public static i convertPoint(org.bouncycastle.math.ec.e eVar, ECPoint eCPoint) {
        return eVar.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertToSpec(org.bouncycastle.crypto.params.f fVar) {
        return new ECParameterSpec(convertCurve(fVar.getCurve(), null), convertPoint(fVar.getG()), fVar.getN(), fVar.getH().intValue());
    }
}
