package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class y extends c {
    public final j$.nio.file.attribute.a h;

    public y(y yVar, Spliterator spliterator) {
        super(yVar, spliterator);
        this.h = yVar.h;
    }

    @Override // j$.util.stream.c
    public final Object a() {
        d0 d0Var = this.a;
        w wVar = (w) this.h;
        x xVar = new x(wVar.c, wVar.b, wVar.a);
        d0Var.a(d0Var.g(xVar), this.b);
        return xVar;
    }

    @Override // j$.util.stream.c
    public final c c(Spliterator spliterator) {
        return new y(this, spliterator);
    }

    @Override // j$.util.stream.c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        c cVar = this.d;
        if (cVar != null) {
            x xVar = (x) ((y) cVar).f;
            xVar.a = xVar.d.apply(xVar.a, ((x) ((y) this.e).f).a);
            this.f = xVar;
        }
        super.onCompletion(countedCompleter);
    }

    public y(j$.nio.file.attribute.a aVar, d0 d0Var, Spliterator spliterator) {
        super(d0Var, spliterator);
        this.h = aVar;
    }
}
