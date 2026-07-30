package cn.hutool.core.text;

import cn.hutool.core.lang.d0;
import cn.hutool.core.lang.n0;
import cn.hutool.core.text.finder.CharFinder;
import cn.hutool.core.text.finder.CharMatcherFinder;
import cn.hutool.core.text.finder.LengthFinder;
import cn.hutool.core.text.finder.PatternFinder;
import cn.hutool.core.text.finder.StrFinder;
import cn.hutool.core.text.split.SplitIter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$trimFunc$0(boolean z7, String str) {
        return z7 ? l.trim(str) : str;
    }

    public static List<String> split(CharSequence charSequence, char c8, boolean z7, boolean z8) {
        return split(charSequence, c8, 0, z7, z8);
    }

    public static String[] splitByLength(CharSequence charSequence, int i8) {
        return charSequence == null ? new String[0] : new SplitIter(charSequence, new LengthFinder(i8), -1, false).toArray(false);
    }

    public static List<String> splitByRegex(String str, String str2, int i8, boolean z7, boolean z8) {
        return split(str, n0.get(str2), i8, z7, z8);
    }

    public static List<String> splitIgnoreCase(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8) {
        return split(charSequence, c8, i8, z7, z8, true);
    }

    public static List<String> splitPath(CharSequence charSequence) {
        return splitPath(charSequence, 0);
    }

    public static String[] splitPathToArray(CharSequence charSequence) {
        return toArray(splitPath(charSequence));
    }

    public static String[] splitToArray(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8) {
        return toArray(split(charSequence, c8, i8, z7, z8));
    }

    public static List<String> splitTrim(CharSequence charSequence, char c8, boolean z7) {
        return split(charSequence, c8, 0, true, z7);
    }

    public static List<String> splitTrimIgnoreCase(CharSequence charSequence, String str, int i8, boolean z7) {
        return split(charSequence, str, i8, true, z7, true);
    }

    private static String[] toArray(List<String> list) {
        return (String[]) list.toArray(new String[0]);
    }

    private static Function<String, String> trimFunc(final boolean z7) {
        return new Function() { // from class: cn.hutool.core.text.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lambda$trimFunc$0;
                lambda$trimFunc$0 = q.lambda$trimFunc$0(z7, (String) obj);
                return lambda$trimFunc$0;
            }
        };
    }

    public static List<String> split(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8) {
        return split(charSequence, c8, i8, z7, z8, false);
    }

    public static List<String> splitIgnoreCase(CharSequence charSequence, String str, int i8, boolean z7, boolean z8) {
        return split(charSequence, str, i8, z7, z8, true);
    }

    public static List<String> splitPath(CharSequence charSequence, int i8) {
        return split(charSequence, cn.hutool.core.io.file.c.UNIX_SEPARATOR, i8, true, true);
    }

    public static String[] splitPathToArray(CharSequence charSequence, int i8) {
        return toArray(splitPath(charSequence, i8));
    }

    public static String[] splitToArray(CharSequence charSequence, String str, int i8, boolean z7, boolean z8) {
        return toArray(split(charSequence, str, i8, z7, z8));
    }

    public static List<String> splitTrim(CharSequence charSequence, char c8, int i8, boolean z7) {
        return split(charSequence, c8, i8, true, z7, false);
    }

    public static <R> List<R> split(CharSequence charSequence, char c8, int i8, boolean z7, Function<String, R> function) {
        return split(charSequence, c8, i8, z7, false, (Function) function);
    }

    public static String[] splitToArray(String str, int i8) {
        return toArray(split(str, i8));
    }

    public static List<String> splitTrim(CharSequence charSequence, String str, boolean z7) {
        return split(charSequence, str, true, z7);
    }

    public static List<String> split(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8, boolean z9) {
        return split(charSequence, c8, i8, z8, z9, trimFunc(z7));
    }

    public static String[] splitToArray(String str, Pattern pattern, int i8, boolean z7, boolean z8) {
        return toArray(split(str, pattern, i8, z7, z8));
    }

    public static List<String> splitTrim(CharSequence charSequence, String str, int i8, boolean z7) {
        return split(charSequence, str, i8, true, z7);
    }

    public static <R> List<R> split(CharSequence charSequence, char c8, int i8, boolean z7, boolean z8, Function<String, R> function) {
        if (charSequence == null) {
            return new ArrayList(0);
        }
        return new SplitIter(charSequence, new CharFinder(c8, z8), i8, z7).toList(function);
    }

    public static List<String> split(CharSequence charSequence, String str, boolean z7, boolean z8) {
        return split(charSequence, str, -1, z7, z8, false);
    }

    public static List<String> split(CharSequence charSequence, String str, int i8, boolean z7, boolean z8) {
        return split(charSequence, str, i8, z7, z8, false);
    }

    public static List<String> split(CharSequence charSequence, String str, int i8, boolean z7, boolean z8, boolean z9) {
        if (charSequence == null) {
            return new ArrayList(0);
        }
        return new SplitIter(charSequence, new StrFinder(str, z9), i8, z8).toList(z7);
    }

    public static List<String> split(CharSequence charSequence, int i8) {
        if (charSequence == null) {
            return new ArrayList(0);
        }
        return new SplitIter(charSequence, new CharMatcherFinder(new d0() { // from class: cn.hutool.core.text.o
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return cn.hutool.core.util.k.isBlankChar(((Character) obj).charValue());
            }
        }), i8, true).toList(false);
    }

    public static List<String> split(String str, Pattern pattern, int i8, boolean z7, boolean z8) {
        if (str == null) {
            return new ArrayList(0);
        }
        return new SplitIter(str, new PatternFinder(pattern), i8, z8).toList(z7);
    }
}
