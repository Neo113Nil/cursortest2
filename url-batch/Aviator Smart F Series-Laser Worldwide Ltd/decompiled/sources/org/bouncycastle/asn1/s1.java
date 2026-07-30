package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
class s1 extends r {
    s1(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // org.bouncycastle.asn1.r
    r getDLSubStream() {
        return this;
    }

    @Override // org.bouncycastle.asn1.r
    void writePrimitive(s sVar, boolean z7) {
        sVar.toDLObject().encode(this, z7);
    }
}
