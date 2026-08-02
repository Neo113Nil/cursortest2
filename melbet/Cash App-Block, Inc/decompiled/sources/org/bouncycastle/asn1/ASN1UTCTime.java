package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class ASN1UTCTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1UTCTime.class, 23) { // from class: org.bouncycastle.asn1.ASN1UTCTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1UTCTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1UTCTime(byte[] bArr) {
        if (bArr.length < 2) {
            a$$ExternalSyntheticBUOutline0.m$3("UTCTime string too short");
            throw null;
        }
        this.contents = bArr;
        if (isDigit(0) && isDigit(1)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("illegal characters in UTCTime string");
        throw null;
    }

    public static ASN1UTCTime createPrimitive(byte[] bArr) {
        return new ASN1UTCTime(bArr);
    }

    public static ASN1UTCTime getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1UTCTime)) {
            return (ASN1UTCTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1UTCTime) {
                return (ASN1UTCTime) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1UTCTime) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e) {
                m = GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            m = Boxes$$ExternalSyntheticOutline1.m(obj, "illegal object in getInstance: ");
        }
        a$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    private boolean isDigit(int i) {
        byte b;
        byte[] bArr = this.contents;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1UTCTime) {
            return Arrays.areEqual(this.contents, ((ASN1UTCTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 23, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public Date getAdjustedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat.parse(getAdjustedTime());
    }

    public String getAdjustedTime() {
        String time = getTime();
        return (time.charAt(0) < '5' ? "20" : "19").concat(time);
    }

    public Date getDate() {
        return new SimpleDateFormat("yyMMddHHmmssz", LocaleUtil.EN_Locale).parse(getTime());
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.contents);
        if (fromByteArray.indexOf(45) < 0 && fromByteArray.indexOf(43) < 0) {
            return fromByteArray.length() == 11 ? fromByteArray.substring(0, 10).concat("00GMT+00:00") : fromByteArray.substring(0, 12).concat("GMT+00:00");
        }
        int indexOf = fromByteArray.indexOf(45);
        if (indexOf < 0) {
            indexOf = fromByteArray.indexOf(43);
        }
        if (indexOf == fromByteArray.length() - 3) {
            fromByteArray = fromByteArray.concat("00");
        }
        if (indexOf == 10) {
            return fromByteArray.substring(0, 10) + "00GMT" + fromByteArray.substring(10, 13) + ":" + fromByteArray.substring(13, 15);
        }
        return fromByteArray.substring(0, 12) + "GMT" + fromByteArray.substring(12, 15) + ":" + fromByteArray.substring(15, 17);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return Strings.fromByteArray(this.contents);
    }

    public ASN1UTCTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1UTCTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            Path$$ExternalSyntheticBUOutline0.m(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1UTCTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1UTCTime) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
