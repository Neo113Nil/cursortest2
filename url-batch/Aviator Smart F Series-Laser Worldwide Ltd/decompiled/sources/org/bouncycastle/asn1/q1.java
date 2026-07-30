package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class q1 extends i {
    public q1(g gVar) {
        super(gVar);
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o oVar = this.directReference;
        if (oVar != null) {
            byteArrayOutputStream.write(oVar.getEncoded("DL"));
        }
        l lVar = this.indirectReference;
        if (lVar != null) {
            byteArrayOutputStream.write(lVar.getEncoded("DL"));
        }
        s sVar = this.dataValueDescriptor;
        if (sVar != null) {
            byteArrayOutputStream.write(sVar.getEncoded("DL"));
        }
        byteArrayOutputStream.write(new y1(true, this.encoding, this.externalContent).getEncoded("DL"));
        rVar.writeEncoded(z7, 32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.i, org.bouncycastle.asn1.s
    int encodedLength() {
        return getEncoded().length;
    }

    @Override // org.bouncycastle.asn1.i, org.bouncycastle.asn1.s
    s toDLObject() {
        return this;
    }

    public q1(o oVar, l lVar, s sVar, int i8, s sVar2) {
        super(oVar, lVar, sVar, i8, sVar2);
    }

    public q1(o oVar, l lVar, s sVar, j1 j1Var) {
        this(oVar, lVar, sVar, j1Var.getTagNo(), j1Var.toASN1Primitive());
    }
}
