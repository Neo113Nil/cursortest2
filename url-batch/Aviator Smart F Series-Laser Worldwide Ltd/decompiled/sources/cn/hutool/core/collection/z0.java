package cn.hutool.core.collection;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class z0 extends AbstractCollection {
    private final Collection<Object> fromCollection;
    private final Function<Object, Object> function;

    public z0(Collection<Object> collection, Function<Object, Object> function) {
        this.fromCollection = (Collection) cn.hutool.core.lang.q.notNull(collection);
        this.function = v0.a(cn.hutool.core.lang.q.notNull(function));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forEach$0(Consumer consumer, Object obj) {
        Object apply;
        apply = this.function.apply(obj);
        consumer.accept(apply);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$removeIf$1(Predicate predicate, Object obj) {
        Object apply;
        boolean test;
        apply = this.function.apply(obj);
        test = predicate.test(apply);
        return test;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.fromCollection.clear();
    }

    @Override // java.lang.Iterable
    public void forEach(final Consumer<Object> consumer) {
        cn.hutool.core.lang.q.notNull(consumer);
        this.fromCollection.forEach(new Consumer() { // from class: cn.hutool.core.collection.y0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                z0.this.lambda$forEach$0(consumer, obj);
            }
        });
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.fromCollection.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return k0.trans(this.fromCollection.iterator(), this.function);
    }

    @Override // java.util.Collection
    public boolean removeIf(final Predicate<Object> predicate) {
        boolean removeIf;
        cn.hutool.core.lang.q.notNull(predicate);
        removeIf = this.fromCollection.removeIf(new Predicate() { // from class: cn.hutool.core.collection.x0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$removeIf$1;
                lambda$removeIf$1 = z0.this.lambda$removeIf$1(predicate, obj);
                return lambda$removeIf$1;
            }
        });
        return removeIf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.fromCollection.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Spliterator<Object> spliterator() {
        Spliterator spliterator;
        spliterator = this.fromCollection.spliterator();
        return t0.trans(spliterator, this.function);
    }
}
