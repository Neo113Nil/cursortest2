package org.bouncycastle.crypto.digests;

/* loaded from: classes5.dex */
public class i extends d {
    private static final int DIGEST_LENGTH = 48;

    public i() {
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public org.bouncycastle.util.g copy() {
        return new i(this);
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
        reset();
        return 48;
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "SHA-384";
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.crypto.f, org.bouncycastle.crypto.e
    public int getDigestSize() {
        return 48;
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
        this.H1 = -3766243637369397544L;
        this.H2 = 7105036623409894663L;
        this.H3 = -7973340178411365097L;
        this.H4 = 1526699215303891257L;
        this.H5 = 7436329637833083697L;
        this.H6 = -8163818279084223215L;
        this.H7 = -2662702644619276377L;
        this.H8 = 5167115440072839076L;
    }

    public i(i iVar) {
        super(iVar);
    }

    @Override // org.bouncycastle.crypto.digests.d, org.bouncycastle.util.g
    public void reset(org.bouncycastle.util.g gVar) {
        super.copyIn((i) gVar);
    }

    public i(byte[] bArr) {
        restoreState(bArr);
    }
}
