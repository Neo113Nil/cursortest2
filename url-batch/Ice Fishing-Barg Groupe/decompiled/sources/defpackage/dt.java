package defpackage;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dt {
    public static int PxuCJdSBwIXG(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static long lS5Rgt96tfkO(String str, int i) {
        int PxuCJdSBwIXG = PxuCJdSBwIXG(str, 0, i, false);
        Matcher matcher = et.r3s1LDPKFs1S.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (PxuCJdSBwIXG < i) {
            int PxuCJdSBwIXG2 = PxuCJdSBwIXG(str, PxuCJdSBwIXG + 1, i, true);
            matcher.region(PxuCJdSBwIXG, PxuCJdSBwIXG2);
            if (i3 == -1 && matcher.usePattern(et.r3s1LDPKFs1S).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(et.cpQdD2nAriOS).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = et.x50lh2ztY7Y5;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i5 = ia2.hVNtCUZb4tYH(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(et.dgRBjINgWbAK).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i2 = Integer.parseInt(group6);
                }
            }
            PxuCJdSBwIXG = PxuCJdSBwIXG(str, PxuCJdSBwIXG2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        if (i5 == -1) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(mv2.PxuCJdSBwIXG);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
