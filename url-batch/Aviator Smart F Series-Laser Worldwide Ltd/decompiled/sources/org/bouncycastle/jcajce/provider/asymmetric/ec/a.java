package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.x9.c;
import org.bouncycastle.asn1.x9.e;
import org.bouncycastle.asn1.x9.g;
import org.bouncycastle.jcajce.provider.asymmetric.util.b;

/* loaded from: classes5.dex */
class a {
    a() {
    }

    static org.bouncycastle.crypto.params.a generatePublicKeyParameter(PublicKey publicKey) {
        return publicKey instanceof BCECPublicKey ? ((BCECPublicKey) publicKey).engineGetKeyParameters() : b.generatePublicKeyParameter(publicKey);
    }

    static e getDomainParametersFromGenSpec(ECGenParameterSpec eCGenParameterSpec, w6.b bVar) {
        return getDomainParametersFromName(eCGenParameterSpec.getName(), bVar);
    }

    static c getDomainParametersFromName(ECParameterSpec eCParameterSpec, boolean z7) {
        if (!(eCParameterSpec instanceof org.bouncycastle.jce.spec.c)) {
            if (eCParameterSpec == null) {
                return new c((m) a1.INSTANCE);
            }
            org.bouncycastle.math.ec.e convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(eCParameterSpec.getCurve());
            return new c(new e(convertCurve, new g(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(convertCurve, eCParameterSpec.getGenerator()), z7), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
        org.bouncycastle.jce.spec.c cVar = (org.bouncycastle.jce.spec.c) eCParameterSpec;
        o namedCurveOid = b.getNamedCurveOid(cVar.getName());
        if (namedCurveOid == null) {
            namedCurveOid = new o(cVar.getName());
        }
        return new c(namedCurveOid);
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

    static e getDomainParametersFromName(String str, w6.b bVar) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        o oid = getOID(str);
        if (oid == null) {
            return b.getNamedCurveByName(str);
        }
        e namedCurveByOid = b.getNamedCurveByOid(oid);
        return (namedCurveByOid != null || bVar == null) ? namedCurveByOid : (e) bVar.getAdditionalECParameters().get(oid);
    }
}
