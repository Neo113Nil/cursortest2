package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class g extends CountedCompleter {
    public Spliterator a;
    public final f0 b;
    public final d0 c;
    public long d;

    public g(g gVar, Spliterator spliterator) {
        super(gVar);
        this.a = spliterator;
        this.b = gVar.b;
        this.d = gVar.d;
        this.c = gVar.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = c.e(estimateSize);
            this.d = j;
        }
        boolean h = j0.SHORT_CIRCUIT.h(this.c.f);
        f0 f0Var = this.b;
        boolean z = false;
        while (true) {
            if (h && f0Var.d()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            g gVar = new g(this, trySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                gVar = this;
                this = gVar;
            }
            z = !z;
            this.fork();
            this = gVar;
            estimateSize = spliterator.estimateSize();
        }
        this.c.a(f0Var, spliterator);
        this.a = null;
        this.propagateCompletion();
    }

    public g(d0 d0Var, Spliterator spliterator, f0 f0Var) {
        super(null);
        this.b = f0Var;
        this.c = d0Var;
        this.a = spliterator;
        this.d = 0L;
    }
}
