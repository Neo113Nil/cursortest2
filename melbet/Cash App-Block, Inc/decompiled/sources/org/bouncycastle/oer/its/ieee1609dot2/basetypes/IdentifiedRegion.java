package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes8.dex */
public class IdentifiedRegion extends ASN1Object implements ASN1Choice, RegionInterface {
    public static final int countryAndRegions = 1;
    public static final int countryAndSubregions = 2;
    public static final int countryOnly = 0;
    private final int choice;
    private final ASN1Encodable identifiedRegion;

    private IdentifiedRegion(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.identifiedRegion = CountryOnly.getInstance((Object) aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 1) {
            this.identifiedRegion = CountryAndRegions.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (tagNo == 2) {
            this.identifiedRegion = CountryAndSubregions.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagNo, "invalid choice value "));
            throw null;
        }
    }

    public static IdentifiedRegion countryAndRegions(CountryAndRegions countryAndRegions2) {
        return new IdentifiedRegion(1, countryAndRegions2);
    }

    public static IdentifiedRegion countryAndSubregions(CountryAndSubregions countryAndSubregions2) {
        return new IdentifiedRegion(2, countryAndSubregions2);
    }

    public static IdentifiedRegion countryOnly(CountryOnly countryOnly2) {
        return new IdentifiedRegion(0, countryOnly2);
    }

    public static IdentifiedRegion getInstance(Object obj) {
        if (obj instanceof IdentifiedRegion) {
            return (IdentifiedRegion) obj;
        }
        if (obj != null) {
            return new IdentifiedRegion(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getIdentifiedRegion() {
        return this.identifiedRegion;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.identifiedRegion);
    }

    public IdentifiedRegion(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.identifiedRegion = aSN1Encodable;
    }
}
