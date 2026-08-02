package j$.time.format;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.f0;
import j$.util.stream.h0;
import j$.util.stream.i0;
import j$.util.stream.l0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class s implements Spliterator, Predicate, Supplier, LongFunction, Consumer, f0, BooleanSupplier {
    public final /* synthetic */ int a;
    public final Object b;

    public s(Map map) {
        this.a = 0;
        this.b = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l = (Long) entry2.getKey();
                r rVar = c.b;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, c.b);
            hashMap.put((w) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, c.b);
    }

    public String a(long j, w wVar) {
        Map map = (Map) ((Map) this.b).get(wVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 5:
                ((ArrayList) obj2).add(obj);
                break;
            default:
                ((h0) obj2).accept(obj);
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return j$.nio.file.attribute.a.x(j, (b) this.b);
    }

    @Override // j$.util.Spliterator
    public boolean b() {
        return ((Spliterator) this.b).b();
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return ((Spliterator) this.b).characteristics();
    }

    @Override // j$.util.stream.f0
    public boolean d() {
        return false;
    }

    public void e(i0 i0Var) {
        ((EnumMap) this.b).put((EnumMap) i0Var, (i0) 1);
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return ((Spliterator) this.b).estimateSize();
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ((Spliterator) this.b).forEachRemaining(new j$.util.k(consumer, 0));
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return ((j$.util.stream.a) this.b).f(0);
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        l0 l0Var = (l0) this.b;
        return l0Var.d.tryAdvance(l0Var.e);
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        return ((Spliterator) this.b).getComparator();
    }

    @Override // j$.util.Spliterator
    public long getExactSizeIfKnown() {
        return ((Spliterator) this.b).getExactSizeIfKnown();
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return ((Spliterator) this.b).tryAdvance(new j$.util.k(consumer, 0));
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator trySplit = ((Spliterator) this.b).trySplit();
        if (trySplit == null) {
            return null;
        }
        return new s(1, trySplit);
    }

    public /* synthetic */ s(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.stream.f0
    public void c(long j) {
    }

    @Override // j$.util.stream.f0
    public void end() {
    }
}
