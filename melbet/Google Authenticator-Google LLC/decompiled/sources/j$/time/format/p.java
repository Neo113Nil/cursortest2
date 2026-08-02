package j$.time.format;

import j$.time.Instant;
import j$.time.b0;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class p implements j$.time.temporal.k {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ Instant b;
    public final /* synthetic */ j$.time.chrono.a c;
    public final /* synthetic */ b0 d;

    public p(j$.time.chrono.b bVar, Instant instant, j$.time.chrono.a aVar, b0 b0Var) {
        this.a = bVar;
        this.b = instant;
        this.c = aVar;
        this.d = b0Var;
    }

    @Override // j$.time.temporal.k
    public final boolean c(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.c(nVar) : bVar.c(nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int f(j$.time.temporal.n nVar) {
        return j$.time.temporal.o.a(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q h(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? j$.time.temporal.o.d(this.b, nVar) : bVar.h(nVar);
    }

    @Override // j$.time.temporal.k
    public final Object k(b bVar) {
        return bVar == j$.time.temporal.o.b ? this.c : bVar == j$.time.temporal.o.a ? this.d : bVar == j$.time.temporal.o.c ? this.b.k(bVar) : bVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final long o(j$.time.temporal.n nVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !nVar.isDateBased()) ? this.b.o(nVar) : bVar.o(nVar);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        j$.time.chrono.a aVar = this.c;
        String concat = aVar != null ? " with chronology ".concat(String.valueOf(aVar)) : "";
        b0 b0Var = this.d;
        return valueOf + concat + (b0Var != null ? " with zone ".concat(String.valueOf(b0Var)) : "");
    }
}
