package org.bouncycastle.crypto.digests;

import org.bouncycastle.pqc.crypto.xmss.o;

/* loaded from: classes5.dex */
public class k extends d {
    private static final int DIGEST_LENGTH = 64;

    public k() {
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new k(this);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        finish();
        org.bouncycastle.util.i.longToBigEndian(this.H1, bArr, i8);
        org.bouncycastle.util.i.longToBigEndian(this.H2, bArr, i8 + 8);
        org.bouncycastle.util.i.longToBigEndian(this.H3, bArr, i8 + 16);
        org.bouncycastle.util.i.longToBigEndian(this.H4, bArr, i8 + 24);
        org.bouncycastle.util.i.longToBigEndian(this.H5, bArr, i8 + 32);
        org.bouncycastle.util.i.longToBigEndian(this.H6, bArr, i8 + 40);
        org.bouncycastle.util.i.longToBigEndian(this.H7, bArr, i8 + 48);
        org.bouncycastle.util.i.longToBigEndian(this.H8, bArr, i8 + 56);
        reset();
        return 64;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return o.SHA_512;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.digests.a
    public byte[] getEncodedState() {
        byte[] bArr = new byte[getEncodedStateSize()];
        super.populateState(bArr);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public void reset() {
        super.reset();
        this.H1 = 7640891576956012808L;
        this.H2 = -4942790177534073029L;
        this.H3 = 4354685564936845355L;
        this.H4 = -6534734903238641935L;
        this.H5 = 5840696475078001361L;
        this.H6 = -7276294671716946913L;
        this.H7 = 2270897969802886507L;
        this.H8 = 6620516959819538809L;
    }

    public k(k kVar) {
        super(kVar);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        copyIn((k) gVar);
    }

    public k(byte[] bArr) {
        restoreState(bArr);
    }
}
