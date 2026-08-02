package H0;

import P0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f503e = new j();

    @Override // H0.i
    public final i d(h hVar) {
        Q0.h.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // H0.i
    public final i i(i iVar) {
        Q0.h.e(iVar, "context");
        return iVar;
    }

    @Override // H0.i
    public final g k(h hVar) {
        Q0.h.e(hVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // H0.i
    public final Object m(Object obj, p pVar) {
        return obj;
    }
}
