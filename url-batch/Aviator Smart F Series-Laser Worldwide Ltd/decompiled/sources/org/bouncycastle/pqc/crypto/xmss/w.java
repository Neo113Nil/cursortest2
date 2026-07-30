package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.g;

/* loaded from: classes5.dex */
public final class w extends o implements y, org.bouncycastle.util.c {
    private volatile BDS bdsState;
    private final v params;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;

    public static class b {
        private final v params;
        private int index = 0;
        private int maxIndex = -1;
        private byte[] secretKeySeed = null;
        private byte[] secretKeyPRF = null;
        private byte[] publicSeed = null;
        private byte[] root = null;
        private BDS bdsState = null;
        private byte[] privateKey = null;

        public b(v vVar) {
            this.params = vVar;
        }

        public w build() {
            return new w(this);
        }

        public b withBDSState(BDS bds) {
            this.bdsState = bds;
            return this;
        }

        public b withIndex(int i8) {
            this.index = i8;
            return this;
        }

        public b withMaxIndex(int i8) {
            this.maxIndex = i8;
            return this;
        }

        public b withPrivateKey(byte[] bArr) {
            this.privateKey = z.cloneArray(bArr);
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

    private w(b bVar) {
        super(true, bVar.params.getTreeDigest());
        v vVar = bVar.params;
        this.params = vVar;
        if (vVar == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = vVar.getTreeDigestSize();
        byte[] bArr = bVar.privateKey;
        if (bArr != null) {
            int height = vVar.getHeight();
            int bigEndianToInt = org.bouncycastle.util.i.bigEndianToInt(bArr, 0);
            if (!z.isIndexValid(height, bigEndianToInt)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.secretKeySeed = z.extractBytesAtOffset(bArr, 4, treeDigestSize);
            int i8 = 4 + treeDigestSize;
            this.secretKeyPRF = z.extractBytesAtOffset(bArr, i8, treeDigestSize);
            int i9 = i8 + treeDigestSize;
            this.publicSeed = z.extractBytesAtOffset(bArr, i9, treeDigestSize);
            int i10 = i9 + treeDigestSize;
            this.root = z.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            try {
                BDS bds = (BDS) z.deserialize(z.extractBytesAtOffset(bArr, i11, bArr.length - i11), BDS.class);
                if (bds.getIndex() != bigEndianToInt) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.bdsState = bds.withWOTSDigest(bVar.params.getTreeDigestOID());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
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
        BDS bds2 = bVar.bdsState;
        this.bdsState = bds2 == null ? (bVar.index >= (1 << vVar.getHeight()) + (-2) || bArr4 == null || bArr2 == null) ? new BDS(vVar, (1 << vVar.getHeight()) - 1, bVar.index) : new BDS(vVar, bArr4, bArr2, (g) new g.b().build(), bVar.index) : bds2;
        if (bVar.maxIndex >= 0 && bVar.maxIndex != this.bdsState.getMaxIndex()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public w extractKeyShard(int i8) {
        w build;
        if (i8 < 1) {
            throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j8 = i8;
            try {
                if (j8 > getUsagesRemaining()) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                build = new b(this.params).withSecretKeySeed(this.secretKeySeed).withSecretKeyPRF(this.secretKeyPRF).withPublicSeed(this.publicSeed).withRoot(this.root).withIndex(getIndex()).withBDSState(this.bdsState.withMaxIndex((this.bdsState.getIndex() + i8) - 1, this.params.getTreeDigestOID())).build();
                if (j8 == getUsagesRemaining()) {
                    this.bdsState = new BDS(this.params, this.bdsState.getMaxIndex(), getIndex() + i8);
                } else {
                    g gVar = (g) new g.b().build();
                    for (int i9 = 0; i9 != i8; i9++) {
                        this.bdsState = this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, gVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    BDS getBDSState() {
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

    public int getIndex() {
        return this.bdsState.getIndex();
    }

    public w getNextKey() {
        w extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
    }

    public v getParameters() {
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

    w rollKey() {
        synchronized (this) {
            try {
                this.bdsState = this.bdsState.getIndex() < this.bdsState.getMaxIndex() ? this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, (g) new g.b().build()) : new BDS(this.params, this.bdsState.getMaxIndex(), this.bdsState.getMaxIndex() + 1);
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
                byte[] bArr = new byte[treeDigestSize + 4 + treeDigestSize + treeDigestSize + treeDigestSize];
                org.bouncycastle.util.i.intToBigEndian(this.bdsState.getIndex(), bArr, 0);
                z.copyBytesAtOffset(bArr, this.secretKeySeed, 4);
                int i8 = 4 + treeDigestSize;
                z.copyBytesAtOffset(bArr, this.secretKeyPRF, i8);
                int i9 = i8 + treeDigestSize;
                z.copyBytesAtOffset(bArr, this.publicSeed, i9);
                z.copyBytesAtOffset(bArr, this.root, i9 + treeDigestSize);
                try {
                    concatenate = org.bouncycastle.util.a.concatenate(bArr, z.serialize(this.bdsState));
                } catch (IOException e8) {
                    throw new RuntimeException("error serializing bds state: " + e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concatenate;
    }
}
