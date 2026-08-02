package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class y implements Spliterator {
    public final java.util.Collection a;
    public Iterator b = null;
    public final int c;
    public long d;
    public int e;

    public y(java.util.Collection collection, int i) {
        this.a = collection;
        this.c = (i & 4096) == 0 ? i | 16448 : i;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.c;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.b != null) {
            return this.d;
        }
        java.util.Collection collection = this.a;
        this.b = collection.iterator();
        long size = collection.size();
        this.d = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.b;
        if (it == null) {
            Iterator it2 = this.a.iterator();
            this.b = it2;
            this.d = r0.size();
            it = it2;
        }
        j$.nio.file.attribute.a.z(it, consumer);
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (j$.nio.file.attribute.a.o(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b == null) {
            this.b = this.a.iterator();
            this.d = r0.size();
        }
        if (!this.b.hasNext()) {
            return false;
        }
        consumer.accept(this.b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j;
        Iterator it = this.b;
        if (it == null) {
            java.util.Collection collection = this.a;
            Iterator it2 = collection.iterator();
            this.b = it2;
            j = collection.size();
            this.d = j;
            it = it2;
        } else {
            j = this.d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.e + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.e = i2;
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            this.d = j2 - i2;
        }
        return new u(objArr, 0, i2, this.c);
    }
}
