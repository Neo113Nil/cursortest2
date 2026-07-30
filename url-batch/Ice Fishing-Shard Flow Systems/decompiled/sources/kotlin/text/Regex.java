package kotlin.text;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final h f6180e = new h(null);

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f6181d;

    public Regex(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern nativePattern = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(nativePattern, "compile(...)");
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f6181d = nativePattern;
    }

    public final D0.j a(int i2, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher region = this.f6181d.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length());
        if (region.lookingAt()) {
            return new D0.j(region, input);
        }
        return null;
    }

    public final D0.j b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f6181d.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new D0.j(matcher, input);
        }
        return null;
    }

    public final boolean c(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f6181d.matcher(input).matches();
    }

    public final String replace(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f6181d.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f6181d.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }
}
