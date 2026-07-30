package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
final class j {
    private final int digestSize;
    private final int len;
    private final int len1;
    private final int len2;
    private final u oid;
    private final org.bouncycastle.asn1.o treeDigest;
    private final int winternitzParameter;

    protected j(org.bouncycastle.asn1.o oVar) {
        if (oVar == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.treeDigest = oVar;
        org.bouncycastle.crypto.e digest = c.getDigest(oVar);
        int digestSize = z.getDigestSize(digest);
        this.digestSize = digestSize;
        this.winternitzParameter = 16;
        int ceil = (int) Math.ceil((digestSize * 8) / z.log2(16));
        this.len1 = ceil;
        int floor = ((int) Math.floor(z.log2((16 - 1) * ceil) / z.log2(16))) + 1;
        this.len2 = floor;
        int i8 = ceil + floor;
        this.len = i8;
        i lookup = i.lookup(digest.getAlgorithmName(), digestSize, 16, i8);
        this.oid = lookup;
        if (lookup != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + digest.getAlgorithmName());
    }

    protected int getLen() {
        return this.len;
    }

    protected int getLen1() {
        return this.len1;
    }

    protected int getLen2() {
        return this.len2;
    }

    protected u getOid() {
        return this.oid;
    }

    public org.bouncycastle.asn1.o getTreeDigest() {
        return this.treeDigest;
    }

    protected int getTreeDigestSize() {
        return this.digestSize;
    }

    protected int getWinternitzParameter() {
        return this.winternitzParameter;
    }
}
