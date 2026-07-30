package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class w0 {
    public static <E> Set<E> build(Set<E> builder) {
        kotlin.jvm.internal.s.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    private static final <E> Set<E> buildSetInternal(f6.l builderAction) {
        Set<E> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = createSetBuilder();
        builderAction.invoke(createSetBuilder);
        build = build(createSetBuilder);
        return build;
    }

    public static final <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    public static <T> Set<T> setOf(T t7) {
        Set<T> singleton = Collections.singleton(t7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(singleton, "singleton(element)");
        return singleton;
    }

    public static final <T> TreeSet<T> sortedSetOf(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet());
    }

    private static final <E> Set<E> buildSetInternal(int i8, f6.l builderAction) {
        Set createSetBuilder;
        Set<E> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        createSetBuilder = createSetBuilder(i8);
        builderAction.invoke(createSetBuilder);
        build = build(createSetBuilder);
        return build;
    }

    public static <E> Set<E> createSetBuilder(int i8) {
        return new SetBuilder(i8);
    }

    public static final <T> TreeSet<T> sortedSetOf(Comparator<? super T> comparator, T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(comparator, "comparator");
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet(comparator));
    }
}
