package t;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* loaded from: classes.dex */
public class i0 implements Collector {
    private final BiConsumer<Object, Object> accumulator;
    private final Set<Collector.Characteristics> characteristics;
    private final BinaryOperator<Object> combiner;
    private final Function<Object, Object> finisher;
    private final Supplier<Object> supplier;

    public i0(Supplier<Object> supplier, BiConsumer<Object, Object> biConsumer, BinaryOperator<Object> binaryOperator, Function<Object, Object> function, Set<Collector.Characteristics> set) {
        this.supplier = supplier;
        this.accumulator = biConsumer;
        this.combiner = binaryOperator;
        this.finisher = function;
        this.characteristics = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$0(Object obj) {
        return obj;
    }

    @Override // java.util.stream.Collector
    public BiConsumer<Object, Object> accumulator() {
        return this.accumulator;
    }

    @Override // java.util.stream.Collector
    public Set<Collector.Characteristics> characteristics() {
        return this.characteristics;
    }

    @Override // java.util.stream.Collector
    public BinaryOperator<Object> combiner() {
        return this.combiner;
    }

    @Override // java.util.stream.Collector
    public Function<Object, Object> finisher() {
        return this.finisher;
    }

    @Override // java.util.stream.Collector
    public Supplier<Object> supplier() {
        return this.supplier;
    }

    public i0(Supplier<Object> supplier, BiConsumer<Object, Object> biConsumer, BinaryOperator<Object> binaryOperator, Set<Collector.Characteristics> set) {
        this(supplier, biConsumer, binaryOperator, new Function() { // from class: t.h0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object lambda$new$0;
                lambda$new$0 = i0.lambda$new$0(obj);
                return lambda$new$0;
            }
        }, set);
    }
}
