package kotlin.text;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f7514e = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f7515d;

    @Metadata
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Regex(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern nativePattern = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(nativePattern, "compile(...)");
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f7515d = nativePattern;
    }

    public final j a(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f7515d.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new j(matcher, input);
        }
        return null;
    }

    public final boolean b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f7515d.matcher(input).matches();
    }

    public final String replace(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f7515d.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f7515d.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }
}
