package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes5.dex */
public class b extends a {
    private final byte[] keyData;

    public b(byte[] bArr) {
        super(true, null);
        this.keyData = org.bouncycastle.util.a.clone(bArr);
    }

    public byte[] getKeyData() {
        return org.bouncycastle.util.a.clone(this.keyData);
    }

    public b(byte[] bArr, String str) {
        super(true, str);
        this.keyData = org.bouncycastle.util.a.clone(bArr);
    }
}
