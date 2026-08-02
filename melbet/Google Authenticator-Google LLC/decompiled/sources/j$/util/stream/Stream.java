package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public interface Stream<T> extends d {

    /* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
    /* renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T> Stream<T> ofNullable(T t) {
            if (t == null) {
                return j$.nio.file.attribute.a.H(Spliterators.a, false);
            }
            j$.time.format.q qVar = new j$.time.format.q();
            qVar.c = t;
            qVar.b = -2;
            return j$.nio.file.attribute.a.H(qVar, false);
        }
    }

    <R, A> R collect(Collector<? super T, A, R> collector);

    Stream<T> filter(Predicate<? super T> predicate);

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer consumer);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    boolean noneMatch(Predicate<? super T> predicate);

    Object[] toArray();
}
