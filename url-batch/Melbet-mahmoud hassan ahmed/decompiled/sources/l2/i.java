package l2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.a0;
import o2.m0;
import r0.n2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f18588a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(a0 a0Var) {
        String o7;
        while (true) {
            String o8 = a0Var.o();
            if (o8 == null) {
                return null;
            }
            if (f18588a.matcher(o8).matches()) {
                do {
                    o7 = a0Var.o();
                    if (o7 != null) {
                    }
                } while (!o7.isEmpty());
            } else {
                Matcher matcher = f.f18561a.matcher(o8);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(a0 a0Var) {
        String o7 = a0Var.o();
        return o7 != null && o7.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] R0 = m0.R0(str, "\\.");
        long j7 = 0;
        for (String str2 : m0.Q0(R0[0], ":")) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j8 = j7 * 1000;
        if (R0.length == 2) {
            j8 += Long.parseLong(R0[1]);
        }
        return j8 * 1000;
    }

    public static void e(a0 a0Var) {
        int e7 = a0Var.e();
        if (b(a0Var)) {
            return;
        }
        a0Var.O(e7);
        throw n2.a("Expected WEBVTT. Got " + a0Var.o(), null);
    }
}
