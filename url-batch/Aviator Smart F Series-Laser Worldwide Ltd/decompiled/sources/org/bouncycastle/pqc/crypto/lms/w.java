package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
class w {
    private final byte[] I;
    private final org.bouncycastle.crypto.e digest;

    /* renamed from: j, reason: collision with root package name */
    private int f17207j;
    private final byte[] masterSeed;

    /* renamed from: q, reason: collision with root package name */
    private int f17208q;

    public w(byte[] bArr, byte[] bArr2, org.bouncycastle.crypto.e eVar) {
        this.I = bArr;
        this.masterSeed = bArr2;
        this.digest = eVar;
    }

    public void deriveSeed(byte[] bArr, boolean z7) {
        deriveSeed(bArr, z7, 0);
    }

    public byte[] getI() {
        return this.I;
    }

    public int getJ() {
        return this.f17207j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f17208q;
    }

    public void setJ(int i8) {
        this.f17207j = i8;
    }

    public void setQ(int i8) {
        this.f17208q = i8;
    }

    public void deriveSeed(byte[] bArr, boolean z7, int i8) {
        deriveSeed(bArr, i8);
        if (z7) {
            this.f17207j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i8) {
        if (bArr.length < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        org.bouncycastle.crypto.e eVar = this.digest;
        byte[] bArr2 = this.I;
        eVar.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f17208q >>> 24));
        this.digest.update((byte) (this.f17208q >>> 16));
        this.digest.update((byte) (this.f17208q >>> 8));
        this.digest.update((byte) this.f17208q);
        this.digest.update((byte) (this.f17207j >>> 8));
        this.digest.update((byte) this.f17207j);
        this.digest.update((byte) -1);
        org.bouncycastle.crypto.e eVar2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        eVar2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i8);
        return bArr;
    }
}
