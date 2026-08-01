package kotlin.text;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 :2\u00060\u0001j\u0002`\u0002:\u00029:B\u0015\bA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0002\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\bV\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\nB\u0019\bV\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\rB\u001f\bV\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0005\u0010\u0010J\u0012\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\u0084\u0004J\u0012\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\u0080\u0004J\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0086\u0080\u0004J\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0086\u0080\u0004J\u0014\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\u0080\u0004J*\u0010\"\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001eH\u0087\u0080\u0004b\f\b$\u0012\b\b%\u0012\u0004\b\b(&J(\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u001eH\u0087\u0080\u0004b\f\b$\u0012\b\b%\u0012\u0004\b\b(&J\u001a\u0010(\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\tH\u0086\u0080\u0004J&\u0010(\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190+H\u0086\u0080\u0004J\u001a\u0010,\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\tH\u0086\u0080\u0004J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0.2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u001eH\u0086\u0080\u0004J0\u00100\u001a\b\u0012\u0004\u0012\u00020\t0 2\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010/\u001a\u00020\u001eH\u0087\u0080\u0004b\f\b$\u0012\b\b%\u0012\u0004\b\b(1J\n\u00102\u001a\u00020\tH\u0096\u0080\u0004J\n\u00103\u001a\u00020\u0004H\u0086\u0080\u0004J\n\u00104\u001a\u000205H\u0082\u0080\u0004J\u0012\u00106\u001a\u0002072\u0006\u0010\u0018\u001a\u000208H\u0082\u0080\u0004R\u000f\u0010\u0003\u001a\u00020\u0004X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u00020\t8FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fX\u0082\u008e\b¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8FX\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006;"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "nativePattern", "Ljava/util/regex/Pattern;", "<init>", "(Ljava/util/regex/Pattern;)V", "Lkotlin/PublishedApi;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "getPattern", "()Ljava/lang/String;", "_options", "getOptions", "()Ljava/util/Set;", "matches", "", "input", "", "containsMatchIn", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matchAt", "index", "Lkotlin/SinceKotlin;", "version", "1.7", "matchesAt", "replace", "replacement", "transform", "Lkotlin/Function1;", "replaceFirst", "split", "", "limit", "splitToSequence", "1.6", "toString", "toPattern", "writeReplace", "", "readObject", "", "Ljava/io/ObjectInputStream;", "Serialized", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, a4.j.LONG_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Regex implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final f f5606e = new f(null);

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f5607d;

    public Regex(String str, g gVar) {
        str.getClass();
        gVar.getClass();
        f fVar = f5606e;
        int i3 = gVar.f5626d;
        fVar.getClass();
        Pattern compile = Pattern.compile(str, (i3 & 2) != 0 ? i3 | 64 : i3);
        compile.getClass();
        this.f5607d = compile;
    }

    public static a1.n a(Regex regex, String str) {
        regex.getClass();
        str.getClass();
        Matcher matcher = regex.f5607d.matcher(str);
        matcher.getClass();
        if (matcher.find(0)) {
            return new a1.n(matcher, str);
        }
        return null;
    }

    public final a1.n b(String str) {
        str.getClass();
        Matcher matcher = this.f5607d.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new a1.n(matcher, str);
        }
        return null;
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.f5607d.matcher(charSequence).matches();
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String replaceAll = this.f5607d.matcher(input).replaceAll(replacement);
        replaceAll.getClass();
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f5607d.toString();
        pattern.getClass();
        return pattern;
    }

    public Regex(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        compile.getClass();
        this.f5607d = compile;
    }
}
