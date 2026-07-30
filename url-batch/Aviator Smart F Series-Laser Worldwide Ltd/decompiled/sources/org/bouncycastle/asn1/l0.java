package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class l0 extends v {
    public l0() {
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncodedIndef(z7, 48, this.elements);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int length = this.elements.length;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i8 += this.elements[i9].toASN1Primitive().encodedLength();
        }
        return i8 + 4;
    }

    public l0(f fVar) {
        super(fVar);
    }

    public l0(g gVar) {
        super(gVar);
    }

    public l0(f[] fVarArr) {
        super(fVarArr);
    }
}
