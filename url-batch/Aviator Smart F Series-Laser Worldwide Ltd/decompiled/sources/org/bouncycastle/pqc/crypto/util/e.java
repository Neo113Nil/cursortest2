package org.bouncycastle.pqc.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.crypto.digests.h;
import org.bouncycastle.crypto.digests.k;
import org.bouncycastle.crypto.digests.m;

/* loaded from: classes5.dex */
class e {
    static final v6.a AlgID_qTESLA_p_I;
    static final v6.a AlgID_qTESLA_p_III;
    static final v6.a SPHINCS_SHA3_256;
    static final v6.a SPHINCS_SHA512_256;
    static final v6.a XMSS_SHA256;
    static final v6.a XMSS_SHA512;
    static final v6.a XMSS_SHAKE128;
    static final v6.a XMSS_SHAKE256;
    static final Map categories;

    static {
        o oVar = c7.e.qTESLA_p_I;
        AlgID_qTESLA_p_I = new v6.a(oVar);
        o oVar2 = c7.e.qTESLA_p_III;
        AlgID_qTESLA_p_III = new v6.a(oVar2);
        SPHINCS_SHA3_256 = new v6.a(org.bouncycastle.asn1.nist.b.id_sha3_256);
        SPHINCS_SHA512_256 = new v6.a(org.bouncycastle.asn1.nist.b.id_sha512_256);
        XMSS_SHA256 = new v6.a(org.bouncycastle.asn1.nist.b.id_sha256);
        XMSS_SHA512 = new v6.a(org.bouncycastle.asn1.nist.b.id_sha512);
        XMSS_SHAKE128 = new v6.a(org.bouncycastle.asn1.nist.b.id_shake128);
        XMSS_SHAKE256 = new v6.a(org.bouncycastle.asn1.nist.b.id_shake256);
        HashMap hashMap = new HashMap();
        categories = hashMap;
        hashMap.put(oVar, org.bouncycastle.util.e.valueOf(5));
        hashMap.put(oVar2, org.bouncycastle.util.e.valueOf(6));
    }

    e() {
    }

    public static v6.a getAlgorithmIdentifier(String str) {
        if (str.equals("SHA-1")) {
            return new v6.a(s6.a.idSHA1, a1.INSTANCE);
        }
        if (str.equals("SHA-224")) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha224);
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_256)) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha256);
        }
        if (str.equals("SHA-384")) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha384);
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_512)) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha512);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    static org.bouncycastle.crypto.e getDigest(o oVar) {
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha256)) {
            return new h();
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha512)) {
            return new k();
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_shake128)) {
            return new m(128);
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_shake256)) {
            return new m(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + oVar);
    }

    public static String getDigestName(o oVar) {
        if (oVar.equals((s) s6.a.idSHA1)) {
            return "SHA-1";
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha224)) {
            return "SHA-224";
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha256)) {
            return org.bouncycastle.pqc.crypto.xmss.o.SHA_256;
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha384)) {
            return "SHA-384";
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha512)) {
            return org.bouncycastle.pqc.crypto.xmss.o.SHA_512;
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + oVar);
    }

    static v6.a qTeslaLookupAlgID(int i8) {
        if (i8 == 5) {
            return AlgID_qTESLA_p_I;
        }
        if (i8 == 6) {
            return AlgID_qTESLA_p_III;
        }
        throw new IllegalArgumentException("unknown security category: " + i8);
    }

    static int qTeslaLookupSecurityCategory(v6.a aVar) {
        return ((Integer) categories.get(aVar.getAlgorithm())).intValue();
    }

    static v6.a sphincs256LookupTreeAlgID(String str) {
        if (str.equals(org.bouncycastle.pqc.crypto.sphincs.a.SHA3_256)) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.sphincs.a.SHA512_256)) {
            return SPHINCS_SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    static String sphincs256LookupTreeAlgName(c7.h hVar) {
        v6.a treeDigest = hVar.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((s) SPHINCS_SHA3_256.getAlgorithm())) {
            return org.bouncycastle.pqc.crypto.sphincs.a.SHA3_256;
        }
        if (treeDigest.getAlgorithm().equals((s) SPHINCS_SHA512_256.getAlgorithm())) {
            return org.bouncycastle.pqc.crypto.sphincs.a.SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + treeDigest.getAlgorithm());
    }

    static v6.a xmssLookupTreeAlgID(String str) {
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_256)) {
            return XMSS_SHA256;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_512)) {
            return XMSS_SHA512;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHAKE128)) {
            return XMSS_SHAKE128;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHAKE256)) {
            return XMSS_SHAKE256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
