package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class o0 implements y {
    private z _parser;

    o0(z zVar) {
        this._parser = zVar;
    }

    @Override // org.bouncycastle.asn1.y, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return new n0(this._parser.readVector());
    }

    @Override // org.bouncycastle.asn1.y
    public f readObject() {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.y, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException(e8.getMessage(), e8);
        }
    }
}
