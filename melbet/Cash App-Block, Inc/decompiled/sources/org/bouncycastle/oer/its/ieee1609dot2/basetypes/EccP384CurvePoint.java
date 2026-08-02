package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes8.dex */
public class EccP384CurvePoint extends EccCurvePoint implements ASN1Choice {
    public static final int compressedY0 = 2;
    public static final int compressedY1 = 3;
    public static final int fill = 1;
    public static final int uncompressedP384 = 4;
    public static final int xonly = 0;
    private final int choice;
    private final ASN1Encodable eccP384CurvePoint;

    private EccP384CurvePoint(ASN1TaggedObject aSN1TaggedObject) {
        this.choice = aSN1TaggedObject.getTagNo();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo != 0) {
            if (tagNo == 1) {
                this.eccP384CurvePoint = ASN1Null.getInstance(aSN1TaggedObject.getExplicitBaseObject());
                return;
            } else if (tagNo != 2 && tagNo != 3) {
                if (tagNo == 4) {
                    this.eccP384CurvePoint = ASN1Sequence.getInstance(aSN1TaggedObject.getExplicitBaseObject());
                    return;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(aSN1TaggedObject, new StringBuilder("invalid choice value ")));
                    throw null;
                }
            }
        }
        this.eccP384CurvePoint = ASN1OctetString.getInstance(aSN1TaggedObject.getExplicitBaseObject());
    }

    public static EccP384CurvePoint compressedY0(byte[] bArr) {
        return new EccP384CurvePoint(2, new DEROctetString(Arrays.clone(bArr)));
    }

    public static EccP384CurvePoint compressedY1(byte[] bArr) {
        return new EccP384CurvePoint(3, new DEROctetString(Arrays.clone(bArr)));
    }

    public static EccP384CurvePoint fill() {
        return new EccP384CurvePoint(1, DERNull.INSTANCE);
    }

    public static EccP384CurvePoint getInstance(Object obj) {
        if (obj instanceof EccP384CurvePoint) {
            return (EccP384CurvePoint) obj;
        }
        if (obj != null) {
            return new EccP384CurvePoint(ASN1TaggedObject.getInstance(obj, 128));
        }
        return null;
    }

    public static EccP384CurvePoint uncompressedP384(Point384 point384) {
        return new EccP384CurvePoint(4, point384);
    }

    public static EccP384CurvePoint xOnly(byte[] bArr) {
        return new EccP384CurvePoint(0, new DEROctetString(Arrays.clone(bArr)));
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getEccP384CurvePoint() {
        return this.eccP384CurvePoint;
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccCurvePoint
    public byte[] getEncodedPoint() {
        String str;
        byte[] octets;
        byte[] octets2;
        int i = this.choice;
        if (i == 0) {
            str = "x Only not implemented";
        } else {
            if (i == 2) {
                byte[] octets3 = ASN1OctetString.getInstance(this.eccP384CurvePoint).getOctets();
                byte[] bArr = new byte[octets3.length + 1];
                bArr[0] = 2;
                System.arraycopy(octets3, 0, bArr, 1, octets3.length);
                return bArr;
            }
            if (i == 3) {
                byte[] octets4 = ASN1OctetString.getInstance(this.eccP384CurvePoint).getOctets();
                byte[] bArr2 = new byte[octets4.length + 1];
                bArr2[0] = 3;
                System.arraycopy(octets4, 0, bArr2, 1, octets4.length);
                return bArr2;
            }
            if (i == 4) {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(this.eccP384CurvePoint);
                octets = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
                octets2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
                return Arrays.concatenate(new byte[]{4}, octets, octets2);
            }
            str = "unknown point choice";
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.eccP384CurvePoint);
    }

    public static EccP384CurvePoint compressedY0(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(2, aSN1OctetString);
    }

    public static EccP384CurvePoint compressedY1(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(3, aSN1OctetString);
    }

    public static EccP384CurvePoint xOnly(ASN1OctetString aSN1OctetString) {
        return new EccP384CurvePoint(0, aSN1OctetString);
    }

    public EccP384CurvePoint(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.eccP384CurvePoint = aSN1Encodable;
    }
}
