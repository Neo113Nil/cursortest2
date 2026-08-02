package j$.time.format;

import j$.time.b0;
import j$.time.c0;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.BiFunction$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Predicate, BinaryOperator, IntFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    public Object a(j$.time.temporal.k kVar) {
        int i = this.a;
        b bVar = j$.time.temporal.o.a;
        switch (i) {
            case 0:
                b0 b0Var = (b0) kVar.k(bVar);
                if (b0Var == null || (b0Var instanceof c0)) {
                    return null;
                }
                return b0Var;
            case 1:
                return (b0) kVar.k(bVar);
            case 2:
                return (j$.time.chrono.a) kVar.k(j$.time.temporal.o.b);
            case 3:
                return (TemporalUnit) kVar.k(j$.time.temporal.o.c);
            case 4:
                j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
                if (kVar.c(aVar)) {
                    return c0.C(kVar.f(aVar));
                }
                return null;
            case 5:
                b0 b0Var2 = (b0) kVar.k(bVar);
                return b0Var2 != null ? b0Var2 : (b0) kVar.k(j$.time.temporal.o.d);
            case 6:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.EPOCH_DAY;
                if (kVar.c(aVar2)) {
                    return j$.time.j.F(kVar.o(aVar2));
                }
                return null;
            default:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_DAY;
                if (kVar.c(aVar3)) {
                    return j$.time.n.x(kVar.o(aVar3));
                }
                return null;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new j$.util.stream.p((j$.util.stream.l) obj, (j$.util.stream.l) obj2);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        j$.com.android.tools.r8.a aVar = ConcurrentLinkedQueue.a;
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
