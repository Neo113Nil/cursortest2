package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class c1 extends p {
    public c1(f fVar) {
        super(fVar.toASN1Primitive().getEncoded("DER"));
    }

    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 4, this.string);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return h2.calculateBodyLength(this.string.length) + 1 + this.string.length;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.s
    s toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.p, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public c1(byte[] bArr) {
        super(bArr);
    }

    static void encode(r rVar, boolean z7, byte[] bArr, int i8, int i9) {
        rVar.writeEncoded(z7, 4, bArr, i8, i9);
    }
}
