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
public class GeographicRegion extends ASN1Object implements ASN1Choice {
    public static final int circularRegion = 0;
    public static final int identifiedRegion = 3;
    public static final int polygonalRegion = 2;
    public static final int rectangularRegion = 1;
    private final int choice;
    private final ASN1Encodable geographicRegion;

    private GeographicRegion(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.geographicRegion = CircularRegion.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 1) {
            this.geographicRegion = SequenceOfRectangularRegion.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 2) {
            this.geographicRegion = PolygonalRegion.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (tagNo == 3) {
            this.geographicRegion = SequenceOfIdentifiedRegion.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(tagNo, "invalid choice value "));
            throw null;
        }
    }

    public static GeographicRegion circularRegion(CircularRegion circularRegion2) {
        return new GeographicRegion(0, circularRegion2);
    }

    public static GeographicRegion getInstance(Object obj) {
        if (obj instanceof GeographicRegion) {
            return (GeographicRegion) obj;
        }
        if (obj != null) {
            return new GeographicRegion(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public static GeographicRegion identifiedRegion(SequenceOfIdentifiedRegion sequenceOfIdentifiedRegion) {
        return new GeographicRegion(3, sequenceOfIdentifiedRegion);
    }

    public static GeographicRegion polygonalRegion(PolygonalRegion polygonalRegion2) {
        return new GeographicRegion(2, polygonalRegion2);
    }

    public static GeographicRegion rectangularRegion(SequenceOfRectangularRegion sequenceOfRectangularRegion) {
        return new GeographicRegion(1, sequenceOfRectangularRegion);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getGeographicRegion() {
        return this.geographicRegion;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.geographicRegion);
    }

    public GeographicRegion(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.geographicRegion = aSN1Encodable;
    }
}
