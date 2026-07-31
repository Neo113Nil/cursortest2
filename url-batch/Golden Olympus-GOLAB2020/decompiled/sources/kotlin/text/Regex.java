package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class Regex implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f41255c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f41256b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f41256b = nativePattern;
    }

    public static /* synthetic */ MatchResult b(Regex regex, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return regex.a(charSequence, i4);
    }

    public final MatchResult a(CharSequence input, int i4) {
        MatchResult e4;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f41256b.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        e4 = e.e(matcher, i4, input);
        return e4;
    }

    public final MatchResult c(CharSequence input) {
        MatchResult f4;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f41256b.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        f4 = e.f(matcher, input);
        return f4;
    }

    public final boolean d(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f41256b.matcher(input).matches();
    }

    public final String e(CharSequence input, Function1 transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i4 = 0;
        MatchResult b4 = b(this, input, 0, 2, null);
        if (b4 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i4, b4.b().l().intValue());
            sb.append((CharSequence) transform.invoke(b4));
            i4 = b4.b().k().intValue() + 1;
            b4 = b4.next();
            if (i4 >= length) {
                break;
            }
        } while (b4 != null);
        if (i4 < length) {
            sb.append(input, i4, length);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String f(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceFirst = this.f41256b.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    public final List g(CharSequence input, int i4) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.z0(i4);
        Matcher matcher = this.f41256b.matcher(input);
        if (i4 == 1 || !matcher.find()) {
            return CollectionsKt.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i4 > 0 ? kotlin.ranges.g.g(i4, 10) : 10);
        int i5 = i4 - 1;
        int i6 = 0;
        do {
            arrayList.add(input.subSequence(i6, matcher.start()).toString());
            i6 = matcher.end();
            if (i5 >= 0 && arrayList.size() == i5) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i6, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f41256b.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f41256b.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(@NotNull String pattern) {
        this(r2);
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
    }
}
