package j4;

import com.moyoung.dafit.module.common.utils.n;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.bouncycastle.pqc.math.linearalgebra.k;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17029a = "UTC";

    /* renamed from: b, reason: collision with root package name */
    private static final TimeZone f17030b = TimeZone.getTimeZone(f17029a);

    private static int a(String str, int i8) {
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            if (charAt < '0' || charAt > '9') {
                return i8;
            }
            i8++;
        }
        return str.length();
    }

    private static int a(String str, int i8, int i9) {
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

    public static String a(Date date) {
        return a(date, false, f17030b);
    }

    public static String a(Date date, boolean z7) {
        return a(date, z7, f17030b);
    }

    public static String a(Date date, boolean z7, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z7 ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        a(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        a(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        a(sb, gregorianCalendar.get(13), 2);
        if (z7) {
            sb.append('.');
            a(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i8 = offset / 60000;
            int abs = Math.abs(i8 / 60);
            int abs2 = Math.abs(i8 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            a(sb, abs, 2);
            sb.append(':');
            a(sb, abs2, 2);
        } else {
            sb.append(k.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date a(String str, ParsePosition parsePosition) {
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
            int a8 = a(str, index, i12);
            if (a(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int a9 = a(str, i12, i13);
            if (a(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int a10 = a(str, i13, i14);
            boolean a11 = a(str, i14, 'T');
            if (!a11 && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(a8, a9 - 1, a10);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (a11) {
                int i15 = i13 + 5;
                int a12 = a(str, i13 + 3, i15);
                if (a(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int a13 = a(str, i15, i16);
                if (a(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (charAt = str.charAt(i16)) == 'Z' || charAt == '+' || charAt == '-') {
                    i9 = a13;
                    i10 = 0;
                    i11 = 0;
                    i14 = i16;
                    i8 = a12;
                } else {
                    int i17 = i16 + 2;
                    i11 = a(str, i16, i17);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (a(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int a14 = a(str, i16 + 4);
                        int min = Math.min(a14, i16 + 6);
                        int a15 = a(str, i18, min);
                        int i19 = min - i18;
                        if (i19 == 1) {
                            a15 *= 100;
                        } else if (i19 == 2) {
                            a15 *= 10;
                        }
                        i8 = a12;
                        i14 = a14;
                        i9 = a13;
                        i10 = a15;
                    } else {
                        i8 = a12;
                        i14 = i17;
                        i9 = a13;
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
                timeZone = f17030b;
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
                timeZone = f17030b;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, a8);
            gregorianCalendar2.set(2, a9 - 1);
            gregorianCalendar2.set(5, a10);
            gregorianCalendar2.set(11, i8);
            gregorianCalendar2.set(12, i9);
            gregorianCalendar2.set(13, i11);
            gregorianCalendar2.set(14, i10);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e8) {
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
        } catch (IndexOutOfBoundsException e9) {
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
        } catch (NumberFormatException e10) {
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

    private static void a(StringBuilder sb, int i8, int i9) {
        String num = Integer.toString(i8);
        for (int length = i9 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }

    private static boolean a(String str, int i8, char c8) {
        return i8 < str.length() && str.charAt(i8) == c8;
    }
}
