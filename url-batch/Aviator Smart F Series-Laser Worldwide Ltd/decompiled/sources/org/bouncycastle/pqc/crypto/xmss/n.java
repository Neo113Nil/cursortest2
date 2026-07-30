package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
public abstract class n {
    private final int keyAndMask;
    private final int layerAddress;
    private final long treeAddress;
    private final int type;

    protected static abstract class a {
        private final int type;
        private int layerAddress = 0;
        private long treeAddress = 0;
        private int keyAndMask = 0;

        protected a(int i8) {
            this.type = i8;
        }

        protected abstract n build();

        protected abstract a getThis();

        protected a withKeyAndMask(int i8) {
            this.keyAndMask = i8;
            return getThis();
        }

        protected a withLayerAddress(int i8) {
            this.layerAddress = i8;
            return getThis();
        }

        protected a withTreeAddress(long j8) {
            this.treeAddress = j8;
            return getThis();
        }
    }

    protected n(a aVar) {
        this.layerAddress = aVar.layerAddress;
        this.treeAddress = aVar.treeAddress;
        this.type = aVar.type;
        this.keyAndMask = aVar.keyAndMask;
    }

    public final int getKeyAndMask() {
        return this.keyAndMask;
    }

    protected final int getLayerAddress() {
        return this.layerAddress;
    }

    protected final long getTreeAddress() {
        return this.treeAddress;
    }

    public final int getType() {
        return this.type;
    }

    protected byte[] toByteArray() {
        byte[] bArr = new byte[32];
        org.bouncycastle.util.i.intToBigEndian(this.layerAddress, bArr, 0);
        org.bouncycastle.util.i.longToBigEndian(this.treeAddress, bArr, 4);
        org.bouncycastle.util.i.intToBigEndian(this.type, bArr, 12);
        org.bouncycastle.util.i.intToBigEndian(this.keyAndMask, bArr, 28);
        return bArr;
    }
}
