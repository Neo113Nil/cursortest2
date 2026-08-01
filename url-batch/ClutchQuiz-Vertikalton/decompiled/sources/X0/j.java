package X0;

import f1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1156a = new j();

    public final int hashCode() {
        return 0;
    }

    @Override // X0.i
    public final g j(h hVar) {
        g1.f.e(hVar, "key");
        return null;
    }

    @Override // X0.i
    public final i k(i iVar) {
        g1.f.e(iVar, "context");
        return iVar;
    }

    @Override // X0.i
    public final i p(h hVar) {
        g1.f.e(hVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // X0.i
    public final Object u(Object obj, p pVar) {
        return obj;
    }
}
