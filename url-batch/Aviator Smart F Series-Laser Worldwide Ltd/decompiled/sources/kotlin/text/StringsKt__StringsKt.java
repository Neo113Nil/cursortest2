package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StringsKt__StringsKt extends t {

    public static final class a extends kotlin.collections.o {
        final /* synthetic */ CharSequence $this_iterator;
        private int index;

        a(CharSequence charSequence) {
            this.$this_iterator = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.length();
        }

        @Override // kotlin.collections.o
        public char nextChar() {
            CharSequence charSequence = this.$this_iterator;
            int i8 = this.index;
            this.index = i8 + 1;
            return charSequence.charAt(i8);
        }
    }

    public static final String commonPrefixWith(CharSequence charSequence, CharSequence other, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        int i8 = 0;
        while (i8 < min && c.equals(charSequence.charAt(i8), other.charAt(i8), z7)) {
            i8++;
        }
        int i9 = i8 - 1;
        if (hasSurrogatePairAt(charSequence, i9) || hasSurrogatePairAt(other, i9)) {
            i8--;
        }
        return charSequence.subSequence(0, i8).toString();
    }

    public static /* synthetic */ String commonPrefixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return commonPrefixWith(charSequence, charSequence2, z7);
    }

    public static final String commonSuffixWith(CharSequence charSequence, CharSequence other, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int length = charSequence.length();
        int min = Math.min(length, other.length());
        int i8 = 0;
        while (i8 < min && c.equals(charSequence.charAt((length - i8) - 1), other.charAt((r1 - i8) - 1), z7)) {
            i8++;
        }
        if (hasSurrogatePairAt(charSequence, (length - i8) - 1) || hasSurrogatePairAt(other, (r1 - i8) - 1)) {
            i8--;
        }
        return charSequence.subSequence(length - i8, length).toString();
    }

    public static /* synthetic */ String commonSuffixWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return commonSuffixWith(charSequence, charSequence2, z7);
    }

    public static final boolean contains(CharSequence charSequence, CharSequence other, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (indexOf$default(charSequence, (String) other, 0, z7, 2, (Object) null) < 0) {
                return false;
            }
        } else if (indexOf$StringsKt__StringsKt$default(charSequence, other, 0, charSequence.length(), z7, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return contains(charSequence, charSequence2, z7);
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return t.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!c.equals(charSequence.charAt(i8), charSequence2.charAt(i8), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return kotlin.jvm.internal.s.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (charSequence.charAt(i8) != charSequence2.charAt(i8)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean endsWith(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && c.equals(charSequence.charAt(getLastIndex(charSequence)), c8, z7);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return endsWith(charSequence, c8, z7);
    }

    public static final Pair<Integer, String> findAnyOf(CharSequence charSequence, Collection<String> strings, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i8, z7, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i8, boolean z7, boolean z8) {
        int coerceAtMost;
        j6.k downTo;
        Object obj;
        Object obj2;
        int coerceAtLeast;
        Object single;
        if (!z7 && collection.size() == 1) {
            single = CollectionsKt___CollectionsKt.single(collection);
            String str = (String) single;
            int indexOf$default = !z8 ? indexOf$default(charSequence, str, i8, false, 4, (Object) null) : lastIndexOf$default(charSequence, str, i8, false, 4, (Object) null);
            if (indexOf$default < 0) {
                return null;
            }
            return y5.h.to(Integer.valueOf(indexOf$default), str);
        }
        if (z8) {
            coerceAtMost = j6.v.coerceAtMost(i8, getLastIndex(charSequence));
            downTo = j6.v.downTo(coerceAtMost, 0);
        } else {
            coerceAtLeast = j6.v.coerceAtLeast(i8, 0);
            downTo = new j6.m(coerceAtLeast, charSequence.length());
        }
        if (charSequence instanceof String) {
            int first = downTo.getFirst();
            int last = downTo.getLast();
            int step = downTo.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = (String) obj2;
                        if (t.regionMatches(str2, 0, (String) charSequence, first, str2.length(), z7)) {
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 == null) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        return y5.h.to(Integer.valueOf(first), str3);
                    }
                }
            }
        } else {
            int first2 = downTo.getFirst();
            int last2 = downTo.getLast();
            int step2 = downTo.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String str4 = (String) obj;
                        if (regionMatchesImpl(str4, 0, charSequence, first2, str4.length(), z7)) {
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                    } else {
                        return y5.h.to(Integer.valueOf(first2), str5);
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Pair findAnyOf$default(CharSequence charSequence, Collection collection, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return findAnyOf(charSequence, collection, i8, z7);
    }

    public static final Pair<Integer, String> findLastAnyOf(CharSequence charSequence, Collection<String> strings, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(strings, "strings");
        return findAnyOf$StringsKt__StringsKt(charSequence, strings, i8, z7, true);
    }

    public static /* synthetic */ Pair findLastAnyOf$default(CharSequence charSequence, Collection collection, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return findLastAnyOf(charSequence, collection, i8, z7);
    }

    public static final j6.m getIndices(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return new j6.m(0, charSequence.length() - 1);
    }

    public static int getLastIndex(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final boolean hasSurrogatePairAt(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return new j6.m(0, charSequence.length() + (-2)).contains(i8) && Character.isHighSurrogate(charSequence.charAt(i8)) && Character.isLowSurrogate(charSequence.charAt(i8 + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifBlank(C c8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return t.isBlank(c8) ? (R) defaultValue.invoke() : c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <C extends CharSequence & R, R> R ifEmpty(C c8, f6.a defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return c8.length() == 0 ? (R) defaultValue.invoke() : c8;
    }

    public static final int indexOf(CharSequence charSequence, char c8, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).indexOf(c8, i8);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8) {
        int coerceAtMost;
        int coerceAtLeast;
        j6.k downTo;
        int coerceAtLeast2;
        int coerceAtMost2;
        if (z8) {
            coerceAtMost = j6.v.coerceAtMost(i8, getLastIndex(charSequence));
            coerceAtLeast = j6.v.coerceAtLeast(i9, 0);
            downTo = j6.v.downTo(coerceAtMost, coerceAtLeast);
        } else {
            coerceAtLeast2 = j6.v.coerceAtLeast(i8, 0);
            coerceAtMost2 = j6.v.coerceAtMost(i9, charSequence.length());
            downTo = new j6.m(coerceAtLeast2, coerceAtMost2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = downTo.getFirst();
            int last = downTo.getLast();
            int step = downTo.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            while (!t.regionMatches((String) charSequence2, 0, (String) charSequence, first, charSequence2.length(), z7)) {
                if (first == last) {
                    return -1;
                }
                first += step;
            }
            return first;
        }
        int first2 = downTo.getFirst();
        int last2 = downTo.getLast();
        int step2 = downTo.getStep();
        if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
            return -1;
        }
        while (!regionMatchesImpl(charSequence2, 0, charSequence, first2, charSequence2.length(), z7)) {
            if (first2 == last2) {
                return -1;
            }
            first2 += step2;
        }
        return first2;
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z7, boolean z8, int i10, Object obj) {
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i8, i9, z7, (i10 & 16) != 0 ? false : z8);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return indexOf(charSequence, c8, i8, z7);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] chars, int i8, boolean z7) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt___ArraysKt.single(chars), i8);
        }
        coerceAtLeast = j6.v.coerceAtLeast(i8, 0);
        f0 it = new j6.m(coerceAtLeast, getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            char charAt = charSequence.charAt(nextInt);
            for (char c8 : chars) {
                if (c.equals(c8, charAt, z7)) {
                    return nextInt;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return indexOfAny(charSequence, cArr, i8, z7);
    }

    private static final boolean isEmpty(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    private static final boolean isNotBlank(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return !t.isBlank(charSequence);
    }

    private static final boolean isNotEmpty(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    private static final boolean isNullOrBlank(CharSequence charSequence) {
        return charSequence == null || t.isBlank(charSequence);
    }

    private static final boolean isNullOrEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static final kotlin.collections.o iterator(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final int lastIndexOf(CharSequence charSequence, char c8, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c8}, i8, z7) : ((String) charSequence).lastIndexOf(c8, i8);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c8, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return lastIndexOf(charSequence, c8, i8, z7);
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] chars, int i8, boolean z7) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt___ArraysKt.single(chars), i8);
        }
        for (coerceAtMost = j6.v.coerceAtMost(i8, getLastIndex(charSequence)); -1 < coerceAtMost; coerceAtMost--) {
            char charAt = charSequence.charAt(coerceAtMost);
            for (char c8 : chars) {
                if (c.equals(c8, charAt, z7)) {
                    return coerceAtMost;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return lastIndexOfAny(charSequence, cArr, i8, z7);
    }

    public static final kotlin.sequences.m lineSequence(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return splitToSequence$default(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> lines(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt___SequencesKt.toList(lineSequence(charSequence));
    }

    private static final boolean matches(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.matches(charSequence);
    }

    private static final String orEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i8, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append(charSequence);
        f0 it = new j6.m(1, i8 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c8);
        }
        return sb;
    }

    public static /* synthetic */ CharSequence padEnd$default(CharSequence charSequence, int i8, char c8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c8 = ' ';
        }
        return padEnd(charSequence, i8, c8);
    }

    public static final CharSequence padStart(CharSequence charSequence, int i8, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0) {
            throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
        }
        if (i8 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i8);
        f0 it = new j6.m(1, i8 - charSequence.length()).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(c8);
        }
        sb.append(charSequence);
        return sb;
    }

    public static /* synthetic */ CharSequence padStart$default(CharSequence charSequence, int i8, char c8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c8 = ' ';
        }
        return padStart(charSequence, i8, c8);
    }

    private static final kotlin.sequences.m rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, final char[] cArr, int i8, final boolean z7, int i9) {
        requireNonNegativeLimit(i9);
        return new e(charSequence, i8, i9, new f6.p() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((CharSequence) obj, ((Number) obj2).intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i10) {
                kotlin.jvm.internal.s.checkNotNullParameter($receiver, "$this$$receiver");
                int indexOfAny = StringsKt__StringsKt.indexOfAny($receiver, cArr, i10, z7);
                if (indexOfAny < 0) {
                    return null;
                }
                return y5.h.to(Integer.valueOf(indexOfAny), 1);
            }
        });
    }

    static /* synthetic */ kotlin.sequences.m rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i8, boolean z7, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i8, z7, i9);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!c.equals(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final CharSequence removePrefix(CharSequence charSequence, CharSequence prefix) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        return startsWith$default(charSequence, prefix, false, 2, (Object) null) ? charSequence.subSequence(prefix.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeRange(CharSequence charSequence, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i9 < i8) {
            throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
        }
        if (i9 == i8) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i9 - i8));
        sb.append(charSequence, 0, i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        sb.append(charSequence, i9, charSequence.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    public static final CharSequence removeSuffix(CharSequence charSequence, CharSequence suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return endsWith$default(charSequence, suffix, false, 2, (Object) null) ? charSequence.subSequence(0, charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return (charSequence.length() >= prefix.length() + suffix.length() && startsWith$default(charSequence, prefix, false, 2, (Object) null) && endsWith$default(charSequence, suffix, false, 2, (Object) null)) ? charSequence.subSequence(prefix.length(), charSequence.length() - suffix.length()) : charSequence.subSequence(0, charSequence.length());
    }

    private static final String replace(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        return regex.replace(charSequence, replacement);
    }

    public static final String replaceAfter(String str, char c8, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, indexOf$default + 1, str.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfter$default(String str, char c8, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceAfter(str, c8, str2, str3);
    }

    public static final String replaceAfterLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, lastIndexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceAfterLast(str, str2, str3, str4);
    }

    public static final String replaceBefore(String str, char c8, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBefore$default(String str, char c8, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceBefore(str, c8, str2, str3);
    }

    public static final String replaceBeforeLast(String str, char c8, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, char c8, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceBeforeLast(str, c8, str2, str3);
    }

    private static final String replaceFirst(CharSequence charSequence, Regex regex, String replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        return regex.replaceFirst(charSequence, replacement);
    }

    private static final String replaceFirstCharWithChar(String str, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char charValue = ((Character) transform.invoke(Character.valueOf(str.charAt(0)))).charValue();
        String substring = str.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return charValue + substring;
    }

    private static final String replaceFirstCharWithCharSequence(String str, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(transform.invoke(Character.valueOf(str.charAt(0))));
        String substring = str.substring(1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public static final CharSequence replaceRange(CharSequence charSequence, int i8, int i9, CharSequence replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        if (i9 >= i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i8);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            sb.append(replacement);
            sb.append(charSequence, i9, charSequence.length());
            kotlin.jvm.internal.s.checkNotNullExpressionValue(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
    }

    public static final void requireNonNegativeLimit(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List<String> split(CharSequence charSequence, String[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z7, i8);
            }
        }
        Iterable asIterable = SequencesKt___SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z7, i8, 2, (Object) null));
        ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(asIterable, 10));
        Iterator it = asIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (j6.m) it.next()));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z7, int i8) {
        requireNonNegativeLimit(i8);
        int i9 = 0;
        int indexOf = indexOf(charSequence, str, 0, z7);
        if (indexOf == -1 || i8 == 1) {
            return kotlin.collections.q.listOf(charSequence.toString());
        }
        boolean z8 = i8 > 0;
        ArrayList arrayList = new ArrayList(z8 ? j6.v.coerceAtMost(i8, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i9, indexOf).toString());
            i9 = str.length() + indexOf;
            if (z8 && arrayList.size() == i8 - 1) {
                break;
            }
            indexOf = indexOf(charSequence, str, i9, z7);
        } while (indexOf != -1);
        arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return split(charSequence, strArr, z7, i8);
    }

    public static final kotlin.sequences.m splitToSequence(final CharSequence charSequence, String[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt___SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z7, i8, 2, (Object) null), new f6.l() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final String invoke(j6.m it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return StringsKt__StringsKt.substring(charSequence, it);
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.m splitToSequence$default(CharSequence charSequence, String[] strArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return splitToSequence(charSequence, strArr, z7, i8);
    }

    public static final boolean startsWith(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && c.equals(charSequence.charAt(0), c8, z7);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return startsWith(charSequence, c8, z7);
    }

    public static final CharSequence subSequence(CharSequence charSequence, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static final String substring(String str, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String substring$default(CharSequence charSequence, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = charSequence.length();
        }
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i8, i9).toString();
    }

    public static final String substringAfter(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(indexOf$default + 1, str.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c8, str2);
    }

    public static String substringAfterLast(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(lastIndexOf$default + 1, str.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c8, str2);
    }

    public static final String substringBefore(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c8, str2);
    }

    public static final String substringBeforeLast(String str, char c8, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, lastIndexOf$default);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c8, str2);
    }

    public static final boolean toBooleanStrict(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.s.areEqual(str, "true")) {
            return true;
        }
        if (kotlin.jvm.internal.s.areEqual(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    public static final Boolean toBooleanStrictOrNull(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (kotlin.jvm.internal.s.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.s.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final CharSequence trim(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean booleanValue = ((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(!z7 ? i8 : length)))).booleanValue();
            if (z7) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i8 = length - 1;
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i8 < 0) {
                return "";
            }
            length = i8;
        }
    }

    public static final CharSequence trimStart(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c8, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return contains(charSequence, c8, z7);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        return (!z7 && (charSequence instanceof String) && (suffix instanceof String)) ? t.endsWith$default((String) charSequence, (String) suffix, false, 2, null) : regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z7);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return endsWith(charSequence, charSequence2, z7);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return indexOf(charSequence, str, i8, z7);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, Collection collection, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return indexOfAny(charSequence, (Collection<String>) collection, i8, z7);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return lastIndexOf(charSequence, str, i8, z7);
    }

    public static /* synthetic */ int lastIndexOfAny$default(CharSequence charSequence, Collection collection, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = getLastIndex(charSequence);
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return lastIndexOfAny(charSequence, (Collection<String>) collection, i8, z7);
    }

    public static /* synthetic */ String padEnd$default(String str, int i8, char c8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c8 = ' ';
        }
        return padEnd(str, i8, c8);
    }

    public static /* synthetic */ String padStart$default(String str, int i8, char c8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            c8 = ' ';
        }
        return padStart(str, i8, c8);
    }

    static /* synthetic */ kotlin.sequences.m rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i8, boolean z7, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i8, z7, i9);
    }

    private static final String replace(CharSequence charSequence, Regex regex, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return regex.replace(charSequence, transform);
    }

    public static /* synthetic */ String replaceAfter$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceAfter(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceAfterLast$default(String str, char c8, String str2, String str3, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str3 = str;
        }
        return replaceAfterLast(str, c8, str2, str3);
    }

    public static /* synthetic */ String replaceBefore$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceBefore(str, str2, str3, str4);
    }

    public static /* synthetic */ String replaceBeforeLast$default(String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            str4 = str;
        }
        return replaceBeforeLast(str, str2, str3, str4);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return split(charSequence, cArr, z7, i8);
    }

    public static final kotlin.sequences.m splitToSequence(final CharSequence charSequence, char[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt___SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z7, i8, 2, (Object) null), new f6.l() { // from class: kotlin.text.StringsKt__StringsKt$splitToSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public final String invoke(j6.m it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return StringsKt__StringsKt.substring(charSequence, it);
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.m splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z7 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return splitToSequence(charSequence, cArr, z7, i8);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        return (!z7 && (charSequence instanceof String) && (prefix instanceof String)) ? t.startsWith$default((String) charSequence, (String) prefix, false, 2, null) : regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z7);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        return startsWith(charSequence, charSequence2, z7);
    }

    private static final CharSequence subSequence(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return str.subSequence(i8, i9);
    }

    private static final String substring(CharSequence charSequence, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.subSequence(i8, i9).toString();
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    private static final kotlin.sequences.m rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i8, final boolean z7, int i9) {
        requireNonNegativeLimit(i9);
        final List asList = kotlin.collections.k.asList(strArr);
        return new e(charSequence, i8, i9, new f6.p() { // from class: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((CharSequence) obj, ((Number) obj2).intValue());
            }

            public final Pair<Integer, Integer> invoke(CharSequence $receiver, int i10) {
                Pair findAnyOf$StringsKt__StringsKt;
                kotlin.jvm.internal.s.checkNotNullParameter($receiver, "$this$$receiver");
                findAnyOf$StringsKt__StringsKt = StringsKt__StringsKt.findAnyOf$StringsKt__StringsKt($receiver, asList, i10, z7, false);
                if (findAnyOf$StringsKt__StringsKt != null) {
                    return y5.h.to(findAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(((String) findAnyOf$StringsKt__StringsKt.getSecond()).length()));
                }
                return null;
            }
        });
    }

    public static final String replaceAfter(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, indexOf$default + delimiter.length(), str.length(), (CharSequence) replacement).toString();
    }

    public static final String replaceAfterLast(String str, char c8, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, c8, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, lastIndexOf$default + 1, str.length(), (CharSequence) replacement).toString();
    }

    public static final String replaceBefore(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return indexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, 0, indexOf$default, (CharSequence) replacement).toString();
    }

    public static final String replaceBeforeLast(String str, String delimiter, String replacement, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        return lastIndexOf$default == -1 ? missingDelimiterValue : replaceRange((CharSequence) str, 0, lastIndexOf$default, (CharSequence) replacement).toString();
    }

    static /* synthetic */ List split$default(CharSequence charSequence, Regex regex, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i8);
    }

    private static final kotlin.sequences.m splitToSequence(CharSequence charSequence, Regex regex, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i8);
    }

    static /* synthetic */ kotlin.sequences.m splitToSequence$default(CharSequence charSequence, Regex regex, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.splitToSequence(charSequence, i8);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return startsWith(charSequence, charSequence2, i8, z7);
    }

    public static final String substring(CharSequence charSequence, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(indexOf$default + delimiter.length(), str.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String substringAfterLast(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(lastIndexOf$default + delimiter.length(), str.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int indexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (indexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        kotlin.jvm.internal.s.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int lastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (lastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(0, lastIndexOf$default);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean contains(CharSequence charSequence, char c8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return indexOf$default(charSequence, c8, 0, z7, 2, (Object) null) >= 0;
    }

    public static final int indexOf(CharSequence charSequence, String string, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i8);
        }
        return indexOf$StringsKt__StringsKt$default(charSequence, string, i8, charSequence.length(), z7, false, 16, null);
    }

    public static final int lastIndexOf(CharSequence charSequence, String string, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(string, "string");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i8);
        }
        return indexOf$StringsKt__StringsKt(charSequence, string, i8, 0, z7, true);
    }

    public static String removePrefix(String str, CharSequence prefix) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        if (!startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(prefix.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static String removeSuffix(String str, CharSequence suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        if (!endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - suffix.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String removeSurrounding(String str, CharSequence prefix, CharSequence suffix) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.s.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !startsWith$default((CharSequence) str, prefix, false, 2, (Object) null) || !endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(prefix.length(), str.length() - suffix.length());
        kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    private static final String trim(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return trim((CharSequence) str).toString();
    }

    private static final String trimEnd(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return trimEnd((CharSequence) str).toString();
    }

    private static final String trimStart(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return trimStart((CharSequence) str).toString();
    }

    private static final boolean contains(CharSequence charSequence, Regex regex) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.containsMatchIn(charSequence);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(prefix, "prefix");
        if (!z7 && (charSequence instanceof String) && (prefix instanceof String)) {
            return t.startsWith$default((String) charSequence, (String) prefix, i8, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i8, prefix, 0, prefix.length(), z7);
    }

    public static final String trim(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean booleanValue = ((Boolean) predicate.invoke(Character.valueOf(str.charAt(!z7 ? i8 : length)))).booleanValue();
            if (z7) {
                if (!booleanValue) {
                    break;
                }
                length--;
            } else if (booleanValue) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return str.subSequence(i8, length + 1).toString();
    }

    public static final String trimEnd(String str, f6.l predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(length)))).booleanValue()) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final String trimStart(String str, f6.l predicate) {
        CharSequence charSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                charSequence = "";
                break;
            }
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                charSequence = str.subSequence(i8, str.length());
                break;
            }
            i8++;
        }
        return charSequence.toString();
    }

    private static final String removeRange(String str, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return removeRange((CharSequence) str, i8, i9).toString();
    }

    public static final CharSequence removeSurrounding(CharSequence charSequence, CharSequence delimiter) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(charSequence, delimiter, delimiter);
    }

    private static final String replaceRange(String str, int i8, int i9, CharSequence replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        return replaceRange((CharSequence) str, i8, i9, replacement).toString();
    }

    public static final CharSequence removeRange(CharSequence charSequence, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        return removeRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
    }

    public static String removeSurrounding(String str, CharSequence delimiter) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(str, delimiter, delimiter);
    }

    public static final CharSequence replaceRange(CharSequence charSequence, j6.m range, CharSequence replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        return replaceRange(charSequence, range.getStart().intValue(), range.getEndInclusive().intValue() + 1, replacement);
    }

    public static final int indexOfAny(CharSequence charSequence, Collection<String> strings, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i8, z7, false);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final int lastIndexOfAny(CharSequence charSequence, Collection<String> strings, int i8, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(strings, "strings");
        Pair<Integer, String> findAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(charSequence, strings, i8, z7, true);
        if (findAnyOf$StringsKt__StringsKt != null) {
            return findAnyOf$StringsKt__StringsKt.getFirst().intValue();
        }
        return -1;
    }

    public static final String padEnd(String str, int i8, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i8, c8).toString();
    }

    public static String padStart(String str, int i8, char c8) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i8, c8).toString();
    }

    private static final String removeRange(String str, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        return removeRange((CharSequence) str, range).toString();
    }

    private static final String replaceRange(String str, j6.m range, CharSequence replacement) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        kotlin.jvm.internal.s.checkNotNullParameter(replacement, "replacement");
        return replaceRange((CharSequence) str, range, replacement).toString();
    }

    public static final CharSequence trim(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean contains = ArraysKt___ArraysKt.contains(chars, charSequence.charAt(!z7 ? i8 : length));
            if (z7) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!ArraysKt___ArraysKt.contains(chars, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence, char... chars) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!ArraysKt___ArraysKt.contains(chars, charSequence.charAt(i8))) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }

    public static final List<String> split(CharSequence charSequence, char[] delimiters, boolean z7, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length != 1) {
            Iterable asIterable = SequencesKt___SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z7, i8, 2, (Object) null));
            ArrayList arrayList = new ArrayList(kotlin.collections.r.collectionSizeOrDefault(asIterable, 10));
            Iterator it = asIterable.iterator();
            while (it.hasNext()) {
                arrayList.add(substring(charSequence, (j6.m) it.next()));
            }
            return arrayList;
        }
        return split$StringsKt__StringsKt(charSequence, String.valueOf(delimiters[0]), z7, i8);
    }

    public static final String trim(String str, char... chars) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean contains = ArraysKt___ArraysKt.contains(chars, str.charAt(!z7 ? i8 : length));
            if (z7) {
                if (!contains) {
                    break;
                }
                length--;
            } else if (contains) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return str.subSequence(i8, length + 1).toString();
    }

    public static final String trimEnd(String str, char... chars) {
        CharSequence charSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!ArraysKt___ArraysKt.contains(chars, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static String trimStart(String str, char... chars) {
        CharSequence charSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                charSequence = "";
                break;
            }
            if (!ArraysKt___ArraysKt.contains(chars, str.charAt(i8))) {
                charSequence = str.subSequence(i8, str.length());
                break;
            }
            i8++;
        }
        return charSequence.toString();
    }

    public static CharSequence trim(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            boolean isWhitespace = b.isWhitespace(charSequence.charAt(!z7 ? i8 : length));
            if (z7) {
                if (!isWhitespace) {
                    break;
                }
                length--;
            } else if (isWhitespace) {
                i8++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    public static final CharSequence trimEnd(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (!b.isWhitespace(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return "";
    }

    public static final CharSequence trimStart(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!b.isWhitespace(charSequence.charAt(i8))) {
                return charSequence.subSequence(i8, charSequence.length());
            }
        }
        return "";
    }

    private static final List<String> split(CharSequence charSequence, Regex regex, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(regex, "regex");
        return regex.split(charSequence, i8);
    }
}
