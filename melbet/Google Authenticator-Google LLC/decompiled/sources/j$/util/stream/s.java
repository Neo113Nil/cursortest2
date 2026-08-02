package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class s extends CountedCompleter implements f0 {
    public final Spliterator a;
    public final d0 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public s(s sVar, Spliterator spliterator, long j, long j2, int i) {
        super(sVar);
        this.a = spliterator;
        this.b = sVar.b;
        this.c = sVar.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.f0
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        while (spliterator.estimateSize() > this.c && (trySplit = spliterator.trySplit()) != null) {
            this.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            r rVar = (r) this;
            new r(rVar, trySplit, this.d, estimateSize).fork();
            this = new r(rVar, spliterator, this.d + estimateSize, this.e - estimateSize);
        }
        d0 d0Var = this.b;
        d0Var.a(d0Var.g(this), spliterator);
        this.propagateCompletion();
    }

    @Override // j$.util.stream.f0
    public final boolean d() {
        return false;
    }

    public s(Spliterator spliterator, d0 d0Var, int i) {
        this.a = spliterator;
        this.b = d0Var;
        this.c = c.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.f0
    public final void end() {
    }
}
