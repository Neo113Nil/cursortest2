package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
public final class s extends p implements y, org.bouncycastle.util.c {
    private final int oid;
    private final q params;
    private final byte[] publicSeed;
    private final byte[] root;

    public static class b {
        private final q params;
        private byte[] root = null;
        private byte[] publicSeed = null;
        private byte[] publicKey = null;

        public b(q qVar) {
            this.params = qVar;
        }

        public s build() {
            return new s(this);
        }

        public b withPublicKey(byte[] bArr) {
            this.publicKey = z.cloneArray(bArr);
            return this;
        }

        public b withPublicSeed(byte[] bArr) {
            this.publicSeed = z.cloneArray(bArr);
            return this;
        }

        public b withRoot(byte[] bArr) {
            this.root = z.cloneArray(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(false, bVar.params.getTreeDigest());
        q qVar = bVar.params;
        this.params = qVar;
        if (qVar == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = qVar.getTreeDigestSize();
        byte[] bArr = bVar.publicKey;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.oid = 0;
                this.root = z.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.publicSeed = z.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            } else {
                if (bArr.length != treeDigestSize + 4 + treeDigestSize) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.oid = org.bouncycastle.util.i.bigEndianToInt(bArr, 0);
                this.root = z.extractBytesAtOffset(bArr, 4, treeDigestSize);
                this.publicSeed = z.extractBytesAtOffset(bArr, 4 + treeDigestSize, treeDigestSize);
                return;
            }
        }
        if (qVar.getOid() != null) {
            this.oid = qVar.getOid().getOid();
        } else {
            this.oid = 0;
        }
        byte[] bArr2 = bVar.root;
        if (bArr2 == null) {
            this.root = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.root = bArr2;
        }
        byte[] bArr3 = bVar.publicSeed;
        if (bArr3 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.publicSeed = bArr3;
        }
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        return toByteArray();
    }

    public q getParameters() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return z.cloneArray(this.publicSeed);
    }

    public byte[] getRoot() {
        return z.cloneArray(this.root);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.y
    public byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.params.getTreeDigestSize();
        int i8 = this.oid;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            org.bouncycastle.util.i.intToBigEndian(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        z.copyBytesAtOffset(bArr, this.root, i9);
        z.copyBytesAtOffset(bArr, this.publicSeed, i9 + treeDigestSize);
        return bArr;
    }
}
