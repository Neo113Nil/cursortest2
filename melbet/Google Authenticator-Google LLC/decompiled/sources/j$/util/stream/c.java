package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class c extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final d0 a;
    public Spliterator b;
    public long c;
    public c d;
    public c e;
    public Object f;

    public c(c cVar, Spliterator spliterator) {
        super(cVar);
        this.b = spliterator;
        this.a = cVar.a;
        this.c = cVar.c;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    public abstract Object a();

    public final boolean b() {
        return ((c) getCompleter()) == null;
    }

    public abstract c c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = e(estimateSize);
            this.c = j;
        }
        boolean z = false;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            c c = this.c(trySplit);
            this.d = c;
            c c2 = this.c(spliterator);
            this.e = c2;
            this.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                this = c;
                c = c2;
            } else {
                this = c2;
            }
            z = !z;
            c.fork();
            estimateSize = spliterator.estimateSize();
        }
        this.d(this.a());
        this.tryComplete();
    }

    public void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public c(d0 d0Var, Spliterator spliterator) {
        super(null);
        this.a = d0Var;
        this.b = spliterator;
        this.c = 0L;
    }
}
