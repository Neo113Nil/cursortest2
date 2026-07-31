package y5;

import f6.p;
import kotlin.jvm.internal.i;
import y5.g;

/* loaded from: classes.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        i.d(cVar, "key");
        this.key = cVar;
    }

    @Override // y5.g
    public <R> R fold(R r7, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r7, pVar);
    }

    @Override // y5.g.b, y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // y5.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // y5.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // y5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
