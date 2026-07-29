package com.google.gson.internal.bind.a;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: ISO8601Utils.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f6586a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: IllegalArgumentException -> 0x01b1, NumberFormatException -> 0x01b3, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x004f, B:20:0x005f, B:21:0x0061, B:23:0x006d, B:24:0x006f, B:26:0x0075, B:30:0x007f, B:35:0x008f, B:37:0x0097, B:38:0x00aa, B:41:0x00be, B:43:0x00c4, B:45:0x00cb, B:46:0x0178, B:51:0x00d5, B:52:0x00f0, B:53:0x00f1, B:56:0x010d, B:58:0x011a, B:61:0x0123, B:63:0x0142, B:66:0x0151, B:67:0x0173, B:69:0x0176, B:70:0x00fc, B:71:0x01a9, B:72:0x01b0, B:73:0x00ae, B:74:0x00b1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a9 A[Catch: IllegalArgumentException -> 0x01b1, NumberFormatException -> 0x01b3, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01b5, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x004f, B:20:0x005f, B:21:0x0061, B:23:0x006d, B:24:0x006f, B:26:0x0075, B:30:0x007f, B:35:0x008f, B:37:0x0097, B:38:0x00aa, B:41:0x00be, B:43:0x00c4, B:45:0x00cb, B:46:0x0178, B:51:0x00d5, B:52:0x00f0, B:53:0x00f1, B:56:0x010d, B:58:0x011a, B:61:0x0123, B:63:0x0142, B:66:0x0151, B:67:0x0173, B:69:0x0176, B:70:0x00fc, B:71:0x01a9, B:72:0x01b0, B:73:0x00ae, B:74:0x00b1), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date a(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        TimeZone timeZone;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int a2 = a(str, index, i6);
            if (a(str, i6, '-')) {
                i6++;
            }
            int i7 = i6 + 2;
            int a3 = a(str, i6, i7);
            if (a(str, i7, '-')) {
                i7++;
            }
            int i8 = i7 + 2;
            int a4 = a(str, i7, i8);
            boolean a5 = a(str, i8, 'T');
            if (!a5 && str.length() <= i8) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(a2, a3 - 1, a4);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (a5) {
                int i9 = i8 + 1;
                int i10 = i9 + 2;
                i2 = a(str, i9, i10);
                if (a(str, i10, ':')) {
                    i10++;
                }
                i = i10 + 2;
                i3 = a(str, i10, i);
                if (a(str, i, ':')) {
                    i++;
                }
                if (str.length() > i && (charAt = str.charAt(i)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i11 = i + 2;
                    int a6 = a(str, i, i11);
                    i5 = 59;
                    if (a6 <= 59 || a6 >= 63) {
                        i5 = a6;
                    }
                    if (a(str, i11, '.')) {
                        int i12 = i11 + 1;
                        i = a(str, i12 + 1);
                        int min = Math.min(i, i12 + 3);
                        int a7 = a(str, i12, min);
                        switch (min - i12) {
                            case 1:
                                a7 *= 100;
                                break;
                            case 2:
                                a7 *= 10;
                                break;
                        }
                        i4 = a7;
                    } else {
                        i = i11;
                        i4 = 0;
                    }
                    if (str.length() > i) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 == 'Z') {
                        timeZone = f6586a;
                        length = i + 1;
                    } else {
                        if (charAt2 != '+' && charAt2 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                        }
                        String substring = str.substring(i);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String str3 = "GMT" + substring;
                            TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                            String id = timeZone2.getID();
                            if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        }
                        timeZone = f6586a;
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, a2);
                    gregorianCalendar2.set(2, a3 - 1);
                    gregorianCalendar2.set(5, a4);
                    gregorianCalendar2.set(11, i2);
                    gregorianCalendar2.set(12, i3);
                    gregorianCalendar2.set(13, i5);
                    gregorianCalendar2.set(14, i4);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
            } else {
                i = i8;
                i2 = 0;
                i3 = 0;
            }
            i4 = 0;
            i5 = 0;
            if (str.length() > i) {
            }
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    private static int a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i3 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = -digit;
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < i2) {
            int i5 = i3 + 1;
            int digit2 = Character.digit(str.charAt(i3), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i4 = (i4 * 10) - digit2;
            i3 = i5;
        }
        return -i4;
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
