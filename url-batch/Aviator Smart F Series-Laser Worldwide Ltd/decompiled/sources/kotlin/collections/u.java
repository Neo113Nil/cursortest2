package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.NotImplementedError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class u extends t {
    private static final <T> void fill(List<T> list, T t7) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        Collections.fill(list, t7);
    }

    private static final <T> void shuffle(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        Collections.shuffle(list);
    }

    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T> void sortWith(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    private static final <T> void shuffle(List<T> list, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        Collections.shuffle(list, random);
    }

    private static final <T> void sort(List<T> list, f6.p comparison) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(comparison, "comparison");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
