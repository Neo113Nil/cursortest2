package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
public class ASN1Integer extends ASN1Primitive {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Integer.class, 2) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Integer.createPrimitive(dEROctetString.getOctets());
        }
    };
    private final byte[] bytes;
    private final int start;

    public ASN1Integer(byte[] bArr, boolean z) {
        if (isMalformed(bArr)) {
            a$$ExternalSyntheticBUOutline0.m$3("malformed integer");
            throw null;
        }
        this.bytes = z ? Arrays.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }

    public static ASN1Integer createPrimitive(byte[] bArr) {
        return new ASN1Integer(bArr, false);
    }

    public static ASN1Integer getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1Integer) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e) {
                m = GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        }
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public static int intValue(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
    }

    public static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    public static long longValue(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 8);
        long j = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j;
            }
            j = (j << 8) | (bArr[max] & 255);
        }
    }

    public static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.bytes.length);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        int i2 = length - i;
        if (i2 <= 4 && (i2 != 4 || (bArr[i] & 128) == 0)) {
            return intValue(bArr, i, 255);
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("ASN.1 Integer out of positive int range");
        return 0;
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        if (length - i <= 4) {
            return intValue(bArr, i, -1);
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("ASN.1 Integer out of int range");
        return 0;
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        if (length - i <= 8) {
            return longValue(bArr, i, -1);
        }
        Mod$$ExternalSyntheticBUOutline0.m$2("ASN.1 Integer out of long range");
        return 0L;
    }

    public String toString() {
        return getValue().toString();
    }

    public boolean hasValue(long j) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i = this.start;
        return length - i <= 8 && longValue(bArr, i, -1) == j;
    }

    public boolean hasValue(int i) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i2 = this.start;
        return length - i2 <= 4 && intValue(bArr, i2, -1) == i;
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Integer(long j) {
        this.bytes = BigInteger.valueOf(j).toByteArray();
        this.start = 0;
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Integer) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
