package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class c {
    private static Map<String, org.bouncycastle.asn1.o> nameToOid = new HashMap();
    private static Map<org.bouncycastle.asn1.o, String> oidToName = new HashMap();

    static {
        Map<String, org.bouncycastle.asn1.o> map = nameToOid;
        org.bouncycastle.asn1.o oVar = org.bouncycastle.asn1.nist.b.id_sha256;
        map.put(o.SHA_256, oVar);
        Map<String, org.bouncycastle.asn1.o> map2 = nameToOid;
        org.bouncycastle.asn1.o oVar2 = org.bouncycastle.asn1.nist.b.id_sha512;
        map2.put(o.SHA_512, oVar2);
        Map<String, org.bouncycastle.asn1.o> map3 = nameToOid;
        org.bouncycastle.asn1.o oVar3 = org.bouncycastle.asn1.nist.b.id_shake128;
        map3.put(o.SHAKE128, oVar3);
        Map<String, org.bouncycastle.asn1.o> map4 = nameToOid;
        org.bouncycastle.asn1.o oVar4 = org.bouncycastle.asn1.nist.b.id_shake256;
        map4.put(o.SHAKE256, oVar4);
        oidToName.put(oVar, o.SHA_256);
        oidToName.put(oVar2, o.SHA_512);
        oidToName.put(oVar3, o.SHAKE128);
        oidToName.put(oVar4, o.SHAKE256);
    }

    c() {
    }

    static org.bouncycastle.crypto.e getDigest(org.bouncycastle.asn1.o oVar) {
        if (oVar.equals((org.bouncycastle.asn1.s) org.bouncycastle.asn1.nist.b.id_sha256)) {
            return new org.bouncycastle.crypto.digests.h();
        }
        if (oVar.equals((org.bouncycastle.asn1.s) org.bouncycastle.asn1.nist.b.id_sha512)) {
            return new org.bouncycastle.crypto.digests.k();
        }
        if (oVar.equals((org.bouncycastle.asn1.s) org.bouncycastle.asn1.nist.b.id_shake128)) {
            return new org.bouncycastle.crypto.digests.m(128);
        }
        if (oVar.equals((org.bouncycastle.asn1.s) org.bouncycastle.asn1.nist.b.id_shake256)) {
            return new org.bouncycastle.crypto.digests.m(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + oVar);
    }

    static String getDigestName(org.bouncycastle.asn1.o oVar) {
        String str = oidToName.get(oVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + oVar);
    }

    static org.bouncycastle.asn1.o getDigestOID(String str) {
        org.bouncycastle.asn1.o oVar = nameToOid.get(str);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }

    public static int getDigestSize(org.bouncycastle.crypto.e eVar) {
        boolean z7 = eVar instanceof org.bouncycastle.crypto.i;
        int digestSize = eVar.getDigestSize();
        return z7 ? digestSize * 2 : digestSize;
    }
}
