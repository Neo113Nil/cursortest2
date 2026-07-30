package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.func.Func0;
import cn.hutool.core.lang.func.VoidFunc0;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class l0 {
    private static final l0 EMPTY = new l0(null);
    private Exception exception;
    private final Object value;

    private l0(Object obj) {
        this.value = obj;
    }

    public static <T> l0 empty() {
        return EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l0 lambda$peeks$0(l0 l0Var, l0 l0Var2) {
        return null;
    }

    public static <T> l0 of(T t7) {
        Objects.requireNonNull(t7);
        return new l0(t7);
    }

    public static <T> l0 ofBlankAble(T t7) {
        return cn.hutool.core.util.c1.isBlankIfStr(t7) ? empty() : new l0(t7);
    }

    public static <T, R extends Collection<T>> l0 ofEmptyAble(R r8) {
        return CollUtil.isEmpty((Collection<?>) r8) ? empty() : new l0(r8);
    }

    public static <T> l0 ofNullable(T t7) {
        return t7 == null ? empty() : new l0(t7);
    }

    public static <T> l0 ofTry(Func0<T> func0) {
        try {
            return ofNullable(func0.call());
        } catch (Exception e8) {
            l0 l0Var = new l0(null);
            l0Var.exception = e8;
            return l0Var;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return Objects.equals(this.value, ((l0) obj).value);
        }
        return false;
    }

    public Object exceptionOrElse(Object obj) {
        return isFail() ? obj : this.value;
    }

    public l0 filter(Predicate<Object> predicate) {
        boolean test;
        Objects.requireNonNull(predicate);
        if (isEmpty()) {
            return this;
        }
        test = predicate.test(this.value);
        return test ? this : empty();
    }

    public <U> l0 flatMap(Function<Object, ? extends l0> function) {
        Object apply;
        Objects.requireNonNull(function);
        if (isEmpty()) {
            return empty();
        }
        apply = function.apply(this.value);
        l0 l0Var = (l0) apply;
        Objects.requireNonNull(l0Var);
        return l0Var;
    }

    public <U> l0 flattedMap(Function<Object, ? extends Optional<? extends U>> function) {
        Object apply;
        Object orElse;
        Objects.requireNonNull(function);
        if (isEmpty()) {
            return empty();
        }
        apply = function.apply(this.value);
        orElse = cn.hutool.core.convert.n.a(apply).orElse(null);
        return ofNullable(orElse);
    }

    public Object get() {
        return this.value;
    }

    public Exception getException() {
        return this.exception;
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public l0 ifPresent(Consumer<Object> consumer) {
        if (isPresent()) {
            consumer.accept(this.value);
        }
        return this;
    }

    public l0 ifPresentOrElse(Consumer<Object> consumer, VoidFunc0 voidFunc0) {
        if (isPresent()) {
            consumer.accept(this.value);
        } else {
            voidFunc0.callWithRuntimeException();
        }
        return this;
    }

    public boolean isEmpty() {
        return this.value == null;
    }

    public boolean isFail() {
        return this.exception != null;
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public <U> l0 map(Function<Object, ? extends U> function) {
        Object apply;
        Objects.requireNonNull(function);
        if (isEmpty()) {
            return empty();
        }
        apply = function.apply(this.value);
        return ofNullable(apply);
    }

    public <U> l0 mapOrElse(Function<Object, ? extends U> function, VoidFunc0 voidFunc0) {
        Object apply;
        if (isPresent()) {
            apply = function.apply(this.value);
            return ofNullable(apply);
        }
        voidFunc0.callWithRuntimeException();
        return empty();
    }

    public l0 or(Supplier<? extends l0> supplier) {
        Object obj;
        Objects.requireNonNull(supplier);
        if (isPresent()) {
            return this;
        }
        obj = supplier.get();
        l0 l0Var = (l0) obj;
        Objects.requireNonNull(l0Var);
        return l0Var;
    }

    public Object orElse(Object obj) {
        return isPresent() ? this.value : obj;
    }

    public Object orElseGet(Supplier<Object> supplier) {
        Object obj;
        if (isPresent()) {
            return this.value;
        }
        obj = supplier.get();
        return obj;
    }

    public Object orElseThrow() {
        return orElseThrow(new Function() { // from class: cn.hutool.core.lang.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new NoSuchElementException((String) obj);
            }
        }, "No value present");
    }

    public l0 peek(Consumer<Object> consumer) {
        Objects.requireNonNull(consumer);
        if (isEmpty()) {
            return empty();
        }
        consumer.accept(this.value);
        return this;
    }

    @SafeVarargs
    public final l0 peeks(Consumer<Object>... consumerArr) {
        Stream of;
        Object reduce;
        of = Stream.of((Object[]) consumerArr);
        reduce = of.reduce(this, new BiFunction() { // from class: cn.hutool.core.lang.i0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((l0) obj).peek((Consumer) obj2);
            }
        }, new BinaryOperator() { // from class: cn.hutool.core.lang.j0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                l0 lambda$peeks$0;
                lambda$peeks$0 = l0.lambda$peeks$0((l0) obj, (l0) obj2);
                return lambda$peeks$0;
            }
        });
        return (l0) reduce;
    }

    public Stream<Object> stream() {
        Stream<Object> of;
        Stream<Object> empty;
        if (isEmpty()) {
            empty = Stream.empty();
            return empty;
        }
        of = Stream.of(this.value);
        return of;
    }

    public Optional<Object> toOptional() {
        Optional<Object> ofNullable;
        ofNullable = Optional.ofNullable(this.value);
        return ofNullable;
    }

    public String toString() {
        return cn.hutool.core.util.c1.toStringOrNull(this.value);
    }

    public <X extends Throwable> Object orElseThrow(Supplier<? extends X> supplier) {
        Object obj;
        if (isPresent()) {
            return this.value;
        }
        obj = supplier.get();
        throw ((Throwable) obj);
    }

    public <X extends Throwable> Object orElseThrow(Function<String, ? extends X> function, String str) {
        Object apply;
        if (isPresent()) {
            return this.value;
        }
        apply = function.apply(str);
        throw ((Throwable) apply);
    }
}
