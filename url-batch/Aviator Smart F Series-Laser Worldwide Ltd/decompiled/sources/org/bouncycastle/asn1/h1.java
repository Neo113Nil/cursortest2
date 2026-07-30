package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class h1 extends x {
    private int bodyLength;

    public h1() {
        this.bodyLength = -1;
    }

    private static boolean checkSorted(boolean z7) {
        if (z7) {
            return z7;
        }
        throw new IllegalStateException("DERSet elements should always be in sorted order");
    }

    public static h1 convert(x xVar) {
        return (h1) xVar.toDERObject();
    }

    private int getBodyLength() {
        if (this.bodyLength < 0) {
            int length = this.elements.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.elements[i9].toASN1Primitive().toDERObject().encodedLength();
            }
            this.bodyLength = i8;
        }
        return this.bodyLength;
    }

    @Override // org.bouncycastle.asn1.x, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        if (z7) {
            rVar.write(49);
        }
        e1 dERSubStream = rVar.getDERSubStream();
        int length = this.elements.length;
        int i8 = 0;
        if (this.bodyLength >= 0 || length > 16) {
            rVar.writeLength(getBodyLength());
            while (i8 < length) {
                this.elements[i8].toASN1Primitive().toDERObject().encode(dERSubStream, true);
                i8++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            s dERObject = this.elements[i10].toASN1Primitive().toDERObject();
            sVarArr[i10] = dERObject;
            i9 += dERObject.encodedLength();
        }
        this.bodyLength = i9;
        rVar.writeLength(i9);
        while (i8 < length) {
            sVarArr[i8].encode(dERSubStream, true);
            i8++;
        }
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int bodyLength = getBodyLength();
        return h2.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    @Override // org.bouncycastle.asn1.x, org.bouncycastle.asn1.s
    s toDERObject() {
        return this.isSorted ? this : super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.x, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public h1(f fVar) {
        super(fVar);
        this.bodyLength = -1;
    }

    public h1(g gVar) {
        super(gVar, true);
        this.bodyLength = -1;
    }

    h1(boolean z7, f[] fVarArr) {
        super(checkSorted(z7), fVarArr);
        this.bodyLength = -1;
    }

    public h1(f[] fVarArr) {
        super(fVarArr, true);
        this.bodyLength = -1;
    }
}
