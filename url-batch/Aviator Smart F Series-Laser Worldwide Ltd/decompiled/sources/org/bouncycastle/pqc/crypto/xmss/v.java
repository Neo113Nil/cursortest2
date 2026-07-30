package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class v {
    private static final Map<Integer, v> paramsLookupTable;
    private final int height;

    /* renamed from: k, reason: collision with root package name */
    private final int f17210k;
    private final u oid;
    private final String treeDigest;
    private final org.bouncycastle.asn1.o treeDigestOID;
    private final int treeDigestSize;
    private final int winternitzParameter;
    private final j wotsPlusParams;

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = org.bouncycastle.util.e.valueOf(1);
        org.bouncycastle.asn1.o oVar = org.bouncycastle.asn1.nist.b.id_sha256;
        hashMap.put(valueOf, new v(10, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(2), new v(16, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(3), new v(20, oVar));
        Integer valueOf2 = org.bouncycastle.util.e.valueOf(4);
        org.bouncycastle.asn1.o oVar2 = org.bouncycastle.asn1.nist.b.id_sha512;
        hashMap.put(valueOf2, new v(10, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(5), new v(16, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(6), new v(20, oVar2));
        Integer valueOf3 = org.bouncycastle.util.e.valueOf(7);
        org.bouncycastle.asn1.o oVar3 = org.bouncycastle.asn1.nist.b.id_shake128;
        hashMap.put(valueOf3, new v(10, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(8), new v(16, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(9), new v(20, oVar3));
        Integer valueOf4 = org.bouncycastle.util.e.valueOf(10);
        org.bouncycastle.asn1.o oVar4 = org.bouncycastle.asn1.nist.b.id_shake256;
        hashMap.put(valueOf4, new v(10, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(11), new v(16, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(12), new v(20, oVar4));
        paramsLookupTable = Collections.unmodifiableMap(hashMap);
    }

    public v(int i8, org.bouncycastle.asn1.o oVar) {
        if (i8 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (oVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.height = i8;
        this.f17210k = determineMinK();
        String digestName = c.getDigestName(oVar);
        this.treeDigest = digestName;
        this.treeDigestOID = oVar;
        j jVar = new j(oVar);
        this.wotsPlusParams = jVar;
        int treeDigestSize = jVar.getTreeDigestSize();
        this.treeDigestSize = treeDigestSize;
        int winternitzParameter = jVar.getWinternitzParameter();
        this.winternitzParameter = winternitzParameter;
        this.oid = b.lookup(digestName, treeDigestSize, winternitzParameter, jVar.getLen(), i8);
    }

    private int determineMinK() {
        int i8 = 2;
        while (true) {
            int i9 = this.height;
            if (i8 > i9) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i9 - i8) % 2 == 0) {
                return i8;
            }
            i8++;
        }
    }

    public static v lookupByOID(int i8) {
        return paramsLookupTable.get(org.bouncycastle.util.e.valueOf(i8));
    }

    public int getHeight() {
        return this.height;
    }

    int getK() {
        return this.f17210k;
    }

    int getLen() {
        return this.wotsPlusParams.getLen();
    }

    u getOid() {
        return this.oid;
    }

    String getTreeDigest() {
        return this.treeDigest;
    }

    public org.bouncycastle.asn1.o getTreeDigestOID() {
        return this.treeDigestOID;
    }

    public int getTreeDigestSize() {
        return this.treeDigestSize;
    }

    h getWOTSPlus() {
        return new h(this.wotsPlusParams);
    }

    int getWinternitzParameter() {
        return this.winternitzParameter;
    }

    public v(int i8, org.bouncycastle.crypto.e eVar) {
        this(i8, c.getDigestOID(eVar.getAlgorithmName()));
    }
}
