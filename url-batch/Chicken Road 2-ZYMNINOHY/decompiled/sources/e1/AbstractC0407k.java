package e1;

import T.G;
import W.J;
import W.u;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* renamed from: e1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0407k {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f8466a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(u uVar) {
        uVar.getClass();
        String n = uVar.n(StandardCharsets.UTF_8);
        return n != null && n.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = J.f3263a;
        String[] split = str.split("\\.", 2);
        long j4 = 0;
        for (String str3 : split[0].split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1)) {
            j4 = (j4 * 60) + Long.parseLong(str3);
        }
        long j5 = j4 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
            j5 += Long.parseLong(trim);
        }
        return j5 * 1000;
    }

    public static void d(u uVar) {
        int i4 = uVar.f3352b;
        if (a(uVar)) {
            return;
        }
        uVar.M(i4);
        throw G.a(null, "Expected WEBVTT. Got " + uVar.n(StandardCharsets.UTF_8));
    }
}
