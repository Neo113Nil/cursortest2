package org.bouncycastle.pqc.jcajce.provider.xmss;

import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.crypto.digests.h;
import org.bouncycastle.crypto.digests.k;
import org.bouncycastle.crypto.digests.m;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.i;

/* loaded from: classes5.dex */
class a {
    a() {
    }

    static e getDigest(o oVar) {
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

    static o getDigestOID(String str) {
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_256)) {
            return org.bouncycastle.asn1.nist.b.id_sha256;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHA_512)) {
            return org.bouncycastle.asn1.nist.b.id_sha512;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHAKE128)) {
            return org.bouncycastle.asn1.nist.b.id_shake128;
        }
        if (str.equals(org.bouncycastle.pqc.crypto.xmss.o.SHAKE256)) {
            return org.bouncycastle.asn1.nist.b.id_shake256;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }

    public static byte[] getDigestResult(e eVar) {
        int digestSize = getDigestSize(eVar);
        byte[] bArr = new byte[digestSize];
        if (eVar instanceof i) {
            ((i) eVar).doFinal(bArr, 0, digestSize);
        } else {
            eVar.doFinal(bArr, 0);
        }
        return bArr;
    }

    public static int getDigestSize(e eVar) {
        boolean z7 = eVar instanceof i;
        int digestSize = eVar.getDigestSize();
        return z7 ? digestSize * 2 : digestSize;
    }

    public static String getXMSSDigestName(o oVar) {
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha256)) {
            return "SHA256";
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_sha512)) {
            return "SHA512";
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_shake128)) {
            return org.bouncycastle.pqc.crypto.xmss.o.SHAKE128;
        }
        if (oVar.equals((s) org.bouncycastle.asn1.nist.b.id_shake256)) {
            return org.bouncycastle.pqc.crypto.xmss.o.SHAKE256;
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + oVar);
    }
}
