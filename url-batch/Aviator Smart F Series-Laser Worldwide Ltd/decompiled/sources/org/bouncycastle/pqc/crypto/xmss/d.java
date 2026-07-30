package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.n;

/* loaded from: classes5.dex */
final class d extends n {
    private static final int PADDING = 0;
    private static final int TYPE = 2;
    private final int padding;
    private final int treeHeight;
    private final int treeIndex;

    protected static class b extends n.a {
        private int treeHeight;
        private int treeIndex;

        protected b() {
            super(2);
            this.treeHeight = 0;
            this.treeIndex = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        protected n build() {
            return new d(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        public b getThis() {
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

    private d(b bVar) {
        super(bVar);
        this.padding = 0;
        this.treeHeight = bVar.treeHeight;
        this.treeIndex = bVar.treeIndex;
    }

    protected int getPadding() {
        return this.padding;
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
        org.bouncycastle.util.i.intToBigEndian(this.padding, byteArray, 16);
        org.bouncycastle.util.i.intToBigEndian(this.treeHeight, byteArray, 20);
        org.bouncycastle.util.i.intToBigEndian(this.treeIndex, byteArray, 24);
        return byteArray;
    }
}
