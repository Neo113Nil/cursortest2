package com.google.gson.internal.bind.util;

import com.moyoung.dafit.module.common.utils.n;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.math.linearalgebra.k;

/* loaded from: classes4.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i8, char c8) {
        return i8 < str.length() && str.charAt(i8) == c8;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i8) {
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (charAt < '0' || charAt > '9') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i8, int i9) {
        String num = Integer.toString(i8);
        for (int length = i9 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str, ParsePosition parsePosition) {
        String str2;
        String message;
        int i8;
        int i9;
        int i10;
        int i11;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int parseInt = parseInt(str, index, i12);
            if (checkOffset(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int parseInt2 = parseInt(str, i12, i13);
            if (checkOffset(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int parseInt3 = parseInt(str, i13, i14);
            boolean checkOffset = checkOffset(str, i14, 'T');
            if (!checkOffset && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i15 = i13 + 5;
                int parseInt4 = parseInt(str, i13 + 3, i15);
                if (checkOffset(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int parseInt5 = parseInt(str, i15, i16);
                if (checkOffset(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (charAt = str.charAt(i16)) == 'Z' || charAt == '+' || charAt == '-') {
                    i9 = parseInt5;
                    i10 = 0;
                    i11 = 0;
                    i14 = i16;
                    i8 = parseInt4;
                } else {
                    int i17 = i16 + 2;
                    i11 = parseInt(str, i16, i17);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (checkOffset(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i16 + 4);
                        int min = Math.min(indexOfNonDigit, i16 + 6);
                        int parseInt6 = parseInt(str, i18, min);
                        int i19 = min - i18;
                        if (i19 == 1) {
                            parseInt6 *= 100;
                        } else if (i19 == 2) {
                            parseInt6 *= 10;
                        }
                        i8 = parseInt4;
                        i14 = indexOfNonDigit;
                        i9 = parseInt5;
                        i10 = parseInt6;
                    } else {
                        i8 = parseInt4;
                        i14 = i17;
                        i9 = parseInt5;
                        i10 = 0;
                    }
                }
            } else {
                i8 = 0;
                i9 = 0;
                i10 = 0;
                i11 = 0;
            }
            if (str.length() <= i14) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i14);
            if (charAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i14 + 1;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                }
                String substring = str.substring(i14);
                if (substring.length() < 5) {
                    substring = substring + n.TWO_INTEGERS_PATTERN;
                }
                length = i14 + substring.length();
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str3 = "GMT" + substring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id = timeZone2.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = TIMEZONE_UTC;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, parseInt);
            gregorianCalendar2.set(2, parseInt2 - 1);
            gregorianCalendar2.set(5, parseInt3);
            gregorianCalendar2.set(11, i8);
            gregorianCalendar2.set(12, i9);
            gregorianCalendar2.set(13, i11);
            gregorianCalendar2.set(14, i10);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e8) {
            e = e8;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e9) {
            e = e9;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int parseInt(String str, int i8, int i9) {
        int i10;
        int i11;
        if (i8 < 0 || i9 > str.length() || i8 > i9) {
            throw new NumberFormatException(str);
        }
        if (i8 < i9) {
            i11 = i8 + 1;
            int digit = Character.digit(str.charAt(i8), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = -digit;
        } else {
            i10 = 0;
            i11 = i8;
        }
        while (i11 < i9) {
            int i12 = i11 + 1;
            int digit2 = Character.digit(str.charAt(i11), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i8, i9));
            }
            i10 = (i10 * 10) - digit2;
            i11 = i12;
        }
        return -i10;
    }

    public static String format(Date date, boolean z7) {
        return format(date, z7, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z7, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z7 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z7) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int abs = Math.abs(i8 / 60);
            int abs2 = Math.abs(i8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append(k.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }
}
