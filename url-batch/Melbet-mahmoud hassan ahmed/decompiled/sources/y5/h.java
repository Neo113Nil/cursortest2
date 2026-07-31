package y5;

import f6.p;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import y5.g;

/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final h f23481f = new h();

    private h() {
    }

    @Override // y5.g
    public <R> R fold(R r7, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return r7;
    }

    @Override // y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // y5.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        return this;
    }

    @Override // y5.g
    public g plus(g gVar) {
        i.d(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
