package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public abstract class ASN1BMPString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BMPString.class, 30) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BMPString.createPrimitive(dEROctetString.getOctets());
        }
    };

    /* renamed from: string, reason: collision with root package name */
    final char[] f1559string;

    public ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'string' cannot be null");
            throw null;
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("malformed BMPString encoding encountered");
            throw null;
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.f1559string = cArr;
    }

    public static ASN1BMPString createPrimitive(byte[] bArr) {
        return new DERBMPString(bArr);
    }

    public static ASN1BMPString getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1BMPString)) {
            return (ASN1BMPString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BMPString) {
                return (ASN1BMPString) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1BMPString) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e) {
                m = GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        }
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1BMPString) {
            return Arrays.areEqual(this.f1559string, ((ASN1BMPString) aSN1Primitive).f1559string);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        int length = this.f1559string.length;
        aSN1OutputStream.writeIdentifier(z, 30);
        aSN1OutputStream.writeDL(length * 2);
        byte[] bArr = new byte[8];
        int i = length & (-4);
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.f1559string;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            aSN1OutputStream.write(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.f1559string[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> '\b');
                i3 += 2;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            aSN1OutputStream.write(bArr, 0, i3);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.f1559string.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return new String(this.f1559string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.f1559string);
    }

    public String toString() {
        return getString();
    }

    public static ASN1BMPString createPrimitive(char[] cArr) {
        return new DERBMPString(cArr);
    }

    public ASN1BMPString(String str) {
        if (str != null) {
            this.f1559string = str.toCharArray();
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'string' cannot be null");
            throw null;
        }
    }

    public ASN1BMPString(char[] cArr) {
        if (cArr != null) {
            this.f1559string = cArr;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("'string' cannot be null");
            throw null;
        }
    }

    public static ASN1BMPString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1BMPString) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
