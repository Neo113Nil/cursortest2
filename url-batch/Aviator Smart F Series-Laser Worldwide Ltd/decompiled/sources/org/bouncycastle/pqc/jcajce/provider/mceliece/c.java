package org.bouncycastle.pqc.jcajce.provider.mceliece;

import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.s;
import org.bouncycastle.crypto.e;
import org.bouncycastle.pqc.crypto.xmss.o;

/* loaded from: classes5.dex */
class c {
    c() {
    }

    static v6.a getDigAlgId(String str) {
        if (str.equals("SHA-1")) {
            return new v6.a(s6.a.idSHA1, a1.INSTANCE);
        }
        if (str.equals("SHA-224")) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha224);
        }
        if (str.equals(o.SHA_256)) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha256);
        }
        if (str.equals("SHA-384")) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha384);
        }
        if (str.equals(o.SHA_512)) {
            return new v6.a(org.bouncycastle.asn1.nist.b.id_sha512);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    static e getDigest(v6.a aVar) {
        if (aVar.getAlgorithm().equals((s) s6.a.idSHA1)) {
            return org.bouncycastle.crypto.util.a.createSHA1();
        }
        if (aVar.getAlgorithm().equals((s) org.bouncycastle.asn1.nist.b.id_sha224)) {
            return org.bouncycastle.crypto.util.a.createSHA224();
        }
        if (aVar.getAlgorithm().equals((s) org.bouncycastle.asn1.nist.b.id_sha256)) {
            return org.bouncycastle.crypto.util.a.createSHA256();
        }
        if (aVar.getAlgorithm().equals((s) org.bouncycastle.asn1.nist.b.id_sha384)) {
            return org.bouncycastle.crypto.util.a.createSHA384();
        }
        if (aVar.getAlgorithm().equals((s) org.bouncycastle.asn1.nist.b.id_sha512)) {
            return org.bouncycastle.crypto.util.a.createSHA512();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + aVar.getAlgorithm());
    }
}
