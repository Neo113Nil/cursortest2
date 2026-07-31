package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i4) {
        if (i4 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i4 == 1) {
            return "MMMM d, y";
        }
        if (i4 == 2) {
            return "MMM d, y";
        }
        if (i4 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i4);
    }

    private static String getDatePartOfDateTimePattern(int i4) {
        if (i4 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i4 == 1) {
            return "MMMM d, yyyy";
        }
        if (i4 == 2) {
            return "MMM d, yyyy";
        }
        if (i4 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i4);
    }

    private static String getTimePartOfDateTimePattern(int i4) {
        if (i4 == 0 || i4 == 1) {
            return "h:mm:ss a z";
        }
        if (i4 == 2) {
            return "h:mm:ss a";
        }
        if (i4 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i4);
    }

    public static DateFormat getUSDateFormat(int i4) {
        return new SimpleDateFormat(getDateFormatPattern(i4), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i4, int i5) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i4) + " " + getTimePartOfDateTimePattern(i5), Locale.US);
    }
}
