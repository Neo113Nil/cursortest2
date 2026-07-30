package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes5.dex */
public final class b extends org.bouncycastle.crypto.params.a {
    private byte[] publicKey;
    private int securityCategory;

    public b(int i8, byte[] bArr) {
        super(false);
        if (bArr.length != c.getPublicSize(i8)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.securityCategory = i8;
        this.publicKey = org.bouncycastle.util.a.clone(bArr);
    }

    public byte[] getPublicData() {
        return org.bouncycastle.util.a.clone(this.publicKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
