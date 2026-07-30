package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.sequences.SequencesKt__SequencesKt;

/* loaded from: classes3.dex */
public final class Regex implements Serializable {
    public static final a Companion = new a(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    private static final class Serialized implements Serializable {
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
                this();
            }
        }

        public Serialized(String pattern, int i8) {
            kotlin.jvm.internal.s.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i8;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int ensureUnicodeCase(int i8) {
            return (i8 & 2) != 0 ? i8 | 64 : i8;
        }

        public final String escape(String literal) {
            kotlin.jvm.internal.s.checkNotNullParameter(literal, "literal");
            String quote = Pattern.quote(literal);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(quote, "quote(literal)");
            return quote;
        }

        public final String escapeReplacement(String literal) {
            kotlin.jvm.internal.s.checkNotNullParameter(literal, "literal");
            String quoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(quoteReplacement, "quoteReplacement(literal)");
            return quoteReplacement;
        }

        public final Regex fromLiteral(String literal) {
            kotlin.jvm.internal.s.checkNotNullParameter(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }
    }

    public Regex(Pattern nativePattern) {
        kotlin.jvm.internal.s.checkNotNullParameter(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ j find$default(Regex regex, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return regex.find(charSequence, i8);
    }

    public static /* synthetic */ kotlin.sequences.m findAll$default(Regex regex, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return regex.findAll(charSequence, i8);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return regex.split(charSequence, i8);
    }

    public static /* synthetic */ kotlin.sequences.m splitToSequence$default(Regex regex, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return regex.splitToSequence(charSequence, i8);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence input) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final j find(CharSequence input, int i8) {
        j findNext;
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        findNext = RegexKt.findNext(matcher, i8, input);
        return findNext;
    }

    public final kotlin.sequences.m findAll(final CharSequence input, final int i8) {
        kotlin.sequences.m generateSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        if (i8 >= 0 && i8 <= input.length()) {
            generateSequence = SequencesKt__SequencesKt.generateSequence(new f6.a() { // from class: kotlin.text.Regex$findAll$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // f6.a
                public final j invoke() {
                    return Regex.this.find(input, i8);
                }
            }, (f6.l) Regex$findAll$2.INSTANCE);
            return generateSequence;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i8 + ", input length: " + input.length());
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        final int flags = this.nativePattern.flags();
        EnumSet fromInt$lambda$1 = EnumSet.allOf(RegexOption.class);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(fromInt$lambda$1, "fromInt$lambda$1");
        kotlin.collections.v.retainAll(fromInt$lambda$1, new f6.l() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final Boolean invoke(RegexOption regexOption) {
                RegexOption regexOption2 = regexOption;
                return Boolean.valueOf((flags & regexOption2.getMask()) == regexOption2.getValue());
            }
        });
        Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final j matchAt(CharSequence input, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i8, input.length());
        if (!region.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.s.checkNotNullExpressionValue(region, "this");
        return new MatcherMatchResult(region, input);
    }

    public final j matchEntire(CharSequence input) {
        j matchEntire;
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(matcher, "nativePattern.matcher(input)");
        matchEntire = RegexKt.matchEntire(matcher, input);
        return matchEntire;
    }

    public final boolean matches(CharSequence input) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i8, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, String replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence input, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(i8);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i8 == 1 || !matcher.find()) {
            return kotlin.collections.q.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i8 > 0 ? j6.v.coerceAtMost(i8, 10) : 10);
        int i9 = i8 - 1;
        int i10 = 0;
        do {
            arrayList.add(input.subSequence(i10, matcher.start()).toString());
            i10 = matcher.end();
            if (i9 >= 0 && arrayList.size() == i9) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i10, input.length()).toString());
        return arrayList;
    }

    public final kotlin.sequences.m splitToSequence(CharSequence input, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        StringsKt__StringsKt.requireNonNegativeLimit(i8);
        return kotlin.sequences.q.sequence(new Regex$splitToSequence$1(this, input, i8, null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String pattern) {
        this(r2);
        kotlin.jvm.internal.s.checkNotNullParameter(pattern, "pattern");
        Pattern compile = Pattern.compile(pattern);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(pattern)");
    }

    public final String replace(CharSequence input, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        j find$default = find$default(this, input, 0, 2, null);
        if (find$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i8, find$default.getRange().getStart().intValue());
            sb.append((CharSequence) transform.invoke(find$default));
            i8 = find$default.getRange().getEndInclusive().intValue() + 1;
            find$default = find$default.next();
            if (i8 >= length) {
                break;
            }
        } while (find$default != null);
        if (i8 < length) {
            sb.append(input, i8, length);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String pattern, RegexOption option) {
        this(r2);
        kotlin.jvm.internal.s.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.s.checkNotNullParameter(option, "option");
        Pattern compile = Pattern.compile(pattern, Companion.ensureUnicodeCase(option.getValue()));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(pattern, ensureUnicodeCase(option.value))");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String pattern, Set<? extends RegexOption> options) {
        this(r2);
        int i8;
        kotlin.jvm.internal.s.checkNotNullParameter(pattern, "pattern");
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        a aVar = Companion;
        i8 = RegexKt.toInt(options);
        Pattern compile = Pattern.compile(pattern, aVar.ensureUnicodeCase(i8));
        kotlin.jvm.internal.s.checkNotNullExpressionValue(compile, "compile(pattern, ensureU…odeCase(options.toInt()))");
    }
}
