package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class i0 implements q {
    private z _parser;

    i0(z zVar) {
        this._parser = zVar;
    }

    @Override // org.bouncycastle.asn1.q, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return new h0(j7.a.readAll(getOctetStream()));
    }

    @Override // org.bouncycastle.asn1.q
    public InputStream getOctetStream() {
        return new r0(this._parser);
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
