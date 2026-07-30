package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class n0 extends x {
    public n0() {
    }

    @Override // org.bouncycastle.asn1.x, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncodedIndef(z7, 49, this.elements);
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

    public n0(f fVar) {
        super(fVar);
    }

    public n0(g gVar) {
        super(gVar, false);
    }

    n0(boolean z7, f[] fVarArr) {
        super(z7, fVarArr);
    }

    public n0(f[] fVarArr) {
        super(fVarArr, false);
    }
}
