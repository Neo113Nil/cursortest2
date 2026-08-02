package j$.time.format;

import j$.time.Instant;
import j$.time.b0;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.stream.h0;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class q implements Consumer, Spliterator {
    public final /* synthetic */ int a = 1;
    public int b;
    public Object c;
    public Object d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.format.p] */
    public q(Instant instant, a aVar) {
        j$.time.chrono.a aVar2 = aVar.c;
        if (aVar2 != null) {
            j$.time.chrono.a aVar3 = (j$.time.chrono.a) instant.k(j$.time.temporal.o.b);
            b0 b0Var = (b0) instant.k(j$.time.temporal.o.a);
            j$.time.chrono.b bVar = null;
            aVar2 = Objects.equals(aVar2, aVar3) ? null : aVar2;
            Objects.equals(null, b0Var);
            if (aVar2 != null) {
                j$.time.chrono.a aVar4 = aVar2 != null ? aVar2 : aVar3;
                if (aVar2 != null) {
                    if (instant.c(j$.time.temporal.a.EPOCH_DAY)) {
                        bVar = aVar4.f(instant);
                    } else if (aVar2 != j$.time.chrono.s.c || aVar3 != null) {
                        for (j$.time.temporal.a aVar5 : j$.time.temporal.a.values()) {
                            if (aVar5.isDateBased() && instant.c(aVar5)) {
                                j$.time.i.d(j$.time.g.a("Unable to apply override chronology '", String.valueOf(aVar2), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", String.valueOf(instant)));
                                throw null;
                            }
                        }
                    }
                }
                instant = new p(bVar, instant, aVar4, b0Var);
            }
        }
        this.c = instant;
        this.d = aVar;
    }

    public Long a(j$.time.temporal.n nVar) {
        j$.time.temporal.k kVar = (j$.time.temporal.k) this.c;
        if (this.b <= 0 || kVar.c(nVar)) {
            return Long.valueOf(kVar.o(nVar));
        }
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.c = obj;
            this.b = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (((h0) this.d) == null) {
                h0 h0Var = new h0();
                this.d = h0Var;
                h0Var.accept(this.c);
                this.b++;
            }
            ((h0) this.d).accept(obj);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ boolean b() {
        return j$.nio.file.attribute.a.o(this, 16384);
    }

    @Override // j$.util.Spliterator
    public int characteristics() {
        return 17488;
    }

    @Override // j$.util.Spliterator
    public long estimateSize() {
        return (-this.b) - 1;
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.b == -2) {
            consumer.accept(this.c);
            this.b = -1;
        }
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ long getExactSizeIfKnown() {
        return j$.nio.file.attribute.a.m(this);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((j$.time.temporal.k) this.c).toString();
            default:
                return super.toString();
        }
    }

    @Override // j$.util.Spliterator
    public boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.b != -2) {
            return false;
        }
        consumer.accept(this.c);
        this.b = -1;
        return true;
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        return null;
    }

    public /* synthetic */ q() {
    }
}
