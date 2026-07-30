package org.bouncycastle.pqc.crypto.util;

import c7.h;
import c7.j;
import c7.m;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.pqc.crypto.lms.q;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.r;
import org.bouncycastle.pqc.crypto.xmss.v;
import org.bouncycastle.pqc.crypto.xmss.w;
import org.bouncycastle.pqc.crypto.xmss.z;
import org.bouncycastle.util.i;

/* loaded from: classes5.dex */
public class a {
    private static short[] convert(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i8 = 0; i8 != length; i8++) {
            sArr[i8] = i.littleEndianToShort(bArr, i8 * 2);
        }
        return sArr;
    }

    public static org.bouncycastle.crypto.params.a createKey(InputStream inputStream) {
        return createKey(t6.b.getInstance(new k(inputStream).readObject()));
    }

    public static org.bouncycastle.crypto.params.a createKey(t6.b bVar) {
        o algorithm = bVar.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.on(p6.a.qTESLA)) {
            return new org.bouncycastle.pqc.crypto.qtesla.a(e.qTeslaLookupSecurityCategory(bVar.getPrivateKeyAlgorithm()), p.getInstance(bVar.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((s) p6.a.sphincs256)) {
            return new org.bouncycastle.pqc.crypto.sphincs.b(p.getInstance(bVar.parsePrivateKey()).getOctets(), e.sphincs256LookupTreeAlgName(h.getInstance(bVar.getPrivateKeyAlgorithm().getParameters())));
        }
        if (algorithm.equals((s) p6.a.newHope)) {
            return new org.bouncycastle.pqc.crypto.newhope.a(convert(p.getInstance(bVar.parsePrivateKey()).getOctets()));
        }
        if (algorithm.equals((s) t6.a.id_alg_hss_lms_hashsig)) {
            byte[] octets = p.getInstance(bVar.parsePrivateKey()).getOctets();
            org.bouncycastle.asn1.c publicKeyData = bVar.getPublicKeyData();
            if (i.bigEndianToInt(octets, 0) == 1) {
                if (publicKeyData == null) {
                    return q.getInstance(org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length));
                }
                byte[] octets2 = publicKeyData.getOctets();
                return q.getInstance(org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length), org.bouncycastle.util.a.copyOfRange(octets2, 4, octets2.length));
            }
            if (publicKeyData == null) {
                return org.bouncycastle.pqc.crypto.lms.e.getInstance(org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length));
            }
            return org.bouncycastle.pqc.crypto.lms.e.getInstance(org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length), publicKeyData.getOctets());
        }
        if (algorithm.equals((s) p6.a.xmss)) {
            c7.i iVar = c7.i.getInstance(bVar.getPrivateKeyAlgorithm().getParameters());
            o algorithm2 = iVar.getTreeDigest().getAlgorithm();
            m mVar = m.getInstance(bVar.parsePrivateKey());
            try {
                w.b withRoot = new w.b(new v(iVar.getHeight(), e.getDigest(algorithm2))).withIndex(mVar.getIndex()).withSecretKeySeed(mVar.getSecretKeySeed()).withSecretKeyPRF(mVar.getSecretKeyPRF()).withPublicSeed(mVar.getPublicSeed()).withRoot(mVar.getRoot());
                if (mVar.getVersion() != 0) {
                    withRoot.withMaxIndex(mVar.getMaxIndex());
                }
                if (mVar.getBdsState() != null) {
                    withRoot.withBDSState(((BDS) z.deserialize(mVar.getBdsState(), BDS.class)).withWOTSDigest(algorithm2));
                }
                return withRoot.build();
            } catch (ClassNotFoundException e8) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e8.getMessage());
            }
        }
        if (!algorithm.equals((s) c7.e.xmss_mt)) {
            if (!algorithm.equals((s) c7.e.mcElieceCca2)) {
                throw new RuntimeException("algorithm identifier in private key not recognised");
            }
            c7.a aVar = c7.a.getInstance(bVar.parsePrivateKey());
            return new d7.b(aVar.getN(), aVar.getK(), aVar.getField(), aVar.getGoppaPoly(), aVar.getP(), e.getDigestName(aVar.getDigest().getAlgorithm()));
        }
        j jVar = j.getInstance(bVar.getPrivateKeyAlgorithm().getParameters());
        o algorithm3 = jVar.getTreeDigest().getAlgorithm();
        try {
            c7.k kVar = c7.k.getInstance(bVar.parsePrivateKey());
            r.b withRoot2 = new r.b(new org.bouncycastle.pqc.crypto.xmss.q(jVar.getHeight(), jVar.getLayers(), e.getDigest(algorithm3))).withIndex(kVar.getIndex()).withSecretKeySeed(kVar.getSecretKeySeed()).withSecretKeyPRF(kVar.getSecretKeyPRF()).withPublicSeed(kVar.getPublicSeed()).withRoot(kVar.getRoot());
            if (kVar.getVersion() != 0) {
                withRoot2.withMaxIndex(kVar.getMaxIndex());
            }
            if (kVar.getBdsState() != null) {
                withRoot2.withBDSState(((BDSStateMap) z.deserialize(kVar.getBdsState(), BDSStateMap.class)).withWOTSDigest(algorithm3));
            }
            return withRoot2.build();
        } catch (ClassNotFoundException e9) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e9.getMessage());
        }
    }

    public static org.bouncycastle.crypto.params.a createKey(byte[] bArr) {
        return createKey(t6.b.getInstance(s.fromByteArray(bArr)));
    }
}
