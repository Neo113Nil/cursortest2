package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes9.dex */
public class BERSequenceGenerator extends BERGenerator {
    public BERSequenceGenerator(OutputStream outputStream) {
        super(outputStream);
        writeBERHeader(48);
    }

    public void addObject(ASN1Encodable aSN1Encodable) {
        aSN1Encodable.toASN1Primitive().encodeTo(this._out);
    }

    public void close() {
        writeBEREnd();
    }

    public BERSequenceGenerator(OutputStream outputStream, int i, boolean z) {
        super(outputStream, i, z);
        writeBERHeader(48);
    }

    public void addObject(ASN1Primitive aSN1Primitive) {
        aSN1Primitive.encodeTo(this._out);
    }
}
