package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class d1 implements q {
    private a2 stream;

    d1(a2 a2Var) {
        this.stream = a2Var;
    }

    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return new c1(this.stream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.q
    public InputStream getOctetStream() {
        return this.stream;
    }

    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e8.getMessage(), e8);
        }
    }
}
