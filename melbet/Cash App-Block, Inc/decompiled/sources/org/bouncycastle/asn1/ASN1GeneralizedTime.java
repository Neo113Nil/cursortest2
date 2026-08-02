package org.bouncycastle.asn1;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public class ASN1GeneralizedTime extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1GeneralizedTime.class, 24) { // from class: org.bouncycastle.asn1.ASN1GeneralizedTime.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1GeneralizedTime.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1GeneralizedTime(byte[] bArr) {
        if (bArr.length < 4) {
            a$$ExternalSyntheticBUOutline0.m$3("GeneralizedTime string too short");
            throw null;
        }
        this.contents = bArr;
        if (isDigit(0) && isDigit(1) && isDigit(2) && isDigit(3)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("illegal characters in GeneralizedTime string");
        throw null;
    }

    private SimpleDateFormat calculateGMTDateFormat() {
        SimpleDateFormat simpleDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmssz") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private String calculateGMTOffset(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = Marker.ANY_NON_NULL_MARKER;
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    str = pruneFractionalSeconds(str);
                }
                if (timeZone.inDaylightTime(calculateGMTDateFormat().parse(str + "GMT" + str2 + convert(i) + ":" + convert(i2)))) {
                    i += str2.equals(Marker.ANY_NON_NULL_MARKER) ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + convert(i) + ":" + convert(i2);
    }

    private String convert(int i) {
        return i < 10 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "0") : Integer.toString(i);
    }

    public static ASN1GeneralizedTime createPrimitive(byte[] bArr) {
        return new ASN1GeneralizedTime(bArr);
    }

    public static ASN1GeneralizedTime getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1GeneralizedTime)) {
            return (ASN1GeneralizedTime) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1GeneralizedTime) {
                return (ASN1GeneralizedTime) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1GeneralizedTime) TYPE.fromByteArray((byte[]) obj);
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

    private String pruneFractionalSeconds(String str) {
        StringBuilder sb;
        String str2;
        String sb2;
        char charAt;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            sb2 = substring.substring(0, 4).concat(substring.substring(i));
        } else {
            if (i2 == 1) {
                sb = new StringBuilder();
                sb.append(substring.substring(0, i));
                str2 = "00";
            } else {
                if (i2 != 2) {
                    return str;
                }
                sb = new StringBuilder();
                sb.append(substring.substring(0, i));
                str2 = "0";
            }
            sb.append(str2);
            sb.append(substring.substring(i));
            sb2 = sb.toString();
        }
        return str.substring(0, 14).concat(sb2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1GeneralizedTime) {
            return Arrays.areEqual(this.contents, ((ASN1GeneralizedTime) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z) {
        aSN1OutputStream.writeEncodingDL(z, 24, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public Date getDate() {
        SimpleDateFormat calculateGMTDateFormat;
        String fromByteArray = Strings.fromByteArray(this.contents);
        if (fromByteArray.endsWith("Z")) {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", LocaleUtil.EN_Locale) : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.EN_Locale) : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", LocaleUtil.EN_Locale) : new SimpleDateFormat("yyyyMMddHH'Z'", LocaleUtil.EN_Locale);
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (fromByteArray.indexOf(45) > 0 || fromByteArray.indexOf(43) > 0) {
            fromByteArray = getTime();
            calculateGMTDateFormat = calculateGMTDateFormat();
        } else {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            fromByteArray = pruneFractionalSeconds(fromByteArray);
        }
        return calculateGMTDateFormat.parse(fromByteArray);
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.contents);
        if (fromByteArray.charAt(fromByteArray.length() - 1) == 'Z') {
            return fromByteArray.substring(0, fromByteArray.length() - 1).concat("GMT+00:00");
        }
        int length = fromByteArray.length();
        char charAt = fromByteArray.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && fromByteArray.indexOf("GMT") == length - 9) {
            return fromByteArray;
        }
        int length2 = fromByteArray.length();
        int i = length2 - 5;
        char charAt2 = fromByteArray.charAt(i);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, i));
            sb.append("GMT");
            int i2 = length2 - 2;
            sb.append(fromByteArray.substring(i, i2));
            sb.append(":");
            sb.append(fromByteArray.substring(i2));
            return sb.toString();
        }
        int length3 = fromByteArray.length() - 3;
        char charAt3 = fromByteArray.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(fromByteArray);
            m.append(calculateGMTOffset(fromByteArray));
            return m.toString();
        }
        return fromByteArray.substring(0, length3) + "GMT" + fromByteArray.substring(length3) + ":00";
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.contents);
    }

    public boolean hasFractionalSeconds() {
        int i = 0;
        while (true) {
            byte[] bArr = this.contents;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public boolean hasMinutes() {
        return isDigit(10) && isDigit(11);
    }

    public boolean hasSeconds() {
        return isDigit(12) && isDigit(13);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERGeneralizedTime(this.contents);
    }

    public ASN1GeneralizedTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", LocaleUtil.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.contents = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public ASN1GeneralizedTime(String str) {
        this.contents = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e) {
            Path$$ExternalSyntheticBUOutline0.m(e.getMessage(), "invalid date string: ");
            throw null;
        }
    }

    public static ASN1GeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1GeneralizedTime) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
