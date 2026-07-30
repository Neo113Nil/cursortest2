package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.collections.b0;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.f0;
import kotlin.collections.l0;
import kotlin.collections.w0;
import kotlin.collections.x0;
import kotlin.random.Random;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class StringsKt___StringsKt extends u {

    public static final class a implements Iterable, g6.a {
        final /* synthetic */ CharSequence $this_asIterable$inlined;

        public a(CharSequence charSequence) {
            this.$this_asIterable$inlined = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.iterator(this.$this_asIterable$inlined);
        }
    }

    public static final class b implements kotlin.sequences.m {
        final /* synthetic */ CharSequence $this_asSequence$inlined;

        public b(CharSequence charSequence) {
            this.$this_asSequence$inlined = charSequence;
        }

        @Override // kotlin.sequences.m
        public Iterator<Character> iterator() {
            return StringsKt__StringsKt.iterator(this.$this_asSequence$inlined);
        }
    }

    public static final class c implements b0 {
        final /* synthetic */ f6.l $keySelector;
        final /* synthetic */ CharSequence $this_groupingBy;

        public c(CharSequence charSequence, f6.l lVar) {
            this.$this_groupingBy = charSequence;
            this.$keySelector = lVar;
        }

        @Override // kotlin.collections.b0
        public /* bridge */ /* synthetic */ Object keyOf(Object obj) {
            return keyOf(((Character) obj).charValue());
        }

        @Override // kotlin.collections.b0
        public Iterator<Character> sourceIterator() {
            return StringsKt__StringsKt.iterator(this.$this_groupingBy);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [K, java.lang.Object] */
        public K keyOf(char c8) {
            return this.$keySelector.invoke(Character.valueOf(c8));
        }
    }

    public static final boolean all(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean any(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    public static final Iterable<Character> asIterable(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? CollectionsKt__CollectionsKt.emptyList() : new a(charSequence);
    }

    public static final kotlin.sequences.m asSequence(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? SequencesKt__SequencesKt.emptySequence() : new b(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associate(CharSequence charSequence, f6.l transform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        mapCapacity = l0.mapCapacity(charSequence.length());
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Pair pair = (Pair) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K> Map<K, Character> associateBy(CharSequence charSequence, f6.l keySelector) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        mapCapacity = l0.mapCapacity(charSequence.length());
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, M extends Map<? super K, ? super Character>> M associateByTo(CharSequence charSequence, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), Character.valueOf(charAt));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateTo(CharSequence charSequence, M destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Pair pair = (Pair) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            destination.put(pair.getFirst(), pair.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V> Map<Character, V> associateWith(CharSequence charSequence, f6.l valueSelector) {
        int coerceAtMost;
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        coerceAtMost = j6.v.coerceAtMost(charSequence.length(), 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            linkedHashMap.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <V, M extends Map<? super Character, ? super V>> M associateWithTo(CharSequence charSequence, M destination, f6.l valueSelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(valueSelector, "valueSelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            destination.put(Character.valueOf(charAt), valueSelector.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    public static final List<String> chunked(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i8, i8, true);
    }

    public static final kotlin.sequences.m chunkedSequence(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return chunkedSequence(charSequence, i8, new f6.l() { // from class: kotlin.text.StringsKt___StringsKt$chunkedSequence$1
            @Override // f6.l
            public final String invoke(CharSequence it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    private static final int count(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length();
    }

    public static final CharSequence drop(CharSequence charSequence, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            coerceAtMost = j6.v.coerceAtMost(i8, charSequence.length());
            return charSequence.subSequence(coerceAtMost, charSequence.length());
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence dropLast(CharSequence charSequence, int i8) {
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(charSequence.length() - i8, 0);
            return take(charSequence, coerceAtLeast);
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence dropLastWhile(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex)))).booleanValue()) {
                return charSequence.subSequence(0, lastIndex + 1);
            }
        }
        return "";
    }

    public static final CharSequence dropWhile(CharSequence charSequence, f6.l predicate) {
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

    private static final char elementAtOrElse(CharSequence charSequence, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > StringsKt__StringsKt.getLastIndex(charSequence)) ? ((Character) defaultValue.invoke(Integer.valueOf(i8))).charValue() : charSequence.charAt(i8);
    }

    private static final Character elementAtOrNull(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return getOrNull(charSequence, i8);
    }

    public static final CharSequence filter(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final CharSequence filterIndexed(CharSequence charSequence, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            char charAt = charSequence.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
            i8++;
            i9 = i10;
        }
        return sb;
    }

    public static final <C extends Appendable> C filterIndexedTo(CharSequence charSequence, C destination, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            char charAt = charSequence.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(charAt))).booleanValue()) {
                destination.append(charAt);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final CharSequence filterNot(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    public static final <C extends Appendable> C filterNotTo(CharSequence charSequence, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    public static final <C extends Appendable> C filterTo(CharSequence charSequence, C destination, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                destination.append(charAt);
            }
        }
        return destination;
    }

    private static final Character find(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    private static final Character findLast(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char charAt = charSequence.charAt(length);
                if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                    return Character.valueOf(charAt);
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return null;
    }

    public static char first(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    private static final <R> R firstNotNullOf(CharSequence charSequence, f6.l transform) {
        R r8;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        while (true) {
            if (i8 >= charSequence.length()) {
                r8 = null;
                break;
            }
            r8 = (R) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (r8 != null) {
                break;
            }
            i8++;
        }
        if (r8 != null) {
            return r8;
        }
        throw new NoSuchElementException("No element of the char sequence was transformed to a non-null value.");
    }

    private static final <R> R firstNotNullOfOrNull(CharSequence charSequence, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            R r8 = (R) transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (r8 != null) {
                return r8;
            }
        }
        return null;
    }

    public static final Character firstOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static final <R> List<R> flatMap(CharSequence charSequence, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    private static final <R> List<R> flatMapIndexedIterable(CharSequence charSequence, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            kotlin.collections.v.addAll(arrayList, (Iterable) transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    private static final <R, C extends Collection<? super R>> C flatMapIndexedIterableTo(CharSequence charSequence, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C flatMapTo(CharSequence charSequence, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            kotlin.collections.v.addAll(destination, (Iterable) transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return destination;
    }

    public static final <R> R fold(CharSequence charSequence, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
        }
        return r8;
    }

    public static final <R> R foldIndexed(CharSequence charSequence, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            R r9 = r8;
            r8 = (R) operation.invoke(Integer.valueOf(i9), r9, Character.valueOf(charSequence.charAt(i8)));
            i8++;
            i9++;
        }
        return r8;
    }

    public static final <R> R foldRight(CharSequence charSequence, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Character.valueOf(charSequence.charAt(lastIndex)), r8);
        }
        return r8;
    }

    public static final <R> R foldRightIndexed(CharSequence charSequence, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); lastIndex >= 0; lastIndex--) {
            r8 = (R) operation.invoke(Integer.valueOf(lastIndex), Character.valueOf(charSequence.charAt(lastIndex)), r8);
        }
        return r8;
    }

    public static final void forEach(CharSequence charSequence, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            action.invoke(Character.valueOf(charSequence.charAt(i8)));
        }
    }

    public static final void forEachIndexed(CharSequence charSequence, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            i8++;
            i9++;
        }
    }

    private static final char getOrElse(CharSequence charSequence, int i8, f6.l defaultValue) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(defaultValue, "defaultValue");
        return (i8 < 0 || i8 > StringsKt__StringsKt.getLastIndex(charSequence)) ? ((Character) defaultValue.invoke(Integer.valueOf(i8))).charValue() : charSequence.charAt(i8);
    }

    public static final Character getOrNull(CharSequence charSequence, int i8) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 < 0 || i8 > StringsKt__StringsKt.getLastIndex(charSequence)) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i8));
    }

    public static final <K> Map<K, List<Character>> groupBy(CharSequence charSequence, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            Object invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return linkedHashMap;
    }

    public static final <K, M extends Map<? super K, List<Character>>> M groupByTo(CharSequence charSequence, M destination, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            Object invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(Character.valueOf(charAt));
        }
        return destination;
    }

    public static final <K> b0 groupingBy(CharSequence charSequence, f6.l keySelector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        return new c(charSequence, keySelector);
    }

    public static final int indexOfFirst(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return i8;
            }
        }
        return -1;
    }

    public static final int indexOfLast(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue()) {
                    return length;
                }
                if (i8 < 0) {
                    break;
                }
                length = i8;
            }
        }
        return -1;
    }

    public static char last(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character lastOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static final <R> List<R> map(CharSequence charSequence, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexed(CharSequence charSequence, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(charSequence.length());
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            arrayList.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return arrayList;
    }

    public static final <R> List<R> mapIndexedNotNull(CharSequence charSequence, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            int i10 = i9 + 1;
            Object invoke = transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i8++;
            i9 = i10;
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedNotNullTo(CharSequence charSequence, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            int i10 = i9 + 1;
            Object invoke = transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8)));
            if (invoke != null) {
                destination.add(invoke);
            }
            i8++;
            i9 = i10;
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapIndexedTo(CharSequence charSequence, C destination, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int i8 = 0;
        int i9 = 0;
        while (i8 < charSequence.length()) {
            destination.add(transform.invoke(Integer.valueOf(i9), Character.valueOf(charSequence.charAt(i8))));
            i8++;
            i9++;
        }
        return destination;
    }

    public static final <R> List<R> mapNotNull(CharSequence charSequence, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Object invoke = transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    public static final <R, C extends Collection<? super R>> C mapNotNullTo(CharSequence charSequence, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            Object invoke = transform.invoke(Character.valueOf(charSequence.charAt(i8)));
            if (invoke != null) {
                destination.add(invoke);
            }
        }
        return destination;
    }

    public static final <R, C extends Collection<? super R>> C mapTo(CharSequence charSequence, C destination, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            destination.add(transform.invoke(Character.valueOf(charSequence.charAt(i8))));
        }
        return destination;
    }

    public static final <R extends Comparable<? super R>> Character maxByOrNull(CharSequence charSequence, f6.l selector) {
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

    public static final <R extends Comparable<? super R>> char maxByOrThrow(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return charAt;
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
        return charAt;
    }

    private static final double maxOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Double m1221maxOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R maxOfWith(CharSequence charSequence, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R maxOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r8, invoke) < 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Character maxOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.s.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final char maxOrThrow(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.s.compare((int) charAt, (int) charAt2) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    public static final Character maxWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final char maxWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) < 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    public static final <R extends Comparable<? super R>> Character minByOrNull(CharSequence charSequence, f6.l selector) {
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

    public static final <R extends Comparable<? super R>> char minByOrThrow(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return charAt;
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
        return charAt;
    }

    private static final double minOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).doubleValue());
        }
        return doubleValue;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Double m1225minOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        double doubleValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).doubleValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    private static final <R> R minOfWith(CharSequence charSequence, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    private static final <R> R minOfWithOrNull(CharSequence charSequence, Comparator<? super R> comparator, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Object invoke = selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (comparator.compare(r8, invoke) > 0) {
                r8 = (R) invoke;
            }
        }
        return r8;
    }

    public static final Character minOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.s.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final char minOrThrow(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (kotlin.jvm.internal.s.compare((int) charAt, (int) charAt2) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    public static final Character minWithOrNull(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return Character.valueOf(charAt);
    }

    public static final char minWithOrThrow(CharSequence charSequence, Comparator<? super Character> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException();
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            char charAt2 = charSequence.charAt(it.nextInt());
            if (comparator.compare(Character.valueOf(charAt), Character.valueOf(charAt2)) > 0) {
                charAt = charAt2;
            }
        }
        return charAt;
    }

    public static final boolean none(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    public static final <S extends CharSequence> S onEach(S s7, f6.l action) {
        kotlin.jvm.internal.s.checkNotNullParameter(s7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        for (int i8 = 0; i8 < s7.length(); i8++) {
            action.invoke(Character.valueOf(s7.charAt(i8)));
        }
        return s7;
    }

    public static final <S extends CharSequence> S onEachIndexed(S s7, f6.p action) {
        kotlin.jvm.internal.s.checkNotNullParameter(s7, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(action, "action");
        int i8 = 0;
        int i9 = 0;
        while (i8 < s7.length()) {
            action.invoke(Integer.valueOf(i9), Character.valueOf(s7.charAt(i8)));
            i8++;
            i9++;
        }
        return s7;
    }

    public static final Pair<CharSequence, CharSequence> partition(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        return new Pair<>(sb, sb2);
    }

    private static final char random(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return random(charSequence, Random.Default);
    }

    private static final Character randomOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return randomOrNull(charSequence, Random.Default);
    }

    public static final char reduce(CharSequence charSequence, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = ((Character) operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.nextInt())))).charValue();
        }
        return charAt;
    }

    public static final char reduceIndexed(CharSequence charSequence, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            charAt = ((Character) operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt)))).charValue();
        }
        return charAt;
    }

    public static final Character reduceIndexedOrNull(CharSequence charSequence, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            charAt = ((Character) operation.invoke(Integer.valueOf(nextInt), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(nextInt)))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final Character reduceOrNull(CharSequence charSequence, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            charAt = ((Character) operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(it.nextInt())))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final char reduceRight(CharSequence charSequence, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            charAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(charAt))).charValue();
        }
        return charAt;
    }

    public static final char reduceRightIndexed(CharSequence charSequence, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            throw new UnsupportedOperationException("Empty char sequence can't be reduced.");
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            charAt = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i8)), Character.valueOf(charAt))).charValue();
        }
        return charAt;
    }

    public static final Character reduceRightIndexedOrNull(CharSequence charSequence, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            charAt = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(charSequence.charAt(i8)), Character.valueOf(charAt))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final Character reduceRightOrNull(CharSequence charSequence, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence);
        if (lastIndex < 0) {
            return null;
        }
        char charAt = charSequence.charAt(lastIndex);
        for (int i8 = lastIndex - 1; i8 >= 0; i8--) {
            charAt = ((Character) operation.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(charAt))).charValue();
        }
        return Character.valueOf(charAt);
    }

    public static final CharSequence reversed(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        StringBuilder reverse = new StringBuilder(charSequence).reverse();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(reverse, "StringBuilder(this).reverse()");
        return reverse;
    }

    public static final <R> List<R> runningFold(CharSequence charSequence, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <R> List<R> runningFoldIndexed(CharSequence charSequence, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final List<Character> runningReduce(CharSequence charSequence, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i8 = 1; i8 < length; i8++) {
            charAt = ((Character) operation.invoke(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i8)))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    public static final List<Character> runningReduceIndexed(CharSequence charSequence, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        char charAt = charSequence.charAt(0);
        ArrayList arrayList = new ArrayList(charSequence.length());
        arrayList.add(Character.valueOf(charAt));
        int length = charSequence.length();
        for (int i8 = 1; i8 < length; i8++) {
            charAt = ((Character) operation.invoke(Integer.valueOf(i8), Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i8)))).charValue();
            arrayList.add(Character.valueOf(charAt));
        }
        return arrayList;
    }

    public static final <R> List<R> scan(CharSequence charSequence, R r8, f6.p operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            r8 = (R) operation.invoke(r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final <R> List<R> scanIndexed(CharSequence charSequence, R r8, f6.q operation) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(operation, "operation");
        if (charSequence.length() == 0) {
            return kotlin.collections.q.listOf(r8);
        }
        ArrayList arrayList = new ArrayList(charSequence.length() + 1);
        arrayList.add(r8);
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            r8 = (R) operation.invoke(Integer.valueOf(i8), r8, Character.valueOf(charSequence.charAt(i8)));
            arrayList.add(r8);
        }
        return arrayList;
    }

    public static final char single(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static final Character singleOrNull(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static final CharSequence slice(CharSequence charSequence, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.subSequence(charSequence, indices);
    }

    public static final int sumBy(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            i8 += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i9)))).intValue();
        }
        return i8;
    }

    public static final double sumByDouble(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            d8 += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).doubleValue();
        }
        return d8;
    }

    private static final double sumOfDouble(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            d8 += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).doubleValue();
        }
        return d8;
    }

    private static final int sumOfInt(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            i8 += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i9)))).intValue();
        }
        return i8;
    }

    private static final long sumOfLong(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long j8 = 0;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            j8 += ((Number) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).longValue();
        }
        return j8;
    }

    private static final int sumOfUInt(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        int m1632constructorimpl = y5.p.m1632constructorimpl(0);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            m1632constructorimpl = y5.p.m1632constructorimpl(m1632constructorimpl + ((y5.p) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).m1684unboximpl());
        }
        return m1632constructorimpl;
    }

    private static final long sumOfULong(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        long m1710constructorimpl = y5.r.m1710constructorimpl(0L);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            m1710constructorimpl = y5.r.m1710constructorimpl(m1710constructorimpl + ((y5.r) selector.invoke(Character.valueOf(charSequence.charAt(i8)))).m1762unboximpl());
        }
        return m1710constructorimpl;
    }

    public static final CharSequence take(CharSequence charSequence, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            coerceAtMost = j6.v.coerceAtMost(i8, charSequence.length());
            return charSequence.subSequence(0, coerceAtMost);
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence takeLast(CharSequence charSequence, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        if (i8 >= 0) {
            int length = charSequence.length();
            coerceAtMost = j6.v.coerceAtMost(i8, length);
            return charSequence.subSequence(length - coerceAtMost, length);
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final CharSequence takeLastWhile(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(charSequence); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(lastIndex)))).booleanValue()) {
                return charSequence.subSequence(lastIndex + 1, charSequence.length());
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final CharSequence takeWhile(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return charSequence.subSequence(0, i8);
            }
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            destination.add(Character.valueOf(charSequence.charAt(i8)));
        }
        return destination;
    }

    public static final HashSet<Character> toHashSet(CharSequence charSequence) {
        int coerceAtMost;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        coerceAtMost = j6.v.coerceAtMost(charSequence.length(), 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        return (HashSet) toCollection(charSequence, new HashSet(mapCapacity));
    }

    public static final List<Character> toList(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        return length != 0 ? length != 1 ? toMutableList(charSequence) : kotlin.collections.q.listOf(Character.valueOf(charSequence.charAt(0))) : CollectionsKt__CollectionsKt.emptyList();
    }

    public static final List<Character> toMutableList(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static final Set<Character> toSet(CharSequence charSequence) {
        Set<Character> emptySet;
        Set<Character> of;
        int coerceAtMost;
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            emptySet = x0.emptySet();
            return emptySet;
        }
        if (length == 1) {
            of = w0.setOf(Character.valueOf(charSequence.charAt(0)));
            return of;
        }
        coerceAtMost = j6.v.coerceAtMost(charSequence.length(), 128);
        mapCapacity = l0.mapCapacity(coerceAtMost);
        return (Set) toCollection(charSequence, new LinkedHashSet(mapCapacity));
    }

    public static final List<String> windowed(CharSequence charSequence, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i8, i9, z7, new f6.l() { // from class: kotlin.text.StringsKt___StringsKt$windowed$1
            @Override // f6.l
            public final String invoke(CharSequence it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(charSequence, i8, i9, z7);
    }

    public static final kotlin.sequences.m windowedSequence(CharSequence charSequence, int i8, int i9, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return windowedSequence(charSequence, i8, i9, z7, new f6.l() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$1
            @Override // f6.l
            public final String invoke(CharSequence it) {
                kotlin.jvm.internal.s.checkNotNullParameter(it, "it");
                return it.toString();
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.m windowedSequence$default(CharSequence charSequence, int i8, int i9, boolean z7, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowedSequence(charSequence, i8, i9, z7);
    }

    public static final Iterable<c0> withIndex(final CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        return new d0(new f6.a() { // from class: kotlin.text.StringsKt___StringsKt$withIndex$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // f6.a
            public final Iterator<Character> invoke() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        });
    }

    public static final <V> List<V> zip(CharSequence charSequence, CharSequence other, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(transform.invoke(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(other.charAt(i8))));
        }
        return arrayList;
    }

    public static final <R> List<R> zipWithNext(CharSequence charSequence, f6.p transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i8 = 0;
        while (i8 < length) {
            Character valueOf = Character.valueOf(charSequence.charAt(i8));
            i8++;
            arrayList.add(transform.invoke(valueOf, Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    public static final boolean any(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <R> List<R> chunked(CharSequence charSequence, int i8, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return windowed(charSequence, i8, i8, true, transform);
    }

    public static final <R> kotlin.sequences.m chunkedSequence(CharSequence charSequence, int i8, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        return windowedSequence(charSequence, i8, i8, true, transform);
    }

    public static final int count(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i9)))).booleanValue()) {
                i8++;
            }
        }
        return i8;
    }

    public static final Character firstOrNull(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                return Character.valueOf(charAt);
            }
        }
        return null;
    }

    public static final Character lastOrNull(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return null;
        }
        while (true) {
            int i8 = length - 1;
            char charAt = charSequence.charAt(length);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                return Character.valueOf(charAt);
            }
            if (i8 < 0) {
                return null;
            }
            length = i8;
        }
    }

    public static final boolean none(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (((Boolean) predicate.invoke(Character.valueOf(charSequence.charAt(i8)))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final char random(CharSequence charSequence, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (charSequence.length() != 0) {
            return charSequence.charAt(random.nextInt(charSequence.length()));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final Character randomOrNull(CharSequence charSequence, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(random.nextInt(charSequence.length())));
    }

    private static final String reversed(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return reversed((CharSequence) str).toString();
    }

    public static final Character singleOrNull(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                if (z7) {
                    return null;
                }
                ch = Character.valueOf(charAt);
                z7 = true;
            }
        }
        if (z7) {
            return ch;
        }
        return null;
    }

    public static final <R> List<R> windowed(CharSequence charSequence, int i8, int i9, boolean z7, f6.l transform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i8, i9);
        int length = charSequence.length();
        int i10 = 0;
        ArrayList arrayList = new ArrayList((length / i9) + (length % i9 == 0 ? 0 : 1));
        while (i10 >= 0 && i10 < length) {
            int i11 = i10 + i8;
            if (i11 < 0 || i11 > length) {
                if (!z7) {
                    break;
                }
                i11 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i10, i11)));
            i10 += i9;
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(CharSequence charSequence, int i8, int i9, boolean z7, f6.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowed(charSequence, i8, i9, z7, lVar);
    }

    public static final <R> kotlin.sequences.m windowedSequence(final CharSequence charSequence, final int i8, int i9, boolean z7, final f6.l transform) {
        j6.k step;
        kotlin.sequences.m asSequence;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(transform, "transform");
        SlidingWindowKt.checkWindowSizeStep(i8, i9);
        step = j6.v.step(z7 ? StringsKt__StringsKt.getIndices(charSequence) : j6.v.until(0, (charSequence.length() - i8) + 1), i9);
        asSequence = CollectionsKt___CollectionsKt.asSequence(step);
        return SequencesKt___SequencesKt.map(asSequence, new f6.l() { // from class: kotlin.text.StringsKt___StringsKt$windowedSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [R, java.lang.Object] */
            public final R invoke(int i10) {
                int i11 = i8 + i10;
                if (i11 < 0 || i11 > charSequence.length()) {
                    i11 = charSequence.length();
                }
                return transform.invoke(charSequence.subSequence(i10, i11));
            }
        });
    }

    public static /* synthetic */ kotlin.sequences.m windowedSequence$default(CharSequence charSequence, int i8, int i9, boolean z7, f6.l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 1;
        }
        if ((i10 & 4) != 0) {
            z7 = false;
        }
        return windowedSequence(charSequence, i8, i9, z7, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateByTo(CharSequence charSequence, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            destination.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    public static String drop(String str, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            coerceAtMost = j6.v.coerceAtMost(i8, str.length());
            String substring = str.substring(coerceAtMost);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String dropLast(String str, int i8) {
        int coerceAtLeast;
        String take;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            coerceAtLeast = j6.v.coerceAtLeast(str.length() - i8, 0);
            take = take(str, coerceAtLeast);
            return take;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String filterNot(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (!((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final String slice(String str, j6.m indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    public static String take(String str, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            coerceAtMost = j6.v.coerceAtMost(i8, str.length());
            String substring = str.substring(0, coerceAtMost);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final String dropLastWhile(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String substring = str.substring(0, lastIndex + 1);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return "";
    }

    public static final String dropWhile(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                String substring = str.substring(i8);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "";
    }

    public static final String filterIndexed(String str, f6.p predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        int i9 = 0;
        while (i8 < str.length()) {
            char charAt = str.charAt(i8);
            int i10 = i9 + 1;
            if (((Boolean) predicate.invoke(Integer.valueOf(i9), Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "filterIndexedTo(StringBu…(), predicate).toString()");
        return sb2;
    }

    public static final char first(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                return charAt;
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final char last(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i8 = length - 1;
                char charAt = charSequence.charAt(length);
                if (!((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                    if (i8 < 0) {
                        break;
                    }
                    length = i8;
                } else {
                    return charAt;
                }
            }
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final String takeLast(String str, int i8) {
        int coerceAtMost;
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        if (i8 >= 0) {
            int length = str.length();
            coerceAtMost = j6.v.coerceAtMost(i8, length);
            String substring = str.substring(length - coerceAtMost);
            kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i8 + " is less than zero.").toString());
    }

    public static final List<Pair<Character, Character>> zip(CharSequence charSequence, CharSequence other) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        int min = Math.min(charSequence.length(), other.length());
        ArrayList arrayList = new ArrayList(min);
        for (int i8 = 0; i8 < min; i8++) {
            arrayList.add(y5.h.to(Character.valueOf(charSequence.charAt(i8)), Character.valueOf(other.charAt(i8))));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateBy(CharSequence charSequence, f6.l keySelector, f6.l valueTransform) {
        int mapCapacity;
        int coerceAtLeast;
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        mapCapacity = l0.mapCapacity(charSequence.length());
        coerceAtLeast = j6.v.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            linkedHashMap.put(keySelector.invoke(Character.valueOf(charAt)), valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    public static final String filter(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        return sb2;
    }

    public static final char single(CharSequence charSequence, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        Character ch = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                if (!z7) {
                    ch = Character.valueOf(charAt);
                    z7 = true;
                } else {
                    throw new IllegalArgumentException("Char sequence contains more than one matching element.");
                }
            }
        }
        if (z7) {
            kotlin.jvm.internal.s.checkNotNull(ch, "null cannot be cast to non-null type kotlin.Char");
            return ch.charValue();
        }
        throw new NoSuchElementException("Char sequence contains no character matching the predicate.");
    }

    public static final CharSequence slice(CharSequence charSequence, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        int collectionSizeOrDefault = kotlin.collections.r.collectionSizeOrDefault(indices, 10);
        if (collectionSizeOrDefault == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(collectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            sb.append(charSequence.charAt(it.next().intValue()));
        }
        return sb;
    }

    public static final String takeLastWhile(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        for (int lastIndex = StringsKt__StringsKt.getLastIndex(str); -1 < lastIndex; lastIndex--) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(lastIndex)))).booleanValue()) {
                String substring = str.substring(lastIndex + 1);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final String takeWhile(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!((Boolean) predicate.invoke(Character.valueOf(str.charAt(i8)))).booleanValue()) {
                String substring = str.substring(0, i8);
                kotlin.jvm.internal.s.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
        }
        return str;
    }

    public static final List<Pair<Character, Character>> zipWithNext(CharSequence charSequence) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i8 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            i8++;
            arrayList.add(y5.h.to(Character.valueOf(charAt), Character.valueOf(charSequence.charAt(i8))));
        }
        return arrayList;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final float m1219maxOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            float floatValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).floatValue();
            f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final Float m1222maxOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).floatValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final float m1223minOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            float floatValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).floatValue();
            f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final Float m1226minOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        float floatValue = ((Number) selector.invoke(Character.valueOf(charSequence.charAt(0)))).floatValue();
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())))).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, List<V>>> M groupByTo(CharSequence charSequence, M destination, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            Object invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = destination.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                destination.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return destination;
    }

    public static final Pair<String, String> partition(String str, f6.l predicate) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(predicate, "predicate");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (((Boolean) predicate.invoke(Character.valueOf(charAt))).booleanValue()) {
                sb.append(charAt);
            } else {
                sb2.append(charAt);
            }
        }
        String sb3 = sb.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb3, "first.toString()");
        String sb4 = sb2.toString();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(sb4, "second.toString()");
        return new Pair<>(sb3, sb4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, List<V>> groupBy(CharSequence charSequence, f6.l keySelector, f6.l valueTransform) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.s.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            char charAt = charSequence.charAt(i8);
            Object invoke = keySelector.invoke(Character.valueOf(charAt));
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(valueTransform.invoke(Character.valueOf(charAt)));
        }
        return linkedHashMap;
    }

    private static final String slice(String str, Iterable<Integer> indices) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(indices, "indices");
        return slice((CharSequence) str, indices).toString();
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1220maxOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
            f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
                if (r8.compareTo(comparable) < 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R extends Comparable<? super R>> R maxOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r8.compareTo(comparable) < 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <R extends Comparable<? super R>> R m1224minOf(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() != 0) {
            R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
            f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
                if (r8.compareTo(comparable) > 0) {
                    r8 = (R) comparable;
                }
            }
            return r8;
        }
        throw new NoSuchElementException();
    }

    private static final <R extends Comparable<? super R>> R minOfOrNull(CharSequence charSequence, f6.l selector) {
        kotlin.jvm.internal.s.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(selector, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        R r8 = (R) selector.invoke(Character.valueOf(charSequence.charAt(0)));
        f0 it = new j6.m(1, StringsKt__StringsKt.getLastIndex(charSequence)).iterator();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) selector.invoke(Character.valueOf(charSequence.charAt(it.nextInt())));
            if (r8.compareTo(comparable) > 0) {
                r8 = (R) comparable;
            }
        }
        return r8;
    }
}
