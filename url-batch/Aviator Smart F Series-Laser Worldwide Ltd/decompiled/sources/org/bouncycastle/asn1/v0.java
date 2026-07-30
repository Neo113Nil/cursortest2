package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v0 implements f, b2 {
    private z _parser;

    public v0(z zVar) {
        this._parser = zVar;
    }

    @Override // org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        try {
            return new q1(this._parser.readVector());
        } catch (IllegalArgumentException e8) {
            throw new ASN1Exception(e8.getMessage(), e8);
        }
    }

    public f readObject() {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException("unable to get DER object", e8);
        } catch (IllegalArgumentException e9) {
            throw new ASN1ParsingException("unable to get DER object", e9);
        }
    }
}
