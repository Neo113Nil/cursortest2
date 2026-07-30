package w0;

import E0.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f3082e = new j();

    @Override // w0.i
    public final g f(h hVar) {
        F0.i.e(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // w0.i
    public final i i(h hVar) {
        F0.i.e(hVar, "key");
        return this;
    }

    @Override // w0.i
    public final i k(i iVar) {
        F0.i.e(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // w0.i
    public final Object h(Object obj, p pVar) {
        return obj;
    }
}
