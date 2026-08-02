package org.bouncycastle.asn1;

/* loaded from: classes9.dex */
public interface ASN1TaggedObjectParser extends ASN1Encodable, InMemoryRepresentable {
    int getTagClass();

    int getTagNo();

    boolean hasContextTag();

    boolean hasContextTag(int i);

    boolean hasTag(int i, int i2);

    boolean hasTagClass(int i);

    ASN1Encodable parseBaseUniversal(boolean z, int i);

    ASN1Encodable parseExplicitBaseObject();

    ASN1TaggedObjectParser parseExplicitBaseTagged();

    ASN1TaggedObjectParser parseImplicitBaseTagged(int i, int i2);
}
