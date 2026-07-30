package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class q0 implements c0 {
    private boolean _constructed;
    private z _parser;
    private int _tagNumber;

    q0(boolean z7, int i8, z zVar) {
        this._constructed = z7;
        this._tagNumber = i8;
        this._parser = zVar;
    }

    @Override // org.bouncycastle.asn1.c0, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return this._parser.readTaggedObject(this._constructed, this._tagNumber);
    }

    @Override // org.bouncycastle.asn1.c0
    public f getObjectParser(int i8, boolean z7) {
        if (!z7) {
            return this._parser.readImplicit(this._constructed, i8);
        }
        if (this._constructed) {
            return this._parser.readObject();
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // org.bouncycastle.asn1.c0
    public int getTagNo() {
        return this._tagNumber;
    }

    public boolean isConstructed() {
        return this._constructed;
    }

    @Override // org.bouncycastle.asn1.c0, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new ASN1ParsingException(e8.getMessage());
        }
    }
}
