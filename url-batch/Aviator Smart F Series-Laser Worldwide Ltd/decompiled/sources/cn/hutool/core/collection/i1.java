package cn.hutool.core.collection;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* loaded from: classes.dex */
public class i1 implements Spliterator {
    private final Spliterator<Object> fromSpliterator;
    private final Function<Object, Object> function;

    public i1(Spliterator<Object> spliterator, Function<Object, Object> function) {
        this.fromSpliterator = spliterator;
        this.function = function;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forEachRemaining$1(Consumer consumer, Object obj) {
        Object apply;
        apply = this.function.apply(obj);
        consumer.accept(apply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$tryAdvance$0(Consumer consumer, Object obj) {
        Object apply;
        apply = this.function.apply(obj);
        consumer.accept(apply);
    }

    @Override // java.util.Spliterator
    public int characteristics() {
        int characteristics;
        characteristics = this.fromSpliterator.characteristics();
        return characteristics & (-262);
    }

    @Override // java.util.Spliterator
    public long estimateSize() {
        long estimateSize;
        estimateSize = this.fromSpliterator.estimateSize();
        return estimateSize;
    }

    @Override // java.util.Spliterator
    public void forEachRemaining(final Consumer<Object> consumer) {
        this.fromSpliterator.forEachRemaining(new Consumer() { // from class: cn.hutool.core.collection.g1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i1.this.lambda$forEachRemaining$1(consumer, obj);
            }
        });
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(final Consumer<Object> consumer) {
        boolean tryAdvance;
        tryAdvance = this.fromSpliterator.tryAdvance(new Consumer() { // from class: cn.hutool.core.collection.h1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                i1.this.lambda$tryAdvance$0(consumer, obj);
            }
        });
        return tryAdvance;
    }

    @Override // java.util.Spliterator
    public Spliterator<Object> trySplit() {
        Spliterator trySplit;
        trySplit = this.fromSpliterator.trySplit();
        if (trySplit != null) {
            return new i1(trySplit, this.function);
        }
        return null;
    }
}
