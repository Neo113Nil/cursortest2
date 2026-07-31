package G0;

import O0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f500e = new j();

    public final int hashCode() {
        return 0;
    }

    @Override // G0.i
    public final i i(h hVar) {
        P0.h.e(hVar, "key");
        return this;
    }

    @Override // G0.i
    public final i j(i iVar) {
        P0.h.e(iVar, "context");
        return iVar;
    }

    @Override // G0.i
    public final g m(h hVar) {
        P0.h.e(hVar, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // G0.i
    public final Object h(Object obj, p pVar) {
        return obj;
    }
}
