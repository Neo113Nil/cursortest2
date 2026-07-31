package y5;

import f6.l;
import kotlin.jvm.internal.i;
import y5.g;
import y5.g.b;

/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: f, reason: collision with root package name */
    private final l<g.b, E> f23473f;

    /* renamed from: g, reason: collision with root package name */
    private final g.c<?> f23474g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [y5.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [f6.l<? super y5.g$b, ? extends E extends B>, f6.l<y5.g$b, E extends B>, java.lang.Object] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        i.d(cVar, "baseKey");
        i.d(lVar, "safeCast");
        this.f23473f = lVar;
        this.f23474g = cVar instanceof b ? (g.c<B>) ((b) cVar).f23474g : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        i.d(cVar, "key");
        return cVar == this || this.f23474g == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ly5/g$b;)TE; */
    public final g.b b(g.b bVar) {
        i.d(bVar, "element");
        return (g.b) this.f23473f.invoke(bVar);
    }
}
