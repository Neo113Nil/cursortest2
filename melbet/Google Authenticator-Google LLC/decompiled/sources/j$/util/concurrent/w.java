package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.stream.d0;
import j$.util.stream.j0;
import j$.util.stream.k0;
import j$.util.stream.m0;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements BiConsumer, BiFunction, Consumer, Supplier, m0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w(BiFunction biFunction, Function function) {
        this.a = 2;
        this.c = biFunction;
        this.b = function;
    }

    @Override // j$.util.stream.m0
    public Object a(d0 d0Var, Spliterator spliterator) {
        j$.util.stream.h hVar = (j$.util.stream.h) ((w) this.c).get();
        d0Var.a(d0Var.g(hVar), spliterator);
        return Boolean.valueOf(hVar.b);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((Function) this.b).apply(((BiFunction) this.c).apply(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.m0
    public Object e(d0 d0Var, Spliterator spliterator) {
        return (Boolean) new j$.util.stream.j(this, d0Var, spliterator).invoke();
    }

    @Override // j$.util.stream.m0
    public int f() {
        return j0.q | j0.o;
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new j$.util.stream.h((j$.util.stream.i) this.b, (Predicate) this.c);
    }

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public w(k0 k0Var, j$.util.stream.i iVar, w wVar) {
        this.a = 5;
        this.b = iVar;
        this.c = wVar;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 3:
                ((Consumer) obj3).accept(obj);
                ((Consumer) obj2).accept(obj);
                break;
            default:
                ((BiConsumer) obj3).accept(obj2, obj);
                break;
        }
    }
}
