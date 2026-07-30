package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes5.dex */
public class c extends a {
    private final byte[] keyData;

    public c(byte[] bArr) {
        super(false, null);
        this.keyData = org.bouncycastle.util.a.clone(bArr);
    }

    public byte[] getKeyData() {
        return org.bouncycastle.util.a.clone(this.keyData);
    }

    public c(byte[] bArr, String str) {
        super(false, str);
        this.keyData = org.bouncycastle.util.a.clone(bArr);
    }
}
