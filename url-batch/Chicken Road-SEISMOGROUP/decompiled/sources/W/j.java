package W;

import d0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final j f449b = new j();

    @Override // W.i
    public final i c(i iVar) {
        e0.h.e(iVar, "context");
        return iVar;
    }

    @Override // W.i
    public final i e(h hVar) {
        e0.h.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // W.i
    public final g k(h hVar) {
        e0.h.e(hVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // W.i
    public final Object f(Object obj, p pVar) {
        return obj;
    }
}
