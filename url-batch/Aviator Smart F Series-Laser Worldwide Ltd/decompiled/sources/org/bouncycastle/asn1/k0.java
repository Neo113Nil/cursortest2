package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class k0 implements u {
    private final z parser;
    private final int tag;

    k0(int i8, z zVar) {
        this.tag = i8;
        this.parser = zVar;
    }

    @Override // org.bouncycastle.asn1.u, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return new j0(this.tag, this.parser.readVector());
    }

    @Override // org.bouncycastle.asn1.u
    public f readObject() {
        return this.parser.readObject();
    }

    @Override // org.bouncycastle.asn1.u, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException(e8.getMessage(), e8);
        }
    }
}
