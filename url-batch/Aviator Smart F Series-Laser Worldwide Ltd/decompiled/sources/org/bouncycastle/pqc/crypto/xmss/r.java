package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class r extends p implements y, org.bouncycastle.util.c {
    private volatile BDSStateMap bdsState;
    private volatile long index;
    private final q params;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;
    private volatile boolean used;

    public static class b {
        private final q params;
        private long index = 0;
        private long maxIndex = -1;
        private byte[] secretKeySeed = null;
        private byte[] secretKeyPRF = null;
        private byte[] publicSeed = null;
        private byte[] root = null;
        private BDSStateMap bdsState = null;
        private byte[] privateKey = null;
        private v xmss = null;

        public b(q qVar) {
            this.params = qVar;
        }

        public r build() {
            return new r(this);
        }

        public b withBDSState(BDSStateMap bDSStateMap) {
            if (bDSStateMap.getMaxIndex() == 0) {
                this.bdsState = new BDSStateMap(bDSStateMap, (1 << this.params.getHeight()) - 1);
            } else {
                this.bdsState = bDSStateMap;
            }
            return this;
        }

        public b withIndex(long j8) {
            this.index = j8;
            return this;
        }

        public b withMaxIndex(long j8) {
            this.maxIndex = j8;
            return this;
        }

        public b withPrivateKey(byte[] bArr) {
            this.privateKey = z.cloneArray(bArr);
            this.xmss = this.params.getXMSSParameters();
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

        public b withSecretKeyPRF(byte[] bArr) {
            this.secretKeyPRF = z.cloneArray(bArr);
            return this;
        }

        public b withSecretKeySeed(byte[] bArr) {
            this.secretKeySeed = z.cloneArray(bArr);
            return this;
        }
    }

    private r(b bVar) {
        super(true, bVar.params.getTreeDigest());
        q qVar = bVar.params;
        this.params = qVar;
        if (qVar == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = qVar.getTreeDigestSize();
        byte[] bArr = bVar.privateKey;
        if (bArr != null) {
            if (bVar.xmss == null) {
                throw new NullPointerException("xmss == null");
            }
            int height = qVar.getHeight();
            int i8 = (height + 7) / 8;
            this.index = z.bytesToXBigEndian(bArr, 0, i8);
            if (!z.isIndexValid(height, this.index)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.secretKeySeed = z.extractBytesAtOffset(bArr, i8, treeDigestSize);
            int i9 = i8 + treeDigestSize;
            this.secretKeyPRF = z.extractBytesAtOffset(bArr, i9, treeDigestSize);
            int i10 = i9 + treeDigestSize;
            this.publicSeed = z.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            this.root = z.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            try {
                this.bdsState = ((BDSStateMap) z.deserialize(z.extractBytesAtOffset(bArr, i12, bArr.length - i12), BDSStateMap.class)).withWOTSDigest(bVar.xmss.getTreeDigestOID());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        this.index = bVar.index;
        byte[] bArr2 = bVar.secretKeySeed;
        if (bArr2 == null) {
            this.secretKeySeed = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.secretKeySeed = bArr2;
        }
        byte[] bArr3 = bVar.secretKeyPRF;
        if (bArr3 == null) {
            this.secretKeyPRF = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.secretKeyPRF = bArr3;
        }
        byte[] bArr4 = bVar.publicSeed;
        if (bArr4 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.publicSeed = bArr4;
        }
        byte[] bArr5 = bVar.root;
        if (bArr5 == null) {
            this.root = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.root = bArr5;
        }
        BDSStateMap bDSStateMap = bVar.bdsState;
        if (bDSStateMap == null) {
            bDSStateMap = (!z.isIndexValid(qVar.getHeight(), bVar.index) || bArr4 == null || bArr2 == null) ? new BDSStateMap(bVar.maxIndex + 1) : new BDSStateMap(qVar, bVar.index, bArr4, bArr2);
        }
        this.bdsState = bDSStateMap;
        if (bVar.maxIndex >= 0 && bVar.maxIndex != this.bdsState.getMaxIndex()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r extractKeyShard(int i8) {
        r build;
        if (i8 < 1) {
            throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j8 = i8;
            try {
                if (j8 > getUsagesRemaining()) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                build = new b(this.params).withSecretKeySeed(this.secretKeySeed).withSecretKeyPRF(this.secretKeyPRF).withPublicSeed(this.publicSeed).withRoot(this.root).withIndex(getIndex()).withBDSState(new BDSStateMap(this.bdsState, (getIndex() + j8) - 1)).build();
                for (int i9 = 0; i9 != i8; i9++) {
                    rollKey();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    BDSStateMap getBDSState() {
        return this.bdsState;
    }

    @Override // org.bouncycastle.util.c
    public byte[] getEncoded() {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public long getIndex() {
        return this.index;
    }

    public r getNextKey() {
        r extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
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

    public byte[] getSecretKeyPRF() {
        return z.cloneArray(this.secretKeyPRF);
    }

    public byte[] getSecretKeySeed() {
        return z.cloneArray(this.secretKeySeed);
    }

    public long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.bdsState.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    r rollKey() {
        synchronized (this) {
            try {
                if (getIndex() < this.bdsState.getMaxIndex()) {
                    this.bdsState.updateState(this.params, this.index, this.publicSeed, this.secretKeySeed);
                    this.index++;
                } else {
                    this.index = this.bdsState.getMaxIndex() + 1;
                    this.bdsState = new BDSStateMap(this.bdsState.getMaxIndex());
                }
                this.used = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.y
    public byte[] toByteArray() {
        byte[] concatenate;
        synchronized (this) {
            try {
                int treeDigestSize = this.params.getTreeDigestSize();
                int height = (this.params.getHeight() + 7) / 8;
                byte[] bArr = new byte[height + treeDigestSize + treeDigestSize + treeDigestSize + treeDigestSize];
                z.copyBytesAtOffset(bArr, z.toBytesBigEndian(this.index, height), 0);
                z.copyBytesAtOffset(bArr, this.secretKeySeed, height);
                int i8 = height + treeDigestSize;
                z.copyBytesAtOffset(bArr, this.secretKeyPRF, i8);
                int i9 = i8 + treeDigestSize;
                z.copyBytesAtOffset(bArr, this.publicSeed, i9);
                z.copyBytesAtOffset(bArr, this.root, i9 + treeDigestSize);
                try {
                    concatenate = org.bouncycastle.util.a.concatenate(bArr, z.serialize(this.bdsState));
                } catch (IOException e8) {
                    throw new IllegalStateException("error serializing bds state: " + e8.getMessage(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concatenate;
    }
}
