package m0;

import W.J;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: m0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280B {

    /* renamed from: c, reason: collision with root package name */
    public static final C1280B f14296c = new C1280B(0, -9223372036854775807L);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14297d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* renamed from: a, reason: collision with root package name */
    public final long f14298a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14299b;

    public C1280B(long j4, long j5) {
        this.f14298a = j4;
        this.f14299b = j5;
    }

    public static C1280B a(String str) {
        long parseFloat;
        Matcher matcher = f14297d.matcher(str);
        boolean matches = matcher.matches();
        Pattern pattern = z.f14477a;
        if (!matches) {
            throw T.G.b(str, null);
        }
        String group = matcher.group(1);
        if (group == null) {
            throw T.G.b(str, null);
        }
        String str2 = J.f3263a;
        long parseFloat2 = group.equals("now") ? 0L : (long) (Float.parseFloat(group) * 1000.0f);
        String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                parseFloat = (long) (Float.parseFloat(group2) * 1000.0f);
                if (parseFloat < parseFloat2) {
                    throw T.G.b(str, null);
                }
            } catch (NumberFormatException e4) {
                throw T.G.b(group2, e4);
            }
        } else {
            parseFloat = -9223372036854775807L;
        }
        return new C1280B(parseFloat2, parseFloat);
    }
}
