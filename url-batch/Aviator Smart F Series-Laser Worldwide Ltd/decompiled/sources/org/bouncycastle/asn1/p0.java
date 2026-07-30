package org.bouncycastle.asn1;

import com.baidu.location.BDLocation;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class p0 extends b0 {
    public p0(int i8) {
        super(false, i8, new l0());
    }

    @Override // org.bouncycastle.asn1.b0, org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        Enumeration objects;
        rVar.writeTag(z7, BDLocation.TypeCoarseLocation, this.tagNo);
        rVar.write(128);
        if (this.explicit) {
            rVar.writePrimitive(this.obj.toASN1Primitive(), true);
        } else {
            f fVar = this.obj;
            if (fVar instanceof p) {
                objects = fVar instanceof h0 ? ((h0) fVar).getObjects() : new h0(((p) fVar).getOctets()).getObjects();
            } else if (fVar instanceof v) {
                objects = ((v) fVar).getObjects();
            } else {
                if (!(fVar instanceof x)) {
                    throw new ASN1Exception("not implemented: " + this.obj.getClass().getName());
                }
                objects = ((x) fVar).getObjects();
            }
            rVar.writeElements(objects);
        }
        rVar.write(0);
        rVar.write(0);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int calculateTagLength;
        int encodedLength = this.obj.toASN1Primitive().encodedLength();
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
        return this.explicit || this.obj.toASN1Primitive().isConstructed();
    }

    public p0(int i8, f fVar) {
        super(true, i8, fVar);
    }

    public p0(boolean z7, int i8, f fVar) {
        super(z7, i8, fVar);
    }
}
