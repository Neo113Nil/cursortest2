package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes5.dex */
public final class a extends org.bouncycastle.crypto.params.a {
    private byte[] privateKey;
    private int securityCategory;

    public a(int i8, byte[] bArr) {
        super(true);
        if (bArr.length != c.getPrivateSize(i8)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.securityCategory = i8;
        this.privateKey = org.bouncycastle.util.a.clone(bArr);
    }

    public byte[] getSecret() {
        return org.bouncycastle.util.a.clone(this.privateKey);
    }

    public int getSecurityCategory() {
        return this.securityCategory;
    }
}
