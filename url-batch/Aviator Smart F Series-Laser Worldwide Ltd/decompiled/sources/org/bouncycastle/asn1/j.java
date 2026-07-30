package org.bouncycastle.asn1;

import com.artillery.ctc.uitls.TimeConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class j extends s {
    protected byte[] time;

    public j(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e8) {
            throw new IllegalArgumentException("invalid date string: " + e8.getMessage());
        }
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
            str2 = "+";
        }
        int i8 = rawOffset / TimeConstants.HOUR;
        int i9 = (rawOffset - (TimeConstants.HOUR * i8)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (hasFractionalSeconds()) {
                    str = pruneFractionalSeconds(str);
                }
                if (timeZone.inDaylightTime(calculateGMTDateFormat().parse(str + "GMT" + str2 + convert(i8) + ":" + convert(i9)))) {
                    i8 += str2.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + convert(i8) + ":" + convert(i9);
    }

    private String convert(int i8) {
        if (i8 >= 10) {
            return Integer.toString(i8);
        }
        return "0" + i8;
    }

    public static j getInstance(Object obj) {
        if (obj == null || (obj instanceof j)) {
            return (j) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (j) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    private boolean isDigit(int i8) {
        byte b8;
        byte[] bArr = this.time;
        return bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57;
    }

    private String pruneFractionalSeconds(String str) {
        String str2;
        StringBuilder sb;
        char charAt;
        String substring = str.substring(14);
        int i8 = 1;
        while (i8 < substring.length() && '0' <= (charAt = substring.charAt(i8)) && charAt <= '9') {
            i8++;
        }
        int i9 = i8 - 1;
        if (i9 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i8);
            sb = new StringBuilder();
        } else if (i9 == 1) {
            str2 = substring.substring(0, i8) + com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN + substring.substring(i8);
            sb = new StringBuilder();
        } else {
            if (i9 != 2) {
                return str;
            }
            str2 = substring.substring(0, i8) + "0" + substring.substring(i8);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof j) {
            return org.bouncycastle.util.a.areEqual(this.time, ((j) sVar).time);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 24, this.time);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int length = this.time.length;
        return h2.calculateBodyLength(length) + 1 + length;
    }

    public Date getDate() {
        SimpleDateFormat calculateGMTDateFormat;
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.endsWith("Z")) {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : hasSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (fromByteArray.indexOf(45) > 0 || fromByteArray.indexOf(43) > 0) {
            fromByteArray = getTime();
            calculateGMTDateFormat = calculateGMTDateFormat();
        } else {
            calculateGMTDateFormat = hasFractionalSeconds() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : hasSeconds() ? new SimpleDateFormat(cn.hutool.core.date.d.PURE_DATETIME_PATTERN) : hasMinutes() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            calculateGMTDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (hasFractionalSeconds()) {
            fromByteArray = pruneFractionalSeconds(fromByteArray);
        }
        return z1.epochAdjust(calculateGMTDateFormat.parse(fromByteArray));
    }

    public String getTime() {
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.charAt(fromByteArray.length() - 1) == 'Z') {
            return fromByteArray.substring(0, fromByteArray.length() - 1) + "GMT+00:00";
        }
        int length = fromByteArray.length();
        char charAt = fromByteArray.charAt(length - 6);
        if ((charAt == '-' || charAt == '+') && fromByteArray.indexOf("GMT") == length - 9) {
            return fromByteArray;
        }
        int length2 = fromByteArray.length();
        int i8 = length2 - 5;
        char charAt2 = fromByteArray.charAt(i8);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, i8));
            sb.append("GMT");
            int i9 = length2 - 2;
            sb.append(fromByteArray.substring(i8, i9));
            sb.append(":");
            sb.append(fromByteArray.substring(i9));
            return sb.toString();
        }
        int length3 = fromByteArray.length() - 3;
        char charAt3 = fromByteArray.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            return fromByteArray + calculateGMTOffset(fromByteArray);
        }
        return fromByteArray.substring(0, length3) + "GMT" + fromByteArray.substring(length3) + ":00";
    }

    public String getTimeString() {
        return Strings.fromByteArray(this.time);
    }

    protected boolean hasFractionalSeconds() {
        int i8 = 0;
        while (true) {
            byte[] bArr = this.time;
            if (i8 == bArr.length) {
                return false;
            }
            if (bArr[i8] == 46 && i8 == 14) {
                return true;
            }
            i8++;
        }
    }

    protected boolean hasMinutes() {
        return isDigit(10) && isDigit(11);
    }

    protected boolean hasSeconds() {
        return isDigit(12) && isDigit(13);
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.time);
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new x0(this.time);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new x0(this.time);
    }

    public j(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", z1.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public static j getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof j)) ? getInstance(object) : new j(p.getInstance(object).getOctets());
    }

    public j(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    j(byte[] bArr) {
        if (bArr.length < 4) {
            throw new IllegalArgumentException("GeneralizedTime string too short");
        }
        this.time = bArr;
        if (!isDigit(0) || !isDigit(1) || !isDigit(2) || !isDigit(3)) {
            throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
        }
    }
}
