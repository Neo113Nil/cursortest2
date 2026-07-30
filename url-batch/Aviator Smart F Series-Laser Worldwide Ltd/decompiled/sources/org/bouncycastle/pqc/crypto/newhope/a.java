package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes5.dex */
public class a extends org.bouncycastle.crypto.params.a {
    final short[] secData;

    public a(short[] sArr) {
        super(true);
        this.secData = org.bouncycastle.util.a.clone(sArr);
    }

    public short[] getSecData() {
        return org.bouncycastle.util.a.clone(this.secData);
    }
}
