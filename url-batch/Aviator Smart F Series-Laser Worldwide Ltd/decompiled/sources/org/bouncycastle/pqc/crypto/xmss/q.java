package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class q {
    private static final Map<Integer, q> paramsLookupTable;
    private final int height;
    private final int layers;
    private final u oid;
    private final v xmssParams;

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = org.bouncycastle.util.e.valueOf(1);
        org.bouncycastle.asn1.o oVar = org.bouncycastle.asn1.nist.b.id_sha256;
        hashMap.put(valueOf, new q(20, 2, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(2), new q(20, 4, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(3), new q(40, 2, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(4), new q(40, 4, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(5), new q(40, 8, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(6), new q(60, 3, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(7), new q(60, 6, oVar));
        hashMap.put(org.bouncycastle.util.e.valueOf(8), new q(60, 12, oVar));
        Integer valueOf2 = org.bouncycastle.util.e.valueOf(9);
        org.bouncycastle.asn1.o oVar2 = org.bouncycastle.asn1.nist.b.id_sha512;
        hashMap.put(valueOf2, new q(20, 2, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(10), new q(20, 4, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(11), new q(40, 2, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(12), new q(40, 4, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(13), new q(40, 8, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(14), new q(60, 3, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(15), new q(60, 6, oVar2));
        hashMap.put(org.bouncycastle.util.e.valueOf(16), new q(60, 12, oVar2));
        Integer valueOf3 = org.bouncycastle.util.e.valueOf(17);
        org.bouncycastle.asn1.o oVar3 = org.bouncycastle.asn1.nist.b.id_shake128;
        hashMap.put(valueOf3, new q(20, 2, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(18), new q(20, 4, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(19), new q(40, 2, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(20), new q(40, 4, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(21), new q(40, 8, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(22), new q(60, 3, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(23), new q(60, 6, oVar3));
        hashMap.put(org.bouncycastle.util.e.valueOf(24), new q(60, 12, oVar3));
        Integer valueOf4 = org.bouncycastle.util.e.valueOf(25);
        org.bouncycastle.asn1.o oVar4 = org.bouncycastle.asn1.nist.b.id_shake256;
        hashMap.put(valueOf4, new q(20, 2, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(26), new q(20, 4, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(27), new q(40, 2, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(28), new q(40, 4, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(29), new q(40, 8, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(30), new q(60, 3, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(31), new q(60, 6, oVar4));
        hashMap.put(org.bouncycastle.util.e.valueOf(32), new q(60, 12, oVar4));
        paramsLookupTable = Collections.unmodifiableMap(hashMap);
    }

    public q(int i8, int i9, org.bouncycastle.asn1.o oVar) {
        this.height = i8;
        this.layers = i9;
        this.xmssParams = new v(xmssTreeHeight(i8, i9), oVar);
        this.oid = a.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i9);
    }

    public static q lookupByOID(int i8) {
        return paramsLookupTable.get(org.bouncycastle.util.e.valueOf(i8));
    }

    private static int xmssTreeHeight(int i8, int i9) {
        if (i8 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i8 % i9 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i10 = i8 / i9;
        if (i10 != 1) {
            return i10;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    protected int getLen() {
        return this.xmssParams.getLen();
    }

    protected u getOid() {
        return this.oid;
    }

    protected String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public org.bouncycastle.asn1.o getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    protected h getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    protected v getXMSSParameters() {
        return this.xmssParams;
    }

    public q(int i8, int i9, org.bouncycastle.crypto.e eVar) {
        this(i8, i9, c.getDigestOID(eVar.getAlgorithmName()));
    }
}
