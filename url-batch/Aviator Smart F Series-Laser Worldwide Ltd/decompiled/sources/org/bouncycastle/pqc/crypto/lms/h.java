package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class h {
    private final byte[] I;
    private final byte[] masterSecret;
    private final LMOtsParameters parameter;

    /* renamed from: q, reason: collision with root package name */
    private final int f17201q;

    public h(LMOtsParameters lMOtsParameters, byte[] bArr, int i8, byte[] bArr2) {
        this.parameter = lMOtsParameters;
        this.I = bArr;
        this.f17201q = i8;
        this.masterSecret = bArr2;
    }

    w getDerivationFunction() {
        w wVar = new w(this.I, this.masterSecret, b.getDigest(this.parameter.getDigestOID()));
        wVar.setQ(this.f17201q);
        return wVar;
    }

    public byte[] getI() {
        return this.I;
    }

    public byte[] getMasterSecret() {
        return this.masterSecret;
    }

    public LMOtsParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f17201q;
    }

    l getSignatureContext(LMSigParameters lMSigParameters, byte[][] bArr) {
        byte[] bArr2 = new byte[32];
        w derivationFunction = getDerivationFunction();
        derivationFunction.setJ(-3);
        derivationFunction.deriveSeed(bArr2, false);
        org.bouncycastle.crypto.e digest = b.getDigest(this.parameter.getDigestOID());
        v.byteArray(getI(), digest);
        v.u32str(getQ(), digest);
        v.u16str((short) -32383, digest);
        v.byteArray(bArr2, digest);
        return new l(this, lMSigParameters, digest, bArr2, bArr);
    }
}
