package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> function, Comparator<? super U> comparator) {
        function.getClass();
        comparator.getClass();
        return new c(function, comparator);
    }

    public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> toLongFunction) {
        toLongFunction.getClass();
        return new b(toLongFunction);
    }

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }
}
