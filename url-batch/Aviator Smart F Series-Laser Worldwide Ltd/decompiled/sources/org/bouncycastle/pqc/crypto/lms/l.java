package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
public class l implements org.bouncycastle.crypto.e {
    private final byte[] C;
    private volatile org.bouncycastle.crypto.e digest;
    private final h key;
    private final byte[][] path;
    private final i publicKey;
    private final LMSigParameters sigParams;
    private final Object signature;
    private t[] signedPubKeys;

    public l(h hVar, LMSigParameters lMSigParameters, org.bouncycastle.crypto.e eVar, byte[] bArr, byte[][] bArr2) {
        this.key = hVar;
        this.sigParams = lMSigParameters;
        this.digest = eVar;
        this.C = bArr;
        this.path = bArr2;
        this.publicKey = null;
        this.signature = null;
    }

    @Override // org.bouncycastle.crypto.e
    public int doFinal(byte[] bArr, int i8) {
        return this.digest.doFinal(bArr, i8);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName();
    }

    byte[] getC() {
        return this.C;
    }

    @Override // org.bouncycastle.crypto.e
    public int getDigestSize() {
        return this.digest.getDigestSize();
    }

    byte[][] getPath() {
        return this.path;
    }

    h getPrivateKey() {
        return this.key;
    }

    public i getPublicKey() {
        return this.publicKey;
    }

    byte[] getQ() {
        byte[] bArr = new byte[34];
        this.digest.doFinal(bArr, 0);
        this.digest = null;
        return bArr;
    }

    LMSigParameters getSigParams() {
        return this.sigParams;
    }

    public Object getSignature() {
        return this.signature;
    }

    t[] getSignedPubKeys() {
        return this.signedPubKeys;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.digest.reset();
    }

    @Override // org.bouncycastle.crypto.e
    public void update(byte b8) {
        this.digest.update(b8);
    }

    l withSignedPublicKeys(t[] tVarArr) {
        this.signedPubKeys = tVarArr;
        return this;
    }

    public l(i iVar, Object obj, org.bouncycastle.crypto.e eVar) {
        this.publicKey = iVar;
        this.signature = obj;
        this.digest = eVar;
        this.C = null;
        this.key = null;
        this.sigParams = null;
        this.path = null;
    }

    @Override // org.bouncycastle.crypto.e
    public void update(byte[] bArr, int i8, int i9) {
        this.digest.update(bArr, i8, i9);
    }
}
