package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

/* loaded from: classes9.dex */
public class ECNamedCurveTable {
    public static Enumeration getNames() {
        return org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ECNamedCurveParameterSpec getParameterSpec(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        X9ECParameters byOID;
        if (possibleOID(str)) {
            aSN1ObjectIdentifier = new ASN1ObjectIdentifier(str);
            byOID = aSN1ObjectIdentifier == null ? CustomNamedCurves.getByOID(aSN1ObjectIdentifier) : CustomNamedCurves.getByName(str);
            if (byOID == null) {
                byOID = aSN1ObjectIdentifier != null ? org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifier) : org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str);
            }
            if (byOID != null) {
                return null;
            }
            return new ECNamedCurveParameterSpec(str, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
        }
        aSN1ObjectIdentifier = null;
        if (aSN1ObjectIdentifier == null) {
        }
        if (byOID == null) {
        }
        if (byOID != null) {
        }
    }

    private static boolean possibleOID(String str) {
        char charAt;
        return str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2';
    }
}
