package com.moyoung.dafit.module.common.utils;

import androidx.annotation.NonNull;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes4.dex */
public class n {
    public static final String ONE_DECIMAL_PATTERN = "#.#";
    public static final String ONE_INTEGERS_PATTERN = "0";
    public static final String TWO_DECIMAL_PATTERN = "#.##";
    public static final String TWO_INTEGERS_PATTERN = "00";

    private n() {
    }

    public static String format(double d8) {
        return format(d8, ONE_DECIMAL_PATTERN);
    }

    public static String formatTemp(double d8) {
        return getDecimalFormat(ONE_DECIMAL_PATTERN).format(d8);
    }

    public static String formatWeight(double d8, int i8) {
        if (i8 <= 0) {
            return String.valueOf(Math.round(d8));
        }
        float decimalFormat = getDecimalFormat((float) d8, i8);
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("0");
        }
        return getDecimalFormat(sb.toString()).format(decimalFormat);
    }

    public static float getDecimalFormat(float f8, int i8) {
        if (i8 <= 0) {
            return Math.round(f8);
        }
        double d8 = f8;
        return (float) (Math.round(d8 * Math.pow(10.0d, r6)) / Math.pow(10.0d, i8));
    }

    public static String format(double d8, String str) {
        return format(d8, str, RoundingMode.FLOOR);
    }

    public static String format(double d8, String str, RoundingMode roundingMode) {
        DecimalFormat decimalFormat = getDecimalFormat(str);
        decimalFormat.setRoundingMode(roundingMode);
        return decimalFormat.format(d8);
    }

    @NonNull
    public static DecimalFormat getDecimalFormat(String str) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en", u.COUNTRY_US));
        decimalFormat.applyPattern(str);
        return decimalFormat;
    }
}
