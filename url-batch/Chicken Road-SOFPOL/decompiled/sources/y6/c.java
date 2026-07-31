package y6;

import a0.g1;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f8993d;

    public c(String str) {
        q6.i.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        q6.i.d(compile, "compile(...)");
        this.f8993d = compile;
    }

    public static g1 a(c cVar, String str) {
        cVar.getClass();
        q6.i.e(str, "input");
        Matcher matcher = cVar.f8993d.matcher(str);
        q6.i.d(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new g1(matcher, str);
        }
        return null;
    }

    public final g1 b(String str) {
        q6.i.e(str, "input");
        Matcher matcher = this.f8993d.matcher(str);
        q6.i.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new g1(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.f8993d.toString();
        q6.i.d(pattern, "toString(...)");
        return pattern;
    }

    public c(String str, int i) {
        q6.i.e(str, "pattern");
        Pattern compile = Pattern.compile(str, 66);
        q6.i.d(compile, "compile(...)");
        this.f8993d = compile;
    }
}
