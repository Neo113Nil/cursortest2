package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: classes10.dex */
public final class XMSSMTSignature implements XMSSStoreableObjectInterface, Encodable {
    private final long index;
    private final XMSSMTParameters params;
    private final byte[] random;
    private final List<XMSSReducedSignature> reducedSignatures;

    public static class Builder {
        private final XMSSMTParameters params;
        private long index = 0;
        private byte[] random = null;
        private List<XMSSReducedSignature> reducedSignatures = null;
        private byte[] signature = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.params = xMSSMTParameters;
        }

        public XMSSMTSignature build() {
            return new XMSSMTSignature(this);
        }

        public Builder withIndex(long j) {
            this.index = j;
            return this;
        }

        public Builder withRandom(byte[] bArr) {
            this.random = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withReducedSignatures(List<XMSSReducedSignature> list) {
            this.reducedSignatures = list;
            return this;
        }

        public Builder withSignature(byte[] bArr) {
            this.signature = Arrays.clone(bArr);
            return this;
        }
    }

    private XMSSMTSignature(Builder builder) {
        XMSSMTParameters xMSSMTParameters = builder.params;
        this.params = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$2("params == null");
            throw null;
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.signature;
        if (bArr == null) {
            this.index = builder.index;
            byte[] bArr2 = builder.random;
            if (bArr2 == null) {
                this.random = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    a$$ExternalSyntheticBUOutline0.m$3("size of random needs to be equal to size of digest");
                    throw null;
                }
                this.random = bArr2;
            }
            List<XMSSReducedSignature> list = builder.reducedSignatures;
            if (list != null) {
                this.reducedSignatures = list;
                return;
            } else {
                this.reducedSignatures = new ArrayList();
                return;
            }
        }
        int len = xMSSMTParameters.getWOTSPlus().getParams().getLen();
        int ceil = (int) Math.ceil(xMSSMTParameters.getHeight() / 8.0d);
        int height = ((xMSSMTParameters.getHeight() / xMSSMTParameters.getLayers()) + len) * treeDigestSize;
        if (bArr.length != ceil + treeDigestSize + (xMSSMTParameters.getLayers() * height)) {
            a$$ExternalSyntheticBUOutline0.m$3("signature has wrong size");
            throw null;
        }
        long bytesToXBigEndian = XMSSUtil.bytesToXBigEndian(bArr, 0, ceil);
        this.index = bytesToXBigEndian;
        if (!XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), bytesToXBigEndian)) {
            a$$ExternalSyntheticBUOutline0.m$3("index out of bounds");
            throw null;
        }
        this.random = XMSSUtil.extractBytesAtOffset(bArr, ceil, treeDigestSize);
        this.reducedSignatures = new ArrayList();
        for (int i = ceil + treeDigestSize; i < bArr.length; i += height) {
            this.reducedSignatures.add(new XMSSReducedSignature.Builder(this.params.getXMSSParameters()).withReducedSignature(XMSSUtil.extractBytesAtOffset(bArr, i, height)).build());
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return toByteArray();
    }

    public long getIndex() {
        return this.index;
    }

    public byte[] getRandom() {
        return XMSSUtil.cloneArray(this.random);
    }

    public List<XMSSReducedSignature> getReducedSignatures() {
        return this.reducedSignatures;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = this.params.getTreeDigestSize();
        int len = this.params.getWOTSPlus().getParams().getLen();
        int ceil = (int) Math.ceil(this.params.getHeight() / 8.0d);
        int height = ((this.params.getHeight() / this.params.getLayers()) + len) * treeDigestSize;
        byte[] bArr = new byte[ceil + treeDigestSize + (this.params.getLayers() * height)];
        XMSSUtil.copyBytesAtOffset(bArr, XMSSUtil.toBytesBigEndian(this.index, ceil), 0);
        XMSSUtil.copyBytesAtOffset(bArr, this.random, ceil);
        int i = ceil + treeDigestSize;
        Iterator<XMSSReducedSignature> it = this.reducedSignatures.iterator();
        while (it.hasNext()) {
            XMSSUtil.copyBytesAtOffset(bArr, it.next().toByteArray(), i);
            i += height;
        }
        return bArr;
    }
}
