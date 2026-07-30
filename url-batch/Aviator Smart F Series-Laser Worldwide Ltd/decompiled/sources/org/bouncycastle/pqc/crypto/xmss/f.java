package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.n;

/* loaded from: classes5.dex */
final class f extends n {
    private static final int TYPE = 1;
    private final int lTreeAddress;
    private final int treeHeight;
    private final int treeIndex;

    protected static class b extends n.a {
        private int lTreeAddress;
        private int treeHeight;
        private int treeIndex;

        protected b() {
            super(1);
            this.lTreeAddress = 0;
            this.treeHeight = 0;
            this.treeIndex = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        protected n build() {
            return new f(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        public b getThis() {
            return this;
        }

        protected b withLTreeAddress(int i8) {
            this.lTreeAddress = i8;
            return this;
        }

        protected b withTreeHeight(int i8) {
            this.treeHeight = i8;
            return this;
        }

        protected b withTreeIndex(int i8) {
            this.treeIndex = i8;
            return this;
        }
    }

    private f(b bVar) {
        super(bVar);
        this.lTreeAddress = bVar.lTreeAddress;
        this.treeHeight = bVar.treeHeight;
        this.treeIndex = bVar.treeIndex;
    }

    protected int getLTreeAddress() {
        return this.lTreeAddress;
    }

    protected int getTreeHeight() {
        return this.treeHeight;
    }

    protected int getTreeIndex() {
        return this.treeIndex;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.n
    protected byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        org.bouncycastle.util.i.intToBigEndian(this.lTreeAddress, byteArray, 16);
        org.bouncycastle.util.i.intToBigEndian(this.treeHeight, byteArray, 20);
        org.bouncycastle.util.i.intToBigEndian(this.treeIndex, byteArray, 24);
        return byteArray;
    }
}
