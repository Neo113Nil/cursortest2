package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class q {
    public static <E> List<E> build(List<E> builder) {
        kotlin.jvm.internal.s.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    private static final <E> List<E> buildListInternal(f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        List createListBuilder = createListBuilder();
        builderAction.invoke(createListBuilder);
        return build(createListBuilder);
    }

    private static final int checkCountOverflow(int i8) {
        if (i8 < 0) {
            if (!b6.b.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            CollectionsKt__CollectionsKt.throwCountOverflow();
        }
        return i8;
    }

    private static final int checkIndexOverflow(int i8) {
        if (i8 < 0) {
            if (!b6.b.apiVersionIsAtLeast(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return i8;
    }

    private static final Object[] copyToArrayImpl(Collection<?> collection) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "collection");
        return kotlin.jvm.internal.n.toArray(collection);
    }

    public static final <T> Object[] copyToArrayOfAny(T[] tArr, boolean z7) {
        kotlin.jvm.internal.s.checkNotNullParameter(tArr, "<this>");
        if (z7 && kotlin.jvm.internal.s.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <E> List<E> createListBuilder() {
        return new ListBuilder();
    }

    public static <T> List<T> listOf(T t7) {
        List<T> singletonList = Collections.singletonList(t7);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        kotlin.jvm.internal.s.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(list, "list(this)");
        return list;
    }

    private static final <E> List<E> buildListInternal(int i8, f6.l builderAction) {
        kotlin.jvm.internal.s.checkNotNullParameter(builderAction, "builderAction");
        List createListBuilder = createListBuilder(i8);
        builderAction.invoke(createListBuilder);
        return build(createListBuilder);
    }

    private static final <T> T[] copyToArrayImpl(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.s.checkNotNullParameter(collection, "collection");
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.n.toArray(collection, array);
    }

    public static <E> List<E> createListBuilder(int i8) {
        return new ListBuilder(i8);
    }

    public static final <T> List<T> shuffled(Iterable<? extends T> iterable, Random random) {
        kotlin.jvm.internal.s.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
