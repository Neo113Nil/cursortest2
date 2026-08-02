package Z0;

import W.AbstractC0108a;
import W.J;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3820a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3821b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3822c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3823d;

    static {
        String str = J.f3263a;
        Locale locale = Locale.US;
        f3821b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f3822c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f3823d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String group;
        String group2;
        Matcher matcher = f3821b.matcher(str);
        Matcher matcher2 = f3822c.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                AbstractC0108a.j("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
