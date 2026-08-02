package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
class DLTaggedObjectParser extends BERTaggedObjectParser {
    private final boolean _constructed;

    public DLTaggedObjectParser(int i, int i2, boolean z, ASN1StreamParser aSN1StreamParser) {
        super(i, i2, aSN1StreamParser);
        this._constructed = z;
    }

    private ASN1StreamParser checkConstructed() {
        if (this._constructed) {
            return this._parser;
        }
        a$$ExternalSyntheticBUOutline0.m$4("Explicit tags must be constructed (see X.690 8.14.2)");
        return null;
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return this._parser.loadTaggedDL(this._tagClass, this._tagNo, this._constructed);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseBaseUniversal(boolean z, int i) {
        if (z) {
            return checkConstructed().parseObject(i);
        }
        boolean z2 = this._constructed;
        ASN1StreamParser aSN1StreamParser = this._parser;
        return z2 ? aSN1StreamParser.parseImplicitConstructedDL(i) : aSN1StreamParser.parseImplicitPrimitive(i);
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1Encodable parseExplicitBaseObject() {
        return checkConstructed().readObject();
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseExplicitBaseTagged() {
        return checkConstructed().parseTaggedObject();
    }

    @Override // org.bouncycastle.asn1.BERTaggedObjectParser, org.bouncycastle.asn1.ASN1TaggedObjectParser
    public ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2) {
        return new DLTaggedObjectParser(i, i2, this._constructed, this._parser);
    }
}
