package org.bouncycastle.asn1;

import com.baidu.location.BDLocation;

/* loaded from: classes5.dex */
public class j1 extends b0 {
    public j1(int i8, f fVar) {
        super(true, i8, fVar);
    }

    @Override // org.bouncycastle.asn1.b0, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        s dERObject = this.obj.toASN1Primitive().toDERObject();
        rVar.writeTag(z7, (this.explicit || dERObject.isConstructed()) ? BDLocation.TypeCoarseLocation : 128, this.tagNo);
        if (this.explicit) {
            rVar.writeLength(dERObject.encodedLength());
        }
        dERObject.encode(rVar.getDERSubStream(), this.explicit);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int calculateTagLength;
        int encodedLength = this.obj.toASN1Primitive().toDERObject().encodedLength();
        if (this.explicit) {
            calculateTagLength = h2.calculateTagLength(this.tagNo) + h2.calculateBodyLength(encodedLength);
        } else {
            encodedLength--;
            calculateTagLength = h2.calculateTagLength(this.tagNo);
        }
        return calculateTagLength + encodedLength;
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return this.explicit || this.obj.toASN1Primitive().toDERObject().isConstructed();
    }

    @Override // org.bouncycastle.asn1.b0, org.bouncycastle.asn1.s
    s toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.b0, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public j1(boolean z7, int i8, f fVar) {
        super(z7, i8, fVar);
    }
}
