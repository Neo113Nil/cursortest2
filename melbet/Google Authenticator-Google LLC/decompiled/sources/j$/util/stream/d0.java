package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class d0 extends a implements Stream {
    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object b;
        if (this.a.i && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!j0.ORDERED.h(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            b = collector.supplier().get();
            forEach(new j$.util.concurrent.w(6, collector.accumulator(), b));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            b = b(new w(k0.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? b : collector2.finisher().apply(b);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new a0(this, j0.p, predicate, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new a0(this, j0.n | j0.m | j0.p, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        b(new j$.util.k(consumer, 1));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new a0(this, j0.n | j0.m, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        i iVar = i.NONE;
        predicate.getClass();
        iVar.getClass();
        return ((Boolean) b(new j$.util.concurrent.w(k0.REFERENCE, iVar, new j$.util.concurrent.w(4, iVar, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        l build;
        d0 d0Var;
        j$.time.format.b bVar = new j$.time.format.b(10);
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        a aVar = this.a;
        if (aVar.i && (d0Var = this.b) != null && d()) {
            this.e = 0;
            d0Var.f(0);
            throw new UnsupportedOperationException("Parallel evaluation is not supported");
        }
        Spliterator f = f(0);
        if (aVar.i) {
            long c = c(f);
            if (c < 0 || !f.b()) {
                build = j$.nio.file.attribute.a.y((l) new n(this, f, new j$.time.format.s(4, bVar), new j$.time.format.b(9)).invoke(), bVar);
            } else {
                if (c >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                Object[] objArr = (Object[]) bVar.apply((int) c);
                new r(f, this, objArr).invoke();
                build = new m(objArr);
            }
        } else {
            k x = j$.nio.file.attribute.a.x(c(f), bVar);
            a(g(x), f);
            build = x.build();
        }
        return j$.nio.file.attribute.a.y(build, bVar).b(bVar);
    }
}
