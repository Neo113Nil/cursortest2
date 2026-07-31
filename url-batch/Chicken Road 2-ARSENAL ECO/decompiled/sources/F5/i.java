package F5;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Pattern f806f;

    public i(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.f806f = compile;
    }

    public final B0.c a(String input, int i7) {
        kotlin.jvm.internal.i.e(input, "input");
        Matcher region = this.f806f.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i7, input.length());
        if (region.lookingAt()) {
            return new B0.c(region, input);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.f806f.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
