package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes8.dex */
public class Point256 extends ASN1Object {
    private final ASN1OctetString x;
    private final ASN1OctetString y;

    private Point256(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("expected sequence size of 2");
            throw null;
        }
        ASN1OctetString aSN1OctetString = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.x = aSN1OctetString;
        ASN1OctetString aSN1OctetString2 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
        this.y = aSN1OctetString2;
        if (aSN1OctetString.getOctets().length != 32) {
            a$$ExternalSyntheticBUOutline0.m$3("x must be 32 bytes long");
            throw null;
        }
        if (aSN1OctetString2.getOctets().length == 32) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("y must be 32 bytes long");
        throw null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Point256 getInstance(Object obj) {
        if (obj instanceof Point256) {
            return (Point256) obj;
        }
        if (obj != null) {
            return new Point256(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1OctetString getX() {
        return this.x;
    }

    public ASN1OctetString getY() {
        return this.y;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.x, this.y});
    }

    public static class Builder {
        private ASN1OctetString x;
        private ASN1OctetString y;

        public Point256 createPoint256() {
            return new Point256(this.x, this.y);
        }

        public Builder setX(BigInteger bigInteger) {
            return setX(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setY(BigInteger bigInteger) {
            return setY(BigIntegers.asUnsignedByteArray(32, bigInteger));
        }

        public Builder setX(ASN1OctetString aSN1OctetString) {
            this.x = aSN1OctetString;
            return this;
        }

        public Builder setY(ASN1OctetString aSN1OctetString) {
            this.y = aSN1OctetString;
            return this;
        }

        public Builder setX(byte[] bArr) {
            this.x = new DEROctetString(bArr);
            return this;
        }

        public Builder setY(byte[] bArr) {
            this.y = new DEROctetString(bArr);
            return this;
        }
    }

    public Point256(ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (aSN1OctetString == null || aSN1OctetString.getOctets().length != 32) {
            a$$ExternalSyntheticBUOutline0.m$3("x must be 32 bytes long");
            throw null;
        }
        if (aSN1OctetString2 == null || aSN1OctetString2.getOctets().length != 32) {
            a$$ExternalSyntheticBUOutline0.m$3("y must be 32 bytes long");
            throw null;
        }
        this.x = aSN1OctetString;
        this.y = aSN1OctetString2;
    }
}
