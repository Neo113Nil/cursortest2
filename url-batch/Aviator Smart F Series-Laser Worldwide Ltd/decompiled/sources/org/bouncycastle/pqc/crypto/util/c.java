package org.bouncycastle.pqc.crypto.util;

import c7.j;
import c7.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.p;
import org.bouncycastle.pqc.crypto.lms.r;
import org.bouncycastle.pqc.crypto.xmss.q;
import org.bouncycastle.pqc.crypto.xmss.s;
import org.bouncycastle.pqc.crypto.xmss.v;
import org.bouncycastle.pqc.crypto.xmss.x;

/* loaded from: classes5.dex */
public class c {
    private static Map converters;

    private static class b extends g {
        private b() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            byte[] octets = p.getInstance(bVar.parsePublicKey()).getOctets();
            if (org.bouncycastle.util.i.bigEndianToInt(octets, 0) == 1) {
                return r.getInstance(org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length));
            }
            if (octets.length == 64) {
                octets = org.bouncycastle.util.a.copyOfRange(octets, 4, octets.length);
            }
            return org.bouncycastle.pqc.crypto.lms.f.getInstance(octets);
        }
    }

    /* renamed from: org.bouncycastle.pqc.crypto.util.c$c, reason: collision with other inner class name */
    private static class C0395c extends g {
        private C0395c() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            c7.b bVar2 = c7.b.getInstance(bVar.parsePublicKey());
            return new d7.c(bVar2.getN(), bVar2.getT(), bVar2.getG(), org.bouncycastle.pqc.crypto.util.e.getDigestName(bVar2.getDigest().getAlgorithm()));
        }
    }

    private static class d extends g {
        private d() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            return new org.bouncycastle.pqc.crypto.newhope.b(bVar.getPublicKeyData().getBytes());
        }
    }

    private static class e extends g {
        private e() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            return new org.bouncycastle.pqc.crypto.qtesla.b(org.bouncycastle.pqc.crypto.util.e.qTeslaLookupSecurityCategory(bVar.getAlgorithm()), bVar.getPublicKeyData().getOctets());
        }
    }

    private static class f extends g {
        private f() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            return new org.bouncycastle.pqc.crypto.sphincs.c(bVar.getPublicKeyData().getBytes(), org.bouncycastle.pqc.crypto.util.e.sphincs256LookupTreeAlgName(c7.h.getInstance(bVar.getAlgorithm().getParameters())));
        }
    }

    private static abstract class g {
        private g() {
        }

        abstract org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj);
    }

    private static class h extends g {
        private h() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            x.b withPublicKey;
            c7.i iVar = c7.i.getInstance(bVar.getAlgorithm().getParameters());
            if (iVar != null) {
                o algorithm = iVar.getTreeDigest().getAlgorithm();
                n nVar = n.getInstance(bVar.parsePublicKey());
                withPublicKey = new x.b(new v(iVar.getHeight(), org.bouncycastle.pqc.crypto.util.e.getDigest(algorithm))).withPublicSeed(nVar.getPublicSeed()).withRoot(nVar.getRoot());
            } else {
                byte[] octets = p.getInstance(bVar.parsePublicKey()).getOctets();
                withPublicKey = new x.b(v.lookupByOID(org.bouncycastle.util.i.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }
    }

    private static class i extends g {
        private i() {
            super();
        }

        @Override // org.bouncycastle.pqc.crypto.util.c.g
        org.bouncycastle.crypto.params.a getPublicKeyParameters(v6.b bVar, Object obj) {
            s.b withPublicKey;
            j jVar = j.getInstance(bVar.getAlgorithm().getParameters());
            if (jVar != null) {
                o algorithm = jVar.getTreeDigest().getAlgorithm();
                n nVar = n.getInstance(bVar.parsePublicKey());
                withPublicKey = new s.b(new q(jVar.getHeight(), jVar.getLayers(), org.bouncycastle.pqc.crypto.util.e.getDigest(algorithm))).withPublicSeed(nVar.getPublicSeed()).withRoot(nVar.getRoot());
            } else {
                byte[] octets = p.getInstance(bVar.parsePublicKey()).getOctets();
                withPublicKey = new s.b(q.lookupByOID(org.bouncycastle.util.i.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        converters = hashMap;
        hashMap.put(c7.e.qTESLA_p_I, new e());
        converters.put(c7.e.qTESLA_p_III, new e());
        converters.put(c7.e.sphincs256, new f());
        converters.put(c7.e.newHope, new d());
        converters.put(c7.e.xmss, new h());
        converters.put(c7.e.xmss_mt, new i());
        converters.put(r6.a.id_alg_xmss, new h());
        converters.put(r6.a.id_alg_xmssmt, new i());
        converters.put(t6.a.id_alg_hss_lms_hashsig, new b());
        converters.put(c7.e.mcElieceCca2, new C0395c());
    }

    public static org.bouncycastle.crypto.params.a createKey(InputStream inputStream) {
        return createKey(v6.b.getInstance(new k(inputStream).readObject()));
    }

    public static org.bouncycastle.crypto.params.a createKey(v6.b bVar) {
        return createKey(bVar, null);
    }

    public static org.bouncycastle.crypto.params.a createKey(v6.b bVar, Object obj) {
        v6.a algorithm = bVar.getAlgorithm();
        g gVar = (g) converters.get(algorithm.getAlgorithm());
        if (gVar != null) {
            return gVar.getPublicKeyParameters(bVar, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + algorithm.getAlgorithm());
    }

    public static org.bouncycastle.crypto.params.a createKey(byte[] bArr) {
        return createKey(v6.b.getInstance(org.bouncycastle.asn1.s.fromByteArray(bArr)));
    }
}
