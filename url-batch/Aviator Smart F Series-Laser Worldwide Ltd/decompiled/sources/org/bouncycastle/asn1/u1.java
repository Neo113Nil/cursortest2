package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public class u1 extends v {
    private int bodyLength;

    public u1() {
        this.bodyLength = -1;
    }

    private int getBodyLength() {
        if (this.bodyLength < 0) {
            int length = this.elements.length;
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                i8 += this.elements[i9].toASN1Primitive().toDLObject().encodedLength();
            }
            this.bodyLength = i8;
        }
        return this.bodyLength;
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        if (z7) {
            rVar.write(48);
        }
        r dLSubStream = rVar.getDLSubStream();
        int length = this.elements.length;
        int i8 = 0;
        if (this.bodyLength >= 0 || length > 16) {
            rVar.writeLength(getBodyLength());
            while (i8 < length) {
                dLSubStream.writePrimitive(this.elements[i8].toASN1Primitive(), true);
                i8++;
            }
            return;
        }
        s[] sVarArr = new s[length];
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            s dLObject = this.elements[i10].toASN1Primitive().toDLObject();
            sVarArr[i10] = dLObject;
            i9 += dLObject.encodedLength();
        }
        this.bodyLength = i9;
        rVar.writeLength(i9);
        while (i8 < length) {
            dLSubStream.writePrimitive(sVarArr[i8], true);
            i8++;
        }
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int bodyLength = getBodyLength();
        return h2.calculateBodyLength(bodyLength) + 1 + bodyLength;
    }

    @Override // org.bouncycastle.asn1.v, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public u1(f fVar) {
        super(fVar);
        this.bodyLength = -1;
    }

    public u1(g gVar) {
        super(gVar);
        this.bodyLength = -1;
    }

    public u1(f[] fVarArr) {
        super(fVarArr);
        this.bodyLength = -1;
    }

    u1(f[] fVarArr, boolean z7) {
        super(fVarArr, z7);
        this.bodyLength = -1;
    }
}
