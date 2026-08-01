package com.bykv.vk.openvk.preload.a.b.a.a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes.dex */
public final class a {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x017d, B:52:0x00e0, B:53:0x00fa, B:54:0x00fb, B:57:0x0119, B:59:0x0126, B:62:0x012f, B:64:0x0147, B:67:0x0156, B:68:0x0178, B:70:0x017b, B:71:0x0106, B:72:0x01ae, B:73:0x01b5, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae A[Catch: IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, NumberFormatException -> 0x01b8, IndexOutOfBoundsException -> 0x01ba, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01b6, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:42:0x00c9, B:44:0x00cf, B:46:0x00d6, B:47:0x017d, B:52:0x00e0, B:53:0x00fa, B:54:0x00fb, B:57:0x0119, B:59:0x0126, B:62:0x012f, B:64:0x0147, B:67:0x0156, B:68:0x0178, B:70:0x017b, B:71:0x0106, B:72:0x01ae, B:73:0x01b5, B:74:0x00b0, B:75:0x00b3), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date a(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i5 = index + 4;
            int a2 = a(str, index, i5);
            if (a(str, i5, SignatureVisitor.SUPER)) {
                i5++;
            }
            int i6 = i5 + 2;
            int a3 = a(str, i5, i6);
            if (a(str, i6, SignatureVisitor.SUPER)) {
                i6++;
            }
            int i7 = i6 + 2;
            int a4 = a(str, i6, i7);
            boolean a5 = a(str, i7, 'T');
            if (!a5 && str.length() <= i7) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(a2, a3 - 1, a4);
                parsePosition.setIndex(i7);
                return gregorianCalendar.getTime();
            }
            if (a5) {
                int i8 = i7 + 1;
                int i9 = i8 + 2;
                int a6 = a(str, i8, i9);
                if (a(str, i9, AbstractJsonLexerKt.COLON)) {
                    i9++;
                }
                int i10 = i9 + 2;
                int a7 = a(str, i9, i10);
                if (a(str, i10, AbstractJsonLexerKt.COLON)) {
                    i10++;
                }
                if (str.length() > i10 && (charAt = str.charAt(i10)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i11 = i10 + 2;
                    i4 = a(str, i10, i11);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (a(str, i11, '.')) {
                        int i12 = i11 + 1;
                        int a8 = a(str, i12 + 1);
                        int min = Math.min(a8, i12 + 3);
                        int a9 = a(str, i12, min);
                        int i13 = min - i12;
                        if (i13 == 1) {
                            a9 *= 100;
                        } else if (i13 == 2) {
                            a9 *= 10;
                        }
                        i2 = a7;
                        i3 = a9;
                        i = a6;
                        i7 = a8;
                    } else {
                        i2 = a7;
                        i = a6;
                        i7 = i11;
                        i3 = 0;
                    }
                    if (str.length() > i7) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt2 = str.charAt(i7);
                    if (charAt2 == 'Z') {
                        timeZone = a;
                        length = i7 + 1;
                    } else {
                        if (charAt2 != '+' && charAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                        String substring = str.substring(i7);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i7 + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String concat = "GMT".concat(String.valueOf(substring));
                            TimeZone timeZone2 = TimeZone.getTimeZone(concat);
                            String id = timeZone2.getID();
                            if (!id.equals(concat) && !id.replace(":", "").equals(concat)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + concat + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        }
                        timeZone = a;
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, a2);
                    gregorianCalendar2.set(2, a3 - 1);
                    gregorianCalendar2.set(5, a4);
                    gregorianCalendar2.set(11, i);
                    gregorianCalendar2.set(12, i2);
                    gregorianCalendar2.set(13, i4);
                    gregorianCalendar2.set(14, i3);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i2 = a7;
                i3 = 0;
                i = a6;
                i7 = i10;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            if (str.length() > i7) {
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException e) {
            String str2 = str == null ? null : "\"" + str + '\"';
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
