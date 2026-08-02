package kotlin.text;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.GeneratorSequence;
import okio.Path$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Regex implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final Pattern nativePattern;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Regex(String str, RegexOption regexOption) {
        str.getClass();
        regexOption.getClass();
        Companion companion = INSTANCE;
        int i = regexOption.value;
        companion.getClass();
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        compile.getClass();
        this.nativePattern = compile;
    }

    public static GeneratorSequence findAll$default(String str, Regex regex) {
        regex.getClass();
        str.getClass();
        int i = 0;
        if (str.length() >= 0) {
            return new GeneratorSequence(new Regex$$ExternalSyntheticLambda1(i, regex, str), Regex$findAll$2.INSTANCE);
        }
        Path$$ExternalSyntheticBUOutline0.m(str.length(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(0, "Start index out of bounds: ", ", input length: "));
        return null;
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).find();
    }

    public final MatcherMatchResult find(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public final MatcherMatchResult matchAt(int i, String str) {
        str.getClass();
        Matcher region = this.nativePattern.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new MatcherMatchResult(region, str);
        }
        return null;
    }

    public final MatcherMatchResult matchEntire(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    public final boolean matches(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String replace(String str, Function1 function1) {
        str.getClass();
        function1.getClass();
        MatcherMatchResult find = find(str);
        if (find == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, find.getRange().first);
            sb.append((CharSequence) function1.invoke(find));
            i = find.getRange().last + 1;
            find = find.next();
            if (i >= length) {
                break;
            }
        } while (find != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List split(int i, CharSequence charSequence) {
        charSequence.getClass();
        StringsKt__StringsKt.requireNonNegativeLimit(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return CollectionsKt__CollectionsJVMKt.listOf(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.nativePattern.toString();
        pattern.getClass();
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String str) {
        this(r1);
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.nativePattern = pattern;
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        replaceAll.getClass();
        return replaceAll;
    }
}
