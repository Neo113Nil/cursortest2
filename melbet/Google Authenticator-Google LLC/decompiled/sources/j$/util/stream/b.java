package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public abstract class b extends c {
    public final AtomicReference h;

    public b(d0 d0Var, Spliterator spliterator) {
        super(d0Var, spliterator);
        this.h = new AtomicReference(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        r9.a();
        r7 = null;
     */
    @Override // j$.util.stream.c, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = c.e(estimateSize);
            this.c = j;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            CountedCompleter<?> completer = this.getCompleter();
            while (true) {
                b bVar = (b) ((c) completer);
                if (bVar == null) {
                    break;
                } else {
                    completer = bVar.getCompleter();
                }
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            j jVar = (j) this;
            j jVar2 = new j(jVar, trySplit);
            this.d = jVar2;
            j jVar3 = new j(jVar, spliterator);
            this.e = jVar3;
            this.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                this = jVar2;
                jVar2 = jVar3;
            } else {
                this = jVar3;
            }
            z = !z;
            jVar2.fork();
            estimateSize = spliterator.estimateSize();
        }
        this.d(obj);
        this.tryComplete();
    }

    @Override // j$.util.stream.c
    public final void d(Object obj) {
        if (!b()) {
            this.f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.c, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        if (!b()) {
            return this.f;
        }
        Object obj = this.h.get();
        return obj == null ? Boolean.valueOf(!((i) ((j) this).i.b).b) : obj;
    }

    public b(j jVar, Spliterator spliterator) {
        super(jVar, spliterator);
        this.h = jVar.h;
    }
}
