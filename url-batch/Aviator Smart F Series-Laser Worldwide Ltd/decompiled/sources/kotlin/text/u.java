package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.collections.f0;

/* loaded from: classes3.dex */
class u extends StringsKt__StringsKt {
    private static final char elementAt(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i8);
    }

    public static final /* synthetic */ Character max(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.maxOrNull(charSequence);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charAt));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) < 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.maxWithOrNull(charSequence, comparator);
    }

    public static final /* synthetic */ Character min(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return StringsKt___StringsKt.minOrNull(charSequence);
    }

    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(charAt);
        }
        Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charAt));
        f0 it = new j6.m(1, lastIndex).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            Comparable comparable2 = (Comparable) selector.invoke(Character.valueOf(charAt2));
            if (comparable.compareTo(comparable2) > 0) {
                charAt = charAt2;
                comparable = comparable2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        return StringsKt___StringsKt.minWithOrNull(charSequence, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            valueOf = valueOf.add((BigDecimal) selector.invoke(Character.valueOf(charSequence.charAt(i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    private static final BigInteger sumOfBigInteger(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            valueOf = valueOf.add((BigInteger) selector.invoke(Character.valueOf(charSequence.charAt(i8))));
            kotlin.jvm.internal.s.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    public static final SortedSet<Character> toSortedSet(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) StringsKt___StringsKt.toCollection(charSequence, new TreeSet());
    }
}
