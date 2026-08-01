package a1;

import i1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1673a = new j();

    @Override // a1.i
    public final i B(i iVar) {
        j1.h.e(iVar, "context");
        return iVar;
    }

    @Override // a1.i
    public final g d(h hVar) {
        j1.h.e(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // a1.i
    public final Object q(Object obj, p pVar) {
        return obj;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // a1.i
    public final i z(h hVar) {
        j1.h.e(hVar, "key");
        return this;
    }
}
