package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class x0 extends w0 {
    private static final <E> Set<E> buildSet(f6.l builderAction) {
        Set<E> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        Set createSetBuilder = w0.createSetBuilder();
        builderAction.invoke(createSetBuilder);
        build = w0.build(createSetBuilder);
        return build;
    }

    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> optimizeReadOnlySet(Set<? extends T> set) {
        Set<T> emptySet;
        Set<T> of;
        kotlin.jvm.internal.s.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size == 0) {
            emptySet = emptySet();
            return emptySet;
        }
        if (size != 1) {
            return set;
        }
        of = w0.setOf(set.iterator().next());
        return of;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        Set<T> emptySet;
        if (set != 0) {
            return set;
        }
        emptySet = emptySet();
        return emptySet;
    }

    public static final <T> Set<T> setOf(T... elements) {
        Set<T> emptySet;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        if (elements.length > 0) {
            return ArraysKt___ArraysKt.toSet(elements);
        }
        emptySet = emptySet();
        return emptySet;
    }

    public static final <T> Set<T> setOfNotNull(T t7) {
        Set<T> emptySet;
        Set<T> of;
        if (t7 != null) {
            of = w0.setOf(t7);
            return of;
        }
        emptySet = emptySet();
        return emptySet;
    }

    private static final <E> Set<E> buildSet(int i8, f6.l builderAction) {
        Set createSetBuilder;
        Set<E> build;
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        createSetBuilder = w0.createSetBuilder(i8);
        builderAction.invoke(createSetBuilder);
        build = w0.build(createSetBuilder);
        return build;
    }

    public static final <T> HashSet<T> hashSetOf(T... elements) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        mapCapacity = l0.mapCapacity(elements.length);
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(mapCapacity));
    }

    public static final <T> LinkedHashSet<T> linkedSetOf(T... elements) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        mapCapacity = l0.mapCapacity(elements.length);
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(mapCapacity));
    }

    public static final <T> Set<T> mutableSetOf(T... elements) {
        int mapCapacity;
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        mapCapacity = l0.mapCapacity(elements.length);
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(mapCapacity));
    }

    private static final <T> Set<T> setOf() {
        Set<T> emptySet;
        emptySet = emptySet();
        return emptySet;
    }

    public static final <T> Set<T> setOfNotNull(T... elements) {
        kotlin.jvm.internal.s.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
