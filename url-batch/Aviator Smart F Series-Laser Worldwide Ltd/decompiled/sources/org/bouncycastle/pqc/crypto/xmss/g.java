package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.n;

/* loaded from: classes5.dex */
final class g extends n {
    private static final int TYPE = 0;
    private final int chainAddress;
    private final int hashAddress;
    private final int otsAddress;

    protected static class b extends n.a {
        private int chainAddress;
        private int hashAddress;
        private int otsAddress;

        protected b() {
            super(0);
            this.otsAddress = 0;
            this.chainAddress = 0;
            this.hashAddress = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        protected n build() {
            return new g(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.bouncycastle.pqc.crypto.xmss.n.a
        public b getThis() {
            return this;
        }

        protected b withChainAddress(int i8) {
            this.chainAddress = i8;
            return this;
        }

        protected b withHashAddress(int i8) {
            this.hashAddress = i8;
            return this;
        }

        protected b withOTSAddress(int i8) {
            this.otsAddress = i8;
            return this;
        }
    }

    private g(b bVar) {
        super(bVar);
        this.otsAddress = bVar.otsAddress;
        this.chainAddress = bVar.chainAddress;
        this.hashAddress = bVar.hashAddress;
    }

    protected int getChainAddress() {
        return this.chainAddress;
    }

    protected int getHashAddress() {
        return this.hashAddress;
    }

    protected int getOTSAddress() {
        return this.otsAddress;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.n
    protected byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        org.bouncycastle.util.i.intToBigEndian(this.otsAddress, byteArray, 16);
        org.bouncycastle.util.i.intToBigEndian(this.chainAddress, byteArray, 20);
        org.bouncycastle.util.i.intToBigEndian(this.hashAddress, byteArray, 24);
        return byteArray;
    }
}
