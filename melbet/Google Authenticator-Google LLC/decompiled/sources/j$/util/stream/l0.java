package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class l0 implements Spliterator {
    public final boolean a;
    public final a b;
    public j$.time.format.s c;
    public Spliterator d;
    public f0 e;
    public j$.time.format.s f;
    public long g;
    public h0 h;
    public boolean i;

    public l0(a aVar, j$.time.format.s sVar, boolean z) {
        this.b = aVar;
        this.c = sVar;
        this.d = null;
        this.a = z;
    }

    public final boolean a() {
        while (this.h.count() == 0) {
            if (this.e.d() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    public final void c() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = i & ((~i) >> 1) & j0.j & j0.f;
        if ((i2 & 64) == 0) {
            return i2;
        }
        return (this.d.characteristics() & 16448) | (i2 & (-16449));
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        c();
        j$.util.k kVar = new j$.util.k(consumer, 2);
        Spliterator spliterator = this.d;
        a aVar = this.b;
        aVar.a(aVar.g(kVar), spliterator);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.nio.file.attribute.a.o(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (j0.SIZED.h(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    public final String toString() {
        return String.format("%s[%s]", l0.class.getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean z;
        Object obj;
        consumer.getClass();
        h0 h0Var = this.h;
        if (h0Var != null) {
            long j = this.g + 1;
            this.g = j;
            z = j < h0Var.count();
            if (!z) {
                this.g = 0L;
                this.h.clear();
                z = a();
            }
        } else if (this.i) {
            z = false;
        } else {
            c();
            h0 h0Var2 = new h0();
            this.h = h0Var2;
            f0 g = this.b.g(new j$.time.format.s(7, h0Var2));
            this.e = g;
            this.f = new j$.time.format.s(8, this);
            this.g = 0L;
            g.c(this.d.getExactSizeIfKnown());
            z = a();
        }
        if (!z) {
            return z;
        }
        h0 h0Var3 = this.h;
        long j2 = this.g;
        if (h0Var3.b != 0) {
            if (j2 >= h0Var3.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            for (int i = 0; i <= h0Var3.b; i++) {
                long j3 = h0Var3.c[i];
                Object[] objArr = h0Var3.e[i];
                if (j2 < objArr.length + j3) {
                    obj = objArr[(int) (j2 - j3)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        if (j2 >= h0Var3.a) {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        obj = h0Var3.d[(int) j2];
        consumer.accept(obj);
        return z;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        boolean z = this.a;
        if (!z || this.h != null || this.i) {
            return null;
        }
        c();
        Spliterator trySplit = this.d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new l0(this.b, trySplit, z);
    }

    public l0(a aVar, Spliterator spliterator, boolean z) {
        this.b = aVar;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
