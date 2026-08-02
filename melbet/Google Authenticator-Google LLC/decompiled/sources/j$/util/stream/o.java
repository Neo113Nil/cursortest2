package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public class o extends c {
    public final d0 h;
    public final j$.time.format.s i;
    public final j$.time.format.b j;

    public o(o oVar, Spliterator spliterator) {
        super(oVar, spliterator);
        this.h = oVar.h;
        this.i = oVar.i;
        this.j = oVar.j;
    }

    @Override // j$.util.stream.c
    public final Object a() {
        k kVar = (k) this.i.apply(this.h.c(this.b));
        d0 d0Var = this.h;
        Spliterator spliterator = this.b;
        d0Var.getClass();
        d0Var.a(d0Var.g(kVar), spliterator);
        return kVar.build();
    }

    @Override // j$.util.stream.c
    public final c c(Spliterator spliterator) {
        return new o(this, spliterator);
    }

    @Override // j$.util.stream.c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        c cVar = this.d;
        if (cVar != null) {
            this.f = (l) this.j.apply((l) ((o) cVar).f, (l) ((o) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public o(d0 d0Var, Spliterator spliterator, j$.time.format.s sVar, j$.time.format.b bVar) {
        super(d0Var, spliterator);
        this.h = d0Var;
        this.i = sVar;
        this.j = bVar;
    }
}
