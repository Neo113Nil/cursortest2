package org.bouncycastle.asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Strings;

/* loaded from: classes5.dex */
public class d0 extends s {
    private byte[] time;

    public d0(String str) {
        this.time = Strings.toByteArray(str);
        try {
            getDate();
        } catch (ParseException e8) {
            throw new IllegalArgumentException("invalid date string: " + e8.getMessage());
        }
    }

    public static d0 getInstance(Object obj) {
        if (obj == null || (obj instanceof d0)) {
            return (d0) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (d0) s.fromByteArray((byte[]) obj);
        } catch (Exception e8) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e8.toString());
        }
    }

    private boolean isDigit(int i8) {
        byte b8;
        byte[] bArr = this.time;
        return bArr.length > i8 && (b8 = bArr[i8]) >= 48 && b8 <= 57;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        if (sVar instanceof d0) {
            return org.bouncycastle.util.a.areEqual(this.time, ((d0) sVar).time);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    void encode(r rVar, boolean z7) {
        rVar.writeEncoded(z7, 23, this.time);
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        int length = this.time.length;
        return h2.calculateBodyLength(length) + 1 + length;
    }

    public Date getAdjustedDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return z1.epochAdjust(simpleDateFormat.parse(getAdjustedTime()));
    }

    public String getAdjustedTime() {
        StringBuilder sb;
        String str;
        String time = getTime();
        if (time.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        sb.append(str);
        sb.append(time);
        return sb.toString();
    }

    public Date getDate() {
        return z1.epochAdjust(new SimpleDateFormat("yyMMddHHmmssz").parse(getTime()));
    }

    public String getTime() {
        StringBuilder sb;
        String substring;
        String fromByteArray = Strings.fromByteArray(this.time);
        if (fromByteArray.indexOf(45) >= 0 || fromByteArray.indexOf(43) >= 0) {
            int indexOf = fromByteArray.indexOf(45);
            if (indexOf < 0) {
                indexOf = fromByteArray.indexOf(43);
            }
            if (indexOf == fromByteArray.length() - 3) {
                fromByteArray = fromByteArray + com.moyoung.dafit.module.common.utils.n.TWO_INTEGERS_PATTERN;
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(fromByteArray.substring(0, 10));
                sb.append("00GMT");
                sb.append(fromByteArray.substring(10, 13));
                sb.append(":");
                substring = fromByteArray.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(fromByteArray.substring(0, 12));
                sb.append("GMT");
                sb.append(fromByteArray.substring(12, 15));
                sb.append(":");
                substring = fromByteArray.substring(15, 17);
            }
        } else if (fromByteArray.length() == 11) {
            sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, 10));
            substring = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(fromByteArray.substring(0, 12));
            substring = "GMT+00:00";
        }
        sb.append(substring);
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.time);
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return false;
    }

    public String toString() {
        return Strings.fromByteArray(this.time);
    }

    public d0(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", z1.EN_Locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    public static d0 getInstance(b0 b0Var, boolean z7) {
        s object = b0Var.getObject();
        return (z7 || (object instanceof d0)) ? getInstance(object) : new d0(p.getInstance(object).getOctets());
    }

    public d0(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = Strings.toByteArray(simpleDateFormat.format(date));
    }

    d0(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("UTCTime string too short");
        }
        this.time = bArr;
        if (!isDigit(0) || !isDigit(1)) {
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
    }
}
