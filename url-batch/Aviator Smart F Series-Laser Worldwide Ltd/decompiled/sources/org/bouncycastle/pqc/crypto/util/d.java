package org.bouncycastle.pqc.crypto.util;

import c7.h;
import c7.i;
import c7.j;
import c7.l;
import c7.n;
import java.io.IOException;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.pqc.crypto.lms.f;
import org.bouncycastle.pqc.crypto.lms.r;
import org.bouncycastle.pqc.crypto.xmss.s;
import org.bouncycastle.pqc.crypto.xmss.x;

/* loaded from: classes5.dex */
public class d {
    private d() {
    }

    public static v6.b createSubjectPublicKeyInfo(org.bouncycastle.crypto.params.a aVar) {
        if (aVar instanceof org.bouncycastle.pqc.crypto.qtesla.b) {
            org.bouncycastle.pqc.crypto.qtesla.b bVar = (org.bouncycastle.pqc.crypto.qtesla.b) aVar;
            return new v6.b(e.qTeslaLookupAlgID(bVar.getSecurityCategory()), bVar.getPublicData());
        }
        if (aVar instanceof org.bouncycastle.pqc.crypto.sphincs.c) {
            org.bouncycastle.pqc.crypto.sphincs.c cVar = (org.bouncycastle.pqc.crypto.sphincs.c) aVar;
            return new v6.b(new v6.a(c7.e.sphincs256, new h(e.sphincs256LookupTreeAlgID(cVar.getTreeDigest()))), cVar.getKeyData());
        }
        if (aVar instanceof org.bouncycastle.pqc.crypto.newhope.b) {
            return new v6.b(new v6.a(c7.e.newHope), ((org.bouncycastle.pqc.crypto.newhope.b) aVar).getPubData());
        }
        if (aVar instanceof r) {
            return new v6.b(new v6.a(t6.a.id_alg_hss_lms_hashsig), new c1(org.bouncycastle.pqc.crypto.lms.a.compose().u32str(1).bytes((r) aVar).build()));
        }
        if (aVar instanceof f) {
            f fVar = (f) aVar;
            return new v6.b(new v6.a(t6.a.id_alg_hss_lms_hashsig), new c1(org.bouncycastle.pqc.crypto.lms.a.compose().u32str(fVar.getL()).bytes(fVar.getLMSPublicKey()).build()));
        }
        if (aVar instanceof x) {
            x xVar = (x) aVar;
            byte[] publicSeed = xVar.getPublicSeed();
            byte[] root = xVar.getRoot();
            byte[] encoded = xVar.getEncoded();
            return encoded.length > publicSeed.length + root.length ? new v6.b(new v6.a(r6.a.id_alg_xmss), new c1(encoded)) : new v6.b(new v6.a(c7.e.xmss, new i(xVar.getParameters().getHeight(), e.xmssLookupTreeAlgID(xVar.getTreeDigest()))), new n(publicSeed, root));
        }
        if (!(aVar instanceof s)) {
            if (!(aVar instanceof d7.c)) {
                throw new IOException("key parameters not recognized");
            }
            d7.c cVar2 = (d7.c) aVar;
            return new v6.b(new v6.a(c7.e.mcElieceCca2), new c7.b(cVar2.getN(), cVar2.getT(), cVar2.getG(), e.getAlgorithmIdentifier(cVar2.getDigest())));
        }
        s sVar = (s) aVar;
        byte[] publicSeed2 = sVar.getPublicSeed();
        byte[] root2 = sVar.getRoot();
        byte[] encoded2 = sVar.getEncoded();
        return encoded2.length > publicSeed2.length + root2.length ? new v6.b(new v6.a(r6.a.id_alg_xmssmt), new c1(encoded2)) : new v6.b(new v6.a(c7.e.xmss_mt, new j(sVar.getParameters().getHeight(), sVar.getParameters().getLayers(), e.xmssLookupTreeAlgID(sVar.getTreeDigest()))), new l(sVar.getPublicSeed(), sVar.getRoot()));
    }
}
