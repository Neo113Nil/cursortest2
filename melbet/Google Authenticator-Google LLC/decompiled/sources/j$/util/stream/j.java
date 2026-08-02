package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class j extends b {
    public final j$.util.concurrent.w i;

    public j(j jVar, Spliterator spliterator) {
        super(jVar, spliterator);
        this.i = jVar.i;
    }

    @Override // j$.util.stream.c
    public final Object a() {
        d0 d0Var = this.a;
        h hVar = (h) ((j$.util.concurrent.w) this.i.c).get();
        d0Var.a(d0Var.g(hVar), this.b);
        boolean z = hVar.b;
        if (z == ((i) this.i.b).b) {
            Boolean valueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.c
    public final c c(Spliterator spliterator) {
        return new j(this, spliterator);
    }

    public j(j$.util.concurrent.w wVar, d0 d0Var, Spliterator spliterator) {
        super(d0Var, spliterator);
        this.i = wVar;
    }
}
