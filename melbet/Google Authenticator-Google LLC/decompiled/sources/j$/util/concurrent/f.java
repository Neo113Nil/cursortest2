package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class f extends p implements Spliterator {
    public final ConcurrentHashMap i;
    public long j;

    public f(l[] lVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a = a();
            if (a == null) {
                return;
            } else {
                consumer.accept(new k(a.b, a.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a = a();
        if (a == null) {
            return false;
        }
        consumer.accept(new k(a.b, a.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        l[] lVarArr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new f(lVarArr, this.h, i3, i2, j, this.i);
    }
}
