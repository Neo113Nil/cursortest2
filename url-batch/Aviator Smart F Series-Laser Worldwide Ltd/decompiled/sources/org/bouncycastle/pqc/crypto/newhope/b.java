package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes5.dex */
public class b extends org.bouncycastle.crypto.params.a {
    final byte[] pubData;

    public b(byte[] bArr) {
        super(false);
        this.pubData = org.bouncycastle.util.a.clone(bArr);
    }

    public byte[] getPubData() {
        return org.bouncycastle.util.a.clone(this.pubData);
    }
}
