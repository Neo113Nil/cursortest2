package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class a1 extends m {
    public static final a1 INSTANCE = new a1();
    private static final byte[] zeroBytes = new byte[0];

    private a1() {
    }

    @Override // org.bouncycastle.asn1.m, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 5, zeroBytes);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return 2;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }
}
