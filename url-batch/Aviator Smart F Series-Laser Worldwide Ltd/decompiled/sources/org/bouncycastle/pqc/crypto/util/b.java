package org.bouncycastle.pqc.crypto.util;

import c7.h;
import c7.j;
import c7.k;
import c7.m;
import java.io.IOException;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.x;
import org.bouncycastle.pqc.crypto.lms.q;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.r;
import org.bouncycastle.pqc.crypto.xmss.w;
import org.bouncycastle.pqc.crypto.xmss.z;
import org.bouncycastle.util.i;

/* loaded from: classes5.dex */
public class b {
    private b() {
    }

    public static t6.b createPrivateKeyInfo(org.bouncycastle.crypto.params.a aVar) {
        return createPrivateKeyInfo(aVar, null);
    }

    private static m xmssCreateKeyStructure(w wVar) {
        byte[] encoded = wVar.getEncoded();
        int treeDigestSize = wVar.getParameters().getTreeDigestSize();
        int height = wVar.getParameters().getHeight();
        int bytesToXBigEndian = (int) z.bytesToXBigEndian(encoded, 0, 4);
        if (!z.isIndexValid(height, bytesToXBigEndian)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] extractBytesAtOffset = z.extractBytesAtOffset(encoded, 4, treeDigestSize);
        int i8 = 4 + treeDigestSize;
        byte[] extractBytesAtOffset2 = z.extractBytesAtOffset(encoded, i8, treeDigestSize);
        int i9 = i8 + treeDigestSize;
        byte[] extractBytesAtOffset3 = z.extractBytesAtOffset(encoded, i9, treeDigestSize);
        int i10 = i9 + treeDigestSize;
        byte[] extractBytesAtOffset4 = z.extractBytesAtOffset(encoded, i10, treeDigestSize);
        int i11 = i10 + treeDigestSize;
        byte[] extractBytesAtOffset5 = z.extractBytesAtOffset(encoded, i11, encoded.length - i11);
        try {
            BDS bds = (BDS) z.deserialize(extractBytesAtOffset5, BDS.class);
            return bds.getMaxIndex() != (1 << height) - 1 ? new m(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bds.getMaxIndex()) : new m(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (ClassNotFoundException e8) {
            throw new IOException("cannot parse BDS: " + e8.getMessage());
        }
    }

    private static k xmssmtCreateKeyStructure(r rVar) {
        byte[] encoded = rVar.getEncoded();
        int treeDigestSize = rVar.getParameters().getTreeDigestSize();
        int height = rVar.getParameters().getHeight();
        int i8 = (height + 7) / 8;
        long bytesToXBigEndian = (int) z.bytesToXBigEndian(encoded, 0, i8);
        if (!z.isIndexValid(height, bytesToXBigEndian)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        byte[] extractBytesAtOffset = z.extractBytesAtOffset(encoded, i8, treeDigestSize);
        int i9 = i8 + treeDigestSize;
        byte[] extractBytesAtOffset2 = z.extractBytesAtOffset(encoded, i9, treeDigestSize);
        int i10 = i9 + treeDigestSize;
        byte[] extractBytesAtOffset3 = z.extractBytesAtOffset(encoded, i10, treeDigestSize);
        int i11 = i10 + treeDigestSize;
        byte[] extractBytesAtOffset4 = z.extractBytesAtOffset(encoded, i11, treeDigestSize);
        int i12 = i11 + treeDigestSize;
        byte[] extractBytesAtOffset5 = z.extractBytesAtOffset(encoded, i12, encoded.length - i12);
        try {
            BDSStateMap bDSStateMap = (BDSStateMap) z.deserialize(extractBytesAtOffset5, BDSStateMap.class);
            return bDSStateMap.getMaxIndex() != (1 << height) - 1 ? new k(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bDSStateMap.getMaxIndex()) : new k(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (ClassNotFoundException e8) {
            throw new IOException("cannot parse BDSStateMap: " + e8.getMessage());
        }
    }

    public static t6.b createPrivateKeyInfo(org.bouncycastle.crypto.params.a aVar, x xVar) {
        if (aVar instanceof org.bouncycastle.pqc.crypto.qtesla.a) {
            org.bouncycastle.pqc.crypto.qtesla.a aVar2 = (org.bouncycastle.pqc.crypto.qtesla.a) aVar;
            return new t6.b(e.qTeslaLookupAlgID(aVar2.getSecurityCategory()), new c1(aVar2.getSecret()), xVar);
        }
        if (aVar instanceof org.bouncycastle.pqc.crypto.sphincs.b) {
            org.bouncycastle.pqc.crypto.sphincs.b bVar = (org.bouncycastle.pqc.crypto.sphincs.b) aVar;
            return new t6.b(new v6.a(c7.e.sphincs256, new h(e.sphincs256LookupTreeAlgID(bVar.getTreeDigest()))), new c1(bVar.getKeyData()));
        }
        if (aVar instanceof org.bouncycastle.pqc.crypto.newhope.a) {
            v6.a aVar3 = new v6.a(c7.e.newHope);
            short[] secData = ((org.bouncycastle.pqc.crypto.newhope.a) aVar).getSecData();
            byte[] bArr = new byte[secData.length * 2];
            for (int i8 = 0; i8 != secData.length; i8++) {
                i.shortToLittleEndian(secData[i8], bArr, i8 * 2);
            }
            return new t6.b(aVar3, new c1(bArr));
        }
        if (aVar instanceof q) {
            q qVar = (q) aVar;
            byte[] build = org.bouncycastle.pqc.crypto.lms.a.compose().u32str(1).bytes(qVar).build();
            return new t6.b(new v6.a(t6.a.id_alg_hss_lms_hashsig), new c1(build), xVar, org.bouncycastle.pqc.crypto.lms.a.compose().u32str(1).bytes(qVar.getPublicKey()).build());
        }
        if (aVar instanceof org.bouncycastle.pqc.crypto.lms.e) {
            org.bouncycastle.pqc.crypto.lms.e eVar = (org.bouncycastle.pqc.crypto.lms.e) aVar;
            byte[] build2 = org.bouncycastle.pqc.crypto.lms.a.compose().u32str(eVar.getL()).bytes(eVar).build();
            return new t6.b(new v6.a(t6.a.id_alg_hss_lms_hashsig), new c1(build2), xVar, org.bouncycastle.pqc.crypto.lms.a.compose().u32str(eVar.getL()).bytes(eVar.getPublicKey().getLMSPublicKey()).build());
        }
        if (aVar instanceof w) {
            w wVar = (w) aVar;
            return new t6.b(new v6.a(c7.e.xmss, new c7.i(wVar.getParameters().getHeight(), e.xmssLookupTreeAlgID(wVar.getTreeDigest()))), xmssCreateKeyStructure(wVar), xVar);
        }
        if (aVar instanceof r) {
            r rVar = (r) aVar;
            return new t6.b(new v6.a(c7.e.xmss_mt, new j(rVar.getParameters().getHeight(), rVar.getParameters().getLayers(), e.xmssLookupTreeAlgID(rVar.getTreeDigest()))), xmssmtCreateKeyStructure(rVar), xVar);
        }
        if (!(aVar instanceof d7.b)) {
            throw new IOException("key parameters not recognized");
        }
        d7.b bVar2 = (d7.b) aVar;
        return new t6.b(new v6.a(c7.e.mcElieceCca2), new c7.a(bVar2.getN(), bVar2.getK(), bVar2.getField(), bVar2.getGoppaPoly(), bVar2.getP(), e.getAlgorithmIdentifier(bVar2.getDigest())));
    }
}
