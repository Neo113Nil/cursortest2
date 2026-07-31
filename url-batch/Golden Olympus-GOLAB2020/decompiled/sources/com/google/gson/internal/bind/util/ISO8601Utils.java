package com.google.gson.internal.bind.util;

import com.huawei.hms.iap.entity.OrderStatusCode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private static boolean checkOffset(String str, int i4, char c4) {
        return i4 < str.length() && str.charAt(i4) == c4;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i4) {
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                return i4;
            }
            i4++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i4, int i5) {
        String num = Integer.toString(i4);
        for (int length = i5 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00de A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x005a, B:20:0x006a, B:21:0x006c, B:23:0x0078, B:24:0x007b, B:26:0x0081, B:30:0x008b, B:35:0x009b, B:37:0x00a3, B:42:0x00d8, B:44:0x00de, B:46:0x00e4, B:47:0x0191, B:52:0x00ee, B:53:0x0109, B:54:0x010a, B:57:0x0126, B:59:0x0133, B:62:0x013c, B:64:0x015b, B:67:0x016a, B:68:0x018c, B:70:0x018f, B:71:0x0115, B:72:0x01c2, B:73:0x01c9, B:74:0x00bb, B:75:0x00be), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c2 A[Catch: IllegalArgumentException -> 0x004a, NumberFormatException -> 0x004d, IndexOutOfBoundsException -> 0x0050, TryCatch #2 {IllegalArgumentException -> 0x004a, IndexOutOfBoundsException -> 0x0050, NumberFormatException -> 0x004d, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x005a, B:20:0x006a, B:21:0x006c, B:23:0x0078, B:24:0x007b, B:26:0x0081, B:30:0x008b, B:35:0x009b, B:37:0x00a3, B:42:0x00d8, B:44:0x00de, B:46:0x00e4, B:47:0x0191, B:52:0x00ee, B:53:0x0109, B:54:0x010a, B:57:0x0126, B:59:0x0133, B:62:0x013c, B:64:0x015b, B:67:0x016a, B:68:0x018c, B:70:0x018f, B:71:0x0115, B:72:0x01c2, B:73:0x01c9, B:74:0x00bb, B:75:0x00be), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date parse(String str, ParsePosition parsePosition) {
        String str2;
        String message;
        int i4;
        int i5;
        int i6;
        int i7;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i8 = index + 4;
            int parseInt = parseInt(str, index, i8);
            if (checkOffset(str, i8, '-')) {
                i8 = index + 5;
            }
            int i9 = i8 + 2;
            int parseInt2 = parseInt(str, i8, i9);
            if (checkOffset(str, i9, '-')) {
                i9 = i8 + 3;
            }
            int i10 = i9 + 2;
            int parseInt3 = parseInt(str, i9, i10);
            boolean checkOffset = checkOffset(str, i10, 'T');
            if (!checkOffset && str.length() <= i10) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                parsePosition.setIndex(i10);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i11 = i9 + 5;
                int parseInt4 = parseInt(str, i9 + 3, i11);
                if (checkOffset(str, i11, ':')) {
                    i11 = i9 + 6;
                }
                int i12 = i11 + 2;
                int parseInt5 = parseInt(str, i11, i12);
                if (checkOffset(str, i12, ':')) {
                    i12 = i11 + 3;
                }
                if (str.length() > i12 && (charAt = str.charAt(i12)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i13 = i12 + 2;
                    i7 = parseInt(str, i12, i13);
                    if (i7 > 59 && i7 < 63) {
                        i7 = 59;
                    }
                    if (checkOffset(str, i13, JwtParser.SEPARATOR_CHAR)) {
                        int i14 = i12 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i12 + 4);
                        int min = Math.min(indexOfNonDigit, i12 + 6);
                        int parseInt6 = parseInt(str, i14, min);
                        int i15 = min - i14;
                        if (i15 == 1) {
                            parseInt6 *= 100;
                        } else if (i15 == 2) {
                            parseInt6 *= 10;
                        }
                        i4 = parseInt4;
                        i10 = indexOfNonDigit;
                        i5 = parseInt5;
                        i6 = parseInt6;
                    } else {
                        i4 = parseInt4;
                        i10 = i13;
                        i5 = parseInt5;
                        i6 = 0;
                    }
                    if (str.length() > i10) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 == 'Z') {
                        timeZone = TIMEZONE_UTC;
                        length = i10 + 1;
                    } else {
                        if (charAt2 != '+' && charAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                        String substring = str.substring(i10);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i10 + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String str3 = "GMT" + substring;
                            TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                            String id = timeZone2.getID();
                            if (!id.equals(str3) && !id.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "").equals(str3)) {
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
                    gregorianCalendar2.set(11, i4);
                    gregorianCalendar2.set(12, i5);
                    gregorianCalendar2.set(13, i7);
                    gregorianCalendar2.set(14, i6);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i10 = i12;
                i4 = parseInt4;
                i5 = parseInt5;
            } else {
                i4 = 0;
                i5 = 0;
            }
            i6 = 0;
            i7 = 0;
            if (str.length() > i10) {
            }
        } catch (IllegalArgumentException e4) {
            e = e4;
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
        } catch (IndexOutOfBoundsException e5) {
            e = e5;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e6) {
            e = e6;
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

    private static int parseInt(String str, int i4, int i5) {
        int i6;
        int i7;
        if (i4 < 0 || i5 > str.length() || i4 > i5) {
            throw new NumberFormatException(str);
        }
        if (i4 < i5) {
            i7 = i4 + 1;
            int digit = Character.digit(str.charAt(i4), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
            i6 = -digit;
        } else {
            i6 = 0;
            i7 = i4;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int digit2 = Character.digit(str.charAt(i7), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
            i6 = (i6 * 10) - digit2;
            i7 = i8;
        }
        return -i6;
    }

    public static String format(Date date, boolean z4) {
        return format(date, z4, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z4, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z4 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
        if (z4) {
            sb.append(JwtParser.SEPARATOR_CHAR);
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i4 = offset / OrderStatusCode.ORDER_STATE_CANCEL;
            int abs = Math.abs(i4 / 60);
            int abs2 = Math.abs(i4 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, abs, 2);
            sb.append(':');
            padInt(sb, abs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
