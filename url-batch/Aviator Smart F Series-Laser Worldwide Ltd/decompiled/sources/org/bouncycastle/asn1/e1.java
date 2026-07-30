package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
class e1 extends r {
    e1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.r
    e1 getDERSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.r
    r getDLSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.r
    void writePrimitive(s sVar, boolean z7) {
        sVar.toDERObject().encode(this, z7);
    }
}
